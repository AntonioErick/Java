import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        String pathOriging = "C:\\eclipse\\Projetos\\LerArquivos\\out\\summary.csv";

        readFile(pathOriging);
    }

    public static void readFile(String path) {
        Path pathOriging;

        try {
            pathOriging = Paths.get(path);
            if(!Files.exists(pathOriging)){
                System.err.println("Erro: O caminho de origem nao foi encontrado.");
                return;
            }
        }
        catch(InvalidPathException e){
            System.err.println("Erro: O caminho do arquivo fornecido é inválido. Detalhe: " + e.getMessage());
            return;
        }

        try{
            Path diretorioSaida = pathOriging.getParent().resolve("out");
            Files.createDirectories(diretorioSaida);
            Path caminhoSaida = diretorioSaida.resolve("summary.csv");

            try(BufferedReader leitor = Files.newBufferedReader(pathOriging);
                BufferedWriter escritor = Files.newBufferedWriter(caminhoSaida)){
                
                    String linha;
                while ((linha = leitor.readLine()) != null) {
                    String[] colunas = linha.split(",");

                    if(colunas.length == 3){
                        try{
                            String nomeItem = colunas[0].trim();
                            Double precoUnitario = Double.parseDouble(colunas[1].trim());
                            int quantidade = Integer.parseInt(colunas[2].trim());

                            Double valorTotal = precoUnitario * quantidade;
                            String linhaSaida = String.format("%s, %.2f%n", nomeItem, valorTotal);
                            escritor.write(linhaSaida);
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Aviso: Dados em formato numérico inválido na linha: " + linha);
                        }
                    }
                    else {
                        System.err.println("Aviso: Linha em formato inesperado (não contém 3 colunas): " + linha);
                    }
                }
            }

            System.out.println("\nArquivo 'summary.csv' criado com sucesso em: " + caminhoSaida);
        }
        catch(IOException e){
            System.err.println("Erro de E/S (Entrada/Saída) ao processar os arquivos: " + e.getMessage());
        }
    }
}
