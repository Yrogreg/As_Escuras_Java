//package AsEscuras.User;
//
//import java.io.*;
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Gregory
// */
//public class User_edit extends Usuario {
//    
//    public void Editar(int id, String email, String senha, String nome, int diaNascimento, int mesNascimento, int anoNascimento, int idade, String localizacao, int generoBio, int altura, int peso, int formaFisica, int imc, int cabeloNatural, int pele, int tatuagens, int salario, int certificaProfi, int personalidade, int intGeneroBio, int intAltura, int intTatuagens, int intCabeloNatural, int preto, int castanho, int loiro, int ruivo, int intPele, int escuro, int cauca, int claro, int viagens, int musica, int gastronomia, int livros, int esportes, int natureza, int artes, int jogos, int animais, int causa) {
//        this.id = id;
//        this.email = email;
//        this.senha = senha;
//        this.nome = nome;
//        this.diaNascimento = diaNascimento;
//        this.mesNascimento = mesNascimento;
//        this.anoNascimento = anoNascimento;
//        this.idade = ObterIdade(anoNascimento, mesNascimento, diaNascimento);
//        this.localizacao = localizacao;
//        this.generoBio = generoBio;
//        this.altura = altura;
//        this.peso = peso;
//        this.formaFisica = formaFisica;
//        this.imc = ObterIMC(altura, peso);
//        this.cabeloNatural = cabeloNatural;
//        this.pele = pele;
//        this.tatuagens = tatuagens;
//        this.salario = salario;
//        this.certificaProfi = certificaProfi;
//        this.personalidade = personalidade;
//        this.intGeneroBio = intGeneroBio;
//        this.intAltura = intAltura;
//        this.intTatuagens = intTatuagens;
//        this.intCabeloNatural = intCabeloNatural;
//        this.preto = preto;
//        this.castanho = castanho;
//        this.loiro = loiro;
//        this.ruivo = ruivo;
//        this.intPele = intPele;
//        this.escuro = escuro;
//        this.cauca = cauca;
//        this.claro = claro;
//        this.viagens = viagens;
//        this.musica = musica;
//        this.gastronomia = gastronomia;
//        this.livros = livros;
//        this.esportes = esportes;
//        this.natureza = natureza;
//        this.artes = artes;
//        this.jogos = jogos;
//        this.animais = animais;
//        this.causa = causa;
//        
//        
//        String filePath = "usuarios.txt";
//        
//        try {
//            // Carregar todas as linhas do arquivo
//            List<String> linhas = new ArrayList<>();
//            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//                String linhaArquivo;
//                while ((linhaArquivo = reader.readLine()) != null) {
//                    // Verifica se a linha contém o ID que deve ser atualizado
//                    if (linhaArquivo.startsWith(id + ";")) {
//                        // Substitui a linha com a nova versão
//                        linhas.add(linha);
//                    } else {
//                        // Mantém a linha original
//                        linhas.add(linhaArquivo);
//                    }
//                }
//            }
//
//            // Reescrever o arquivo com as linhas atualizadas
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//                for (String linhaArquivo : linhas) {
//                    writer.write(linhaArquivo);
//                    writer.newLine(); // Adiciona nova linha após cada entrada
//                }
//            }
//            System.out.println("Informações atualizadas com sucesso!");
//            
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar as informações: " + e.getMessage());
//        }
//    
//        salvarInformacoesUsuario();
//        salvarInteressesUsuario();
//        salvarPreferenciaUsuario();
//        
//    }
//    
//    public void salvarInformacoesUsuario() {
//        String linha = String.format("%d;%s;%s;%s;%d;%d;%d;%d;%s;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;",
//            this.id,
//            this.email, 
//            this.senha, 
//            this.nome, 
//            this.diaNascimento, 
//            this.mesNascimento, 
//            this.anoNascimento, 
//            this.idade, 
//            this.localizacao, 
//            this.generoBio, 
//            this.altura, 
//            this.peso, 
//            this.formaFisica, 
//            this.imc, 
//            this.cabeloNatural, 
//            this.pele, 
//            this.tatuagens, 
//            this.salario, 
//            this.certificaProfi,
//                this.personalidade);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
//            writer.write(linha);
//            writer.newLine();
//            System.out.println("Informações do usuário salvas com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar as informações do usuário: " + e.getMessage());
//        }
//    }
//    
//    public void salvarInteressesUsuario() {
//        String linha = String.format("%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;",
//            this.id,
//            this.viagens, 
//            this.musica, 
//            this.gastronomia, 
//            this.livros, 
//            this.esportes, 
//            this.natureza, 
//            this.artes, 
//            this.jogos, 
//            this.animais, 
//            this.causa);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios_interesses.txt", true))) {
//            writer.write(linha);
//            writer.newLine();
//            System.out.println("Interesses salvos com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar os interesses: " + e.getMessage());
//        }
//    }
//    
//    public void salvarPreferenciaUsuario() {
//        String linha = String.format("%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;",
//            this.id,
//            this.intGeneroBio, 
//            this.intAltura, 
//            this.intTatuagens, 
//            this.intCabeloNatural, 
//            this.preto, 
//            this.castanho, 
//            this.loiro, 
//            this.ruivo, 
//            this.intPele, 
//            this.escuro, 
//            this.cauca, 
//            this.claro);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios_preferencias.txt", true))) {
//            writer.write(linha);
//            writer.newLine();
//            System.out.println("Tipo de pessoa salvo com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar o tipo de pessoa: " + e.getMessage());
//        }
//    }
//
//    public int obterUltimoIdSalvo(String filePath) {
//        int ultimoId = -1; // Inicializa com -1 para indicar que nenhum ID foi encontrado
//
//        try {
//            // Garantir que o arquivo existe antes de ler
//            File file = new File(filePath);
//            if (!file.exists()) {
//                return -1; // Cria o arquivo se não existir
//            }
//
//            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//                String linha;
//                while ((linha = reader.readLine()) != null) {
//                    // Extrai o primeiro valor da linha que representa o ID
//                    String[] partes = linha.split(";");
//                    if (partes.length > 0) {
//                        try {
//                            int id = Integer.parseInt(partes[0]); // Assume que o ID é o primeiro valor
//                            if (id > ultimoId) {
//                                ultimoId = id;
//                            }
//                        } catch (NumberFormatException e) {
//                            System.out.println("Erro ao converter ID: " + e.getMessage());
//                        }
//                    }
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
//            return -1;
//        }
//
//        return ultimoId; // Retorna o último ID encontrado
//    }
//
//    public int ObterIdade(int anoNascimento, int mesNascimento, int diaNascimento) {
//        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
//        LocalDate dataAtual = LocalDate.now();
//        Period periodo = Period.between(dataNascimento, dataAtual);
//        return periodo.getYears();
//    }
//
//    public int ObterIMC(int altura, int peso) {
//        // Converter altura de centímetros para metros
//        float alturaEmMetros = altura / 100f; // Corrigido para a conversão correta
//
//        // Calcular o IMC
//        float imc = peso / (alturaEmMetros * alturaEmMetros);
//
//        // Retornar a categoria do IMC
//        if (imc < 18.5) {
//            return 0; // Abaixo do peso
//        } else if (imc < 24.9) {
//            return 1; // Peso ideal
//        } else if (imc < 29.9) {
//            return 2; // Sobrepeso
//        } else {
//            return 3; // Obesidade
//        }
//    }