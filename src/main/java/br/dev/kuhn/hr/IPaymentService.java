package br.dev.kuhn.hr;

import java.math.BigDecimal;

public interface IPaymentService {
    BigDecimal calculate(Employee employee);
}
