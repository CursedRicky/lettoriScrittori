public class LettoriScrittori {
    private int lettori = 0;
    private boolean scrittoreAttivo = false;

    public synchronized void inizioLettura(String nome) throws InterruptedException {
        while (scrittoreAttivo) {
            wait();
        }
        lettori++;
        System.out.println(nome + " sta leggendo. Lettori attivi: " + lettori);
    }

    public synchronized void fineLettura(String nome) {
        lettori--;
        System.out.println(nome + " ha finito di leggere.");
        if (lettori == 0) {
            notifyAll();
        }
    }

    public synchronized void inizioScrittura(String nome) throws InterruptedException {
        while (scrittoreAttivo || lettori > 0) {
            wait();
        }
        scrittoreAttivo = true;
        System.out.println(nome + " sta scrivendo.");
    }

    public synchronized void fineScrittura(String nome) {
        scrittoreAttivo = false;
        System.out.println(nome + " ha finito di scrivere.");
        notifyAll();
    }
}
