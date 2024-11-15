public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(2, 3);
        Vector v2 = new Vector(1, 4);

        Vector suma = v1.sumar(v2);
        System.out.println(suma); // Imprimirá algo como (3.0, 7.0)

        Vector resta = v1.subtract(v2);
        System.out.println(resta);

        Vector escalar = v1.multiply(2);
        System.out.println(escalar);
    }
}