import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PineTree tree = new PineTree(20);

        Owl owl = new Owl(80,true);
        tree.setOwl(owl);
        Random rand = new Random();
        Squirrel squirrel = null;
        int totWeight = 0;
        for (int i = 0; i < 5; i++){
            int weight = rand.nextInt(200)+300;
            int cones = rand.nextInt(20);
            Squirrel s = new Squirrel(weight,cones);
            tree.addSquirrel(s);
            totWeight += s.getWeight();
            squirrel = s;
        }
        //set up complete Story begins

        int conesToEat = rand.nextInt(5)+1;
        int ate = squirrel.eat(conesToEat);
        int wind = rand.nextInt(20);
        int earthquake = rand.nextInt(20);
        if (totWeight >2200) {
            System.out.println("The squirrels in the tree was too fat so the tree fell");
        }
        else if(tree.fall(totWeight,wind,earthquake)) {

            if (ate > 0) {
                System.out.println("Squirrel ate " + ate + " cones");
            } else {
                System.out.println("The squirrel did not find enough food in its nest");
            }
            if (owl.eat()) {
                System.out.println("The owl ate a squirrel");
            } else {
                System.out.println("Owl found no squirrel to eat");
            }
        }
        else{
            System.out.println("The tree got struck by a natural disaster so it fell");
        }

    }
}
