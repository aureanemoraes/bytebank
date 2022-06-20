package teste;

public class TesteSistema {

	public static void main(String[] args) {
		modelo.Gerente g = new modelo.Gerente();
		g.setSenha(2222);

		modelo.SistemaInterno si = new modelo.SistemaInterno();

		si.autentica(g);

	}

}
