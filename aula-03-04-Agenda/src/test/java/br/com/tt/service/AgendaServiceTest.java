package br.com.tt.service;

import static org.junit.Assert.*;

import org.junit.Test;
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
		agenda.setNomeFake("Camilo");
		agenda.setColega(Boolean.TRUE);
		
		AgendaService agendaService = new AgendaService();
		Agenda verificaHeColega = agendaService.verificaHeColega(agenda);
		assertEquals("Camilo", verificaHeColega.getNome());
	}
	
	@Test
	public void testColegasImportantes(){
		AgendaService agendaService = new AgendaService();
		Crud<Agenda> agendaCrud = mock(Crud.class);
		
		List<Agenda> listaAgendas = new ArrayList<Agenda>();
		listaAgendas.add(new Agenda("Camila"));
		listaAgendas.add(new Agenda("Marcela","97878787"));
		Agenda agenda = new Agenda();
		agenda.setNome("Lisa");
		agenda.setSexo('F');
		agenda.setNomeFake("Lisandro");
		agenda.setNota(9.5);
		listaAgendas.add(agenda);
				
		when(agendaCrud.consultar()).thenReturn(listaAgendas);
		
		agendaService.setCrud(agendaCrud); //Chama o mock
		List<Agenda> colegasImportantes = agendaService.colegasImportantes(7D); 
		for (Agenda agenda2 : colegasImportantes) {
			System.out.println(agenda2);
			
		}
				
	}

}
