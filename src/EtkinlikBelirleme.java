import java.util.Scanner;

public class EtkinlikBelirleme {
    public static void main(String[] args) {
        int sicaklik;

        Scanner inp=new Scanner(System.in);

        System.out.print("Sicaklik Degerini Giriniz : ");
        sicaklik=inp.nextInt();

        if (sicaklik<5){
            System.out.println("Bugun kayak yapmak icin iyi bir gun...");

        } else if (sicaklik>=5 && sicaklik<=15) {
            System.out.println("Bugun sinemaya gitmek icin iyi bir gun...");

        } else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Bugun piknik yapmak icin iyi bir gun...");
        } else if (sicaklik>25) {
            System.out.println("Yüzmek icin ideal bir hava...");
        }

    }
}
