package AsEscuras.User;

import AsEscuras.Algoritimo.Lista;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Usuario {
    protected int id;
    protected String email;
    protected String senha;
    protected String nome;
    protected int diaNascimento;
    protected int mesNascimento;
    protected int anoNascimento;
    protected int idade;
    protected String localizacao;
    protected int generoBio; // masc = 0 / fem = 1
    protected int altura;
    protected int peso;
    protected int formaFisica;
    protected int imc;
    protected int cabeloNatural;

    protected int pele;
    protected int tatuagens; // 0 = false, 1 = true
    protected int salario;
    protected int certificaProfi; // 0 = false, 1 = true
    protected int personalidade;

    protected int intGeneroBio;
    protected int intAltura;
    protected int intTatuagens; // 0 = false, 1 = true
    protected int intCabeloNatural; // 0 = false, 1 = true
    protected int preto; // 0 = false, 1 = true
    protected int castanho; // 0 = false, 1 = true
    protected int loiro; // 0 = false, 1 = true
    protected int ruivo; // 0 = false, 1 = true
    protected int intPele; // 0 = false, 1 = true
    protected int escuro; // 0 = false, 1 = true
    protected int cauca; // 0 = false, 1 = true
    protected int claro; // 0 = false, 1 = true
    protected int viagens; // 0 = false, 1 = true
    protected int musica; // 0 = false, 1 = true
    protected int gastronomia; // 0 = false, 1 = true
    protected int livros; // 0 = false, 1 = true
    protected int esportes; // 0 = false, 1 = true
    protected int natureza; // 0 = false, 1 = true
    protected int artes; // 0 = false, 1 = true
    protected int jogos; // 0 = false, 1 = true
    protected int animais; // 0 = false, 1 = true
    protected int causa; // 0 = false, 1 = true

    protected int atracao;
    protected int gostei; // 0 = false, 1 = true
    protected int amei; // 0 = false, 1 = true
    
    public Usuario(){}
    
    // Construtor
    public Usuario(int id, String email, String senha, String nome, int diaNascimento, int mesNascimento, int anoNascimento, int idade, String localizacao, int generoBio, int altura, int peso, int formaFisica, int imc, int cabeloNatural, int pele, int tatuagens, int salario, int certificaProfi, int personalidade, int intGeneroBio, int intAltura, int intTatuagens, int intCabeloNatural, int preto, int castanho, int loiro, int ruivo, int intPele, int escuro, int cauca, int claro, int viagens, int musica, int gastronomia, int livros, int esportes, int natureza, int artes, int jogos, int animais, int causa, int atracao, int gostei, int amei) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = idade;
        this.localizacao = localizacao;
        this.generoBio = generoBio;
        this.altura = altura;
        this.peso = peso;
        this.formaFisica = formaFisica;
        this.imc = imc;
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

        this.atracao = atracao;
        this.gostei = gostei;
        this.amei = amei;
    }
    
    public void lerDadosUser (int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            // Lê cada linha do arquivo
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id_banco = Integer.parseInt(dados[0]);
                if (id_banco == id) {
                    
                    this.id = id_banco;
                    this.email = dados[1];
                    this.senha = dados[2];
                    this.nome = dados[3];
                    
                    this.diaNascimento = Integer.parseInt(dados[4]);
                    this.mesNascimento = Integer.parseInt(dados[5]);
                    this.anoNascimento = Integer.parseInt(dados[6]);
                    this.idade = Integer.parseInt(dados[7]);
                    this.localizacao = dados[8];
                    this.generoBio = Integer.parseInt(dados[9]);
                    this.altura = Integer.parseInt(dados[10]);
                    this.peso = Integer.parseInt(dados[11]);
                    this.formaFisica = Integer.parseInt(dados[12]);
                    this.imc = Integer.parseInt(dados[13]);
                    this.cabeloNatural = Integer.parseInt(dados[14]);
                    this.pele = Integer.parseInt(dados[15]);
                    this.tatuagens = Integer.parseInt(dados[16]);
                    this.salario = Integer.parseInt(dados[17]);
                    this.certificaProfi = Integer.parseInt(dados[18]);
                    this.personalidade = Integer.parseInt(dados[19]);
                    
                    this.intGeneroBio = Integer.parseInt(dados[20]); // Index 20
                    this.intAltura = Integer.parseInt(dados[21]); // Index 21
                    this.intTatuagens = Integer.parseInt(dados[22]); // Index 22
                    this.intCabeloNatural = Integer.parseInt(dados[23]); // Index 23
                    this.preto = Integer.parseInt(dados[24]); // Index 24
                    this.castanho = Integer.parseInt(dados[25]); // Index 25
                    this.loiro = Integer.parseInt(dados[26]); // Index 26
                    this.ruivo = Integer.parseInt(dados[27]); // Index 27
                    this.pele = Integer.parseInt(dados[28]); // Index 28
                    this.escuro = Integer.parseInt(dados[29]); // Index 29
                    this.cauca = Integer.parseInt(dados[30]); // Index 30
                    this.claro = Integer.parseInt(dados[31]); // Index 31

                    this.viagens = Integer.parseInt(dados[32]); // Index 32        
                    this.musica = Integer.parseInt(dados[33]); // Index 33        
                    this.gastronomia = Integer.parseInt(dados[34]); // Index 34    
                    this.livros = Integer.parseInt(dados[35]); // Index 35           
                    this.esportes = Integer.parseInt(dados[36]); // Index 36       
                    this.natureza = Integer.parseInt(dados[37]); // Index 37         
                    this.artes = Integer.parseInt(dados[38]); // Index 38            
                    this.jogos = Integer.parseInt(dados[39]); // Index 39            
                    this.animais = Integer.parseInt(dados[40]); // Index 40          
                    this.causa = Integer.parseInt(dados[41]); // Index 41           
                    
                    break; // Sai do loop após encontrar o usuário
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }
    }
       
    public void userAltual(int id) {
        String linha = String.format("%d", id); // Use the parameter id
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt", false))) {
            writer.write(linha);
            // writer.newLine(); // Uncomment if you want to add a new line after writing
        } catch (IOException e) {
            System.out.println("Erro ao salvar as informações do usuário: " + e.getMessage());
        }
    }
    public int userLeitura() {
        String filePath = "user.txt";
        String linha;
        int resultado = -1; // Valor padrão caso não encontre o ID

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            linha = reader.readLine(); // Adicionando ponto e vírgula aqui
            if (linha != null) {
                resultado = Integer.parseInt(linha);
            } else {
                System.out.println("O arquivo está vazio.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as informações do usuário: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o ID: " + e.getMessage());
        }

        return resultado; // Retorna o ID encontrado ou -1 se não encontrado
    }  
    // Getters e Setters
    public int getAtracao() { return atracao; }
    public void setAtracao(int atracao) { this.atracao = atracao; }

    public int getGostei() { return gostei; }
    public void setGostei(int gostei) { this.gostei = gostei; }

    public int getAmei() { return amei; }
    public void setAmei(int amei) { this.amei = amei; }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getDiaNascimento() { return diaNascimento; }
    public void setDiaNascimento(int diaNascimento) { this.diaNascimento = diaNascimento; }

    public int getMesNascimento() { return mesNascimento; }
    public void setMesNascimento(int mesNascimento) { this.mesNascimento = mesNascimento; }

    public int getAnoNascimento() { return anoNascimento; }
    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public int getGeneroBio() { return generoBio; }
    public void setGeneroBio(int generoBio) { this.generoBio = generoBio; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public int getFormaFisica() { return formaFisica; }
    public void setFormaFisica(int formaFisica) { this.formaFisica = formaFisica; }

    public int getImc() { return imc; }
    public void setImc(int imc) { this.imc = imc; }

    public int getCabeloNatural() { return cabeloNatural; }
    public void setCabeloNatural(int cabeloNatural) { this.cabeloNatural = cabeloNatural; }

    public int getPele() { return pele; }
    public void setPele(int pele) { this.pele = pele; }

    public int getTatuagens() { return tatuagens; }
    public void setTatuagens(int tatuagens) { this.tatuagens = tatuagens; }

    public int getSalario() { return salario; }
    public void setSalario(int salario) { this.salario = salario; }

    public int getCertificaProfi() { return certificaProfi; }
    public void setCertificaProfi(int certificaProfi) { this.certificaProfi = certificaProfi; }

    public int getPersonalidade() { return personalidade; }
    public void setPersonalidade(int personalidade) { this.personalidade = personalidade; }

    public int getIntGeneroBio() { return intGeneroBio; }
    public void setIntGeneroBio(int intGeneroBio) { this.intGeneroBio = intGeneroBio; }

    public int getIntAltura() { return intAltura; }
    public void setIntAltura(int intAltura) { this.intAltura = intAltura; }

    public int getIntTatuagens() { return intTatuagens; }
    public void setIntTatuagens(int intTatuagens) { this.intTatuagens = intTatuagens; }

    public int getIntCabeloNatural() { return intCabeloNatural; }
    public void setIntCabeloNatural(int intCabeloNatural) { this.intCabeloNatural = intCabeloNatural; }

    public int getPreto() { return preto; }
    public void setPreto(int preto) { this.preto = preto; }

    public int getCastanho() { return castanho; }
    public void setCastanho(int castanho) { this.castanho = castanho; }

    public int getLoiro() { return loiro; }
    public void setLoiro(int loiro) { this.loiro = loiro; }

    public int getRuivo() { return ruivo; }
    public void setRuivo(int ruivo) { this.ruivo = ruivo; }

    public int getIntPele() { return intPele; }
    public void setIntPele(int intPele) { this.intPele = intPele; }

    public int getEscuro() { return escuro; }
    public void setEscuro(int escuro) { this.escuro = escuro; }

    public int getCauca() { return cauca; }
    public void setCauca(int cauca) { this.cauca = cauca; }

    public int getClaro() { return claro; }
    public void setClaro(int claro) { this.claro = claro; }

    public int getViagens() { return viagens; }
    public void setViagens(int viagens) { this.viagens = viagens; }

    public int getMusica() { return musica; }
    public void setMusica(int musica) { this.musica = musica; }

    public int getGastronomia() { return gastronomia; }
    public void setGastronomia(int gastronomia) { this.gastronomia = gastronomia; }

    public int getLivros() { return livros; }
    public void setLivros(int livros) { this.livros = livros; }

    public int getEsportes() { return esportes; }
    public void setEsportes(int esportes) { this.esportes = esportes; }

    public int getNatureza() { return natureza; }
    public void setNatureza(int natureza) { this.natureza = natureza; }

    public int getArtes() { return artes; }
    public void setArtes(int artes) { this.artes = artes; }

    public int getJogos() { return jogos; }
    public void setJogos(int jogos) { this.jogos = jogos; }

    public int getAnimais() { return animais; }
    public void setAnimais(int animais) { this.animais = animais; }

    public int getCausa() { return causa; }
    public void setCausa(int causa) { this.causa = causa; }
}