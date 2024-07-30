package Es3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        try {
            // Inserimento di contatti
            rubrica.inserisciContatto("Mario Rossi", "1234567890");
            rubrica.inserisciContatto("Luigi Verdi", "0987654321");
            rubrica.inserisciContatto("Anna Bianchi", "1122334455");


            String numero = rubrica.cercaNumero("Luigi Verdi");
            if (numero != null) {
                System.out.println("Numero di Luigi Verdi: " + numero);
            } else {
                System.out.println("Contatto Luigi Verdi non trovato.");
            }

            rubrica.cancellaContatto("Mario Rossi");
            System.out.println("Contatto Mario Rossi rimosso.");

            rubrica.stampaTuttiContatti();

        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore imprevisto: " + e.getMessage());
        }
    }
}
