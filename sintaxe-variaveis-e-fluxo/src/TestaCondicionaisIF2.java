public class TestaCondicionaisIF2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais if");
        int idade = 15;
        int acompanhado = 2;

        if (idade >= 18 || acompanhado >= 2) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
