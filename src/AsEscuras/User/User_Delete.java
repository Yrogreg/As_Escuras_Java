package AsEscuras.User;

/*
package AsEscuras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gregory
 */
/*
public class User_Delete extends Usuario{
    public void excluir(int id) {
    String filePath = "dados_pessoa.txt"; // Caminho do arquivo onde os dados são salvos
        List<String> linhas = new ArrayList<>();

        // Ler o arquivo e armazenar as linhas
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Verifica se a linha contém o ID que estamos excluindo
                if (!linha.startsWith("ID: " + id)) {
                    linhas.add(linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Salvar as linhas de volta ao arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String linha : linhas) {
                writer.write(linha + "\n");
            }
            System.out.println("Registro de " + id + " excluído com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
*/