/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 16 de Março de 2016, 09:12
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

typedef struct nodo {
    int valor;
    struct nodo *prox;
}lista;

lista* insere_inicio (lista *inicio, int v)
{
    lista *novo = (lista*)malloc(sizeof(lista));
    if (novo!=NULL) {
        
        novo -> valor = v;
        novo -> prox = inicio;
        inicio = novo;
    }
    return inicio;
}

void imprime_lista(lista *inicio) {
    lista *aux;
    aux = inicio;
    if (inicio == NULL) {
        printf("Não há lista para imprimir");
    } else {
        while (aux != NULL) {
        printf("%d\n", aux->valor);
        aux = aux->prox;
        }
    }
    
}

void valores_v1_v2(lista *inicio,int v1,int v2) {
    if (inicio == NULL)
        printf("Lista vazia");
    else {
        lista *novo = (lista*)malloc(sizeof(lista));
        lista *aux = inicio;
        lista *p = aux;
        while (aux->valor != v2 && aux->prox != NULL) {
            p = aux;
            aux = aux->prox;          
        }
        //insere v1 antes do v2
                novo->prox = p->prox;
                novo->valor = v1;
                p->prox = novo;
        
    }
}

void libera_lista (lista *inicio) {
    if (inicio == NULL) {
        printf("Lista já está vazia \n");
    } else {
        lista *aux = inicio;
        lista *aux2;
        while (aux->prox != NULL) {
            aux2 = aux;
            free(aux2);
            aux = aux->prox;
            
        }
        printf("Lista foi esvaziada. \n");
    }
}


void excluir_posicao (lista *inicio) {
    if (inicio == NULL) {
        printf("Lista vazia.\n");
    } else {
        int pos, i;
        lista *aux, *aux2;
        aux = inicio;
        printf("Insira a posicao que deseja excluir \n");
        scanf("%d", &pos);
        
        for (i = 1; i < pos; i++) {
            aux2 = aux;
            aux = aux->prox; 
        }
        aux2->prox = aux->prox;
        free(aux);
    }
}


int main(int argc, char** argv) {
    int num, num2, valor1, valor2;
    lista *ptri, *novo;
    ptri = NULL;
    
    do {
        printf("Insira um valor \n");
        scanf("%d", &num);
        if (num!=0) {
            ptri = insere_inicio (ptri, num);
        }
    } while (num!=0);
    
    printf("Lista criada: \n");
    imprime_lista(ptri);
    
    printf("Insira dois valores: \n");
    scanf("%d", &valor1);
    scanf("%d", &valor2);
    
    valores_v1_v2(ptri, valor1, valor2);
    
    printf("Lista depois das alterações: \n");
    imprime_lista(ptri);
    
/*
    printf("Lista será esvaziada: \n");
    libera_lista(ptri);
*/
    excluir_posicao(ptri);
    printf("Lista depois da exclusão: \n");
    imprime_lista(ptri);
    
    
    return (EXIT_SUCCESS);
}

