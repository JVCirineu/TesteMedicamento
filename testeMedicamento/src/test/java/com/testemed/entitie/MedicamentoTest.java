package com.testemed.entitie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MedicamentoTest {
private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		//Arrange
		medicamento = new Medicamento(1L,"Dorflex","para dor, alérgicos contém dipirona","05/2007");
	}
	
	@Test
	@DisplayName("Testando getter e setter do ID")
	void testId() {
		medicamento.setId(2L);
		//Assert
		assertEquals(2L,medicamento.getId());
	}
	@Test
	@DisplayName("Testando getter e setter do NOME")
	void testNome() {
		//Act
		medicamento.setNome("Dramim");
		//Assert
		assertEquals("Dramim", medicamento.getNome());
	}
	@Test
	@DisplayName("Testando getter e setter do BULA")
	void testBula() {
		//Act
		medicamento.setBula("aprecie com moderação");
		//Assert
		assertEquals("aprecie com moderação", medicamento.getBula());
	}
	@Test
	@DisplayName("Testando getter e setter do DATA VALIDADE")
	void testdataValidade() {
		//Act
		medicamento.setDataValidade("05/2027");
		//Assert
		assertEquals("05/2027", medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("Tetsanod todos os argumentos")
	void testConstrutor() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L,"Dramin","aprecie com moderação", "05/2027");
		//Assert
		assertAll("novoMedicamento",
				()-> assertEquals(3L,novoMedicamento.getId()),
				()-> assertEquals("Dramin",novoMedicamento.getNome()),
				()-> assertEquals("aprecie com moderação",novoMedicamento.getBula()),
				()-> assertEquals("05/2027",novoMedicamento.getDataValidade()));
	}
}
