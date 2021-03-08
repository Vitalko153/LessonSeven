public class Cat {
    public String name;
    boolean hunger;
    int appetite;

    Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public void eat() {
        if (!hunger && Plate.plateFull(appetite)) {
            Plate.food -= appetite;
            hunger = true;
        }
        if(hunger){
            System.out.println(name + " сытый.");
        }
        else{
            System.out.println(name + " еще голоден.");

        }
    }
}
