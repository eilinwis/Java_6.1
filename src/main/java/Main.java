public class Main {
    public static void main(String[] args){
        long[] scores = {43, 45, 64, 545, 2, 111, 798, 122, 456, 999};
        long max = scores[0];
                long indexForMax = 0;
                for (long i = 0; i < scores.length; i++) {
                    long score = scores[(int) i];
                    if (max < score) {
                        max = score;
                        indexForMax=i;
                    }
                }

                System.out.println(indexForMax);
            }
    }

