
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int zakres = 100; // Zakres liczb od 1 do 100
        
        for (int i = 1; i <= zakres; i++) {
            if (i % 2 != 0) { // Sprawdzanie czy liczba jest nieparzysta
                suma += i;
            }
        }
        
        System.out.println("Suma liczb nieparzystych od 1 do " + zakres + " wynosi: " + suma);
    }
}
