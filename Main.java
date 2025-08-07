//Crie um programa Java em um único arquivo chamado Main, utilizando: Uma classe chamada
//Funcionario, com os atributos nome e faltas. Crie um array com 5 objetos da classe Funcionario.
//Utilize for ou while para percorrer o array. Use estruturas if para mostrar funcionários com menos
//de 2 faltas. Ao final, calcule e exiba média de faltas.

public class Main {
    public class Funcionario {
        String nome;
        int faltas;
        
    public Funcionario(String nome, int faltas) {
        this.nome = nome;
        this.faltas = faltas;
    }
}
public static void main(String[] args) {
       funcionarios[0] = new Funcionario("Guilherme", 1);
       funcionarios[1] = new Funcionario("Maria Clara", 3);
       funcionarios[2] = new Funcionario("P10", 0);
       funcionarios[3] = new Funcionario("Luana", 2);
       funcionarios[4] = new Funcionario("Bispo", 1);
    
        System.out.println("Funcionários com menos de 2 faltas:");
       for (int i = 0; i < funcionarios.length; i++) {
           if(funcionarios[i].faltas < 2) {
               System.out.println("- " + funcionarios[i].nome + " (" + funcionarios[i].faltas +
           }
       }
    int somaFaltas = 0;
    int totalFuncionarios = funcionarios.length;
    
    for (int i = 0; i < totalFuncionarios; i++) {
        somaFaltas += funcionario[i].faltas;
    }
    
    double mediaFaltas = (double) somaFaltas / totalFuncionarios;
    System.out.printf("\nMédia de faltas dos funcionarios%.2f\n", mediaFaltas);
   }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
}