package com.simple.mq.store.fastdfs;

import com.simple.mq.api.model.Message;
import com.simple.mq.api.model.MessageData;
import com.simple.mq.store.StorageOperator;
import org.springframework.stereotype.Component;

/**
 * @author wuping
 * @date 2019/1/12
 */

@Component
public class FastdfsStorageOperatorImpl implements StorageOperator {

    @Override
    public void record(Message<? extends MessageData> message) {

    }
}
