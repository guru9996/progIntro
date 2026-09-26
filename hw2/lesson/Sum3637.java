public class Sum3637 {

    public static boolean isBracket(char symbol) {
        return Character.getType(symbol) == Character.START_PUNCTUATION 
            || Character.getType(symbol) == Character.END_PUNCTUATION;
    }
    public static boolean isDelimiter(char symbol) {
        return Character.isWhitespace(symbol) || isBracket(symbol);
    }

    enum State {
        SPACE,
        NUMBER
    }

    public static void main(String[] args) {
        long sumOfNums = 0;


        for (int i = 0; i < args.length; i++) {
            int startIndexOfSubstring = 0;
            int endIndexOfSubstring = 0;

            State state = State.SPACE;
            for (int j = 0; j < args[i].length(); j++) {
                char currChar = args[i].charAt(j);

                if (!isDelimiter(currChar)) {
                    if (state == State.SPACE) {
                        state = State.NUMBER;
                        startIndexOfSubstring = j;
                    }    
                    endIndexOfSubstring = j + 1;
                }                

                if (state == State.NUMBER && (isDelimiter(currChar) || j == args[i].length() - 1)) {
                    state = State.SPACE;
                    sumOfNums += Long.parseLong(
                        args[i].substring(startIndexOfSubstring, endIndexOfSubstring));
                }   
            }
        }
        System.out.println(sumOfNums);
    }
}

