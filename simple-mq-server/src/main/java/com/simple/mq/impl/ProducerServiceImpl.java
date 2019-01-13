package com.simple.mq.impl;

import com.simple.mq.api.ProducerService;
import com.simple.mq.api.model.Message;
import com.simple.mq.api.model.MessageData;
import com.simple.mq.api.model.SendResult;
import com.simple.mq.store.StorageOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wuping
 * @date 2019/1/11
 */

@Component
public class ProducerServiceImpl implements ProducerService {
    private final StorageOperator storageOperator;

    @Autowired
    public ProducerServiceImpl(StorageOperator storageOperator) {
        this.storageOperator = storageOperator;
    }

    @Override
    public SendResult send(Message<? extends MessageData> message) {
        try {
            storageOperator.record(message);
            return SendResult.OK;
        } catch (Exception e) {

        }
        return null;
    }
}
