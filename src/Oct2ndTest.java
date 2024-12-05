public class Oct2ndTest {
    public static void main(String[] args) {
        String name = "Owen";
        String names = "Sonic, Amy, Surge";
        Student student1 = new Student("Jared", 163793, "Mathematics");
        Student student2 = new Student();
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        Mobians mobian1 = new Mobians("Sonic", "Hedgehog", "Super Speed");
        Mobians mobian2 = new Mobians("Surge", "Tenrec", "Super Speed and Electrokenisis");
        mobian1.mobianFile();
        mobian2.mobianFile();
    }
}
