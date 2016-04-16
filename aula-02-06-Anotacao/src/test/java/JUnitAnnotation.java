import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotation {
	
	@BeforeClass
	public static void antesDaClasse(){
		System.out.println("Antes da Classe");
	}
	
	@AfterClass
	public static void depoisDaClasse(){
		System.out.println("Depois da Classe");
	}
	
	@Before
	public void anteDoTeste(){
		System.out.println("Antes do Teste");		
	}
	
	@After
	public void depoisDoTeste(){
		System.out.println("Depois do Teste");
	}
	
	@Test
	public void meuTeste(){
		System.out.println("Meu Teste");
	}
	
	@Test
	public void meuTeste2(){
		System.out.println("Meu Teste2");
	}
	
	@Ignore 
	public void ignoraTeste(){
		System.out.println("Meu Teste");
	}
	
}
