public class Squirrel {
    private int weight;
    private int numOfConesInNest;
    private PineTree tree;
    public Squirrel(int weight, int numOfConesInNest){
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
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

    public int getWeight(){
        return weight;
    }

    public void setTree(PineTree tree){
        this.tree = tree;
    }
}
