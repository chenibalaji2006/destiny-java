import java.util.Random;
public class Player {
    private String name;
    private int health;
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
    public void attack(Player player) throws InterruptedException{
        for (int i = 0; i < 1; i++) {
        System.out.println("  o     o  ");
        System.out.println(" /|\\   /|\\ ");
        System.out.println(" / \\   / \\ ");
        Thread.sleep(300);
        System.out.println("  o   > o  ");
        System.out.println(" /|\\  /|\\  ");
        System.out.println(" / \\  / \\  ");
        Thread.sleep(300);
        System.out.println("\n\n\n\n");
        }
        Random rand = new Random();
        boolean atk = rand.nextBoolean();
        if(atk){
            System.out.println(name+" landed an crit-hit to "+player.getName());
            int dmg = rand.nextInt(21)+70;
            player.takeDamage(dmg);
            System.out.println("damaged "+dmg+"......");
            System.out.println(player.getName()+" remaining health is "+player.getHealth());
        }
        else{
            System.out.println(name+" landed an basic attack to "+player.getName());
            int dmg = rand.nextInt(41)+10;
            player.takeDamage(dmg);
            System.out.println("damaged "+dmg+"......");
            System.out.println(player.getName()+" remaining health "+player.getHealth());
        }
        if(getHealth() == 0){
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
