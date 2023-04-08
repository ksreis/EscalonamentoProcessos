package view;

import Kreis.fila.FilaObject;
import controller.EscalonadorController;
import controller.Processo;

public class Principal {
	
	public static void main(String[] args) {
	    FilaObject filaProcessos = new FilaObject();
	    filaProcessos.enfileirar(new Processo("notepad.exe", 14));
	    filaProcessos.enfileirar(new Processo("write.exe", 35));
	    filaProcessos.enfileirar(new Processo("chrome.exe", 27));
	    filaProcessos.enfileirar(new Processo("acrobat.exe", 52));
	    filaProcessos.enfileirar(new Processo("firefox.exe", 18));
	    filaProcessos.enfileirar(new Processo("word.exe", 25));

	    EscalonadorController escalonadorController = new EscalonadorController();

	    while (!filaProcessos.estaVazia()) {
	        escalonadorController.escalonador(filaProcessos);
	    }

	    System.out.println("Escalonamento terminado.");
	}
}