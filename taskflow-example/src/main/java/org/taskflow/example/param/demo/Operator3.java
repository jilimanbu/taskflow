package org.taskflow.example.param.demo;


import org.taskflow.config.op.OpConfig;
import org.taskflow.core.operator.IOperator;

/**
 * Created by ytyht226 on 2022/6/23.
 */
public class Operator3 implements IOperator<OpConfig, OpConfig> {
    @Override
    public OpConfig execute(OpConfig param) throws Exception {
        //业务逻辑部分

        param.getExtMap().put("op3", "op3");
        return param;
    }
}