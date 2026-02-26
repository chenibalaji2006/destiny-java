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
    public void attack(Player player) throws InterruptedException{
        System.out.println("your skills : [1]basic_attack [2]sword_slash [3]heal [4]continuous_sword_slash");
        System.out.print("Enter your choice "+name+" :");
        boolean randomer = rand.nextBoolean();
        int atk = sc.nextInt();
        if(atk == 1){
            if(randomer){
                System.out.println(name+" landed an crit-hit to "+player.getName());
                int dmg = rand.nextInt(21)+30;
                player.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(player.getName()+" remaining health is "+player.getHealth());
            }
            else{
                System.out.println(name+" landed an basic attack to "+player.getName());
                int dmg = rand.nextInt(21)+10;
                player.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(player.getName()+" remaining health "+player.getHealth());
            }
        }
        else if(atk == 2){
            if(randomer){
                System.out.println(name+" landed an sword_slash crit-hit to "+player.getName());
                int dmg = rand.nextInt(21)+80;
                player.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(player.getName()+" remaining health is "+player.getHealth());
            }
            else{
                System.out.println(name+" landed an basic attack to "+player.getName());
                int dmg = rand.nextInt(41)+40;
                player.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(player.getName()+" remaining health "+player.getHealth());
            }
        }
        else if(atk == 3){
            System.out.println(name+"used the goddess of blessings to recover health ");
            int holyBlessings = rand.nextInt(21)+40;
            this.takeHeal(holyBlessings);
            System.out.println("recovered "+holyBlessings+" health");
        }
        else if(atk == 4){
            System.out.println(name+" landed an continuous_sword_slash to "+player.getName());
            int dmg = rand.nextInt(11)+70;
            for(int k = 0;k<2;k++){
                System.out.println("sword_slash.......");
                player.takeDamage(dmg);
            }
            System.out.println("total damage dealed : "+dmg*2);
        }
        else{
            System.out.println("enteres invalid choice.....ErRor..eRRoR...errOr..");
        }
        if(player.getHealth() == 0){
            System.out.println(player.getName()+" is defeated");
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
