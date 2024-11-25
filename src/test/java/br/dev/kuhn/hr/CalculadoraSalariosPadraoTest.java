package br.dev.kuhn.hr;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.dev.kuhn.hr.factories.CalculadoraSalariosFactoryReflection;

public class CalculadoraSalariosPadraoTest {
    @Test
    public void calcular() {
        CalculadoraSalariosFactoryReflection factory = new CalculadoraSalariosFactoryReflection();

        IPaymentService calculator = factory.create();

        BigDecimal resultado = calculator.calculate(null);

        assertEquals(resultado, null);
    }
}
