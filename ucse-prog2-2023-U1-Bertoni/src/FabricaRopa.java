public class FabricaRopa extends ProductFactory{

    @Override
    public Product createProduct() {
        return new Ropa();
    }
}
