import java.util.Scanner;

public class Plate {
    static int food;

    Plate(int food){
        this.food = food;
    }

    public static boolean plateFull(int appetite){
        if(appetite < food){
            food -= appetite;
            return true;
        }
        return false;
    }
}
