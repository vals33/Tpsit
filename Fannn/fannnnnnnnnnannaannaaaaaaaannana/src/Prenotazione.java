
import java.util.concurrent.atomic.AtomicInteger;

public class Prenotazione {
    String nome;
    int posti;
    AtomicInteger postirichiesti;
    AtomicInteger prenriusicte;
    public Prenotazione(String nome, int posti) {
        this.nome = nome;
        this.posti = posti;
        this.postirichiesti = new AtomicInteger(0);
        this.prenriusicte = new AtomicInteger(0);
    }

    public synchronized boolean prenota(){
        postirichiesti.incrementAndGet();
        if(postirichiesti.get() < posti){
            prenriusicte.incrementAndGet();
            return true;
        }
        return false;
    }

    public int getPosti() {
        return posti;
    }

    public AtomicInteger getPostirichiesti() {
        return postirichiesti;
    }

    public AtomicInteger getPrenriusicte() {
        return prenriusicte;
    }
    

    
}
