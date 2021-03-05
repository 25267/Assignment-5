package org.example.event.handler;

import org.example.event.SalaryChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SalaryChangeEventHandler  implements ApplicationListener<SalaryChangeEvent> {

    @Override
    public void onApplicationEvent(SalaryChangeEvent salaryChangeEvent) {
        System.out.println("SalaryChangeEventHandler.onApplicationEvent");
        System.out.println("salary changed on: " + salaryChangeEvent.getEmployee().getType());
    }
}
