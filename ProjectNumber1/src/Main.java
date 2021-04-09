

public class Main {

    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                answer ++;
            }

        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        for(int i = 0; i < s.length() - 2; i++) {
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                answer ++;
            }

        }

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){

        int iMax = 0;
        int counter = 1;
        int counterMax = 1;
        String longestPart;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) <= s.charAt(i + 1)) {
                counter ++;
            }
            else {
                counter = 1;
            }
            if(counter > counterMax) {
                iMax = i + 1;
                counterMax = Math.max(counter, counterMax);

            }
        }

        longestPart = s.substring(iMax - counterMax + 1, iMax + 1);


        return longestPart;
    }


    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "bobobobobobobobobobbobobobobobobobobobobobobobobo";

        System.out.println(problemTwo(s));
    }
}


