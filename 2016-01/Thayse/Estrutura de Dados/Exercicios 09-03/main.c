/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 9 de Março de 2016, 09:52
 */
#include <stdio.h>
#include <stdlib.h>


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

lista *remove_inicio (lista *inicio) {
    lista *aux;
    int v;
    if (inicio != NULL) {                                   // se a lista não tiver vazia
        v = inicio -> valor;                                // v armazena o valor do nodo inicial
        aux = inicio;                                       // aux armazena o nodo inicial
        inicio = inicio->prox;                              // o nodo inicial passa a apontar pro nodo seguinte
        free(aux);                                          // o espaço do que era o primeiro nodo é liberado
        printf("Valor excluido: %d \n", v);
    }
    return inicio;
}

lista *remove_fim (lista *inicio) {
    lista *aux;
    lista *p;
    aux = inicio;
    p = aux;                            //variável anterior - vai sempre receber o anterior ao auxiliar
    int v;
    
    if (inicio == NULL) {
        printf("lista vazia");
    } else {
        if (inicio-> prox == NULL) {
            v = inicio -> valor;
            free(inicio);
            inicio = NULL;
        } else {
            while (aux->prox != NULL) {
            p = aux;
            aux = aux->prox;
            } 
            v = aux -> valor;
            p->prox = NULL;
            free(aux);
            printf("%d", v);
        }
            
    }
    
    
    return inicio;
}

void imprime_lista(lista *inicio) {
    lista *aux;
    aux = inicio;
    while (aux != NULL) {
        printf("%d\n", aux->valor);
        aux = aux->prox;
    }
}
//PRIMEIRO LIGA E DEPOIS DESLIGA
void insere_depois (lista *inicio, int v) {                     // é void pq não precisa retornar nada, não ta mudando o valor inicial
    if (inicio != NULL) {                                       //verifica se não ta vazia
        lista *novo = (lista*)malloc(sizeof(lista));            //cria a variável do novo nodo e aloca espaço pra ela
        lista *aux;
        if (novo!=NULL) {                                       
            aux = inicio;                                       //a variável aux armazena o nodo inicial
            novo->valor = v;                                    //o valor do novo vai receber o valor inserido na função principal
            novo->prox = aux->prox;                             //o novo vai apontar pra onde a variavel auxiliar está apontando, que é o próximo nodo
            inicio->prox = novo;                                //o primeiro passa a apontar pro novo nodo

    }
    }

}


int *maior_elemento (lista *inicio) {
    int maior;                                              //variavel maior é inicializada com o valor do nodo inicial
    lista *aux;                                             //variavel aux é inicializada com o primeiro nodo
    if (inicio != NULL) {                                   //se lista n tiver vazia
        aux = inicio;
        maior = inicio->valor;  
        while (aux != NULL) {                               //percorre a lista incluindo o último, que é null
            if (aux->valor > maior)                         //se o valor do nodo for maior que o maior
                maior = aux->valor;                         //armazena na variável maior
            aux = aux->prox;                                //e a auxiliar vai receber o que ela estava apontando, pra percorrer a lista
        }
    }
   return maior;   
}

int main(int argc, char** argv) {
    
    int num, num2;
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
    
    ptri=remove_inicio(ptri);
    
    printf("Lista depois de remover o primeiro: \n");
    imprime_lista(ptri);
    
    printf("Insira um valor depois do primeiro: \n");
    scanf("%d", &num2);
    insere_depois (ptri, num2);
    
    printf("Lista depois de adicionar depois do primeiro: \n");
    imprime_lista(ptri);
    
    ptri=remove_fim(ptri);
    
    printf("Lista depois de remover o ultimo: \n");
    imprime_lista(ptri);
    
    printf("O maior elemento da lista: %d", maior_elemento(ptri));
    
return (EXIT_SUCCESS);

}

