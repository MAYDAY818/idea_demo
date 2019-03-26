package com.spring.hello4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("numberBean")
public class Number {
    @Value("999")
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}