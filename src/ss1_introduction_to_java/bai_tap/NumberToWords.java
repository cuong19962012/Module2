package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToWords {
    static String ones(int number) {
        switch (number) {
            case 0:
                break;
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
        }
        return "";
    }

    static String tens(int number) {
        switch (number) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
        }
        return "";
    }

    static String hundreds(int number) {
        switch (number) {
            case 1:
                return "One hundred";
            case 2:
                return "Two hundred";
            case 3:
                return "Three hundred";
            case 4:
                return "Four hundred";
            case 5:
                return "Five hundred";
            case 6:
                return "Six hundred";
            case 7:
                return "Seven hundred";
            case 8:
                return "Eight hundred";
            case 9:
                return "Nine hundred";
        }
        return "";
    }

    static String numberSmaller20(int number) {
        switch (number) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String s = "";
        if (number < 10 && number > -1) {
            switch (number) {
                case 0:
                    s = "Zero";
                    break;
                case 1:
                    s = "One";
                    break;
                case 2:
                    s = "Two";
                    break;
                case 3:
                    s = "Three";
                    break;
                case 4:
                    s = "Four";
                    break;
                case 5:
                    s = "Five";
                    break;
                case 6:
                    s = "Six";
                    break;
                case 7:
                    s = "Seven";
                    break;
                case 8:
                    s = "Eight";
                    break;
                case 9:
                    s = "Nine";
                    break;
                case 10:
                    s = "Ten";
                    break;
                default:
                    s = "out of ability";
            }
        } else {
            int ones = number % 10;
            if (number < 20) {
                numberSmaller20(ones);
            } else {
                String firstNumber = "";
                String secondNumber = "";
                String thirdNumber = "";
                int tens = 0;
                int hundreds = 0;
                if (number < 100) {
                    tens = number / 10;
                    ones = number - tens * 10;
                    firstNumber = tens(tens);
                    secondNumber = ones(ones);
                } else if (number < 1000) {
                    hundreds = number / 100;
                    tens = (number - (hundreds * 100)) / 10;
                    ones = (number - (hundreds * 100 + tens * 10));
                    if (ones == 0) {
                        secondNumber = "";
                    } else {
                        secondNumber = ones(ones);
                    }
                    if (number - (hundreds * 100) < 21) {
                        firstNumber = numberSmaller20(number - (hundreds * 100));
                        secondNumber = "";
                    } else {
                        firstNumber = tens(tens);
                    }
                    thirdNumber = hundreds(hundreds);
                }
                s = thirdNumber + " " + firstNumber + " " + secondNumber;
            }
        }
        System.out.println(s);
    }
}
