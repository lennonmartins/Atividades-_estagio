public class Exc11 {
    public static void main(String[] args) {
        double areaHexagono;
        double comprimento = 6;

        areaHexagono = (6*Math.pow(comprimento,2)/(4*Math.tan((Math.PI/6))));
        System.out.println("A áre ado hexágono de lado " + comprimento + " é igual a = " + areaHexagono);
    }
}
