package day8;

public abstract class Mobile {
    public void click(){
        System.out.println("Click");
    }
        abstract  void  swipe();
        abstract void scroll();
        abstract  void  tap();
}
