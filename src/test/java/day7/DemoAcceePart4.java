package day7;

public class DemoAcceePart4 extends DemoAccessPart2{
    String name ="Aravind";
    protected  String city ="Bangalore";
    public String state ="Karnataka";
    public static void main(String[] args) {
    DemoAcceePart4 demo =new DemoAcceePart4();
    demo.publicMethod();

    }
    public  void childMethod(){
        System.out.println();
    }
}
