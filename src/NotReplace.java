public class NotReplace {
    public static void main(String[] args) {

        NotReplace ex = new NotReplace();
        System.out.print(ex.notReplace("This is right"));

    }
    public String notReplace(String str) {


        String newStr ="";

        for (int i = 0; i < str.length(); i++) {


            if((i == 0 && str.substring(0,i+2).equals("is")) && !(Character.isLetter(str.charAt(2)))){

                newStr += "is not";
                i++;
                continue;
           }



            if(i > 0 && i< str.length()-2 &&(str.substring(i,i+2).equals("is")) && !(Character.isLetter(str.charAt(i+2))) && !(Character.isLetter(str.charAt(i-1)))){
               newStr += "is not";
               i++;
               continue;
            }

            if(i== str.length()-2 && str.substring(str.length()-2).equals("is") && !(Character.isLetter(str.charAt(str.length()-3)))){
                newStr += "is not";
                break;
            }
                newStr+= str.charAt(i);


        }
           return newStr;
        }

    }
