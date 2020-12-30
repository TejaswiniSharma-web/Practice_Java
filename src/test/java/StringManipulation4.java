public class StringManipulation4 {
    public static void main(String[] args) {
        String details="Aravind_8904483799";
        String name=details.split("_")[0];
        String mob =details.split("_")[1];
        System.out.println("Name"+name);
        System.out.println("Mob"+mob);
    }
}
