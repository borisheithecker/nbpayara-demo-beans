/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.demo.beans;

import java.util.List;

/**
 *
 * @author boris.heithecker
 */
public interface MessagesBean {

    public List<Message> getMessages();
    
    public void postMessage(String message);

}
