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
        Player p1 = new Player(name1,200);
        Player p2 = new Player(name2,200);
        String exit = " ";
        while(!exit.equalsIgnoreCase("exit")&&p1.isAlive()&&p2.isAlive()){
            System.out.println("Game start : ");
            System.out.println("Enter any number to attack "+name2+" :");
            int a1 = sc.nextInt();
            sc.nextLine();
            p1.attack(p2);
            System.out.println("Enter any number to attack "+name1+" :");
            int a2 = sc.nextInt();
            sc.nextLine();
            p2.attack(p1);
            System.out.print("Enter exit to leave or to continue enter any key : "); 
            exit = sc.nextLine();
        }
    }
}

