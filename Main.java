public class Main {
    public static void main(String[] args) {
        LettoriScrittori risorsa = new LettoriScrittori();

        new Lettore(risorsa, "Lettore 1").start();
        new Lettore(risorsa, "Lettore 2").start();

        new Scrittore(risorsa, "Scrittore 1").start();
    }
}
