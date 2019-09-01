package br.com.eduardo.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import br.com.eduardo.entidades.Filme;
import br.com.eduardo.entidades.NotaAluguel;
import br.com.eduardo.entidades.TipoAluguel;
import br.com.eduardo.servicos.AluguelService;
import br.com.eduardo.utils.DateUtils;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AlugarFilmeSteps {

private Filme filme;
private AluguelService aluguel = new AluguelService();
private NotaAluguel nota;
private String erro;
private TipoAluguel tipoAluguel;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
	   filme = new Filme();
	   filme.setEstoque(arg1);
	}

	@Dado("^que o preco do aluguel seja R\\$ (\\d+)$")
	public void queOPrecoDoAluguelSejaR$(int arg1) throws Throwable {
       filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
	  try {
		nota = aluguel.alugar(filme, tipoAluguel);
	  } catch(RuntimeException e) {
		  erro = e.getMessage();
	  }
	}

	@Entao("^o preco do aluguel sera R\\$ (\\d+)$")
	public void oPrecoDoAluguelSeraR$(int arg1) throws Throwable {
     // Assert.assertEquals(arg1, nota.getPreco());
		filme.setAluguel(arg1);
	}

	

	@Entao("^o estoque do filme sera (\\d+) unidade$")
	public void oEstoqueDoFilmeSeraUnidade(int arg1) throws Throwable {
	 Assert.assertEquals(arg1, filme.getEstoque()); 
	}
	
	
	@Entao("^nao sera possivel por falta de estoque$")
	public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
    Assert.assertEquals("Filme sem estoque", erro);
	}
	
	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendida(String tipo) throws Throwable {
	    tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;
	}

	@Entao("^a data de entrega sera em (\\d+) dias?$")
	public void aDataDeEntregaSeraEmDias(int arg1) throws Throwable {
	    Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
	    Date dataReal = nota.getDataEntrega();
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Entao("^a pontuacao sera de (\\d+) pontos$")
	public void aPontuacaoSeraDePontos(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, nota.getPontucao());
	}
	
	
	@Dado("^um filme$")
	public void umFilme(DataTable table) throws Throwable {
	   Map<String, String> map = table.asMap(String.class, String.class);
       filme = new Filme();
       filme.setEstoque(Integer.parseInt(map.get("estoque")));
       filme.setAluguel(Integer.parseInt(map.get("preco")));
       
       String tipo = map.get("tipo"); 
       tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;  
	}
	
}
