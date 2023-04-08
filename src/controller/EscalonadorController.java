package controller;

import Kreis.fila.FilaObject;

public class EscalonadorController {
	public void escalonador(FilaObject fila) {
	    if (!fila.estaVazia()) {
	        Processo processo = (Processo) fila.desenfileirar();
	        processo.decrementaRetornos();
	        if (processo.getQtdRetornos() > 0) {
	            fila.enfileirar(processo);
	            System.out.println(processo.getNome() + " foi reinserido na fila.");
	        }
	        System.out.println("Processo " + processo.getNome() + " finalizado.");
	    }
	}
}