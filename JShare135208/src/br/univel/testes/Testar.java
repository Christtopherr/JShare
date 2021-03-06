package br.univel.testes;

import java.awt.EventQueue;

import br.univel.cliente.FrameCliente;
import br.univel.servidor.FrameServidor;

public class Testar {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					FrameServidor servidor = new FrameServidor();
					servidor.setVisible(true);
					servidor.configurar();
					
					servidor.setBounds(0, 0, 1000, 300);
					
					FrameCliente cliente = new FrameCliente();
					cliente.setVisible(true);
					cliente.configurar();
					cliente.setBounds(0, 350, 1000, 300);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}


