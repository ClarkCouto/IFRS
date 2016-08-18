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
    struct nodo *esq, *dir;    
} folha;

folha *cria_folha (int v) {
    folha *nova;
    nova = (folha *)malloc(sizeof(folha));
    return nova;
}

// Testa se o elemento é uma raiz ou folha.;
// Se for raiz: retorna 1. Se for folha: retorna 0. Se não existir: retorna 9.
int testa_raiz (folha *folha) {
    int teste = 9; // Assume que não existe por padrão
    if (folha != NULL)
        if (folha->esq != NULL && folha->dir != NULL)
            teste = 1; // É raiz
        else
            teste = 0; // É folha
    return teste;
}

folha *insere (folha *raiz, int v) {    
    if (testa_raiz == 1)
        if (raiz->valor > v)
            insere(raiz->esq, v);
        else
            insere(raiz->dir, v);
//    else if (testa_raiz == 0)
        
    
}

int main(int argc, char** argv) {
    
    folha *raiz;
    
    return (EXIT_SUCCESS);
}

