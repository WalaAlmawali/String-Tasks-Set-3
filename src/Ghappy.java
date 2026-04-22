public class Ghappy {
    public static void main(String[] args) {


        Ghappy ex = new Ghappy();
        System.out.println(ex.gHappy("xxggyygxx"));


    }

    public boolean gHappy(String str) {
        boolean happy = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g') {
                if (!(i > 0 && str.charAt(i - 1) == 'g') && !(i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    happy= false;
                }
            }

        }
        return happy;
    }
}
