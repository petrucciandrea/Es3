package abc;

public class ActivityB extends Thread{
    int ms;
    Thread a, c;
    public ActivityB(int ms, Thread a, Thread c){
        this.ms = ms;
        this.a = a;
        this.c = c;
    }

    @Override
    public void run(){
        try{
            System.out.println(getName()+".1 start");
            sleep(this.ms);
            System.out.println(getName()+".1 finish");

            a.join();
            c.join();

            System.out.println(getName()+".2 start");
            sleep(this.ms);
            System.out.println(getName()+".2 finish");
        } catch (InterruptedException e){
            System.out.println(getName()+" blocked");
        }
    }
}
