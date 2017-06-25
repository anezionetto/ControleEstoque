/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Anézio
 */
public class No {

    String nome;
    String sexo;
    String endereco;
    int idade;
    int telefone;
    No next;
    No ant;

    No(String nome, String sexo, String endereco, int idade, int telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
        this.next = null;
        this.ant = null;
    }
}
