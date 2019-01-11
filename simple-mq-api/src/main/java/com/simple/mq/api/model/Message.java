package com.simple.mq.api.model;

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
}
