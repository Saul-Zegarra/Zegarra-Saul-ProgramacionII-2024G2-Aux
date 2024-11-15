public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector sumar(Vector otro) {
        return new Vector(this.x + otro.x, this.y + otro.y);
    }

    public Vector restar(Vector otro) {
        return new Vector(this.x - otro.x, this.y - otro.y);
    }

    public Vector multiplicar(double escalar) {
        return new Vector(this.x * escalar, this.y * escalar);
    }

    public Vector add(Vector otro) {
        return this.sumar(otro);
    }

    public Vector subtract(Vector otro) {
        return this.restar(otro);
    }

    public Vector multiply(double escalar) {
        return this.multiplicar(escalar);
    }

}