/*
 * File:   main.c
 * Author: 0729159
 *
 * Created on 23 de Março de 2016, 10:31
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    char nome[20];
    struct nodo *prox;
}nodo;

nodo* inserirOrdenado();
nodo* alocarEspaco();
void imprimirLista();
nodo* limparLista();
void menu();

int main(int argc, char** argv) {
    nodo *ptri = NULL;
    int opcao = 1, tam = 0;
    do{
        menu();
        printf("\nDigite a opcao: ");
        scanf("%d", &opcao);
        switch(opcao){
        case 0:
            printf("\n\nSistema Finalizado!\n\n");
            break;
        case 1:
            ptri = inserirOrdenado(ptri, &tam);
            imprimirLista(ptri, tam);
            break;
        case 2:
            imprimirLista(ptri, tam);
            break;
        case 3:
            ptri = limparLista(ptri, &tam);
            imprimirLista(ptri, tam);
            break;
        }
    }
    while(opcao != 0);

    return (EXIT_SUCCESS);
}

void menu(){
    printf("\n------------------\n");
    printf("       MENU\n");
    printf("------------------\n");
    printf("1 - Inserir Nome\n");
    printf("2 - Imprimir Lista\n");
    printf("3 - Limpar Lista\n");
    printf("0 - Sair\n");
    printf("------------------\n");
}
nodo* inserirOrdenado(nodo *inicio, int *tam){
    nodo *aux, *anterior, *novo;
    int comparacao;
    novo = alocarEspaco(&tam);
    if(inicio == NULL){
        inicio = novo;
    }
    else{
        aux = inicio;
        while(aux != NULL){
            comparacao = strcmp(aux->nome, novo->nome);
            if(comparacao <= 0){
                anterior = aux;
                if(aux->prox == NULL){
                    aux->prox = novo;
                    break;
                }
                aux = aux->prox;
            }
            else{
                novo->prox = aux;
                if(aux == inicio){
                    inicio = novo;
                }
                else{
                    anterior->prox = novo;
                }
                break;
            }
        }
    }
    return inicio;
}

void imprimirLista(nodo *inicio, int tam){
    nodo *aux;
    aux = inicio;
    if(aux == NULL){
        printf("Lista vazia!\n");
    }
    else{
        printf("\nTamanho da lista: %d\n", tam);
        printf("Lista = ");
        while(aux != NULL){
            printf("%s", aux->nome);
            aux = aux -> prox;
            if(aux != NULL)
                printf(", ");
        }
        printf("\n");
    }
}

nodo* alocarEspaco(int **tam){
    nodo *novo = (nodo *)malloc(sizeof(nodo));
    if(!novo){
        printf("\nSem espaço na memória!\n");
    }
    else{
        char nome[20];
        getchar();
        printf("Digite o nome: ");
        gets(novo->nome);
        novo->prox = NULL;
        (**tam)++;
    }
    return novo;
}

nodo* limparLista(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        int i;
        nodo *aux = inicio;
        nodo *aux2;
        for(i = 1; i < *tam; i++){
            aux2 = aux;
            aux  = aux->prox;
            free(aux2);
        }
        inicio = NULL;
        printf("\nA lista foi esvaziada!\n");
    }
    *tam = 0;
    return inicio;
}
