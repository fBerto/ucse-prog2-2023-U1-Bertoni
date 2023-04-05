public class Main {
     static void main(String[] args) {
        Product producto = ProductSelector.selectProduct("ropa"); //TODO: me hace ruido el setear a travez de interfaz y no objeto
        producto.setNombre("Remera");
        producto.setPrecio(20.30);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}