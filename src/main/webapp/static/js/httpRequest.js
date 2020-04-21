// 获取项目上下问路径
function getContextPath() {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf('/');
    var result = pathName.substr(0, index + 1);
    return result;
}

// 获取全部emp
function findAllEmp(pageNum, func) {
    fetch(getContextPath() + '/emps?pn=' + pageNum)
        .then(response => response.json())
        .then(json => func(json));
}

// 获取全部dept,  并构建添加员工的下拉列表
function findAllDept() {
    fetch(getContextPath() + '/depts')
        .then(response => response.json())
        .then(json => {
            $.each(json.data.depts, function () {
                var optionElement = $("<option></option>").append(this.deptName).attr("value", this.deptId);
                optionElement.appendTo("#empAddModal select");
            })
        })
}

// 处理信息显示
function show(json) {
    var pageInfo = json.data.pageInfo;
    var emps = pageInfo.list;
    // //改变url
    // window.history.replaceState(null,null,getContextPath() + '/emps?pn=' + pageInfo.pageNum);
    //  清空数据
    $("#empsTable tbody").empty();
    $("#pageNum").empty();
    $("#pages").empty();
    $("#total").empty();
    $("#nav").empty();
    // 构建表格
    $.each(emps, function (index, item) {
        var deptId = $("<td></td>").append(item.empId);
        var empName = $("<td></td>").append(item.empName);
        var gender = $("<td></td>").append(item.gender);
        var email = $("<td></td>").append(item.email);
        if (item.dept != null) {
            var deptName = $("<td></td>").append(item.dept.deptName);
        } else {
            var deptName = $("<td></td>").append(" 未分配");
        }
        var btnTd = $("<td></td>");
        var delBtn = $("<button></button>")
            .addClass("btn btn-primary btn-sm")
            .append($("<span></span>")
                .addClass("glyphicon glyphicon-pencil"))
            .append("编辑")
            .appendTo(btnTd);
        var edBtn = $("<button></button>")
            .addClass("btn btn-danger btn-sm")
            .append($("<span></span>")
                .addClass("glyphicon glyphicon-trash"))
            .append("删除")
            .appendTo(btnTd);
        $("<tr></tr>")
            .append(deptId)
            .append(empName)
            .append(gender)
            .append(email)
            .append(deptName)
            .append(btnTd)
            .appendTo("#empsTable tbody");
    });
    // 构建信息
    $("#pageNum").append("当前页码： " + pageInfo.pageNum);
    $("#pages").append("总页码数： " + pageInfo.pages);
    $("#total").append("总记录数：" + pageInfo.total);
    // 构建分页
    var ul = $("<ul></ul>").addClass("pagination");
    // 首页
    var firstBtn = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
    // 上一页
    var preBtn = $("<li></li>").append($("<a></a>").append($("<span></span>").attr("aria-hidden", "true").append("&laquo;")).attr("href", "#").attr("aria-label", "Previous"));
    // 下一页
    var nextBtn = $("<li></li>").append($("<a></a>").append($("<span></span>").attr("aria-hidden", "true").append("&raquo;")).attr("href", "#").attr("aria-label", "next"));
    // 末页
    var lastBtn = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
    // 判断是否还有上一页
    if (pageInfo.hasPreviousPage == false) {
        firstBtn.addClass("disabled");
        preBtn.addClass("disabled");
    } else {
        // 添加单击事件
        firstBtn.click(function () {
            findAllEmp(1, show);
        })

        preBtn.click(function () {
            findAllEmp(pageInfo.pageNum - 1, show);
        })
    }

    // 判断是否还有下一页
    if (pageInfo.hasNextPage == false) {
        lastBtn.addClass("disabled");
        nextBtn.addClass("disabled");
    } else {
        nextBtn.click(function () {
            findAllEmp(pageInfo.pageNum + 1, show);
        });
        lastBtn.click(function () {
            findAllEmp(pageInfo.pages, show);
        });
    }

    ul.append(firstBtn).append(preBtn);
    $.each(pageInfo.navigatepageNums, function (index, item) {
        var eachLi = $("<li></li>").append($("<a></a>").append(item).attr("href", "#"));
        eachLi.click(function () {
            findAllEmp(item, show);
        });
        if (pageInfo.pageNum == item) {
            eachLi.addClass("active");
        }
        ul.append(eachLi);
    })
    ul.append(nextBtn);
    ul.append(lastBtn);

    var nav = $("<nav></nav>").attr("aria-label", "Page navigation");
    nav.append(ul);
    $("#nav").append(nav);
};



$(function () {
    // 页面加载完成发送fetch请求
    findAllEmp(1, show);
    // 员工添加按钮点击事件
    $("#addEmp").click(function () {
        //清空部门信息
        $("#empAddModal select").empty();
        // 获取所有部门信息
        findAllDept();
        $('#empAddModal').modal({
            backdrop:false
        });
    });
});