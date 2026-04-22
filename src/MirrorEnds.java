public class MirrorEnds {
    public static void main(String[] args) {

        MirrorEnds ex = new MirrorEnds();
        System.out.print(ex.mirrorEnds("abXYZba"));



    }

    public String mirrorEnds(String str) {

        for(int i = 0; i< str.length();i++){

            if(str.charAt(i)== str.charAt(str.length()- 1 - i)){
               continue;

            } else {
                return str.substring(0,i);
            }


        }
        return str;
    }
 }
