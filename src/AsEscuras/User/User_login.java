package AsEscuras.User;

import AsEscuras.Algoritimo.Lista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gregory
 */
public class User_login{
    
    public boolean login(String email, String senha) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                
                int id = Integer.parseInt(dados[0]);
                String email_banco = dados[1];
                String senha_banco = dados[2];
                String nome_banco = dados[3];
                
                if (email_banco.equals(email) && senha_banco.equals(senha)) {
                    
                    Usuario u = new Usuario();
                    u.lerDadosUser(id);
                    u.userAltual(id);
                    
                    Lista a = new Lista();
                    a.criarLista(id);
                                        
                    System.out.println(u.getNome() + " foi logado.");
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }
        return false;
    }
}      
