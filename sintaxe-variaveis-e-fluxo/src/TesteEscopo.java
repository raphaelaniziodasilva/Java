public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais if");
        int idade = 20;
        int quantidadePessoas = 2;
        boolean acompanhado;

        // verificando se a pessoas esta acompanhado
        if(quantidadePessoas >= 1) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
