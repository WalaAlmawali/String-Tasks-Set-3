

public class WithoutString {
    public static void main(String[] args) {


        String str = "Hello there";
        String str1 = "e";


        System.out.println(withoutString(str,str1));

    }

    public static String withoutString(String str, String str1) {

        String result = "" ;
        if(str.contains(str1)){
            if(str1.length()>1){

           int startIndex= str.indexOf(str1);
           int lastIndex = startIndex + str1.length() -1;

           for(int i =0 ; i< str.length();i++){
               if(i==startIndex || i>startIndex && i<= lastIndex ){
                   continue;
               } else{
                   result+= str.charAt(i);
               }

           }

        } else if(str1.length()<=1){
                for(int i =0 ; i< str.length();i++){

                    if(str.charAt(i) == str1.charAt(0)){
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
