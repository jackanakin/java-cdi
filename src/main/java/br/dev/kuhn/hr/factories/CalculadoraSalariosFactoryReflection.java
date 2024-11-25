package br.dev.kuhn.hr.factories;

import java.util.ResourceBundle;

import br.dev.kuhn.hr.IPaymentService;
import br.dev.kuhn.hr.impl.DefaultPaymentService;

public class CalculadoraSalariosFactoryReflection {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("dependencias");

    public IPaymentService create() {
        try {
            String nomeClasse = resourceBundle.getString("calculadora_de_salarios");

            Class<?> clazz = Class.forName(nomeClasse);

            return clazz.asSubclass(IPaymentService.class).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return new DefaultPaymentService();
        }
    }
}
