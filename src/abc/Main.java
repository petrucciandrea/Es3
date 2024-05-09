package abc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread a = new Thread(new ActivityAC(4000));
        Thread c = new Thread(new ActivityAC(3000));
        ActivityB b = new ActivityB(1000, a, c);

        a.start();
        b.start();
        c.start();

    }
}