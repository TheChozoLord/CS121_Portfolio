package battleTime;

public class Warrior extends Character implements Fighter{
    private int Strength;

    public Warrior(String name, int HP, int Strength){
        super(name, Math.min(HP, MAX_HEALTH));
        this.Strength = Strength;
    }
    @Override
    public void attack(){
        System.out.println(name + " slashes with a sword! Strength: " + Strength);
    }

    @Override
    public void defend(){
        System.out.println(name + " blocks with their shield.");
    }
    public int getStrength() {
        return Strength;
    }
}
