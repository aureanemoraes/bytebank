package teste;

public class TesteReferencias {

    public static void main(String[] args) {
    	modelo.Gerente g1 = new modelo.Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        
        modelo.ControleBonificacao controle = new modelo.ControleBonificacao();
        controle.registra(g1);

        System.out.println(controle.getSoma());

    }

}