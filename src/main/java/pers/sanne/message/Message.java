package pers.sanne.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回json信息的通用格式
 */
public class Message implements Serializable {
    /**
     * 状态
     */
    private int status;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 数据
     */
    private Map<String, Object> data = new HashMap<>();

    /**
     * 添加返回数据,返回的还是当前对象，可以连续多次调用add方法
     * @param key
     * @param value
     * @return
     */
    public Message add(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

    /**
     * 默认成功模板
     * @return
     */
    public static Message success() {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage("success");
        return message;
    }

    /**
     * 默认失败模板
     * @return
     */
    public static Message fail() {
        Message message = new Message();
        message.setStatus(500);
        message.setMessage("fail");
        return message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
