//Criar um sistema simples de tarefas com as seguintes funcionalidades:

//1. Adicionar tarefa
//2. Listar tarefas
//3. Marcar tarefa como concluída
//4. Remover tarefa
//5. Sair

//Uso de funções  para organizar o código
//Uso de lista para armazenar tarefas
//Criação de um menu no console

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int acao;
    static ArrayList<String> listaTarefas = new ArrayList<>();

    public static void main(String[] args) {
        while (true){
            System.out.println("\n Digite a opção desejada" +
                    "\n 1. Adicionar tarefa" +
                    "\n 2. Listar tarefas" +
                    "\n 3. Marcar tarefa como concluída" +
                    "\n 4. Remover tarefa" +
                    "\n 5. Sair");
            acao = sc.nextInt();
            sc.nextLine();

            if (acao == 1){
                adicionarTarefa();
            }
            else if (acao == 2){
                listarTarefas();
            }
            else if (acao == 3){
                tarefaConcluida();
            }
            else if(acao == 4){
                removerTarefa();
            }
            else if(acao == 5){
                System.out.println("tchau :D");
                System.exit(0);
            }
        }

    }
    public static void adicionarTarefa(){
        System.out.println("Digite a sua tarefa:");
        String novaTarefa = sc.nextLine();
        listaTarefas.add(novaTarefa);
        System.out.println("Nova tarefa adicionada");
    }

    public static void listarTarefas(){
        if (listaTarefas.isEmpty()){
            System.out.println("Nnehuma tarefa existente");
        }
        else {
            int index = 1;
            System.out.println("Tarefas existentes:");
            for (String tarefas : listaTarefas){
                System.out.printf("%d - %s \n", index, tarefas);
                index++;
            }
        }
    }

    public static void tarefaConcluida(){
        System.out.println("alguma ta concluida ai");
    }

    public static void removerTarefa(){
        System.out.println();
        System.out.println("alguma foi removida ai");
    }
}