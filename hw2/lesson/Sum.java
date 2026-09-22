public class Sum {
    public static void main(String[] args) {
        int sumOfNums = 0;
        String numSymb = "+-1234567890";
        char state = 'S'; //S - space, N - number
        char currChar; 
        
        for (int i = 0; i < args.length; i++) {
            String tempStr = "";

            for (int j = 0; j < args[i].length(); j++) {
                currChar = args[i].charAt(j);

                if (numSymb.contains(Character.toString(currChar))) {
                    state = 'N';
                }

                if (state == 'N' && numSymb.contains(Character.toString(currChar))) {
                    tempStr += currChar;
                }

                if (currChar == '-' && tempStr.length() > 1) {
                    state = 'N';
                    sumOfNums += Integer.parseInt(tempStr.substring(0, tempStr.length() - 1));
                    tempStr = "-";
                }

                if ((state == 'N' && !numSymb.contains(Character.toString(currChar)))
                     || ((j == args[i].length() - 1) && !tempStr.isEmpty())) {
                    state = 'S';
                    sumOfNums += Integer.parseInt(tempStr);
                    tempStr = "";
                }      
            }
            tempStr = "";
            state = 'S';
        }
        System.out.println(sumOfNums);
    }
}