package com.simple.mq.api.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author wuping
 * @date 2019/1/11
 */

public class Message<T extends MessageData> implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * topic
     */
    private String topic;
    /**
     * 组名
     */
    private String groupName;
    /**
     * 流水号
     */
    private String transactionId;
    /**
     * 消息
     */
    private T msg;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("topic", topic)
                .append("groupName", groupName)
                .append("transactionId", transactionId)
                .append("msg", msg)
                .toString();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
