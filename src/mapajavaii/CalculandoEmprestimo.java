/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapajavaii;

import javax.swing.JOptionPane;

/**
 *
 * @author jair
 */
public class CalculandoEmprestimo {
    int score;
    double salario;
    int idade;
    double emprestimoPossivel;

    public double getEmprestimoPossivel() {
        return emprestimoPossivel;
    }

    public void setEmprestimoPossivel(double emprestimoPossivel) {
        this.emprestimoPossivel = emprestimoPossivel;
    }
    
    public CalculandoEmprestimo(int scoreClient, double salarioClient, int idadeClient) {
        
        
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String calculatingLoan() {
        if (this.score < 300 && this.idade <=25){
            return "Clientes entre com idade entre 18 e 25 anos só podem receber empréstimos se o seu score for maior que 300";
            
        }else{
            if (score > 500){
                setEmprestimoPossivel(emprestimoPossivel=this.salario*12);
            }else{
                setEmprestimoPossivel(emprestimoPossivel=this.salario*6);
            }
        }
        return String.valueOf(this.emprestimoPossivel);
    }
}
