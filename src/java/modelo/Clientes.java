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
public class Clientes {

    No primeiro;
    No ultimo;

    public Clientes() {
        primeiro = null;
        ultimo = null;
    }

    public boolean estaVazio() {
        return primeiro == null;
    }

    public Clientes alta(String dat, String dat2, String dat3, int dat4, int dat5) {
        if (estaVazio()) {
            No novo = new No(dat, dat2, dat3, dat4, dat5);
            primeiro = novo;
            ultimo = novo;
        } else {
            No novo = new No(dat, dat2, dat3, dat4, dat5);
            ultimo.next = novo;
            novo.ant = ultimo;
            ultimo = novo;
        }
        return this;
    }

    public void listaNomes() {
        No atual;
        atual = primeiro;
        while (atual != ultimo) {
            System.out.println(atual.nome);
            atual = atual.next;
        }
        System.out.println(atual.nome);

    }

    double tNos = 0, 
//            crianca = 0, jovem = 0, 
            adulto = 0, tHomem = 0, tMulher = 0, 
//            proCrianca = 0, proJovem = 0, 
            pronAdulto = 0, pronHomem = 0, proMulher = 0;

    public void conTotal(No dat) {
        if (dat == null) {
            return;
        }
        tNos = tNos + 1;
        conTotal(dat.next);
    }

//    public void conCrianca(No dat) {
//        int n = 13;
//        if (dat == null) {
//            return;
//        }
//        if (dat.idade <= n) {
//            crianca = crianca + 1;
//        }
//        conCrianca(dat.next);
//    }
//
//    public void conJovem(No dat) {
//        int n = 13, o = 24;
//        if (dat == null) {
//            return;
//        }
//        if (dat.idade > n & dat.idade < o) {
//            jovem = jovem + 1;
//        }
//        conJovem(dat.next);
//    }

    public void conAdulto(No dat) {
        int n = 24;
        if (dat == null) {
            return;
        }
        if (dat.idade >= n) {
            adulto = adulto + 1;
        }
        conAdulto(dat.next);
    }

    public void totalHomem(No dat) {
        if (dat == null) {
            return;
        }
        if (dat.sexo.equals("masculino")) {
            tHomem = tHomem + 1;
        }
        totalHomem(dat.next);
    }

    public void totalMulher(No dat) {
        if (dat == null) {
            return;
        }
        if (dat.sexo.equals("feminino")) {
            tMulher = tMulher + 1;
        }
        totalMulher(dat.next);
    }

    public void conteo() {
        conTotal(primeiro);
//        conCrianca(primeiro);
//        conJovem(primeiro);
        conAdulto(primeiro);
        totalHomem(primeiro);
        totalMulher(primeiro);
//        proCrianca = crianca / tNos;
//        proJovem = jovem / tNos;
        pronAdulto = adulto / tNos;
        pronHomem = tHomem / tNos;
        proMulher = tMulher / tNos;
        System.out.println(
//                "A porcentagem:\n de crianças é: " + proCrianca + " \n de jovens:"
//                + " " + proJovem +
                        "A porcentagem de: \n adultos: " + pronAdulto + "\n homens: "
                + pronHomem + "\n e mulheres: " + proMulher + ".");
    }
}
