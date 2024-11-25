package br.dev.kuhn.hr.impl;

import java.math.BigDecimal;

import br.dev.kuhn.hr.Employee;
import br.dev.kuhn.hr.IPaymentService;

public class ContractPaymentService implements IPaymentService {
    @Override
    public BigDecimal calculate(Employee employee) {
        System.out.println("ContractPaymentService");
        return null;
    }
}
