import java.util.Random;
import java.util.Scanner;
public class Player {
    private String name;
    private int health;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public Player(String name,int health){
        this.name = name;
        this.health = health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health<0){
            health = 0;
        }
    }
    public void takeHeal(int heal){
        health += heal;
        if(health>200){
            health = 200;
        }
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public boolean isAlive(){
        return health>0;
    }
}
