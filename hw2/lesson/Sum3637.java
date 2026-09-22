public class Sum3637 {
     
    public static boolean isBracket(char symbol) {
        if (Character.getType(symbol) == Character.START_PUNCTUATION ||Character.getType(symbol) == Character.END_PUNCTUATION) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long sumOfNums = 0;
        char state = 'S'; //S - space, N - number
        char currChar; 

        for (int i = 0; i < args.length; i++) {
            int startIndexOfSubstring = 0;
            int endIndexOfSubstring = 0;

            for (int j = 0; j < args[i].length(); j++) {
                currChar = args[i].charAt(j);

                if (state == 'S' && !(Character.isWhitespace(currChar) || isBracket(currChar))) {
                    state = 'N';
                    startIndexOfSubstring = j;
                    endIndexOfSubstring = j + 1;
                }
                
                else if (state == 'N' && !(Character.isWhitespace(currChar) || isBracket(currChar))) {
                    endIndexOfSubstring += 1;
                } 

                if (currChar == '-' && args[i].substring(startIndexOfSubstring, endIndexOfSubstring).length() > 1) {
                    state = 'N';
                    sumOfNums += Long.parseLong(args[i].substring(startIndexOfSubstring, endIndexOfSubstring));
                }

                if (state == 'N' && (Character.isWhitespace(currChar) || isBracket(currChar))) {
                    state = 'S';
                    sumOfNums += Long.parseLong(args[i].substring(startIndexOfSubstring, endIndexOfSubstring));
                }
                
                else if (j == args[i].length() - 1 && state == 'N') {
                    state = 'S';
                    sumOfNums += Long.parseLong(args[i].substring(startIndexOfSubstring, endIndexOfSubstring));
                } 
                     
            }
            state = 'S';
        }
        System.out.println(sumOfNums);
    }
}

