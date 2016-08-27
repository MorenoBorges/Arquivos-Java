
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import javax.swing.JOptionPane;


public class Digitar {
    
    
    
    public void Digitar(){
    Path caminho = Paths.get("C:/Users/Felipe/Desktop/batata.txt");
    String texto = JOptionPane.showInputDialog("Teste de arquivos java");
    byte[] textoEmByte = texto.getBytes();
    try {
    Files.write(caminho, textoEmByte);
}catch (Exception erro){

}
    }
}
