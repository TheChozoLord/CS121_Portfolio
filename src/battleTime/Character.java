package battleTime;

public abstract class Character {
    public static final int MAX_HEALTH = 100;
    protected String name;
    protected int HP;

    public Character(String name, int HP){
        this.name = name;
        this.HP = Math.min(HP, MAX_HEALTH);
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void setHealth(int health){
        this.HP = health;
    }

    public boolean isAlive() {
        boolean Test = true;
        if (HP > 0){
            return  Test;
        }
        else{
            Test = false;
            return Test;
        }
    }

    public abstract void attack();
}