public class Scrittore extends Thread {
    private LettoriScrittori risorsa;
    private String nome;

    public Scrittore(LettoriScrittori risorsa, String nome) {
        this.risorsa = risorsa;
        this.nome = nome;
    }

    public void run() {
        try {
            risorsa.inizioScrittura(nome);
            Thread.sleep(2000); // Simula tempo di scrittura
            risorsa.fineScrittura(nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
