public class Ropa implements Product{
    private String nombre;
    private double precio;
    @Override
    public void setNombre(String name) {
        this.nombre=name;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setPrecio(double price) {
        this.precio=price;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
