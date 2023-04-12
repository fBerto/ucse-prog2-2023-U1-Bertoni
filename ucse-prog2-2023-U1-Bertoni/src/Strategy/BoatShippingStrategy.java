package Strategy;

public class BoatShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateCost(int peso, int dimensiones, String origen, String destino) {
        int  precio = peso+dimensiones * 2;
        if(destino == "francia"){
            precio = precio * 4;
        }
        return precio;
    }
}
