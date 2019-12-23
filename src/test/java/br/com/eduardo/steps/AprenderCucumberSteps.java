package br.com.eduardo.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.eduardo.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberSteps {
	//////////////////// CENARIO 1
	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("qualquer coisa");
	}
    @Quando("^executa-lo$")
	public void executaLo() throws Throwable {
    }
    @Entao("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
    }

	//////////////////// CENARIO 2, e 3 CONTADOR
	private int contador = 0;
    @Dado("^que o valor do contador e (\\d+)$")
	public void queOValorDoContadorE(int arg1) throws Throwable {
		contador = arg1;
	}
    @Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
    }

	@Entao("^o valor do contador sera (\\d+)$")
	public void oValorDoContadorSera(int arg1) throws Throwable {
		// System.out.println(arg1);
		// System.out.println(contador);
		// System.out.println(arg1 == contador);
		// Assert.assertTrue(arg1 == contador);
      Assert.assertEquals(arg1, contador);
	}

/////////// CENARIO 4 e 5	
	Date entrega = new Date();
	@Dado("^que a entrega e dia (.*)$")
	public void queAEntregaEDia(@Transform(DateConverter.class)Date data) throws Throwable {
	 entrega = data;
	 System.out.println(entrega);
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);	
		}
		if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Entao("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {
	 DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	 String dataFormatada = format.format(entrega);
	 Assert.assertEquals(data, dataFormatada);
	}
	
///////////	 CENARIO 6, 7 e 8
	
	@Dado("^que o ticket( especial)? e (A.\\d{3})$")
	public void queOTicketAF(String tipo, String arg1) throws Throwable {
	   
	}

	@Dado("^que o valor da passagem e R\\$ (.*)$")
	public void queOValorDaPassagemER$(Double numero) throws Throwable {
	   System.out.println(numero);
	}

	@Dado("^que o nome do passageiro e \"(.{5,20})\"$")
	public void queONomeDoPassageiroE(String arg1) throws Throwable {
	   
	}

	@Dado("^que o telefone do passageiro e (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroE(String data) throws Throwable {
	   
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	    
	}

	@Entao("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	    
	}

}

	


