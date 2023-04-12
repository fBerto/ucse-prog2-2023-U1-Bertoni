public interface PaymentGateway {
    void authorize(double monto);
    void capture(double monto, int IdTransaccion);
}
