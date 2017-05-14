/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.demo.beans;

import java.io.Serializable;
import org.nbpayara.spi.JMSEvent;

/**
 *
 * @author boris.heithecker
 */
public class MessageEvent implements JMSEvent, Serializable {

    private final Message message;

    public MessageEvent(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
