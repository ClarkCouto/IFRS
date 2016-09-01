/* 
 * File:   main.c
 * Author: Matheus Ligabue da Silva
 *
 * Created on 18 de Agosto de 2016, 11:02
 */

#include <stdio.h>
#include <stdlib.h>

// Definição de nó da árvore
typedef struct arvore {
    int valor;
    struct arvore *esq, *dir;    
} no;

/* cria_no;
 * 
 * Retorna um novo nó, inicializado com o valor informado
 */
no * cria_no(int v) {   
    no *novo;
    novo = (no *)malloc(sizeof(no));    
    if (novo != NULL) {
        novo->valor = v;
        // Inicializa o nó sem filhos
        novo->esq = NULL;
        novo->dir = NULL;
    }
    else
        printf("\nERRO AO CRIAR NÓ\n");

    return novo;
}

/* insere_arvore;
 * 
 * Função recursiva para inserir um novo nó na árvore binária de busca
 */
no * insere_arvore (int v, no *raiz) {;
    if (raiz == NULL ) {
        raiz = cria_no(v);
    }
    else {
        if (v == raiz->valor)
            printf("\nEste valor já foi inserido.\n");
        else if (v < raiz->valor)
            if (raiz->esq != NULL)
                insere_arvore(v, raiz->esq);
            else
                raiz->esq = cria_no(v);
        else
            if (raiz->dir != NULL)
                insere_arvore(v, raiz->dir);
            else
                raiz->dir = cria_no(v);
    }
    return raiz;
}

/* imprime_arvore_erd
 *
 * 
 */
void imprime_arvore_erd (no *raiz, int nivel) {    
    if (raiz != NULL ) {        
        imprime_arvore_erd(raiz->esq, nivel++);
        nivel--;
        printf("%d - %d\n", nivel, raiz->valor);
        imprime_arvore_erd(raiz->dir, nivel++);
    }
}

int main(int argc, char** argv) {   
    
    no * ab_raiz = NULL;
    int i;
    for (i=1;i<=5;i++) {
        ab_raiz = insere_arvore(i, ab_raiz);
    }
    imprime_arvore_erd(ab_raiz, 1);
    return (EXIT_SUCCESS);
}

