package battleTime;

public class Mage extends Character implements Fighter{
    private int magicPower;

    public Mage(String name, int HP, int magicPower){
        super(name, Math.min(HP, MAX_HEALTH));
        this.magicPower = magicPower;
    }
    @Override
    public void attack(){
        System.out.println(name + " cast fireball! Magic Power: " + magicPower);
    }

    @Override
    public void defend(){
        System.out.println(name + " conjures a magical barrier.");
    }

}
