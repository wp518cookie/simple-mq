package com.simple.mq.api.model;

import java.io.Serializable;

/**
 * @author wuping
 * @date 2019/1/11
 */

public class SendResult implements Serializable {
    private static final long serialVersionUID = -1L;
    private boolean sendResult;
    private Throwable e;

    public boolean isSendResult() {
        return sendResult;
    }

    public void setSendResult(boolean sendResult) {
        this.sendResult = sendResult;
    }

    public Throwable getE() {
        return e;
    }

    public void setE(Throwable e) {
        this.e = e;
    }
}
