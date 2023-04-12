import Bridge.PaymentManager;
import FactoryMethod.Product;
import FactoryMethod.ProductSelector;
import Strategy.AirShippingStrategy;
import Strategy.ShippingCalculator;
import Strategy.ShippingStrategy;
import Strategy.TruckShippingStrategy;

public class Main {
     static void main(String[] args) {
        Product producto = ProductSelector.selectProduct("ropa"); //TODO: me hace ruido el setear a travez de interfaz y no objeto
        producto.setNombre("Remera");
        producto.setPrecio(20.30);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());

        PaymentManager manager = new PaymentManager();
        manager.processPayment(200.5,"paypal");
        manager.processPayment(200.5,"mercadolibre");
        manager.processRefund(200.5,0,"paypal");
        manager.processRefund(200.5,1,"mercadolibre");

        ShippingCalculator calculator = new ShippingCalculator(25,5,"Arg","Colombia",(new AirShippingStrategy()));
        System.out.println("El costo por aire es de "+ calculator.calculateCost());
        calculator.setShippingStrategy(new TruckShippingStrategy());
        System.out.println("El costo por tierra es de "+ calculator.calculateCost());
    }
}