package Cidades_crud;

import Cidades_crud.view.PessoaView;
import Cidades_crud.controller.PessoaArmazenamentoTipo;
import Cidades_crud.controller.PessoaControllerFactory;

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
