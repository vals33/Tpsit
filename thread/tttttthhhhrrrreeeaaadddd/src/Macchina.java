public class Macchina extends Thread{
    private Semaforo sem;
    public Macchina(Semaforo sem){
        this.sem = sem;
    }
    @Override
    public void run() {
        while(!sem.isVerde()){
            System.out.println("semaforo mrosso");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(Gs.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        System.out.println("la macchina è passata");
    }

    
}
