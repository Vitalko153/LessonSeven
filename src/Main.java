import java.util.Scanner;

public class Main {


    public static void main(String arg[]){
        int userFood = 20;
        System.out.println("Котики хотят есть, сколько еды им положить в тарелку:");
        Scanner sc = new Scanner(System.in);
        userFood = sc.nextInt();


        Cat barsic = new Cat("Барсик", 10);
        Cat garfild = new Cat("Гарфилд", 15);
        Cat stepa = new Cat("Степа", 8);

        Plate plate = new Plate(userFood);
        
        barsic.eat();
        garfild.eat();
        stepa.eat();
        System.out.println(Plate.food);

    }
}
