public class SumDigits {
    public static void main(String[] args) {

        SumDigits ex = new SumDigits();
        System.out.println(ex.sumDigits("aa1bc2d3"));


    }
    public int sumDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }

        }
        return sum;

    }

    }
