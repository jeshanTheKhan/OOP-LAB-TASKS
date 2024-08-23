public class PrimeNumberFinder {

    public static void main(String[] args) {
        final int N = 100000;
        final int numThreads = 5;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * (N / numThreads) + 1;
            final int end = (i + 1) * (N / numThreads);
            threads[i] = new Thread(new PrimeFinder(start, end));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class PrimeFinder implements Runnable {
        private final int start;
        private final int end;

        public PrimeFinder(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

        private boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            if (n <= 3) {
                return true;
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
