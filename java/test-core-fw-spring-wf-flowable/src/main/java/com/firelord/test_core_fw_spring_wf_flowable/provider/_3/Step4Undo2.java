package com.firelord.test_core_fw_spring_wf_flowable.provider._3;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class Step4Undo2 implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Step4Undo2...");
    }
}
