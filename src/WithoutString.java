public class WithoutString {
    public static void main(String[] args) {




    }


    public static String withoutString(String str, String str1) {

        String result = "" ;
        if(str.contains(str1)){
           int startIndex= str.indexOf(str1);


           for(int i =0 ; i< str.length();i++){
               if(i==startIndex || i<= str1.length() +1 && i>=startIndex){
                   continue;
               } else{
                   result+= str.charAt(i);
               }

           }


        }
        return result;
    }

    }
