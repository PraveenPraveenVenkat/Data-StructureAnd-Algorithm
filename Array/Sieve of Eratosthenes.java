class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        
          ArrayList<Integer> primes = new ArrayList<>();
       
        boolean[] isPrime = new boolean[N + 1];
        

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <=  Math.sqrt(N); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
