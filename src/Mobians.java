public class Mobians {

    String mobianName;
    String species;
    String power;
    public Mobians(){
        this.mobianName = "Namless";
        this.species = "Null";
        this.power = "None";
    }

    public Mobians(String name, String species, String power){
        this.mobianName = name;
        this.species = species;
        this.power = power;
    }

    public void mobianFile(){
        System.out.printf("Name: %s\nSpecies: %s\nAbilities: %s\n", this.mobianName, this.species, this.power);
    }
}
