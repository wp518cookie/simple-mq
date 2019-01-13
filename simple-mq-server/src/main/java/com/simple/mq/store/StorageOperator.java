package com.simple.mq.store;

import com.simple.mq.api.model.Message;
import com.simple.mq.api.model.MessageData;

/**
 * @author wuping
 * @date 2019/1/12
 */

public interface StorageOperator {
    void record(Message<? extends MessageData> message);
}
