
class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Federico", "Maniglio", "08/03/1901", 001, "TipSit");
        Studente studente2 = new Studente("Enrica", "Taffurelli", "03/03/1983", 002, "Informatica");
        Studente studente3 = new Studente("Daniele", "Steccanella", "08/03/1903", 003, "Disoccupato");
        Studente studente4 = new Studente("Carlo", "Guzzo", "08/03/1890", 004, "Ingegneria");
        
        studente1.AggiungiVoto(9);
        studente1.AggiungiVoto(2);
        studente1.AggiungiVoto(6);
        studente1.ToString();
        System.out.println("Questa è la media dello studente: " +studente1.CalcolaMedia()+"\n\n");

        studente2.AggiungiVoto(3);
        studente2.AggiungiVoto(4);
        studente2.AggiungiVoto(5);
        studente2.ToString();
        System.out.println("Questa è la media dello studente: " +studente2.CalcolaMedia()+"\n\n");


        studente3.AggiungiVoto(2);
        studente3.AggiungiVoto(2);
        studente3.AggiungiVoto(9);
        studente3.CancellaVoto();
        studente3.ToString();
        System.out.println("Questa è la media dello studente: " +studente3.CalcolaMedia() +"\n\n");


        studente4.AggiungiVoto(4);
        studente4.AggiungiVoto(4);
        studente4.AggiungiVoto(4);
        studente4.ToString();
        System.out.println("Questa è la media dello studente: " +studente4.CalcolaMedia()+"\n\n");

    }
}

