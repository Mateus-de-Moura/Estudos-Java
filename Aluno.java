
package com.mycompany.primeiroprojeto;
import javax.swing.JOptionPane;
public class Aluno {
    private String nome;
    private String sobrenome;
    private double peso;   

public void setNome(String Nome)
{
    this.nome = Nome;
}
public String getNome()
{
  return nome;
}
public void setSobrenome(String Sobrenome)
{
    this.sobrenome = Sobrenome;
}
public String getSobrenome()
{
    return sobrenome;
}
public void setPeso(double peso)
{
  this.peso = peso;  
}
public double getPeso()
{
    return peso;
}
public void apresente()
{
    JOptionPane.showMessageDialog(null, "seja Bem vindo" +" "+ getNome()+ " "+ getSobrenome()+ 
            " atualmente seu  peso é de "+ getPeso());           
}
public Aluno(String nome, String sobrenome, double peso)
{
    setNome(nome);
    setSobrenome(sobrenome);
    setPeso(peso);
}
}