public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente ichigo = new Gerente("Kurosaki Ichigo", "12569811116",458);
        Designer nico = new Designer("nico", "12567771116",48);

        System.out.println(ichigo.getNome());
        System.out.println(ichigo.getBonificacao());

    }
}
