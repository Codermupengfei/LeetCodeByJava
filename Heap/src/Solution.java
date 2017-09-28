/**
 * Created by OovEver on 2017/9/27.
 */
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
import java.util.*;
class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
   static int findMaxMolecules(int massA, int massB, int massC, int massD, int massX)
    {


        HashSet<Integer> set = new HashSet<>();
        set.add(massA);
        set.add(massB);
        set.add(2*massC);
        set.add(2*massD);


        Integer[] mass = set.toArray(new Integer[]{});



        Arrays.sort(mass);
        int[]dp = new int[massX+1];
        dp[0] = 0;



        for(int i = 0; i< mass.length; i++) {
            for(int j = 1; j <= massX; j++){
                if(j - mass[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j-mass[i]] + 1);
                }

            }

        }

        return dp[massX];

        // 2,4,1,1,11
        // 0



    }

    public static void main(String[] args) {
        System.out.println(findMaxMolecules(2, 4, 1, 1, 11));;
    }
    // FUNCTION SIGNATURE ENDS
}