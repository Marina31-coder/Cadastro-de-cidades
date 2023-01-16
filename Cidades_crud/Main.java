package br.com.ada.crud;

import br.com.ada.crud.controller.CidadeArmazenamentoTipo;
import br.com.ada.crud.controller.CidadeControllerFactory;
import br.com.ada.crud.view.CidadeView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipoArmazenamento = args[0];
        CidadeArmazenamentoTipo tipo = CidadeArmazenamentoTipo.valueOf(tipoArmazenamento);

        CidadeControllerFactory factory = new CidadeControllerFactory();

        CidadeView view = new CidadeView(
                factory.criar(tipo),
                new Scanner(System.in)
        );
        view.exibirOpcoes();
    }

}
