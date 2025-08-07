public class Main {

    static class Funcionario {
        String nome;
        int faltas;


        public Funcionario(String nome, int faltas) {
            this.nome = nome;
            this.faltas = faltas;
        }
    }

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("Maria Clara", 3);
        funcionarios[1] = new Funcionario("Guilherme", 0);
        funcionarios[2] = new Funcionario("Nicolle", 1);
        funcionarios[3] = new Funcionario("Danilo", 4);
        funcionarios[4] = new Funcionario("Whendell", 2);

       System.out.println("Funcionários com menos de 4 faltas:");
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].faltas < 4) {
                System.out.println("- " + funcionarios[i].nome + " (" + funcionarios[i].faltas + " faltas)");
            }
        }

        int somaFaltas = 0;
        int totalFuncionarios = funcionarios.length;

        for (int i = 0; i < totalFuncionarios; i++) {
            somaFaltas += funcionarios[i].faltas;
        }

        double mediaFaltas = (double) somaFaltas / totalFuncionarios;
        System.out.printf("\nMédia de faltas dos funcionários: %.2f\n", mediaFaltas);
    }
}
