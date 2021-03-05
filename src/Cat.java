public class Cat {
    public String name;
    private boolean hunger = false;
    private int appetite;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(){
        hunger = Plate.plateFull(appetite);
        if(hunger == true){
            System.out.println(name + " сытый!");
        }
        else if(hunger == false){
            System.out.println(name + " все еще голоден.");
        }
    }
}
