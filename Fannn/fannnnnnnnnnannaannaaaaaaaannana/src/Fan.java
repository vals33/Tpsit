public class Fan implements Runnable {
    private String nome;
    private Prenotazione p;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Prenotazione getP() {
        return p;
    }
    public void setP(Prenotazione p) {
        this.p = p;
    }
    public Fan(String nome, Prenotazione p) {
        this.nome = nome;
        this.p = p;
    }

    
    public void run() {
        if(p.prenota()){
            System.out.println(nome+" prenotato");
        }
        else{System.out.println(nome +" non prenotat");}
    }



}
