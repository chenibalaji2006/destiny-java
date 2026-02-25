public class Player1 {
    private String name;
    private int health;
    public Player1(String name,int health){
        this.name = name;
        this.health = health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health<0){
            health = 0;
        }
    }
    public void attack(Player2 player2){
        System.out.println(name +" attacked "+ player2.getName());
        player2.takeDamage(20);
    }
    public String getName(){
        return name;
    }
    public int health(){
        return health;
    }
}
