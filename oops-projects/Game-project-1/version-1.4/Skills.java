import java.util.Scanner;
import java.util.Random;
public class Skills {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public void attack(Player attacker,Player enemy){
        System.out.println("your skills : [1]basic_attack [2]sword_slash [3]heal [4]continuous_sword_slash");
        int atk = sc.nextInt();
        boolean randomer = rand.nextBoolean();
        if(atk == 1){
            if(randomer){
                System.out.println(attacker.getName()+" landed an crit-hit to "+enemy.getName());
                int dmg = rand.nextInt(21)+30;
                enemy.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(enemy.getName()+" remaining health is "+enemy.getHealth());
            }
            else{
                System.out.println(attacker.getName()+" landed an basic attack to "+enemy.getName());
                int dmg = rand.nextInt(21)+10;
                enemy.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(enemy.getName()+" remaining health "+enemy.getHealth());
            }
        }
        else if(atk == 2){
            if(randomer){
                System.out.println(attacker.getName()+" landed an sword_slash crit-hit to "+enemy.getName());
                int dmg = rand.nextInt(21)+80;
                enemy.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(enemy.getName()+" remaining health is "+enemy.getHealth());
            }
            else{
                System.out.println(attacker.getName()+" landed an basic attack to "+enemy.getName());
                int dmg = rand.nextInt(41)+40;
                enemy.takeDamage(dmg);
                System.out.println("damaged "+dmg+"......");
                System.out.println(enemy.getName()+" remaining health "+enemy.getHealth());
            }
        }
        else if(atk == 3){
            System.out.println(attacker.getName()+"used the goddess of blessings to recover health ");
            int holyBlessings = rand.nextInt(21)+40;
            attacker.takeHeal(holyBlessings);
            System.out.println("recovered "+holyBlessings+" health");
        }
        else if(atk == 4){
            System.out.println(attacker.getName()+" used continuous_sword_slash to "+enemy.getName());
            int dmg = rand.nextInt(11)+70;
            for(int k = 0;k<2;k++){
                System.out.println("sword_slash.......");
                enemy.takeDamage(dmg);
            }
            System.out.println("total damage dealed : "+dmg*2);
        }
        else{
            System.out.println("enteres invalid choice.....ErRor..eRRoR...errOr..");
        }
        if(enemy.getHealth() == 0){
            System.out.println(enemy.getName()+" is defeated");
        }
    }
}
