package day8;

public class Implementation {
    public static void main(String[] args) {
        RBI rbi;
        rbi  =new Axis();
        System.out.println("Axis bank int rate is"+rbi.getInterset());
        rbi =new SBI();
        System.out.println("Sbi namk int rate"+rbi.getInterset());
    }
}
