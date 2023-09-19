package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import util.Funcionario;


public class FuncionarioSalario {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Quantos funcionários serão cadastrados? ");
            int n = scanner.nextInt();
    
            List<Funcionario> funcionarios = new ArrayList<>();
    
            for (int i = 0; i < n; i++) {
                System.out.println("Funcionário #" + (i + 1) + ":");
                System.out.print("Id: ");
                int id = scanner.nextInt();
                //Não deicha repitir o id
                while (hasId(funcionarios, id)) {
                    System.out.println("Id já digitado! Tente novamente: ");
                    id = scanner.nextInt();
                }
                scanner.nextLine(); // Consumir a quebra de linha pendente
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();

                Funcionario novoFuncionario = new Funcionario(id, nome, salario);
                funcionarios.add(novoFuncionario);
            }
    
            System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
            int idParaAumento = scanner.nextInt();
    
                // Verificar se o ID existe
            boolean idEncontrado = false;
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getId() == idParaAumento) {
                System.out.print("Informe a porcentagem de aumento: ");
                double percentualAumento = scanner.nextDouble();
                funcionario.aumentarSalario(percentualAumento);
                idEncontrado = true;
                break;
            }
        }    
                if (!idEncontrado) {
                    System.out.println("ID não encontrado. Operação abortada.");
                }
        
                System.out.println("\nLista de Funcionários Atualizada:");
                for (Funcionario funcionario : funcionarios) {
                    System.out.println(funcionario);
                }
    
            scanner.close();
        }
         // Método para verificar se um ID já existe na lista de funcionários
        private static boolean hasId(List<Funcionario> funcionarios, int id) {
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getId() == id) {
                    return true;
                }
            }
            return false;
        }
    }
