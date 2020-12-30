package day7;

public class Car {

   Car(){
        System.out.println("I am default constructor");
   }
   Car(int cc,String model){
        System.out.println("Car cc is"+cc);
        System.out.println("Car model is"+model);
   }

    public static void main(String[] args) {
        Car c =new Car(10,"Hyundai");
        new Car();

    }


}
