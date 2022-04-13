public class Exc7_2 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1 + " agora é um tipo " + ((Object)numero1).getClass().getSimpleName());
        String numeroStr1 = Integer.toString(numero1);
        System.out.println(numero1 + " agora é um tipo " + numeroStr1.getClass().getSimpleName());
        double numeroDbl1 = numero1;
        System.out.println(numero1 + " agora é um tipo " + ((Object)numeroDbl1).getClass().getSimpleName());
        


        System.out.println(numero2 + " agora é um tipo " + ((Object)numero2).getClass().getSimpleName());
        String numeroStr2 = Integer.toString(numero2);
        System.out.println(numero2 + " agora é um tipo " + numeroStr2.getClass().getSimpleName());
        double numeroDbl2 = numero2;
        System.out.println(numero2 + " agora é um tipo " + ((Object)numeroDbl2).getClass().getSimpleName());




    }
    
}
