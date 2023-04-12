package Bridge;

public class MercadoPagoPaymentProcessor extends PaymentProcessor{

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

    public MercadoPagoPaymentProcessor(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }
}
