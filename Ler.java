
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class Ler {
     Path caminho = Paths.get("C:/Users/Felipe/Desktop/batata.txt");
        
     public void ler(){
        try {
        
        byte[] texto = Files.readAllBytes(caminho);
        String leitura = new String(texto);
        
        JOptionPane.showMessageDialog(null, leitura);
        
        }catch (Exception erro){
        
        
        }
     }
     }
