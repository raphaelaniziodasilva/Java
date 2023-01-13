public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Claudinei", "547856,", 2888);

        EditorVideo ev = new EditorVideo("Ytalo", "568897556,", 3088);

        Designer d = new Designer("Dede", "107547856,", 4888);
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao(150);
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}
