/* 
 * File:   main.c
 * Author: 0729159
 *
 * Created on 20 de Abril de 2016, 09:10
 *

#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int valor;
    struct nodo *prox;
}nodo;

void insereNoFinal();
void imprimirLista();

int main(int argc, char** argv) {
    nodo *ptri = NULL, *ptrf = NULL;
    int valor;
    do{
    printf("\nDigite um valor: ");
    scanf("%d", &valor);
        if(valor != 0){
            insereNoFinal(&ptri, &ptrf, valor);
            printf("\nInicio = %d\n", ptri->valor);
            printf("Final = %d\n", ptrf->valor);
            imprimirLista(ptri);
        }
    }
    while(valor != 0);
    return (EXIT_SUCCESS);
}

void imprimirLista(nodo *inicio){
    nodo *aux;
    aux = inicio;
    if(aux == NULL){
        printf("Lista vazia!\n");
    }
    else{
        //printf("\nTamanho da lista: %d\n", tam);
        printf("Lista = ");
        while(aux != NULL){
            printf("%d ", aux->valor);
            aux = aux -> prox;
        }
        printf("\n");
    }
}

void insereNoFinal(nodo **inicio, nodo **fim, int v){
    nodo *novo;
    novo = (nodo *)malloc(sizeof(nodo));
    if(novo != NULL){
        novo->valor = v;
        novo->prox = NULL;
        if(*inicio == NULL)
            *inicio = novo;
        else
            (*fim)->prox = novo;
        *fim = novo;
    }
}
*/


 

#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int valor;
    struct nodo *prox;
}nodo;

nodo* insereNoFinal();
void imprimirLista();

int main(int argc, char** argv) {
    nodo *ptri = NULL, *ptrf = NULL;
    int valor;
    do{
    printf("\nDigite um valor: ");
    scanf("%d", &valor);
        if(valor != 0){
            ptrf = insereNoFinal(ptrf, valor);
            if(ptri == NULL){
                ptri = ptrf;
            }
            printf("\nInicio = %d\n", ptri->valor);
            printf("Final = %d\n", ptrf->valor);
            imprimirLista(ptri);
        }
    }
    while(valor != 0);
    return (EXIT_SUCCESS);
}

void imprimirLista(nodo *inicio){
    nodo *aux;
    aux = inicio;
    if(aux == NULL){
        printf("Lista vazia!\n");
    }
    else{
        //printf("\nTamanho da lista: %d\n", tam);
        printf("Lista = ");
        while(aux != NULL){
            printf("%d ", aux->valor);
            aux = aux -> prox;
        }
        printf("\n");
    }
}

nodo* insereNoFinal(nodo *final, int v){
    nodo *aux, *novo; 
        novo = (nodo *)malloc(sizeof(nodo));     
        if(novo != NULL){
            novo->prox = NULL;
            novo->valor = v;
        }
        aux = final;        
        if(aux != NULL)
            aux->prox = novo;
        final = novo;
    return final;
}
 
