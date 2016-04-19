package br.com.tt.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;

import br.com.tt.dao.Crud;
import br.com.tt.model.Agenda;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class AgendaServiceTest {

	@Test
	public void testVerificaHeColega() {
		Agenda agenda = new Agenda();
		agenda.setNome("Camila");
		agenda.setSexo('F');
		agenda.setColega(Boolean.TRUE);

		agenda.setNomeFake("Camilo");

		assertEquals("Camilo", new AgendaService().verificaHeColega(agenda).getNome());
		// igual a linha acima
		AgendaService agendaService = new AgendaService();
		Agenda agendaNova = agendaService.verificaHeColega(agenda);
		String nome = agendaNova.getNome();
		assertEquals("Camilo", nome);
	}

	@Test
	public void testColegasImportantes() {

		AgendaService agendaService = new AgendaService();
		Crud<Agenda> agendaCrud = mock(Crud.class);
		when(agendaCrud.consultar()).thenReturn(getConsultaCrudMoke());
		agendaService.setCrud(agendaCrud);
		List<Agenda> colegasImportantes = agendaService.colegasImportantes(7D);
		assertTrue(colegasImportantes.size() == 3);

		
	}

	private List<Agenda> getConsultaCrudMoke() {
		List<Agenda> listaAgendas = new ArrayList<Agenda>();

		listaAgendas.add(new Agenda("Camila"));
		listaAgendas.add(new Agenda("Marcela", "933286"));
		Agenda agenda = new Agenda();
		agenda.setNome("Lisa");
		agenda.setSexo('F');
		agenda.setNomeFake("Lisandro");
		agenda.setNota(9.5);
		listaAgendas.add(agenda);

		agenda.setNome("Lisa");
		agenda.setSexo('F');
		agenda.setNota(9.5);
		listaAgendas.add(agenda);

		agenda.setNome("Lisa");
		agenda.setSexo('F');

		listaAgendas.add(agenda);
		return listaAgendas;
	}

}
