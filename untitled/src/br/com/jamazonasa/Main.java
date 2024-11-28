package br.com.jamazonasa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite nome e gênero de cada pessoa separado por vírgula. Exemplo: Maria-feminino, Joao-masculino");

        String entrada = s.nextLine();
        String[] entradas = entrada.split(",");
        for (String e : entradas) {
            String[] parte = e.trim().split("-");
            if (parte.length == 2) {
                String nome = parte[0].trim();
                String genero = parte[1].trim();
                pessoas.add(new Pessoa(nome, genero));
            } else {
                System.out.println("Digite novamente como no exemplo");
            }
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        System.out.println("Lista de mulheres: ");
        mulheres.forEach(mulher -> System.out.println(mulher.getNome()));
    }
}