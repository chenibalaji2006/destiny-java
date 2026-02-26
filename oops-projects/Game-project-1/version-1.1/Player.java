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
    public void attack(Player player){
        Random rand = new Random();
        System.out.println(name +" attacked "+ player.getName());
        int num = rand.nextInt(41)+10;
        player.takeDamage(num);
        System.out.println("Remaining health : " +player.getHealth());
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
