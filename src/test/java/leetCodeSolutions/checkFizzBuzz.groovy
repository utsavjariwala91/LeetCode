/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkFizzBuzz
{
    public static void main(String[] args){
        int inputInt = 15
        println(evaluateFizzBuzz(inputInt))
    }
    static List<String> evaluateFizzBuzz(int input){
        ArrayList<String> al = new ArrayList<>()
        for(int i=1; i<=input; i++){
            if((i%3==0) && (i%5==0)){
                al.add("FizzBuzz")
            }
            else if((i%3==0)){
                al.add("Fizz")
            }
            else if((i%5==0)){
                al.add("Buzz")
            }
            else{
                al.add(String.valueOf(i))
            }
        }
        return al
    }
}
