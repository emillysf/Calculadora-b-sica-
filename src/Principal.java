
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora cal = new Calculadora();
        
       int op;
       double a,b;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Somar "
                    + "\n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 0-Sair"));
            switch(op)
            {
                case 1: 
                    cal.somar();
                    break;
                case 2:
                    a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    cal.subtrair(a, b);
                    break;
                case 3: 
                    cal.multiplicacao();
                    JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + cal.getR());
                    break;
                case 4:
                    a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    cal.dividir(a, b);
                    JOptionPane.showMessageDialog(null, "O valor da divisão é: " + cal.getR());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa");
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        
    }while (op != 0);
    
    }
}