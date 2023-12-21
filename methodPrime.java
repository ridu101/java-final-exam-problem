public class methodPrime {
    public static void main(String[] args) {
        int number = 17; 

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
