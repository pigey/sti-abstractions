public class Squirrel extends Animal {


    private int numOfConesInNest;
    private PineTree tree;
    public Squirrel(int weight, int numOfConesInNest){
        super(weight);
        this.numOfConesInNest = numOfConesInNest;
    }


    public void setTree(PineTree tree){
        this.tree = tree;
    }

    @Override
    public boolean eat(Object food){
    return false;
    }
    public int eat(int numOfCones){
        if (numOfCones > numOfConesInNest){
           return 0;
        }
        else{
           numOfConesInNest -= numOfCones;
           return numOfCones;
        }
    }


}
