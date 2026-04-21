import java.util.*;

public class WithoutString {
    public static void main(String[] args) {


        String str = "Hello there";
        String str1 = "x";


        System.out.println(withoutString(str,str1));

    }

    public static String withoutString(String str, String str1) {
        Set<Character> set = new HashSet<>();

        String result = "" ;
        if(str.contains(str1)){
            if(str1.length()>1){
           int startIndex= str.indexOf(str1);


           for(int i =0 ; i< str.length();i++){
               if(i==startIndex || i<= str1.length()+1 && i>=startIndex){
                   continue;
               } else{
                   result+= str.charAt(i);
               }

           }

        } else if(str1.length()<=1){

                set.add(str1.charAt(0));
                for(int i =0 ; i< str.length();i++){

                    if(set.contains(str.charAt(i))){
                        continue;
                    }else{
                        result+= str.charAt(i);
                    }

                }

            }
        } else{
            result = str;
        }
        return result;
    }

    }
