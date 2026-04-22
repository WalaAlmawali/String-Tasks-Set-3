public class Ghappy {
    public static void main(String[] args) {




    }
    public boolean gHappy(String str){

        boolean happy = false;

        for(int i =0 ; i<str.length()- 1;i++){


            if(str.charAt(i) == 'g' && str.charAt(i-1)=='g'||str.charAt(i+1)=='g'){
                happy = true;

            }

        }
        return happy;
    }

    }
