// class abstrata ninguém pode instanciar ou criar um objeto dela
// vamos transformar essa classe em uma interface para poder autenticar as classes gerente, cliente e administrador
// Intarface e uma classe abstrata com todos os metdos abstratos. Dentro da interface não existe nada concreto
// concreto são os atributos que recebem valor também são os metodos que tem implementações
// na interface todos os metodos são abstratos, deixamos somente as assinaturas dos metodos
// interface não e para reutilização de codigo e sim uma alternativa para o polymorfismo

public abstract interface Autenticado {
    // na interface so define metodos que assinam contratos que a interface precisa implementar

    public void setSenha(int senha);

    public boolean autentica(int senha);
}

// contrato autenticavel
  // quem assinar esse contrato, e obrigado fazer as implementações dos metodos abstratos
     // metodo setSenha e metodo autentica

// agora vamos aplicar a interface Autenticado nas classe Cliente, Gerente e Administrador
