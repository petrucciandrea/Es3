package abc;

public class ActivityAC implements Runnable{
    int ms;
    public ActivityAC(int ms){
        this.ms = ms;
    }

    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" start");
            Thread.sleep(this.ms);
            System.out.println(Thread.currentThread().getName()+" finish");
        } catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+" blocked");
        }
    }
}
