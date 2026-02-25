import java.util.Scanner;
import java.util.Random;
public class Game {
    public void start(){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter Player1 name :");
        String name1 = sc.nextLine();
        System.out.print("Enter Player2 name :");
        String name2 = sc.nextLine();
        sc.nextLine();
        Player1 p1 = new Player1(name1,100);
        Player2 p2 = new Player2(name2,100);
        String exit = " ";
        while(!exit.equalsIgnoreCase("exit")){
            System.out.printf("%s : Enter any key to attack :",name1);
            String atk1 = sc.nextLine();
            p1.attack(p2);
            System.out.printf("%s : Enter any key to attack :",name2);
            String atk2 = sc.nextLine();
            p2.attack(p1);
            System.out.println("if you want to Quit press exit or Pree any other key ");
            exit = sc.nextLine();
        }
    }
}

