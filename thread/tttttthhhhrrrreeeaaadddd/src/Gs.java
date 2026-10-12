public class Gs extends Thread{

    Semaforo s;
    public Gs(Semaforo s){
        this.s = s;
    }
    @Override
    public void run() {
        while(true){
        s.CambiaColorss();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(Gs.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
    }
}
    
    
    

    /* Vincoli:
La classe auto è un tred.
Il semaforo è una classe con alcuni metodi a scelta, che dovrà implementare le tre luci del semaforo.
Il semaforo è gestito da una classe GestoreSemaforo, che è anch'essa un thread.
Il main dovrà simulare l'attesa e i passaggi delle auto al semaforo verde.

Per simulare l'attesa è possibile utilizzare il metodo della classe thread:   Thread.sleep(millisecondi)
*/
    
}
