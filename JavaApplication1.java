import javax.swing.JOptionPane;

/**
 *
 * @author tuxcuiabano
 */
public class JavaApplication1 {
    
     public static void main( String[] args )
   {
      
      String primeiroNumero = 
         JOptionPane.showInputDialog( "Digite o primeiro número" );
      String segundoNumero =
          JOptionPane.showInputDialog( "Digite o segundo número" );

    
      int num1 = Integer.parseInt( primeiroNumero  ); 
      int num2 = Integer.parseInt( segundoNumero );

      int sum = num1 + num2; 

  
      JOptionPane.showMessageDialog( null, "A soma é " + sum, 
         "Soma de dois Inteiros", JOptionPane.PLAIN_MESSAGE );
   } 
    
    
}