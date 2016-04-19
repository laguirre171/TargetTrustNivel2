package br.com.tt.service;

import java.util.ArrayList;
import java.util.List;

import br.com.tt.dao.Crud;
import br.com.tt.model.Agenda;

public class AgendaService {

	private Crud<Agenda> crud;

	public Agenda verificaHeColega(Agenda agenda) {
		if (agenda.getColega() != null && agenda.getColega()) {
			agenda.setNome(agenda.getNomeFake());
		}
		return agenda;
	}

	public List<Agenda> colegasImportantes(Double nota) {
		List<Agenda> resultado = new ArrayList<Agenda>();
		List<Agenda> colegas = crud.consultar();
		for (Agenda agenda : colegas) {
			if (agenda.getSexo() == 'F' && agenda.getNota() >= nota) {
				resultado.add(verificaHeColega(agenda));
			}
		}
		return resultado;
	}

	public void setCrud(Crud<Agenda> crud) {
		this.crud = crud;
	}
	
	

}
