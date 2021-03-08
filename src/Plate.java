import java.util.Scanner;

public class Plate {
    static int food;

    Plate(int food){
        this.food = food;

    }

    public static boolean plateFull(int appetite){
        if(appetite <= food){
            return true;
        }
        return false;
    }

    public void addFood(){
        food += 50;
    }
}
