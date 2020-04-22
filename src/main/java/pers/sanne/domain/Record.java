package pers.sanne.domain;

import java.util.Date;

public class Record {
    private Integer userId;

    private Integer categoryId;

    private Integer amount;

    private Date date;

    private String remark;

    private Boolean isNegative;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getNegative() {
        return isNegative;
    }

    public void setNegative(Boolean negative) {
        isNegative = negative;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsNegative() {
        return isNegative;
    }

    public void setIsNegative(Boolean isNegative) {
        this.isNegative = isNegative;
    }

    @Override
    public String toString() {
        return "Record{" +
                "userId=" + userId +
                ", categoryId=" + categoryId +
                ", amount=" + amount +
                ", date=" + date +
                ", remark='" + remark + '\'' +
                ", isNegative=" + isNegative +
                '}';
    }
}