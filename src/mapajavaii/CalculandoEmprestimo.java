/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapajavaii;

/**
 *
 * @author jair
 */
public class CalculandoEmprestimo {
    int score;
    double salario;
    int idade;
    double salarioMinimo;
    
    public CalculandoEmprestimo(int score, double salario, int idade) {
        this.salarioMinimo = 1093;
        if(score <= 0 || score > 1000){
            throw new IllegalArgumentException("Score deve ser entre 0 e 1000.");
        }
        else{
            this.score = score;
        }
        if(salario < salarioMinimo){
            throw new IllegalArgumentException("Salario deve ser maior ou igual que o salario minimo do pais.");
        }else{
            this.salario = salario;
        }
        if(idade < 18){
            throw new IllegalArgumentException("Salario deve ser maior ou igual que o salario minimo do pais.");
        }
        this.idade = idade;
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
    
    public void calculatingLoan() {
        //
    }
}
