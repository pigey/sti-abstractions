import java.util.Random;

public class Owl extends Animal {
    private boolean hungry;
    private PineTree tree;


    public Owl(int weight, boolean hungry){
        super(weight);
        this.hungry = hungry;

    }
    public void setTree(PineTree tree){
        this.tree = tree;
    }

    @Override
    public boolean eat(Object food){
        Random rand = new Random();
        boolean catchSquirrel = rand.nextInt(2) == 1;
        if (hungry && catchSquirrel){
            if (tree.removeSquirrel()){
                return true;
            }
        }
        return false;


    }


}
