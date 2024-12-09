package codility;

public class LongestPassword {
    public static void main(String[] args) {
        System.out.println("Given a string containing words, " +
                "find the longest word that satisfies specific conditions");
        /*
         * conditions:
         * - Should only contain alphanumeric (a-z,A-Z,0-9)
         * - Should contain even number of letters
         * - Should contain odd number of digits
         */

        String password = "qwertyVywqkqf123kfaspkp";
        System.out.println("Word : " + password);

        System.out.println("Is a valid password? " + isValidPassword(password));
    }

    static boolean isValidPassword(String password) {
        boolean isValidPass = false;
        if(containsOnlyAlphanumeric(password)) {
            if(containsEvenLetters(password)) {
                if(containsOddNumbers(password)) {
                    isValidPass = true;
                }
            }
        }
        return isValidPass;
    }

    static boolean containsOnlyAlphanumeric(String password) {
        return password != null && password.matches("^[a-zA-Z0-9]*$");
    }

    static boolean containsEvenLetters(String word) {
        boolean isEven = false;
        StringBuilder sb = new StringBuilder();

        //get word and put to char array
        char[] charArr = word.toCharArray();
        //check char if letter
        for(char character : charArr) {
            if(Character.isLetter(character)) {
                sb.append(character);
            }
        }

        System.out.println("Here are the letters : " + sb);
        System.out.println("letter.length() : " + sb.length());

        //count letters and check if even
        if (sb.length() % 2 == 0) {
            System.out.println("Contains even letters");
            isEven = true;
        } else {
            System.out.println("DOES NOT contains even letters");
        }

        return isEven;
    }

    static boolean containsOddNumbers(String word) {
        boolean isOdd = true;
        StringBuilder sb = new StringBuilder();

        //get word and put to char array
        char[] charArr = word.toCharArray();
        //check char if letter
        for(char character : charArr) {
            if(Character.isDigit(character)) {
                sb.append(character);
            }
        }

        System.out.println("Here are the numbers : " + sb);
        System.out.println("number.length() : " + sb.length());

        //count letters and check if even
        if (sb.length() % 2 == 0) {
            System.out.println("DOES NOT contain odd Numbers");
            isOdd = false;
        } else {
            System.out.println("Contains odd numbers");
        }

        return isOdd;
    }
}
