package Strategy;

public interface ShippingStrategy {
    public double calculateCost(int peso, int dimensiones,String origen ,String destino);
}
