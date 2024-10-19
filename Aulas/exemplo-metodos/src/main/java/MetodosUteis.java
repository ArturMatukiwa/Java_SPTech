public class MetodosUteis {
    //Método
    //Retorno ou void se não houver retorno
    //nome: exibirUsuario
    //argumentos: nomeUsuario
    //corpo: faz um print enfeitado com o nome

    void exibirUsuario(String nomeUsuario){
        System.out.println("""
                *--------------*--------------*
                Usuário logado: %s
                *--------------*--------------*
                """.formatted(nomeUsuario));
    }

    Double somar(Double num01, Double num02) {
        return num01 + num02;
    }
}