package projeto03;

public class TesteEmpregado {
    public static void main(String[] args) {
        PessoaFisica pessoafisica = new PessoaFisica("Joao", "da Silva", "3434343433");

        Empregado emp1 = new Empregado("Joao", "da Silva", "3434343433", 2000.00);
        System.out.println(emp1.dados());
        System.out.println(emp1.dados());

        Mensalista emp2 = new Mensalista("Jose", "Pereira", "4354545454", 3500.00);
        System.out.println(emp2.dados());
        System.out.println(emp2.salario());

        Comissionado emp3 = new Comissionado("Maria", "Pereira", "43434343", 1500.00, 5000.00);
        System.out.println(emp3.dados());
        System.out.println(emp3.salario());

        Tarefeiro emp4 = new Tarefeiro("Marcio", "Pereia", "43454545", 1000.00);
        System.out.println(emp4.dados());
        System.out.println(emp4.salario());

        Horista emp5 = new Horista("Mario", "da Silva", "655655665", 100, 7);
        System.out.println(emp5.dados());
        System.out.println(emp5.salario());
        System.out.println(emp5.horasTrabalhadas());
    }
}
