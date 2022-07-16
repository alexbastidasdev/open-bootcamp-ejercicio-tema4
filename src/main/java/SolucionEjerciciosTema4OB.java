public class SolucionEjerciciosTema4OB {
    public static void main(String[] args) {
        int numeroIf = 2;

        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es positivo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++; // En el enunciado dice que se incrementa antes de mostrarlo
            System.out.println("numeroWhile: " + numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println("numeroDoWhile: " + numeroWhile);
        } while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println("numeroFor: " + numeroFor);
        }

        String estacion = "verano";

        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }

    }
}
