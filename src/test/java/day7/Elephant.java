package day7;
// is-a  relation
//Elephant -->child class,subclass,dervied classs
//Animal-->parent class,Super class
public class Elephant extends Animal {
    public static void main(String[] args) {
        Animal an =new Animal();
        an.legs();
        an.tail();

    }
public  void tusk(){
    System.out.println("Tusk");
}
}
