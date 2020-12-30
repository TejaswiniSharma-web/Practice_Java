package day9;


import day8.Axis;
import day8.HDFC;
import day8.RBI;

public class ImplementationPart2 {
    public static void main(String[] args) {
        RBI rbi2;
        rbi2 =new Axis();
        System.out.println("Axis Bank Interset Rate is"+rbi2.getInterset());
        rbi2 =new HDFC();
        System.out.println("HDFC bank int rate is"+rbi2.getInterset());
        rbi2 =new Axis();
        System.out.println("SBI bank rate is "+rbi2.getInterset());
    }
}
