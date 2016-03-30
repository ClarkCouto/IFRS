/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 30 de Março de 2016, 10:03
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

typedef struct nodo_de {
    int valor;
    struct nodo_de *ant, *prox;
} lista_de;


lista_de *inserir_inicio(lista_de *inicio, int v) {
    lista_de *novo;
    novo = (lista_de*)malloc(sizeof(lista_de));
    if (novo!=NULL) {
        novo->valor = v;
        novo->ant = NULL;
        novo->prox = inicio;
        if (inicio!=NULL) {
            inicio->ant = novo;
        }
        inicio = novo;
    }
    return inicio;
}

lista_de *inserir_fim(lista_de *inicio, int v) {
    lista_de *novo, *aux;
    novo = (lista_de*)malloc(sizeof(lista_de));
    if (novo != NULL) {
        novo->valor = v;
        novo->prox = NULL;
        if (inicio==NULL) {
            novo->ant = NULL;
            inicio = novo;
        } else {
            aux = inicio;
            while(aux->prox != NULL) {
                aux = aux->prox;
            }
            aux->prox = novo;
            novo->ant = aux;
                   
        }
        
    }
    return inicio;
}

lista_de *inserir_antes_ultimo(lista_de *inicio, int v) {
    lista_de *novo, *aux;

    novo = (lista_de*)malloc(sizeof(lista_de));
    if (novo!=NULL) {
        novo->valor = v;
        if (inicio == NULL) {
            inicio = novo;
            novo->prox = NULL;
            novo->ant = NULL;
        } else {
            aux = inicio;
            
            while (aux->prox != NULL) {
                
                aux = aux->prox;
                
            }
            novo->prox = aux;
            novo->ant = aux->ant;
            
            if (aux->ant == NULL) {
                inicio = novo;
            } else {
                aux->ant->prox = novo;
            }
            aux->ant = novo;
           
        }
        
    }
    return inicio;
}


void imprimir_inicio_fim(lista_de *inicio) {
    lista_de *aux;
    if (inicio!=NULL) {
        aux = inicio;
        while (aux !=NULL) {
            printf("%d\n", aux->valor);
            aux = aux->prox;
        }
    }
}

void imprimir_fim_inicio(lista_de *inicio) {
    lista_de *aux;
    if (inicio!=NULL) {
        aux = inicio;
        while (aux->prox != NULL) {
            aux = aux -> prox;
        }
        while (aux != NULL) {
            printf("%d\n", aux->valor);
            aux = aux->ant;
        }
    }
}



int main(int argc, char** argv) {
    int valor, op, op_imprimir, va;
    lista_de *ptri;
    ptri = NULL;
    
    printf("Inserir lista.\n");
    printf("Para inserir no inicio da lista, digite 1. \n Para inserir do fim da lista, digite 2. \n");
    scanf("%d", &op);
    switch (op) {
        case 1:
            do {
                printf("Digite um numero para inserir. Para encerrar, digite 0 \n");
                scanf("%d", &valor);
                if (valor != 0) {
                    ptri = inserir_inicio(ptri, valor);
                }
                
            } while (valor != 0);
            break;
        case 2:
            do {
                printf("Digite um numero para inserir. Para encerrar, digite 0 \n");
                scanf("%d", &valor);
                if (valor != 0) {
                    ptri = inserir_fim(ptri, valor);
                }
                
                
            } while (valor != 0);
            break;
    }
    
    printf("Inserir um numero antes do ultimo elemento da lista. \n");
    printf("Insira o valor. \n");
    scanf("%d", &va);
    ptri = inserir_antes_ultimo(ptri, va);
    
    printf("Para imprimir a lista do inicio para o fim, digite 1. \n Para imprimir a lista do fim pro inicio, digite 2. \n");
    scanf("%d", &op_imprimir);
    switch (op_imprimir) {
        case 1:
            printf("Imprimir lista: ");
            imprimir_inicio_fim(ptri);
            break;
        case 2:
            printf("Imprimir lista: ");
            imprimir_fim_inicio(ptri);
            break;
    }
    
    
    return (EXIT_SUCCESS);
}

