public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run(){
        for (int i=2 ; i<100;i++){
            if(isNumber(i)){
                System.out.println("Lazy "+i);
            }
        }
    }
    private boolean isNumber(int number){
        if(number==2){
            return true;
        }
        for (int i=2;i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
