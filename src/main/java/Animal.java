public abstract class Animal {
    private int weight;

    public Animal(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public abstract boolean eat(Object food);

}
