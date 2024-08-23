import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        Funcionario testeFuncionario = new Funcionario();

        System.out.println(" digite o nome do funcionario");
        testeFuncionario.nome = leitura.next();

        System.out.println("digite o sobrenome do funcionario");
        testeFuncionario.sobrenome = leitura.next();

        System.out.println("digite a carga horaria do funcionario");
        testeFuncionario.HorasTrabalhadas = Integer.parseInt(leitura.next());

        System.out.println("digite o valor da hora da hora ");
        testeFuncionario.ValorPorHora = Double.parseDouble(leitura.next());

        System.out.println("digite o numero de horas");
        int horas = leitura.nextInt();
        testeFuncionario.


        System.out.println(testeFuncionario.NomeCompleto());
        System.out.println(testeFuncionario.calcularSalario());

    }


}