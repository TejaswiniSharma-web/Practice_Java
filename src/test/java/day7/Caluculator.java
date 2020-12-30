package day7;

public class Caluculator {
    public static void main(String[] args) {
        Caluculator cal =new Caluculator();
        cal.add(33,2);
        cal.studentDetails("Aravind","Blr",430);

    }
    //method overloading
    public void add(int x,int y){
        int z=x + y;
        System.out.println("Sum of Two Number"+z);

    }
    //method overloading
    public  void add(int x,int y,int r){
        int z=x + y + r;
        System.out.println("Sum of three numbers"+z);

    }
    public  void studentDetails(String name,String city,int roll){
        System.out.println("Student name is"+name);
        System.out.println("Student is form"+city);
        System.out.println("Student roll num"+roll);
    }
}
