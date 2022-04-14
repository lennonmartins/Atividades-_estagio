public class Exc22 {
    public static void main(String[] args) {
        int tempoTotal = 86399;
        int horas;
        int minutos;
        int segundos;

        horas = ((tempoTotal/ 60)/60);
        minutos = ((tempoTotal/ 60)%60);
        segundos = (tempoTotal% 60);
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
