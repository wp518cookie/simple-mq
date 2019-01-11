package com.simple.mq.api;


import com.simple.mq.api.model.Message;
import com.simple.mq.api.model.MessageData;
import com.simple.mq.api.model.SendResult;

/**
 * @author wuping
 * @date 2019/1/11
 * 消息生产服务
 */

public interface ProducerService {
    /**
     * 发送消息
     * @param message
     * @return
     */
    SendResult send(Message<? extends MessageData> message);
}
