import static org.junit.Assert.*;

import org.junit.Test;

import br.com.tt.MensagemUtil;
import junit.framework.Assert;

public class MensagemUtilTest {

	@Test(timeout = 5005)
	public void testMostrarMensagem() {
		MensagemUtil mensagemUtil = new MensagemUtil("Ver tempo Execução");
		try {
			mensagemUtil.mostraMensagem();
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail("Falha da InterruptedException");			
		}				
	}
}
