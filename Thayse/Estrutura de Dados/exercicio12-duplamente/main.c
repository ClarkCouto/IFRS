/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Thayse
 *
 * Created on 30 de Março de 2016, 14:55
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

typedef struct nodo_de {
    int valor;
    struct nodo_de *prox, *ant;
    
} lista_de;


lista_de *inserir(lista_de *inicio, int v) {
    lista_de *novo, *aux;
    novo = (lista_de*)malloc(sizeof(lista_de));
    if (novo != NULL) {
        novo->valor = v;
        novo->prox = NULL;
        if (inicio == NULL) {
            novo->ant = NULL;
            inicio = novo;
        } else {
            aux = inicio;
            while (aux->prox != NULL) {
                aux = aux->prox;
            }
            aux->prox = novo;
            novo->ant = aux;
        }
        
    }
    return inicio;
}

lista_de *valores_v1_v2(lista_de *inicio, int v1, int v2) {
    lista_de *novo, *aux;
    novo = (lista_de*)malloc(sizeof(lista_de));
    if (novo != NULL) {
        if (inicio == NULL) {
            printf("Lista vazia. \n");
        } else {
            aux = inicio;
            while (aux->prox != NULL && aux->valor != v1)
                aux = aux->prox;
            novo->valor = v2;
         
            novo->ant = aux;
            novo->prox = aux->prox;
            aux->prox = novo;
            aux->prox->ant = novo;
            
        }
        
    }
    return inicio;
}

void imprimir(lista_de *inicio) {
    lista_de *aux;
    if (inicio != NULL) {
        aux = inicio;
        while(aux != NULL) {
            printf("%d\n", aux->valor);
            aux = aux->prox;
        }
                
    } else {
        printf("Lista vazia. \n");
    }
}


int main(int argc, char** argv) {
    lista_de *ptri;
    ptri = NULL;
    int valor, valor1, valor2;
    printf("Insira os elementos da lista: (Digite 0 para parar) \n");
    do {
        
        scanf("%d", &valor);
        if (valor != 0) {
            ptri = inserir(ptri, valor);
        }
    } while (valor != 0);
    
    printf("Insira um valor para buscar na lista. \n");
    scanf("%d", &valor1);
    printf("Insira um valor para inserir depois dele. \n");
    scanf("%d", &valor2);
    ptri=valores_v1_v2(ptri, valor1, valor2);
    printf("\n Lista impressa: \n");
    imprimir(ptri);
    
    return (EXIT_SUCCESS);
}

