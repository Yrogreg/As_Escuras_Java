/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AsEscuras;

import AsEscuras.Layout.F_Login;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        try {
            //Ler_Banco inibanc = new Ler_Banco();
            String filePath = "usuarios.txt";

            // Lê os dados do arquivo
            List<Usuario> usuarios = inibanc.lerDados(filePath);

            // Exibe os usuários lidos (opcional)
            for (Usuario usuario : usuarios) {
                System.out.println(usuario); // Certifique-se de que a classe Usuario tenha um método toString() apropriado
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace(); // Imprime a pilha de chamadas para ajudar na depuração
        }

        */
        F_Login ini = new F_Login();
        ini.setVisible(true);
        
//        Algoritimo a = new Algoritimo();
//        a.test();
    }
}
