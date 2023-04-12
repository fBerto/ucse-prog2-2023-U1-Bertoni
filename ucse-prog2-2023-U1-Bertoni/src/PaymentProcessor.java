import java.util.List;

public abstract class PaymentProcessor {
    List<Integer> transacciones;
    protected PaymentGateway paymentGateway;
    public abstract void processPayment(double monto);
    public abstract void refundPayment(double monto, int IdTransaccion);

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    protected int generarIdTransaccion() {
        return transacciones.size() + 1;
    }
}
