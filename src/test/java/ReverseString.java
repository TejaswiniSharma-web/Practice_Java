import java.util.regex.Pattern;

public class ReverseString {
    public static void main(String[] args) {
        String message ="Hello all good morning";
        Pattern pattern =Pattern.compile("\\s");
        String[] temp=pattern.split(message);
        String result="";
        String n1 ="Aravind";
        String n2 ="Kumar";
        String n3="Gyan";

//        String[]temp =pattern.split(message);
   /*     for (String str:temp){
            System.out.println(str);

        }*/
for (int i=0;i<temp.length;i++){
    if (i==temp.length-1){
        result=temp[i]+result;

    }else {
        result=" "+temp[i]+result;

    }
}
System.out.println(message);
System.out.println(result);
    }
}
