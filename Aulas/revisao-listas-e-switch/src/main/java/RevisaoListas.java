import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {
//        List<String> frutas = new ArrayList<>();
//        frutas.add("Laranja");
//        frutas.add("Goiaba");
//
//        System.out.println(frutas);

        List<String> Imutavel = List.of("Laranja", "Goiaba", "Limão");

//        System.out.println(Imutavel);

//        Imutavel.add("papaya");

        List<String> frutasMutavel = new ArrayList<>(
                List.of("Laranja", "Goiaba", "Limão", "Goiaba"
        ));

        System.out.println(frutasMutavel);

        frutasMutavel.add("papaya");

        System.out.println(frutasMutavel);

        frutasMutavel.set(2, "Melancia");
        System.out.println(frutasMutavel);

        System.out.println(frutasMutavel.get(0));

        frutasMutavel.remove(0);
        System.out.println(frutasMutavel);

        frutasMutavel.remove("Goiaba");
        System.out.println(frutasMutavel);

        for (int i = 0; i < Imutavel.size(); i++) {
            System.out.println(Imutavel.get(i));
        }

        System.out.println("Iterando Lista com for aprimorado");
        for (String frutaDaVez : Imutavel) {
            System.out.println(frutaDaVez);
        }

        for (int i = 0; i < Imutavel.size(); i++) {
            
        }

    }
}