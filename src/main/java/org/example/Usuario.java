package org.example;

public class Usuario {

    private String nome;
    private float saldo = 100;
        private float investimento;

    public Usuario() {
        this.nome = nome;
        this.saldo = saldo;

        this.investimento = investimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }
}
