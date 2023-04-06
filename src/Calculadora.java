
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
public class Calculadora {
    private double n1;
    private double n2;
    private double r;

    public Calculadora() {
        this(0.0,0.0,0.0);
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
         setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: ")));
         setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: ")));
         setR(getN1()+getN2());
         JOptionPane.showMessageDialog(null, "O resultado da soma é " + getR());
    }
    
    public void subtrair(double a, double b){
       setR(a-b);
       JOptionPane.showMessageDialog(null, "O resultado da subtração é " + getR());
    }
    
    public double multiplicacao(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: ")));
        setR(getN2()*getN1());
        return getR();
    }
    
    public double dividir(double a, double b){
       setR(a / b);
       return getR();
    }
    
}

