//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reader r = new Reader();
        Writer w = new Writer();
        Writer w2 = new Writer();
        r.start();
        w2.start();
        w.start();


    }
}