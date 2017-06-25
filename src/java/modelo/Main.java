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
public class Main {

    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        Clientes clientes = new Clientes();
        int numClientes;
        System.out.print("Digite o nº de clientes: ");
        numClientes = leer.nextInt();
        for (int i = 1; i <= numClientes; i++) {
            String nome;
            String sexo;
            String endereco;
            int idade;
            int telefone;
            System.out.println("Digite o nome do cliente nº " + i + ":  ");
            nome = leer.next();
            System.out.println("Digite o sexo: ");
            sexo = leer.next();
            System.out.println("Digite o endereço: ");
            endereco = leer.next();
            System.out.println("Digite a idade: ");
            idade = leer.nextInt();
            System.out.println("Digite o telefone: ");
            telefone = leer.nextInt();
            clientes.alta(nome, sexo, endereco, idade, telefone);
        }
        System.out.println("\nLista geral de clientes:");
        clientes.listaNomes();
        System.out.println("Estatísticas");
        clientes.conteo();
    }
}
