import java.util.Random;

public class Terning {
    private int øjne;

    Random random = new Random();

    public Terning(){
        øjne = random.nextInt(6) + 1;
    }

    public int getØjne(){
        return øjne;
    }

    public String toString(){
        return "" + øjne;
    }
}
