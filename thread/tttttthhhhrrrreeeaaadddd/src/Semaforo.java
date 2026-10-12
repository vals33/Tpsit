public class Semaforo {
    boolean verde = false;

    public boolean CambiaColorss(){
        if (verde) {
            return this.verde = false;
            
        } else {
            return this.verde = true;
        }
        
    }

    public boolean isVerde() {
        return verde;
    }

    public void setVerde(boolean verde) {
        this.verde = verde;
    }



}

/* Vincoli:
La classe auto è un thread.
Il semaforo è una classe con alcuni metodi a scelta, che dovrà implementare le tre luci del semaforo.
Il semaforo è gestito da una classe GestoreSemaforo, che è anch'essa un thread.
Il main dovrà simulare l'attesa e i passaggi delle auto al semaforo verde.

Per simulare l'attesa è possibile utilizzare il metodo della classe thread:   Thread.sleep(millisecondi)
*/
