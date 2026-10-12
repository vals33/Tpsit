public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        Gs gs = new Gs(s);
        Macchina mac = new Macchina(s);
        gs.start();
        mac.start();
    }
}
