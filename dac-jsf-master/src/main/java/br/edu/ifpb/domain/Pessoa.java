package br.edu.ifpb.domain;

import java.util.Objects;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private Dependente dependente;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(int id, String nome, String cpf, Dependente dependente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dependente = dependente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dependente=" + dependente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(dependente, pessoa.dependente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, dependente);
    }
}
