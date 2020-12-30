package day10;

import java.util.HashSet;
import java.util.Set;

// Write a Java program to print after removing duplicates from a given string
public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str="java";
     System.out.println(removeDuplicates(str));

    }
    public  static  String removeDuplicates(String str){
        Set<Character>set=new HashSet<Character>();
        StringBuffer sf =new StringBuffer();
        for (int i=0;i<str.length();i++){
            Character c =str.charAt(i);// str.charAt(0)---->return s
        if (!set.contains(c)){ //IF is not present is hashset
            set.add(c);
            sf.append(c);
        }
        }
        return sf.toString();
    }
}
