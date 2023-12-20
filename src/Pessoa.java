/*import java.util.List;
import java.util.Objects;*/
import java.*;

/**
 * @author Rafael da Silva Muniz
 */
public class Pessoa {

    private String id;

    private String nome;

    private String genero;

    private int idade;

    public Pessoa() {

    }

    public Pessoa(String id, String nome, String genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getGenero(), pessoa.getIdade());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1" , "Hernandez Henrique", "Feminino", 18);
        Pessoa pessoa2 = new Pessoa("p2" , "Maria Roja", "Masculino", 21);
        Pessoa pessoa3 = new Pessoa("p3" , "Anecy Fernandes","LGBTQIA+", 50);
        Pessoa pessoa4 = new Pessoa("p4" , "Neymar Junior", "Sem Genero", 34);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
