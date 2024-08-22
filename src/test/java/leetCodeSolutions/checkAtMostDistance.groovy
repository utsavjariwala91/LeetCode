/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkAtMostDistance
{
    public static void main(String[] args){
        int[] iA = [41,11,13,12,14,15,41,21,22,23,41,24,25,26,27,28,29,41]
        int k = 3
        println(checkDistance(iA, k))
    }
    static int[] checkDistance(int[] input, int k) {
        int j = 1;
        for (int i = 0; i < input.length; i++) {
            while (input[i] != input[j]) {
                j++
            }
            if ((input[i] = input[j]) && (j-i <= k)) {
                println("input[i] " + input[i])
                println("input[j] " + input[j])
                println("j " + j)
            }
            return [i,j]
        }

    }
}
