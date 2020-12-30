package day4;

public class Loops4 {
    public static void main(String[] args) {
        String str1 ="Aravind";
        String str2 ="Teju";
        String[]str={"Aravind","Teju","Gaym","Pooja"};
        for (String ref:str){
            if (ref.equals("Teju")){
                System.out.println(ref+"Match");
                break;
                }else {
                System.out.println("Not Match");


            }
        }
    }
}
