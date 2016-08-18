/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 23 de Março de 2016, 10:29
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct nodo {
    char valor[30];
    struct nodo *prox;
}lista;
/*
 * 
 */

lista *nomes_ordenados (lista *inicio) {
    char nome[30];
    int v;
    lista *anterior;
    lista *atual;
    lista *novo;
    
    printf("Digite o nome que deseja inserir. \n");
    scanf("%s", &nome);
        
    do {
        atual = inicio;
        anterior = NULL;
        
        novo = (lista*)malloc(sizeof(lista));
        
        
        strcpy(novo->valor, nome);
        
        novo -> prox = NULL;
        
        if (atual == NULL) {  //se a lista tiver vazia

            inicio = novo;
            
        } else if (inicio->prox == NULL) {  //se a lista tiver só um elemento
            if (strcmp(nome, inicio->valor)) {

                inicio->prox = novo;
                
            } else {
                novo->prox = atual;
                
                inicio = novo;
            }
        } else {
             
            atual = inicio;
            while (atual != NULL && strcmp(atual->valor, nome) < 0) {
                anterior = atual;
                atual = atual->prox;
                break;
            } 
            novo->prox = atual;               //liga
            if (anterior != NULL) {
                anterior->prox = novo;            //desliga
            } else {
                inicio = novo;
            }
            
            
        }
        printf("Digite o nome que deseja inserir. \n");
        scanf("%s", &nome);

    } while (strcmp(nome, "sair") > 0 || (strcmp(nome, "sair") < 0));
           
    
    return inicio;
}

void imprime_lista(lista *inicio) {
    lista *aux;
    aux = inicio;
    if (inicio == NULL) {
        printf("Nao ha lista para imprimir");
    } else {
        while (aux != NULL) {
            printf("%s\n", aux->valor);
            aux = aux->prox;
        }
    }
    
}

int main(int argc, char** argv) {
    lista *ptri;
    ptri = NULL;
    
    ptri = nomes_ordenados(ptri);
    printf("Lista depois das alteracoes: \n");
    imprime_lista(ptri);
    return (EXIT_SUCCESS);
}

