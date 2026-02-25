public class Player2 {
    private String name;
    private int health;
    public Player2(String name,int health){
        this.name = name;
        this.health = health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health<0){
            health = 0;
        }
    }
    public void attack(Player1 player1){
        System.out.println(name+" attacked "+player1.getName());
        player1.takeDamage(20);
    }
    public String getName(){
        return name;
    }
    public int health(){
        return health;
    }
}
