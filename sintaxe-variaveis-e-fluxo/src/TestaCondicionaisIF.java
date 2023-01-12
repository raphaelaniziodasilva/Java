public class TestaCondicionaisIF {
    public static void main(String[] args) {
        System.out.println("Testando condicionais if");
        int idade = 14;
        boolean acompanhado = true;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo!");
        } else {
            if(acompanhado == true) {
                System.out.println("Você não tem 18 anos mais pode entrar pois você está acompanhado");
                System.out.println("Seja bem vindo!");
            } else {
                System.out.println("Infelizmente você não pode entrar");
            }
        }
    }
}
