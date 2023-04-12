package Strategy;

public class AirShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateCost(int peso, int dimensiones, String origen, String destino) {
        int  precio = peso+dimensiones * 3;
        if(destino == "francia"){
            precio = precio * 4;
        }
        return precio;
    }
}
