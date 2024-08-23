public class Funcionario {
    public String nome ;
    public String sobrenome;
    public int HorasTrabalhadas;
    public double ValorPorHora;

    public String NomeCompleto()
    {
      return  ( nome + sobrenome);
    }

      public double calcularSalario ()
      {
        return  (HorasTrabalhadas * ValorPorHora);

      }

    public static void  incrementarHoras(int horasincrementadas)
    {
            this.ValorPorHora += horasincrementadas;

    }




    }

