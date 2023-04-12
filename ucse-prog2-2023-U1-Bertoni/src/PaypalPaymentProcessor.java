import java.util.ArrayList;
import java.util.List;

public class PaypalPaymentProcessor extends PaymentProcessor{

    @Override
    public void processPayment(double monto) {
        paymentGateway.authorize(monto);
        paymentGateway.capture(monto,generarIdTransaccion());
        System.out.println("Se proceso el pago por PayPal");
    }

    @Override
    public void refundPayment(double monto, int IdTransaccion) {
        System.out.println("Se reembolso a PayPal el pago num"+ IdTransaccion + "El cual poseia un monto de:" + monto);
    }
    public PaypalPaymentProcessor(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }
}
