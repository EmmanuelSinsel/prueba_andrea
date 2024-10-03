package SOLID;

public class LiskovSustitutionPrinciple {
    public void run_wrong(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea()); // Resultado: 50

        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(5); // Esto genera confusión, ya que un cuadrado no puede tener diferentes ancho y alto
        System.out.println("Área del cuadrado: " + square.calculateArea()); // Resultado inesperado: 25 (incorrecto)
    }

    public void run_correct(){
        ShapeParent rectangle = new RectangleChild(10, 5);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea()); // Resultado: 50

        ShapeParent square = new SquareChild(5);
        System.out.println("Área del cuadrado: " + square.calculateArea()); // Resultado: 25

    }

}


// Ejemplo de que NO hacer

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Mantener la propiedad de un cuadrado (ancho = alto)
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Mantener la propiedad de un cuadrado (ancho = alto)
    }
}


// Ejemplo de que SI hacer

abstract class ShapeParent {
    public abstract int calculateArea();
}

class RectangleChild extends ShapeParent {
    protected int width;
    protected int height;

    public RectangleChild(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class SquareChild extends ShapeParent {
    private int side;

    public SquareChild(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }
}
