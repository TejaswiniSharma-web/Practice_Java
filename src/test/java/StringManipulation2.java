public class StringManipulation2 {
    public static void main(String[] args) {
        String name ="Aravind Bangalore";
        System.out.println("Is empty"+  name.isEmpty());
        System.out.println(name.charAt(0));
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
            System.out.println(name.toLowerCase().replace("a","g"));
         String n1 ="Arvind";
         String n2 ="aravind";
         System.out.println(n1+"----"+n1.hashCode());
         System.out.println(n2+"");

        }
    }
}