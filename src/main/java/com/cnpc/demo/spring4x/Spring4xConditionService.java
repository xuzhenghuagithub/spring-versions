package com.cnpc.demo.spring4x;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * conditioncal注解
 * 1.在某个情况下不装载
 * 2.不满足某个条件的时候不装载
 * 3.已经装在过了不会重复装载
 * match方法值为true才装载
 */
@Service
@Conditional(MyCondition.class)
public class Spring4xConditionService {
}
