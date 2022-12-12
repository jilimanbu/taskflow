package org.taskflow.example.param.demo2;


import org.taskflow.config.op.OpConfig;
import org.taskflow.config.op.param.OpParamConfig;
import org.taskflow.core.operator.IOperator;

/**
 * Created by ytyht226 on 2022/6/23.
 */
public class Operator2 implements IOperator<String, OpConfig> {
    @Override
    public OpConfig execute(String param) throws Exception {
        //业务逻辑部分

        Object obj = Class.forName(param).getDeclaredConstructor().newInstance();
        OpConfig opConfig = (OpConfig) obj;
        OpParamConfig opParamConfig = new OpParamConfig();
        opParamConfig.setProxyObjName("Operator2");
        opConfig.setOpParamConfig(opParamConfig);
        System.out.println("2: " + opConfig);
        return opConfig;
    }
}