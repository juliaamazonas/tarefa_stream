package br.com.jamazonasa;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FiltragemTest {

    @Test
    public void filtrarApenasGeneroFeminino() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "feminino"));
        pessoas.add(new Pessoa("João", "masculino"));
        pessoas.add(new Pessoa("Ana", "feminino"));
        pessoas.add(new Pessoa("Carlos", "masculino"));


        List<Pessoa> mulheres = FiltragemGenero.filtrarPorGeneroFeminino(pessoas);


        Assert.assertEquals(String.valueOf(2), mulheres.size(), 2);
        Assert.assertEquals("Maria", mulheres.get(0).getNome());
        Assert.assertEquals("Ana", mulheres.get(1).getNome());
    }
}
