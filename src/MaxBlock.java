public class MaxBlock {
    public static void main(String[] args) {



    }
    public int maxBlock(String str){
        int max = 0;
        int count = 0;

       for(int i =0 ; i< str.length();i++){

           if(str.charAt(i)== str.charAt(i+1)){
               count++;
           }else {
               if(count>max){
                   max = count;
               }
           }


       }
       return max;
    }

    }
