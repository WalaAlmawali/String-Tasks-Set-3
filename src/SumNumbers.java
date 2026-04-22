public class SumNumbers {
    public static void main(String[] args) {


        SumNumbers ex = new SumNumbers();
        System.out.print(ex.sumNumbers("7 11"));

    }

    public int sumNumbers(String str) {

        int sum = 0;
        int Number = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                Number = Number * 10 + (ch - '0');

            } else {
                sum += Number;
                Number = 0;
            }

        }
        sum += Number;

        return sum;

    }

    }
