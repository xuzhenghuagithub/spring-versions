package com.cnpc.demo.spring3x;

import org.springframework.stereotype.Service;

@Service
public class Spring3xService {
    private int num =1;

    public Spring3xService(int num) {
        this.num = num;
    }

    public Spring3xService() {
        //类有属性时，使用注解实例化需要空参构造，否则报错
    }

    @Override
    public String toString() {
        return "Spring3xService{" +
                "num=" + num +
                '}';
    }
}
