public class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run(){
        for (int i=2 ; i<100;i++){
            if(isNumber(i)){
                System.out.println("Optimized "+i);
            }
        }
    }
    private boolean isNumber(int number){
        if(number==2){
            return true;
        }
        double result = Math.sqrt(number);
        for (int i=2;i<result;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
