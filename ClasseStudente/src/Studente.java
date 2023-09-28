public class Studente {
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private int matricola;
    private String corsoDiStudi;
    private double[] voti;

    // Costruttore
    public Studente(String nome, String cognome, String dataDiNascita, int matricola, String corsoDiStudi) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
        this.voti = new double[10]; // Inizializziamo l'array dei voti con 10 elementi
    }

    // Getter e Setter per i campi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    public void AggiungiVoto(double voto){
        for(int i = 0; i<voti.length; i++){
            if(voti[i] == 0.0){
                voti[i] = voto;
                return;
            }
        }
    }
    
    public void CancellaVoto(){
        for(int i = 9; i>0 ; i--){
            if(voti[i] != 0.0)
            {
            voti[i] = 0.0;
            return;
            }
        }
    }
    
    public void ToString() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di Nascita: " + dataDiNascita);
        System.out.println("Matricola: " + matricola);
        System.out.println("Corso di Studi: " + corsoDiStudi);
        System.out.println("Voti:");
        for (int i = 0; i < voti.length; i++) {
            if(voti[i] != 0.0){
            System.out.println("Voto " + (i + 1) + ": " + voti[i]);
            }
        }
    }
    
    public double CalcolaMedia(){
        double media = 0;
        int count_voti = 0;
        for(int i = 0; i<voti.length-1; i++){
            if(voti[i] != 0.0){
                media = media + voti[i];
                count_voti++;
            }
        }
        media = media / count_voti;
        return media;
    }
}