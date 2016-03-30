/* 
 * File:   main.c
 * Author: 0559156
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
    struct nodo_de *ant;
    struct nodo_de *prox;
}lista_de;


lista_de * insereInicio(lista_de *inicio, int v) {
    
    lista_de *novo;
    
    novo = (lista_de *)malloc(sizeof(lista_de));
    if (novo != NULL) {
        novo->valor = v;
        novo->ant = NULL;
        if (inicio == NULL)
            novo->prox = NULL;
        else {
            novo->prox = inicio;
            inicio->ant = novo;
        }
        inicio = novo;
    }
    return inicio;
}

lista_de * insereFim(lista_de *inicio, int v) {
    
    lista_de *novo, *aux; 
    
    novo = (lista_de *)malloc(sizeof(lista_de));
    if (novo != NULL) {
        novo->valor = v;
        novo->prox = NULL;
        if (inicio == NULL) {
            novo -> ant = NULL;
            inicio = novo;
        }
        else {
            aux = inicio;
            while (aux->prox != NULL) {
                aux = aux->prox;
            }            
            novo->ant = aux;
            aux->prox = novo;
        }
    }
    return inicio;    
}

lista_de * insereAntesFim (lista_de *inicio, int v) {
    
    lista_de *novo, *aux;
    
    if (inicio != NULL) {
        novo = (lista_de *)malloc(sizeof(lista_de));    
        if(novo != NULL) {        
            aux = inicio;
            while (aux -> prox != NULL)
                aux = aux->prox;
            novo->valor = v;           
            novo->ant = aux->ant;
            novo->prox = aux;
            if (aux->ant!=NULL) {
                aux->ant->prox = novo;                
            }   
            else {
                inicio = novo;
            }
            aux->ant = novo;
        }         
    }
    return inicio;
}

lista_de * insereAntesValor (lista_de *inicio, int v1, int v2) {
    
    lista_de *novo, *aux, *pos;
        
    if (inicio != NULL) {        
        aux = inicio;
        pos = NULL;
        while (aux -> prox != NULL){
            if (aux -> valor == v2)
                pos = aux;
            aux = aux->prox;
        }
        if (pos != NULL) {
            novo = (lista_de *)malloc(sizeof(lista_de));
            if(novo != NULL) { 
                novo->valor = v1;           
                novo->ant = aux->ant;
                novo->prox = aux;
                if (aux->ant!=NULL) {
                    aux->ant->prox = novo;                
                }   
                else {
                    inicio = novo;
                }
                aux->ant = novo;
            }
        }
        else
            printf("O valor pedido não foi encontrado.");
    }
    return inicio;
}

void imprimeLista (lista_de *inicio) {
    
    lista_de *aux;
    
    if (inicio != NULL) {
        aux = inicio;
        while(aux != NULL) {
            if (aux->prox != NULL)
                printf("%d, ", aux->valor);
            else
                printf("%d.", aux->valor);
            aux = aux->prox;
        }        
    }
}

void imprimeListaInverte (lista_de *inicio) {
    
    lista_de *aux;
    
    if (inicio != NULL) {
        aux = inicio;
        while(aux->prox != NULL)
            aux = aux->prox;
        while(aux != NULL) {
            if (aux->ant != NULL)    
                printf("%d, ", aux->valor);
            else
                printf("%d.", aux->valor);
            aux = aux->ant;
        }
    }
    
}

int main(int argc, char** argv) {
    
    lista_de *p_raiz;
    int num1, num2, i;
    
    p_raiz = NULL;
    
    printf("TESTE DE LISTAS");
    printf("\nInsere início (1 números)\n");
    //for (i=0;i<=1;i++){
        printf("Digite um número: ");
        scanf("%d", &num1);
        p_raiz = insereInicio(p_raiz, num1);        
    //}
//    
//    printf("\n\nInsere fim (1 números)\n");
//    //for (i=0;i<=1;i++){
//        printf("Digite um número: ");
//        scanf("%d", &num1);
//        p_raiz = insereFim(p_raiz, num1); 
//    //}
//  
//    printf("\n\nInsere antes do fim (1 número)\n");
//    printf("Digite um número: ");
//    scanf("%d", &num1);
//    p_raiz = insereAntesFim(p_raiz, num1);
//    printf("\n\nInsere antes do valor pedido (1 número)\n");
    printf("Digite o valor a ser inserido: ");    
    scanf("%d", &num1);
    printf("Digite o valor para inserir antes: ");    
    scanf("%d", &num2);
    p_raiz = insereAntesValor(p_raiz, num1, num2); 
        
    printf("\nLista normal: ");
    imprimeLista(p_raiz);
    printf("\nLista invertida: ");
    imprimeListaInverte(p_raiz);    

    return (EXIT_SUCCESS);
}

