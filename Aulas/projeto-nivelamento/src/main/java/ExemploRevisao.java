public class ExemploRevisao {
    public static void main(String[] args) {
       //Tipos de variáveis que mais usaremos:

       //Tipos Wrapper = são classe, ou seja, possuem métodos que ajudam
       String nome = "Bob da Silva";
       Integer idade = 42;
       Double altura = 1.55;
       Boolean bloqueado = false;

        //somente println
        System.out.println("Meu nome é " + nome + " minha altura é " + altura + "\ne minha idade é " + idade);

        //println usando interpolação
        // %s para String
        // %d para inteiros
        // %.xf para Double (x = quantidade de casas após a virgula)
        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome, altura, idade));

        //println usando interpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));

       String nomePet; // variável declarada, valor null
       nomePet = "Teste"; // variável inicializada

        // Tipo primitivo, não são classe, ou seja, sem métodos, (não utilizaremos)
        // Sempre tem valor inicial
       boolean bloqueado02 = false;
       int numero = 42;
    }
}