package DstructureLab;

public class Main {
    public static void main(String[] args) {
        DataStructure ds =new DataStructure();

        ds.addAge(30);
        ds.addAge(28);
        ds.addAge(31);
        ds.addAge("Bogus");
        ds.addAge("Boguuhhs");

        ds.addStudent("Steve");
        ds.addStudent("Ronnie");
        ds.addStudent("Alison");
        ds.addStudent(222);

        ds.addMandG("Truck", 1.1);
        ds.addMandG("Publishing", 2.9);
        ds.addMandG("Science", 3.8);
        ds.addMandG(4.3, "Vibes");
        ds.addMandG(8.9, "7.4");

        ds.addNation("French");
        ds.addNation("American");
        ds.addNation("Belgian");
        ds.addNation(64);

        ds.addHometown("Muncie");
        ds.addHometown("Caramel");
        ds.addHometown("Central City");
        ds.addHometown(6.63);

        ds.addHomeState("Texas");
        ds.addHomeState("California");
        ds.addHomeState("Arizona");
        ds.addHomeState(99);

        ds.printArrayItems();

        ds.removeAge();
        ds.removeStudent("Ronnie");
        ds.removeMandG("Truck", 1.1);
        ds.removeNation("French");
        ds.removeHometown();
        ds.removeHomeState("California");

        ds.printArrayItems();
    }
}
