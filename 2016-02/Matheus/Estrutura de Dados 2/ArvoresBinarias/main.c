/* 
 * File:   main.c
 * Author: Matheus Ligabue da Silva
 *
 * Created on 18 de Agosto de 2016, 11:02
 */

#include <stdio.h>
#include <stdlib.h>

typedef struct nodo {
    int valor;
    struct nodo *pai, *esq, *dir;    
} nodo;

nodo *cria_nodo (int v, nodo *raiz) {
    // Cria novo nodo e aloca seu espaço requerido em memória
    nodo *novo;
    novo = (nodo *)malloc(sizeof(nodo));
    
    // Aponta para o nodo pai e define os filhos como NULL
    novo->pai = raiz;
    novo->esq, novo->dir = NULL;
    
    // Retorna o nodo criado
    return novo;
}

// Testa se o elemento é uma raiz ou nodo.;
// Se for raiz: retorna 1. Se for nodo: retorna 0. Se não existir: retorna 9.
int testa_raiz (nodo *nodo) {
    int teste = 9; // Assume que não existe por padrão
    if (nodo != NULL)
        if (nodo->esq != NULL && nodo->dir != NULL)
            teste = 1; // É raiz
        else
            teste = 0; // É nodo
    return teste;
}

//nodo *insere (nodo *raiz, int v) {    ;
//    
//    // Cria novo nodo
//    
//    // Se nodo for raiz, navega para o próximo nodo
//    if (testa_raiz == 1)
//        if (raiz->valor > v)
//            insere(raiz->esq, v);
//        else
//            insere(raiz->dir, v);
//    // Se nodo for folha, insere uma nova folha
//    else if (testa_raiz == 0)       
//        
//}

int main(int argc, char** argv) {
    
    nodo *raiz;
    
    return (EXIT_SUCCESS);
}

