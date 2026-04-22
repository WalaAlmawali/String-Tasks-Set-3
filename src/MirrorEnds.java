public class MirrorEnds {
    public static void main(String[] args) {




    }

    public String mirrorEnds(String str) {

        for(int i = 0; i< str.length();i++){
            if(str.charAt(i)!= str.charAt(str.length()- 1 - i)){
                return str.substring(0,i);
            }

        }
        return "";
    }
 }
