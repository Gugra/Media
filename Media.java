
import javax.swing.JOptionPane;
public class Media{
   static char menu() { 
      char op;
      do {
         op = JOptionPane.showInputDialog(
         "Digite sua opcao:\n a- media \n b - maximo\n c - minimo\n s - sair").charAt(0);
      } while (op != 'a'  && op != 'b'  && op != 'c' && op != 's' && op != 'S');
      return op;
    }
    static int media (int n1, int n2) {
        return (n1 + n2)/2;
    }
    static  int maximo(int n1,int n2){
        if (n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    static  int minimo(int n1,int n2){
        if (n1<n2){
            return n1;
        }
        else{
            return n2;
        }
    }
   
   public static void main (String[] args) {
      char opcao;
      opcao = menu();
      while (opcao != 's' && opcao != 'S'){
         //leitura dos valores
         int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
         //processamento
         switch (opcao) {
            case 'a':{
               int s =media (num1, num2);
               JOptionPane.showMessageDialog(null, "media = " + s);
               break;
            }
            case 'b':{
                int s= maximo(num1,num2);
                JOptionPane.showMessageDialog(null,"maximo   = "+ s);
                break;
            }
            case 'c':{
                int s= minimo(num1,num2);
                JOptionPane.showMessageDialog(null,"minimo = "+ s);
                break;
                }
            
         }
         opcao = menu();
      }  
      JOptionPane.showMessageDialog(null, "Obrigado. Volte Sempre!");
   }
}