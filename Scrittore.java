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
            
             // Faking del tempo di scrittura
            Thread.sleep(2000);
            risorsa.fineScrittura(nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
