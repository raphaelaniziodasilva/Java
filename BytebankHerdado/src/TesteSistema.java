public class TesteSistema {
    public static void main(String[] args) {
        // criando gerente e ele não tem acesso a senha do sistema
        Gerente anderson = new Gerente("Anderson", "77947856,", 4888);
        anderson.setSenha(2222); // senha incorreta

        // criando o sistema interno
        SistemaInterno si = new SistemaInterno();
        // verificando se o gerente esta autenticado
        si.autentica(anderson); // gerente não autenticado

        // criando gerente e ele tem acesso a senha do sistema
        Gerente gatoNet = new Gerente("Gato", "458793,", 2500);
        gatoNet.setSenha(2585); // senha correta

        // verificando se o gerente esta autenticado
        si.autentica(gatoNet); // gerente autenticado e tem acesso permitido no sistema

        // criando administrador e ele tem acesso a senha do sistema
        Administrador johnny = new Administrador("Johnny", "14588834577", 3500);
        johnny.setSenha(2585); // senha correta

        // verificando se o adminstrador esta autenticado
        si.autentica(johnny); // adminstrador autenticado e tem acesso permitido no sistema

        Cliente cliente = new Cliente();
        cliente.setSenha(2585);
        si.autentica(cliente);


    }
}
