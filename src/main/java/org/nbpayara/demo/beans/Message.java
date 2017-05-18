/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.demo.beans;

import java.io.Serializable;

/**
 *
 * @author boris.heithecker
 */
public class Message implements Serializable {

    private String text;
    private String user;
    private long time;

    public Message() {
    }

    public Message(String user, String text, long time) {
        this.text = text;
        this.user = user;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Message setUser(String user) {
        this.user = user;
        return this;
    }

    public long getTime() { 
        return time; 
    }

    public void setTime(long time) {
        this.time = time;
    }

}
