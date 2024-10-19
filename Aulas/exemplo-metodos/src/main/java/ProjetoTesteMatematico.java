public class ProjetoTesteMatematico {
    public static void main(String[] args) {

        Double num01 = 42.0;
        Double num02 = 10.1;

        MetodosUteis metodosLegais = new MetodosUteis();

        //System.out.println(metodosLegais.somar(num01, num02));

        Double resultadoSoma = metodosLegais.somar(num01, num02);
        System.out.println(resultadoSoma);
    }
}