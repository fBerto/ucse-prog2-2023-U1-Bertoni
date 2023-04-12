package Bridge;

public class PaymentManager {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor; //es como cuando definis color en la clase forma
    public void processPayment(double amount,String  provider){

        if (provider == "paypal"){
            paymentProcessor = new PaypalPaymentProcessor(paymentGateway);
        }else {
            paymentProcessor = new MercadoPagoPaymentProcessor(paymentGateway);
        }
        paymentProcessor.processPayment(amount);
    }
    public void processRefund(double monto, int idTransaccion, String provider){
        if (provider == "paypal"){
            paymentProcessor = new PaypalPaymentProcessor(paymentGateway);
        }else {
            paymentProcessor = new MercadoPagoPaymentProcessor(paymentGateway);
        }
        paymentProcessor.refundPayment(monto,idTransaccion);
    }
}
