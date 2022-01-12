import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PineTree {
    private int numOfCones;
    private List<Squirrel> squirrels;
    private Owl owl;

    public PineTree(int numOfCones){
        this.numOfCones = numOfCones;
        squirrels = new ArrayList<>();
        owl = null;
    }

    public void setOwl(Owl owl){
        this.owl=owl;
        owl.setTree(this);
    }
    public void addSquirrel(Squirrel squirrel){
        squirrel.setTree(this);
        squirrels.add(squirrel);
    }

    public boolean removeSquirrel(){
        int sizeList = squirrels.size();
        if (sizeList > 0) {
            squirrels.remove(0);
            return true;
        }
        return false;
    }

    public int getCones(int requestedNumOfCones) {
        if (numOfCones - requestedNumOfCones >=0){
            numOfCones -= requestedNumOfCones;
            return requestedNumOfCones;
        }
        else{
            int returnedCones = numOfCones;
            numOfCones=0;
            return returnedCones;

        }
    }

    public boolean fall(int totWeight, int wind, int earthquake){
        Random rand = new Random();
        if (wind < 17 || earthquake < 17 || totWeight < 2200){
            return true;
        }
        else{
            return false;
        }


    }
}
