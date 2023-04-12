package FactoryMethod;

public class FabricaVehiculo extends ProductFactory {

    @Override
    public Product createProduct() {
        return new Vehiculo();
    }
}
