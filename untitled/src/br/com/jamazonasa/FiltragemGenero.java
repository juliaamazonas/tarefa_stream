package br.com.jamazonasa;

import java.util.List;
import java.util.stream.Collectors;

public class FiltragemGenero {

    public static List<Pessoa> filtrarPorGeneroFeminino(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());
    }
}