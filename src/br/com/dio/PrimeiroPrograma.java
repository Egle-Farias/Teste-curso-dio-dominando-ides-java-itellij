package br.com.dio;

import br.com.dio.model.Gato;

import java.io.StringWriter;
import java.util.Enumeration;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro = new Livro("O problema dos 3 corpos", 380);
        System.out.println(Livro);

////          int a = 5;
////          int b = 3;
////        System.out.println("Hello Wolder " + (a+b));
////
    }
}


    class Livro {
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }


        public String getNome() {
            return nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }


