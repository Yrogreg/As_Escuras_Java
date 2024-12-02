package AsEscuras.Test;

import AsEscuras.User.User_Cadastrar;
import java.util.Random;

/**
 *
 * @author Yrogreg
 */
public class Test {
    
    public void test() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            String email = i + "@" + i + ".com"; // Email único
            String senha = "123456"; // Senha única
            String nome = "Teste" + i; // Nome único
            int diaNascimento = random.nextInt(28) + 1; // Dia de nascimento (1 a 30)
            int mesNascimento = random.nextInt(12) + 1; // Mês de nascimento (1 a 12)
            int anoNascimento = random.nextInt(50) + 1973; // Ano de nascimento (1973 a 2022)
            int idade = 0; // idade fixa pois sera feito calculo depois
            String localizacao = "Porto Alegre"; // Localização fixa
            int generoBio = random.nextInt(2); // Gênero aleatório 0-1
            int altura = random.nextInt(100) + 100; // Altura entre 150 e 250 cm
            int peso = random.nextInt(100) + 50; // Peso entre 50 e 150 kg
            int formaFisica = random.nextInt(2); // Forma física 0-2
            int imc = 0; // Cálculo do IMC fixa
            int cabeloNatural = random.nextInt(3); // Cabelo natural aleatório 0-3
            int pele = random.nextInt(2); // Pele aleatória 0-1
            int tatuagens = random.nextInt(2); // Tatuagens aleatórias (0 ou 1)
            int salario = random.nextInt(3); // Salário aleatório entre 0-3
            int certificaProfi = random.nextInt(2); // Certificação aleatória (0 ou 1)
            int personalidade = random.nextInt(3); // Personalidade aleatória 0-3
            int intGeneroBio = random.nextInt(2); // Representação do gênero 0-1
            int intAltura = random.nextInt(2); // Altura 0-2
            int intTatuagens = random.nextInt(2); // Representação de tatuagens (0 ou 1)
            int intCabeloNatural = random.nextInt(2); // Cabelo natural aleatório (0 ou 1)
            int preto = random.nextInt(2); // Cabelo preto aleatório (0 ou 1)
            int castanho = random.nextInt(2); // Cabelo castanho aleatório (0 ou 1)
            int loiro = random.nextInt(2); // Cabelo loiro aleatório (0 ou 1)
            int ruivo = random.nextInt(2); // Cabelo ruivo aleatório (0 ou 1)
            int intPele = random.nextInt(2); // Representação da pele (0 ou 1)
            int escuro = random.nextInt(2); // Escuro se a pele for escura (0 ou 1)
            int cauca = random.nextInt(2); // Cauca se a pele for clara (0 ou 1)
            int claro = random.nextInt(2); // Claro se a pele for clara (0 ou 1)
            int viagens = random.nextInt(2); // Viagens aleatórias (0 ou 1)
            int musica = random.nextInt(2); // Música aleatória (0 ou 1)
            int gastronomia = random.nextInt(2); // Gastronomia aleatória (0 ou 1)
            int livros = random.nextInt(2); // Livros aleatórios (0 ou 1)
            int esportes = random.nextInt(2); // Esportes aleatórios (0 ou 1)
            int natureza = random.nextInt(2); // Natureza aleatória (0 ou 1)
            int artes = random.nextInt(2); // Artes aleatórias (0 ou 1)
            int jogos = random.nextInt(2); // Jogos aleatórios (0 ou 1)
            int animais = random.nextInt(2); // Animais aleatórios (0 ou 1)
            int causa = random.nextInt(2); // Causa aleatória (0 ou 1)

            User_Cadastrar user = new User_Cadastrar();
            user .cadastrar(email, senha, nome, diaNascimento, 
                mesNascimento, anoNascimento, idade, localizacao, 
                generoBio, altura, peso, formaFisica, 
                imc, cabeloNatural, pele, tatuagens, 
                salario, certificaProfi, personalidade, intGeneroBio, 
                intAltura, intTatuagens, intCabeloNatural, preto, 
                castanho, loiro, ruivo, intPele, 
                escuro, cauca, claro, viagens, 
                musica, gastronomia, livros, esportes, 
                natureza, artes, jogos, animais, 
                causa);
        }
    }
}