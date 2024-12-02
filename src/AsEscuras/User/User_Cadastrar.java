package AsEscuras.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Gregory
 */
public class User_Cadastrar extends Usuario {

    public void cadastrar(String email, String senha, String nome, int diaNascimento, int mesNascimento, int anoNascimento, int idade, String localizacao, int generoBio, int altura, int peso, int formaFisica, int imc, int cabeloNatural, int pele, int tatuagens, int salario, int certificaProfi, 
        int personalidade, int intGeneroBio, int intAltura, int intTatuagens, int intCabeloNatural, int preto, int castanho, int loiro, int ruivo, int intPele, int escuro, int cauca, int claro, int viagens, int musica, int gastronomia, int livros, int esportes, int natureza, int artes, int jogos, int animais, int causa) {
        this.id = obterUltimoIdSalvo("usuarios.txt") + 1;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = ObterIdade(anoNascimento, mesNascimento, diaNascimento);
        this.localizacao = localizacao;
        this.generoBio = generoBio;
        this.altura = altura;
        this.peso = peso;
        this.formaFisica = formaFisica;
        this.imc = ObterIMC(altura, peso);
        this.cabeloNatural = cabeloNatural;
        this.pele = pele;
        this.tatuagens = tatuagens;
        this.salario = salario;
        this.certificaProfi = certificaProfi;
        this.personalidade = personalidade;
        this.intGeneroBio = intGeneroBio;
        this.intAltura = intAltura;
        this.intTatuagens = intTatuagens;
        this.intCabeloNatural = intCabeloNatural;
        this.preto = preto;
        this.castanho = castanho;
        this.loiro = loiro;
        this.ruivo = ruivo;
        this.intPele = intPele;
        this.escuro = escuro;
        this.cauca = cauca;
        this.claro = claro;
        this.viagens = viagens;
        this.musica = musica;
        this.gastronomia = gastronomia;
        this.livros = livros;
        this.esportes = esportes;
        this.natureza = natureza;
        this.artes = artes;
        this.jogos = jogos;
        this.animais = animais;
        this.causa = causa;
        
        String linha = String.format("%d;%s;%s;%s;%d;%d;%d;%d;%s;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;",
            this.id,
            this.email, 
            this.senha, 
            this.nome, 
            
            this.diaNascimento, 
            this.mesNascimento, 
            this.anoNascimento, 
            this.idade, 
            
            this.localizacao, 
            this.generoBio, 
            this.altura, 
            this.peso, 
            this.formaFisica, 
            this.imc, 
            this.cabeloNatural, 
            this.pele, 
            this.tatuagens, 
            this.salario, 
            this.certificaProfi,
            this.personalidade,
            this.intGeneroBio, 
            this.intAltura, 
            this.intTatuagens, 
            this.intCabeloNatural, 
            this.preto, 
            this.castanho, 
            this.loiro, 
            this.ruivo, 
            this.intPele, 
            this.escuro, 
            this.cauca, 
            this.claro, 
            this.viagens, 
            this.musica, 
            this.gastronomia, 
            this.livros, 
            this.esportes, 
            this.natureza, 
            this.artes, 
            this.jogos, 
            this.animais, 
            this.causa);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(linha);
            writer.newLine();
            System.out.println("usuario " + this.nome + " cadastrado" );
        } catch (IOException e) {
            System.out.println("Erro ao salvar as informações do usuário: " + e.getMessage());
        }
    }

    public int obterUltimoIdSalvo(String filePath) {
        int ultimoId = 0; // Inicializa com -1 para indicar que nenhum ID foi encontrado

        try {
            // Garantir que o arquivo existe antes de ler
            File file = new File(filePath);
            if (!file.exists()) {
                return 0; // Cria o arquivo se não existir
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    // Extrai o primeiro valor da linha que representa o ID
                    String[] partes = linha.split(";");
                    if (partes.length > 0) {
                        try {
                            int id = Integer.parseInt(partes[0]); // Assume que o ID é o primeiro valor
                            if (id > ultimoId) {
                                ultimoId = id;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Erro ao converter ID: " + e.getMessage());
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return 0;
        }

        return ultimoId; // Retorna o último ID encontrado
    }

    public int ObterIdade(int anoNascimento, int mesNascimento, int diaNascimento) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public int ObterIMC(int altura, int peso) {
        // Converter altura de centímetros para metros
        float alturaEmMetros = altura / 100f; // Corrigido para a conversão correta

        // Calcular o IMC
        float imc = peso / (alturaEmMetros * alturaEmMetros);

        // Retornar a categoria do IMC
        if (imc < 18.5) {
            return 0; // Abaixo do peso
        } else if (imc < 24.9) {
            return 1; // Peso ideal
        } else if (imc < 29.9) {
            return 2; // Sobrepeso
        } else {
            return 3; // Obesidade
        }
    }
}