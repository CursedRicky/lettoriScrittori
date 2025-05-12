public class Lettore extends Thread {
    private LettoriScrittori risorsa;
    private String nome;

    public Lettore(LettoriScrittori risorsa, String nome) {
        this.risorsa = risorsa;
        this.nome = nome;
    }

    public void run() {
        try {
            risorsa.inizioLettura(nome);
            
            // Faking del tempo di lettura
            Thread.sleep(1000);
            risorsa.fineLettura(nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
