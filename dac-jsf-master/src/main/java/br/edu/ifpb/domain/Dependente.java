package br.edu.ifpb.domain;

import java.util.Date;
import java.util.Objects;

public class Dependente {

    private int uuid;
    private String nome;
    private String dataDeNascimento;



    public Dependente() {

    }

    public Dependente(int uuid, String nome, String dataDeNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependente that = (Dependente) o;
        return uuid == that.uuid &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(dataDeNascimento, that.dataDeNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, nome, dataDeNascimento);
    }
}

