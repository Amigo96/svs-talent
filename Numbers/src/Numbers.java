public class Numbers {

    private static int wordToNumberConverter(String word) {
        int number = -1;
        switch (word) {
            case "zero":
                //System.out.print("0");
                number = 0;
                break;

            case "one":
                number = 1; //System.out.print("1");
                break;
            case "two":
                number = 2; // System.out.print("2");
                break;
            case "three":
                number = 3; //System.out.print("3");
                break;
            case "four":
                number = 4; //System.out.print("4");
                break;
            case "five":
                number = 5; //System.out.print("5");
                break;
            case "six":
                number = 6; //System.out.print("6");
                break;
            case "seven":
                number = 7; //System.out.print("7");
                break;
            case "eight":
                number = 8; //System.out.print("8");
                break;
            case "nine":
                number = 9; //System.out.print("9");
                break;

            default:
                System.out.println("The argument is not a digit ");



        }
        return number;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.print("hi ");
        int sum = 0;
        // String[] ArgsArray = ar

        if (args.length == 0) {
            System.out.println("Args == 0. \n The program will be terminated .. ");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+ " " );
            sum = sum + Numbers.wordToNumberConverter(args[i]);
            if (i + 1 == args.length) continue;
            sum = sum * 10;

        }

        System.out.println("\n Sumata e " + sum);


    }





}
