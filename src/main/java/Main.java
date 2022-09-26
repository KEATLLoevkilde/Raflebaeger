import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vælg antal terninger: ");
        int antalTerninger = sc.nextInt();

        Raflebæger raflebæger = new Raflebæger(antalTerninger);
        raflebæger.ryst();
        System.out.println(raflebæger.se());
    }
}
