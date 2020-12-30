package day8;

public class Andriod extends  Mobile{
    // WE cannot creart the object of the abstract class
    public static void main(String[] args) {
        Mobile mob = new Mobile() {
            @Override
            void swipe() {
                System.out.println("Swipe");
            }

            @Override
            void scroll() {
            System.out.println("Scroll");
            }

            @Override
            void tap() {
            System.out.println("tap");
            }
        };

    }

    @Override
    void swipe() {

    }

    @Override
    void scroll() {

    }

    @Override
    void tap() {

    }
}
