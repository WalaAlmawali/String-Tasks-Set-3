public class MaxBlock {
    public static void main(String[] args) {

        MaxBlock ex = new MaxBlock();
        System.out.print(ex.maxBlock("abbCCCddBBBxx"));


    }
    public int maxBlock(String str){
        int max = 1;
        int count = 1;

       for(int i =0 ; i< str.length()-1;i++){

           if(str.charAt(i)== str.charAt(i+1)){
               count++;
           }else{
               count = 1;
           }
               if(count > max){
                   max = count;
               }
           }

        return max;
       }

    }


