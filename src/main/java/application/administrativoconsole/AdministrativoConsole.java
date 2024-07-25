/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application.administrativoconsole;

import java.util.Scanner;
import entities.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author wasabi
 */

public class AdministrativoConsole {

    public static void main(String[] args) {

        ArrayList<Funcionario> listFuncionario = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int op;
        System.out.println("Bem Vindo Ao Controle Administrativo Console Java " + " \n 1 - Adicionar Novo Funcionario " + "\n 2 - Nome De Todos Os Funcionarios " + " \n 3 - Alterar " + " \n 4 - Informação De Todos Os Funcionarios ");

        do {
            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Adicionando Novo Funcionario");

                    System.out.print("Primeiro Nome : ");
                    String firtname = scStr.nextLine();
                    System.out.print("Último Nome : ");
                    String lastname = scStr.nextLine();
                    System.out.print("Qual é a sua função dentro da empresa : ");
                    String role = scStr.nextLine();
                    System.out.print("Seu Salario Atual : ");
                    Double salary = sc.nextDouble();

                    listFuncionario.add(new Funcionario(firtname, lastname, role, salary));

                    System.out.println("Funcionario adicionado com sucesso");
                    break;

                case 2:

                    if (listFuncionario.isEmpty()) {

                        System.out.println("a lista não contém nenhum funcionario");
                    } else {

                        for (int i = 0; i < listFuncionario.size(); i++) {

                            System.out.print(listFuncionario.get(i).getFirstname().toUpperCase() + " ");
                        }
                    }
                    break;

                case 3:

                    System.out.println("Digite o que deseja alterar : \n 1 - primeiro nome \n 2 - ultimo nome \n 3 - função \n 4 - salário");
                    int subop = sc.nextInt();

                    switch (subop) {

                        case 1:

                            if (listFuncionario.isEmpty()) {

                                System.out.println("a lista está vazia");

                            } else {
                                System.out.println("ATENÇÃO - Você alterará o primerio nome do funcionario");
                                System.out.print("primeiro digite sua posição na lista");
                                int posicao = sc.nextInt();
                                if (posicao >= listFuncionario.size() || listFuncionario.get(posicao) == null) {

                                    System.out.println("Não Existe Ninguém nesta posição");
                                    System.out.println("Você Voltou Ao Menu Principal");
                                    break;

                                } else {

                                    System.out.println("Você Mudará o nome de " + listFuncionario.get(posicao).getFirstname().toUpperCase());
                                    System.out.print("Digite o novo nome : ");
                                    String novonome = scStr.nextLine();
                                    listFuncionario.get(posicao).setFirstname(novonome);
                                    System.out.println("Alteração Feita Com Sucesso");
                                }

                            }

                            break;

                        case 2:

                            if (listFuncionario.isEmpty()) {

                                System.out.println("a lista está vazia");

                            } else {

                                System.out.println("ATENÇÃO - Você alterará o ultimo nome do funcionario");
                                System.out.print("primeiro digite sua posição na lista");
                                int posicao = sc.nextInt();
                                if (posicao >= listFuncionario.size() || listFuncionario.get(posicao) == null) {

                                    System.out.println("Não Existe Ninguém nesta posição");
                                    System.out.println("Você Voltou Ao Menu Principal");
                                    break;

                                } else {

                                    System.out.println("Você Mudará o segundo nome  de " + listFuncionario.get(posicao).getFirstname().toUpperCase());
                                    System.out.print("Digite o novo último nome : ");
                                    String novonome = scStr.nextLine();
                                    listFuncionario.get(posicao).setLastname(novonome);
                                    System.out.println("Alteração Feita Com Sucesso");

                                }

                            }

                            break;

                        case 3:

                            if (listFuncionario.isEmpty()) {

                                System.out.println("a lista está vazia");

                            } else {

                                System.out.println("ATENÇÃO - Você alterará a função do funcionario");
                                System.out.print("primeiro digite sua posição na lista : ");
                                int posicao = sc.nextInt();
                                if (posicao >= listFuncionario.size() || listFuncionario.get(posicao) == null) {

                                    System.out.println("Não Existe Ninguém nesta posição");
                                    System.out.println("Você Voltou Ao Menu Principal");
                                    break;

                                } else {

                                    System.out.println("Você Mudará a função de " + listFuncionario.get(posicao).getRole().toUpperCase() + " de " + " " + listFuncionario.get(posicao).getFirstname().toUpperCase());
                                    System.out.print("Digite a nova função : ");
                                    String novonome = scStr.nextLine();
                                    listFuncionario.get(posicao).setRole(novonome);
                                    System.out.println("Alteração Feita Com Sucesso");

                                }

                            }

                            break;

                        case 4:

                            if (listFuncionario.isEmpty()) {
                                System.out.println("a lista está vazia");
                                break;
                            } else {

                                System.out.println("ATENÇÃO - Você alterará a função do funcionario");
                                System.out.print("primeiro digite sua posição na lista");
                                int posicao = sc.nextInt();
                                if (posicao >= listFuncionario.size() || listFuncionario.get(posicao) == null) {

                                    System.out.println("Não Existe Ninguém nesta posição");
                                    System.out.println("Você Voltou Ao Menu Principal");
                                    break;

                                } else {

                                    System.out.println("Você Mudará o salario de " + listFuncionario.get(posicao).getSalary() + " " + listFuncionario.get(posicao).getFirstname().toUpperCase());
                                    System.out.print("Digite o novo salario mensal : ");
                                    Double novosalary = sc.nextDouble();
                                    listFuncionario.get(posicao).setSalary(novosalary);
                                    System.out.println("Alteração Feita Com Sucesso");
                                    
                                }

                            }
                            break;
                         

                            
                            
                        default : 
                            
                            System.out.println("Entrada Invalida");
                            break;
                    }
                    break;
                    

                case 4:
                    if (listFuncionario.isEmpty()) {
                        System.out.println("a lista está vazia");
                        System.out.println(" ");
                        break;
                    } else {
                        System.out.println("Informação De Todos os usuarios");
                        for (int i = 0; i < listFuncionario.size(); i++) {
                            System.out.println(listFuncionario.get(i));
                            System.out.println("\t");

                        }
                    }
                            
                    
                    break;
                    
                    
                 default : 
                    
                    System.out.println("Entrada Invalida ");
                    break;

            }

        } while (op != 0);
        
        sc.close();
        scStr.close();
    }
}
