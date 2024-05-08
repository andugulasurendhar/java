package examples;
/*
https://leetcode.com/problems/minimum-number-of-food-buckets-to-feed-the-hamsters/description/
You are given a 0-indexed string hamsters where hamsters[i] is either:

'H' indicating that there is a hamster at index i, or
'.' indicating that index i is empty.
You will add some number of food buckets at the empty indices in order to feed the hamsters.
A hamster can be fed if there is at least one food bucket to its left or to its right.
More formally, a hamster at index i can be fed if you place a food bucket at index i - 1 and/or at index i + 1.

Return the minimum number of food buckets you should place at empty indices to feed all the hamsters or
 -1 if it is impossible to feed all of them.
 */


public class MinFoodBuckets {
    public int minimumBuckets(String hamsters) {
        char[] hamster =  hamsters.toCharArray();
        for(int i = 0; i<hamster.length; i++){
            if(hamster[i]=='H'){
                if(i-1>0 && hamster[i-1]=='B'){
                    continue;
                }
                if(i+1<=hamster.length && hamster[i+1]=='.'){
                    hamster[i+1] = 'B';
                } else if(i-1 > 0 && hamster[i-1] == '.'){
                    hamster[i-1] = 'B';
                } else return -1;
            }
        }
        int count = 0;
        for(int i=0;i<hamster.length;i++)
        {
            if(hamster[i] == 'B')
                count++;
        }
        return count;
    }
}
