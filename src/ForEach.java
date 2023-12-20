

/*import java.util.List;
import java.util.stream.Stream;*/
import java.*;

/**
 * @author Rafael da Silva Muniz
 */
public class ExemplosForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Maria"))
                .forEach(p -> System.out.println(p.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Anecy"));

        stream.forEach(p -> System.out.println(p.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .map(Pessoa::getGenero)
                .forEach(p -> System.out.println(p));
    }
}
