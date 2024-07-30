package Es3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private final Map<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }


    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + " -> " + telefono);
    }

    public void cancellaContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    public String cercaNumero(String nome) {
        return rubrica.getOrDefault(nome, "Contatto non trovato");
    }

    public void stampaTuttiContatti() {
        if (rubrica.isEmpty()) {
            System.out.println("Rubrica vuota.");
        } else {
            System.out.println("Contatti della rubrica:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
