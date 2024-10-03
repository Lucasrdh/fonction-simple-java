public class Main {
    static void myMethod() {
        int cartonsTotal = 34;
        int camionTotal = 9;
        int cartonsRestant = cartonsTotal;
        while (cartonsRestant > 0) {

            int cartonsPris;
            if (cartonsRestant < camionTotal) {
                cartonsPris = cartonsRestant;
            } else {
                cartonsPris = camionTotal;
            }
            System.out.println("Le camion a pris " + cartonsPris + " cartons,il reste " + (cartonsRestant - cartonsPris) + " cartons ");
            cartonsRestant = cartonsRestant - cartonsPris;
        }

    }

    public static void main(String[] args) {
        myMethod();
    }
}
