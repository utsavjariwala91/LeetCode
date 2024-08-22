/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkBalanced
{
    public static void main(String[] args)
    {
        String str = "[{()}]"
        //println(" ::: " +  checkBalancedString(str))
        println(" ::: " +  checkBalancedString1(str))
    }
    static boolean checkBalancedString(String str)
    {
        Stack<Character> st = new Stack<>()
        System.out.println("str length : " + str.length())
        for (int i = 0; i < str.length(); i++)
        {
            println(" ::: " + str[i])
            if (str[i] == "[" | str[i] == "(" | str[i] == "{")
            {
                st.push(str[i])
            }
            else
            {
                if (st.empty())
                {
                    return false
                }
                println("st :::" + st)
                char c = st.peek(); st.pop()
                println("c :::" + c)
                if (((str[i] == "]") && (c = "[")) | ((str[i] == "}") && (c = "{")) | ((str[i] == ")") && (c = "(")))
                {
                    println("matched paranthesis")
                }
                else {
                    println("Un-matched paranthesis")
                    return false
                }
            }
        }
        if (st.empty()) {
            return true
        }
        else {
            return false
        }
    }

    static boolean checkBalancedString1(String str){
        Stack<Character> st1 = new Stack<>();
        for(int i = 0; i<str.length();i++){
            println(" ::: " + str[i])
            if((str[i] == "[") | (str[i] == "(") | (str[i] == "{")){
                st1.push(str[i]);
            }else {
                if (st1.empty()){
                    return false;
                }
                println("st1 :::" + st1)
                char c1 = st1.peek(); st1.pop()
                println("c1 :::" + c1)
                if(((str[i] == "]") && (c1 = "[")) | ((str[i] == ")") && (c1 = "(")) | ((str[i] == "}") && (c1 = "{"))){
                    println("Balanced")
                }else{
                    println("Un-Balanced")
                    return false
                }

            }
        }
        if (st1.empty()) {
            return true
        }
        else {
            return false
        }
    }
}

