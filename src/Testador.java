import junit.framework.Assert;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import java.*;


public class Testador extends GeneroTest{
	private static final String t = null;
	private Pessoa pessoa;

	@Test
	public void alteraPessoa() throws TipoChaveNaoEncontradaException {
		pessoa.setNome("Neymar Júnior");
		pessoaDao.alterar(pessoa);
		Assert.assertEquals("Neymar Júnior", pessoa.getNome());
	}

}
