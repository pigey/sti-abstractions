import java.util.Random;

public class Owl {
    private int wingSpan;
    private boolean hungry;
    private PineTree tree;


    public Owl(int wingSpan, boolean hungry){
        this.wingSpan = wingSpan;
        this.hungry = hungry;

    }

    public boolean eat(){
        Random rand = new Random();
        boolean catchSquirrel = rand.nextInt(2) == 1;
        if (hungry && catchSquirrel){
            if (tree.removeSquirrel()){
                return true;
            }
        }
        return false;


    }

    public void setTree(PineTree tree){
        this.tree = tree;
    }
}
