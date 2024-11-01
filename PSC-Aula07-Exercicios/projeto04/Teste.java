package projeto04;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mario", 30, "Avenida Paulista", "555454436");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Endereco: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        if (pessoa.isMaiorDeIdade())
        {
            System.out.println(pessoa.getNome() + " e maior de idade.");
        }else
        {
            System.out.println(pessoa.getNome() + " e menor de idade");
        }

        if (pessoa.temTelefone())
        {
            System.out.println(pessoa.getNome() + " possui telefone.");
        }else
        {
            System.out.println(pessoa.getNome() + " nao tem telefone.");
        }
    }
}
