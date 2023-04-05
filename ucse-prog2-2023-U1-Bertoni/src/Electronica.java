public class Electronica implements Product{ //TODO:no repito propiedades?
    private String nombre;
    private double precio;
    //TODO:Probar con constructor
    //No hay Construcor pq lo tendriamos q definir tambien a la hora de crearlo en la fabrica sino
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
