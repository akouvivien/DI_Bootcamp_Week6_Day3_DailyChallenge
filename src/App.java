import java.util.Scanner;


public class App {

    public static void multiplication(int nombre) {
        int[][] tab2D = {
            {1, 2, 3, 4,5},
            {6, 7, 8, 9, 10}
        };
            int j,i= 0;
            //parcourt le tableau tab2D 
            for (int[] tab1D : tab2D) {
                j = 0;
                // affiche le contenu de chaque objet 
                for (int valeur : tab1D) {
                    // effectue la multiplication
                    int multiplication = nombre *valeur;
                    System.out.println(nombre+" * "+valeur+" = "+multiplication);
    
                    j++;
                }
                i++;
            }

    }

    public static int factoriel(int nombre) {
        int factoriel = 1;  
        int i = 1;  
        
        while( i <= nombre ){  
            factoriel = factoriel * i;   
            i++; //increment i by 1 
 
        }  
        return factoriel;
    } 


        public static void fibonacci(int nombre) {
            int TermUn = 0, TermDeux = 1;
            System.out.println("Fibonacci Series till " + nombre + " terms:");
    
            int i=1;
            do {
            // compute the next term
                int termSuivant = TermUn + TermDeux;
                TermUn = TermDeux;
                TermDeux = termSuivant;
                System.out.print(TermUn + ", ");
                i++;
            } while (i <= nombre);

    
    
        }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        System.out.println("entrez un nombre entier");
        int nombre = scanner.nextInt();
        System.out.println("la multiplication de ce nombre est");
        multiplication(nombre);
        System.out.println("le factoriel du nombre "+nombre+" est "+ factoriel(nombre)); 
        fibonacci(nombre);
    }
        
}
