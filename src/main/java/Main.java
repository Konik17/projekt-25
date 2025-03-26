
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int zakres = 100; 
        
        for (int i = 1; i <= zakres; i++) {
            if (i % 2 != 0) { 
                suma += i;
            }
        }
        
        System.out.println("Suma liczb nieparzystych od 1 do " + zakres + " wynosi: " + suma);
    }
}
//