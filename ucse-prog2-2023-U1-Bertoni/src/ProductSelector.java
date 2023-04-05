public class ProductSelector {
    public static Product selectProduct(String category) { //static para no tener que crear el objeto
        if (category =="electronica"){
            return new FabricaElectronica().createProduct();
        } else if (category =="ropa") {
            return new FabricaRopa().createProduct();
        }
        else {
            return new FabricaVehiculo().createProduct();
        }
    }
}
