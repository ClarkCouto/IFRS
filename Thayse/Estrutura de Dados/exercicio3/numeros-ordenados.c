/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 23 de Março de 2016, 10:29
 */

#include <stdio.h>
#include <stdlib.h>


typedef struct nodo {
    int valor;
    struct nodo *prox;
}lista;
/*
 * 
 */

lista *valores_ordenados (lista *inicio) {
    int v;
    lista *anterior;
    lista *atual;
    lista *novo;
    
    printf("Digite o valor que deseja inserir. \n");
    scanf("%d", &v);
        
    do {
        atual = inicio;
        anterior = NULL;
        
        novo = (lista*)malloc(sizeof(lista));
        
        novo -> valor = v;
        novo -> prox = NULL;
        
        if (atual == NULL) {  //se a lista tiver vazia

            inicio = novo;
            
        } else if (inicio->prox == NULL) {  //se a lista tiver só um elemento
            if (v >= inicio->valor) {

                inicio->prox = novo;
                
            } else {
                novo->prox = atual;
                
                inicio = novo;
            }
        } else {
             
            atual = inicio;
            while (atual != NULL && atual->valor < v) {
                anterior = atual;
                atual = atual->prox;
                
            }
            novo->prox = atual;               //liga
            if (anterior != NULL) {
                anterior->prox = novo;            //desliga
            } else {
                inicio = novo;
            }
            
            
        }
        printf("Digite o valor que deseja inserir. \n");
        scanf("%d", &v);

    } while (v != 0);
    
    return inicio;
}


void imprime_lista(lista *inicio) {
    lista *aux;
    aux = inicio;
    if (inicio == NULL) {
        printf("NÃ£o hÃ¡ lista para imprimir");
    } else {
        while (aux != NULL) {
        printf("%d\n", aux->valor);
        aux = aux->prox;
        }
    }
    
}

int main(int argc, char** argv) {
    lista *ptri, *novo;
    ptri = NULL;
    
    ptri = valores_ordenados(ptri);
    printf("Lista depois das alteracoes: \n");
    imprime_lista(ptri);
    return (EXIT_SUCCESS);
}

