public class SummationCalculator {

    public static void main(String[] args) {
        final int N = 50000;
        final int numThreads = 5;

        Thread[] threads = new Thread[numThreads];
        SummationResult[] results = new SummationResult[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * (N / numThreads) + 1;
            final int end = (i + 1) * (N / numThreads);
            results[i] = new SummationResult();
            threads[i] = new Thread(new SummationWorker(start, end, results[i]));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long totalSum = 0;
        for (SummationResult result : results) {
            totalSum += result.getSum();
        }

        System.out.println("Total Sum: " + totalSum);
    }

    static class SummationWorker implements Runnable {
         final int start;
         final int end;
         final SummationResult result;

        public SummationWorker(int start, int end, SummationResult result) {
            this.start = start;
            this.end = end;
            this.result = result;
        }

        public void run() {
            long localSum = 0;
            for (int i = start; i <= end; i++) {
                localSum += i;
            }
            result.setSum(localSum);
        }
    }

    static class SummationResult {
         long sum;

        public long getSum() {
            return sum;
        }

        public void setSum(long sum) {
            this.sum = sum;
        }
    }
}
