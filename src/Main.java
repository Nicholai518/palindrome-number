public class Main {

    public static void main(String[] args) {
	System.out.println("The number 121 returns: " + isPalindrome(121));
	System.out.println("The number -121 returns: " + isPalindrome(-121));
	System.out.println("The number 10 returns: " + isPalindrome(10));
    }

    public static boolean isPalindrome(int x){

        // variable to hold boolean value to be returned
        boolean result = false;

        // if x is a negative return false
        if(x < 0){
            return result;
        }

        // if x is not negative, we need out how many numbers there are
        // change the number to a string, compare the characters using index's
        String stringValueForNumber = String.valueOf(x);
        int lengthOfNumber = stringValueForNumber.length();
        boolean thereIsAMiddleValue;

        // if % 2 results in remainder 0, we have an even amount of numbers
        if(lengthOfNumber % 2 == 0){
            thereIsAMiddleValue = false;
        }
        // if % 2 results in remainder 1, the have a middle value that has no match
        else{
            thereIsAMiddleValue = true;
        }


        // one index starts at zero (increments)
        int leftIndex = 0;

        // one index starts at number length - 1 (decrements)
        int rightIndex = lengthOfNumber - 1;

        // if there is a middle number, if both index's match the middle number, stop and return true
        if(thereIsAMiddleValue){
            while(leftIndex != rightIndex){

                // compare
                if(stringValueForNumber.charAt(leftIndex) == stringValueForNumber.charAt(rightIndex)){
                    // if both index's match,  increment, decrement, check again
                    leftIndex++;
                    rightIndex--;
                }
                else{
                    return result;
                }
            }
            // return true, made it through the entire while loop
            result = true;
            return result;
        }
        // if there is no middle value
        else {

            // since there is no middle number, if the right index is ever less than the left index, you stop
            while(leftIndex < rightIndex){
                // compare
                if(stringValueForNumber.charAt(leftIndex) == stringValueForNumber.charAt(rightIndex)){
                    // if both index's match,  increment, decrement, check again
                    leftIndex++;
                    rightIndex--;
                }
                else{
                    return result;
                }
            }
            // return true, made it through the entire while loop
            result = true;
            return result;
        }
    }
}
