public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Maria", "154789654,", 6050);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

    }
}
