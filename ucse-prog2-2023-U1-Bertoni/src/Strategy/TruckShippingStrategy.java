package Strategy;

public class TruckShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateCost(int peso, int dimensiones, String origen, String destino) {
        int  precio = peso+dimensiones;
        if(destino == "francia"){
            precio = precio * 4;
        }
        return precio;
    }
}
