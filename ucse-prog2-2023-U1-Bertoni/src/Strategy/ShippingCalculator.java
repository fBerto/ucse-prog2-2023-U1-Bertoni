package Strategy;

public class ShippingCalculator { //contexto
    int peso;
    int dimensiones;
    String origen;
    String destino;
    ShippingStrategy shippingStrategy;

    public ShippingCalculator(int peso, int dimensiones, String origen, String destino, ShippingStrategy shippingStrategy) {
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.origen = origen;
        this.destino = destino;
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateCost() {
        return shippingStrategy.calculateCost(peso, dimensiones, origen, destino);
    }
}
