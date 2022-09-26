import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private ArrayList<Terning> terninger;

    public Raflebæger (int antalTerninger) {
        this.antalTerninger = antalTerninger;
        this.terninger = new ArrayList<Terning>();
    }
    public int ryst(){
        for (int i = 0; i < antalTerninger; i++) {
            terninger.add(new Terning());
        }

        int samledeAntalØjne = 0;
        for (Terning t: terninger) {
            samledeAntalØjne += t.getØjne();
        }
        return samledeAntalØjne;
    }

    public ArrayList<Terning> se (){
        return terninger;
    }
}
