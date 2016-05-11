/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 11 de Maio de 2016, 09:56
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

typedef struct nodo {
    int valor;
    struct nodo *prox;
} lista;

typedef struct descritor_lista {
    struct nodo *i;
    int n;
    struct nodo *f;
} descritor;

descritor *criar_descritor (descritor *d) {
    if(d == NULL) {
        d = (descritor*)malloc(sizeof(descritor));
        if (d!=NULL) {
            d->i = NULL; //inicializando os ponteiros
            d->n = 0;
            d->f = NULL;
        }
    }
    return d;
}

void insere_inicio(descritor *d, int v) {
    lista *novo;
    if (d!=NULL) {
        novo = (lista*)malloc(sizeof(lista));
        if (novo != NULL) {
            novo->valor = v;
            novo->prox = d->i;
            d->i = novo;
            if (d->n == 0)
                d->f = novo;
            d->n++;
        }
    }
}


void insere_fim(descritor *d, int v) {
    lista *novo;
    if(d!=NULL) {
        novo = (lista*)malloc(sizeof(lista));
        if (novo!=NULL) {
            novo->valor = v;
            novo->prox = NULL;
            if( novo!=NULL) {
                novo->valor = v;
                novo->prox = NULL;
                if (d->i == NULL)
                    d->i = novo;
                else
                    d->f->prox = novo;
                d->f = novo;
                d->n++;
                
            }
        }
    }
}

void remove_inicio(descritor *d) {
    lista *aux;
    int v;
    if ((d!=NULL) && (d->i!=NULL)) {
        aux = d->i;
        v = aux->valor;
        d->i = d->i->prox;
        if (d->i == NULL)
            d->f = NULL;
        d->n--;
        free(aux);
        printf("Valor = %d \n", v);
    }
}

void remove_fim(descritor *d) {
    lista *aux, *p;
    int v;
    if ((d!=NULL) && (d->i!=NULL)) {
        if (d->n == 1) {
            v = d->i->valor;
            free(d->i);
            d->i = NULL;
            d->f = NULL;
        } else {
            aux = d->i;
            while (aux->prox!=NULL) { //pro aux parar em cima do ultimo elemento
                p = aux;
                aux = aux->prox;
            }
            v = aux->valor;
            p->prox = NULL;
            d->f = p;
            free(aux);
            
        }
        d->n--;
        printf("Valor excluído %d", v);
    }
}

void remove_quarto(descritor *d) {
    lista *aux, *p;
    int v, i = 1;
    if (d->n>3) {
        aux = d->i;
        while((aux->prox!=NULL) && (i!=4)) {
                
            p = aux;
            aux = aux-> prox;
            i++;
                
        }
        
        
        v = aux->valor;
        p->prox = aux->prox;
        if (d->n == 4) {
            d->f = p;
        }
        free(aux);
        d->n--;
    }
}

void imprime_lista(descritor *d) {
    lista *aux;
    aux = d->i;
    if (d == NULL) {
        printf("Nao há lista para imprimir");
    } else {
        while (aux != NULL) {
        printf("%d\n", aux->valor);
        aux = aux->prox;
        }
    }
    
}

int main(int argc, char** argv) {
    descritor *des = NULL;
    des = criar_descritor(des);
    
    lista *ptri = NULL;

    insere_inicio(des, 5);
    
    insere_fim(des, 7);
    insere_fim(des, 2);
    insere_fim(des, 3);
    insere_fim(des, 9);
    insere_fim(des, 11);
    insere_fim(des, 1);
    insere_fim(des, 6);
    insere_fim(des, 4);
    
    printf("\n Lista criada: \n");
    imprime_lista(des);
    printf("\n Número de elementos na lista: %d \n", des->n);
    
    remove_inicio(des);
    printf("\n Lista depois de remover o primeiro: \n");
    imprime_lista(des);
    
    remove_fim(des);
    printf("\n Lista depois de remover o último: \n");
    imprime_lista(des);
    
    remove_quarto(des);
    printf("\n Lista depois de remover o quarto: \n");
    imprime_lista(des);
    
    printf("\n Número de elementos na lista: %d \n", des->n);
    
    return (EXIT_SUCCESS);
}

