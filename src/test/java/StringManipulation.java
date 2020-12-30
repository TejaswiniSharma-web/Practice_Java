public class StringManipulation {
    public static void main(String[] args) {
        String   name="Aravind Bangalore";
        System.out.println("Total count is "+name.length());
        System.out.println("Total count with out space:"+name.trim().length());
        System.out.println("To upper"+name.toLowerCase());
        System.out.println("Replace"+name.replace(" ","_"));
    }
}
