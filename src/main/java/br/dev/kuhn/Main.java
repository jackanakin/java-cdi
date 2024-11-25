package br.dev.kuhn;

import br.dev.kuhn.hr.Employee;
import br.dev.kuhn.hr.IPaymentService;
import br.dev.kuhn.hr.factories.CalculadoraSalariosFactoryReflection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee = new Employee();

        CalculadoraSalariosFactoryReflection factory = new CalculadoraSalariosFactoryReflection();

        IPaymentService calculadora = factory.create();

        calculadora.calculate(employee);
    }
}