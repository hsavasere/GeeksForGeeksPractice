class Solution{
    static long largestPrimeFactor(int N) {
        int limit =  (int)Math.sqrt(N) + 1;
        int max = -1;
        
        
        // Removing all the 2's in the number by dividing the number with 2
        while(N % 2 == 0){
            N /= 2;
            max = 2;
        }
        
        // Removing all the 3's in the number by dividing the number with 2
        while(N % 3 == 0){
            N /= 3;
            max = 3;
        }
        
        
        // Iterating and dividing those numbers which does not have 2 or 3 as prime factor
        for(int i = 5; i <= limit; i+=6){
            while(N % i == 0){
                N /= i;
                max = i;
            }
            
            // Need to check why we are dividing by i+2
            while (N % (i + 2) == 0) {
                max = i + 2;
                N /= (i + 2);
            }
        }
        
        
        // if the number has not been completely factorized to 1 or we could not remove any factor by repeated division 
        if(N != 1 || max == -1)
            max = N;
        
        return max;
    }
}
