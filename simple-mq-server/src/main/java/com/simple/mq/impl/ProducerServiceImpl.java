package com.simple.mq.impl;

import com.simple.mq.api.ProducerService;
import com.simple.mq.api.model.Message;
import com.simple.mq.api.model.MessageData;
import com.simple.mq.api.model.SendResult;
import org.springframework.stereotype.Component;

/**
 * @author wuping
 * @date 2019/1/11
 */

@Component
public class ProducerServiceImpl implements ProducerService {
    @Override
    public SendResult send(Message<? extends MessageData> message) {
        return null;
    }
}
