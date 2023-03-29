// La clase creadora declara el método fábrica que debe devolver un objeto de una clase de producto.
// Normalmente, las subclases de la creadora proporcionan la implementación de este método.
abstract class ProductFactory implements IProduct {
    // La creadora también puede proporcionar cierto implementación por defecto del método fábrica.
    abstract void createProduct();
}