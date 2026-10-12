public class App {
    public static void main(String[] args) throws Exception {
        Prenotazione pren= new Prenotazione("kid yugi", 5);
        Fan[] fan = new Fan[10];
        Thread[] t =  new Thread[10];
        for (int i = 0; i < fan.length; i++) {
            fan[i] = new Fan("pers" +i, pren);
            t[i] = new Thread(fan[i]);
        }
        for (int i = 0; i < t.length; i++) {
            t[i].start();
        }
        
    }
}
