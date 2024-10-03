package SOLID;

public class OpenClosedPrinciple {
    public void run(){
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Procesar pagos usando diferentes métodos
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod paypalPayment = new PayPalPayment();
        PaymentMethod googlePayPayment = new GooglePayPayment();

        paymentProcessor.process(creditCardPayment); // Procesa pago con tarjeta de crédito
        paymentProcessor.process(paypalPayment);     // Procesa pago con PayPal
        paymentProcessor.process(googlePayPayment);  // Procesa pago con Google Pay

    }

}


interface PaymentMethod {
    void processPayment();
}


class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}


class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}


class GooglePayPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing Google Pay payment...");
    }
}


class PaymentProcessor {
    public void process(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}