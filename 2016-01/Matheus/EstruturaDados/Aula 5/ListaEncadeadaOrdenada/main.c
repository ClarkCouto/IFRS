/* 
 * File:   main.c
 * Author: 0559156
 *
 * Created on 23 de Março de 2016, 10:02
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * 
 */

// Definição de struct da LISTA
typedef struct nodo {
    char valor[20];
    struct nodo *prox;
} lista;


// FUNÇÕES

void imprimeLista (lista *inicio) {
    if (inicio != NULL)
    {
        printf("\nLista = ");
        lista *aux;
        aux = inicio;
        while (aux != NULL) {
            if (aux -> prox != NULL ){
                printf("%s, ", aux -> valor);
                aux = aux -> prox;
            }
            else {
                printf("%s.", aux -> valor);
                aux = aux -> prox;
            }
        }
        printf("\n");
    }
    else
        printf("\nA lista está vazia!\n");
}

lista * insereOrdenado(lista *inicio, char nome[20]) {
    
    lista *novo = (lista *)malloc(sizeof(lista));
    
    if (inicio == NULL) {
        if (novo != NULL) {
            strcpy(novo -> valor, nome);
            novo -> prox = NULL;
            inicio = novo;
        }
    }
    
    else {
        lista *aux, *ant;
        aux = inicio;

        while (aux != NULL) {
            if (strcasecmp(aux -> valor, nome) <= 0) {
                ant = aux;
                aux = aux -> prox;
            }
            else
                break;            
        }
        
        if (novo != NULL) {
            ant -> prox = novo;
            novo -> prox = aux;
            strcpy(novo -> valor, nome);
        }
    }
    imprimeLista(inicio);
    return inicio;
}

// MAIN
int main(int argc, char** argv) {
    lista * p_raiz = NULL; // Guarda início da lista
    char n[20];
    
    do {
        printf("Digite um nome para inserir na lista (máx. 20 caracteres): ");
        gets(n);
        p_raiz = insereOrdenado(p_raiz, n);
        
    } while (n != "0");
    
    return (EXIT_SUCCESS);
}

