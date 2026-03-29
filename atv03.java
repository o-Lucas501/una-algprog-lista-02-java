import java.util.Scanner;;

public class atv03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe uma palavra: ");
        String texto = scanner.nextLine();

        int letras = 0,espacos = 0, caracteres = 0, numeros = 0, outros = 0;

        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(0);

            if(Character.isLetter(c)){
                letras ++;
            }
            
            else if(Character.isDigit(c)){
                numeros ++;
            }

            else if(Character.isWhitespace(c)){
                espacos ++;
            }

            else{
                outros ++;
            }

        }

            System.out.println("Letras: "+letras);
            System.out.println("numeros: "+numeros);
            System.out.println("Espaços: "+espacos);
            System.out.println("Espaços: "+espacos);

            scanner.close();

    }

    
}
