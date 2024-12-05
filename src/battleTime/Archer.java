package battleTime;

public class Archer extends Character implements Fighter{
    private int agility;

    public Archer(String name, int HP, int Agility){
        super(name, Math.min(HP, MAX_HEALTH));
        this.agility = Agility;
    }
    @Override
    public void attack(){
        System.out.println(name + " shoots an arrow! Agility: " + agility);
    }
    @Override
    public void defend(){
        System.out.println(name + " dodges the attack swiftly.");
    }
}
