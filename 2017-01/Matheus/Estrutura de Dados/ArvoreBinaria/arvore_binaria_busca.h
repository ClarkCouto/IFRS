#ifndef ARVORE_BINARIA_H
#define ARVORE_BINARIA_H

#include <stdio.h>
#include <stdlib.h>

// Tipos

typedef struct nodo {
    int valor;
    struct nodo * raiz;
    struct nodo * esquerda;
    struct nodo * direita;
} folha;

enum ordem_percurso {pre_ordem, em_ordem, pos_ordem};

// Funções

folha * insere_folha(folha *nova, folha *raiz){
       
    nova->raiz = raiz;
    
    if (raiz == NULL){
        printf("ERRO: Impossível inserir pois a raiz não foi criada.\n"
               "Utilize a função cria_folha() para criar a raiz da árvore.");
    } else {
        if (nova->valor < raiz->valor){
            raiz->esquerda = nova;
        } else if (nova->valor > raiz->valor){
            raiz->direita = nova;
        } else {
           printf("ERRO: Este valor já existe na lista.\n"
                  "Não são permitidos valores duplicados.") ;
        }
    }
    
    return raiz;
}

void imprime_arvore(folha *folha) {      
    printf("R: ");
    printf("%d\n", folha->valor);    
    
    if (folha->esquerda != NULL) {
        imprime_arvore(folha->esquerda);        
    }
    
    if (folha->direita != NULL) {
        imprime_arvore(folha->direita);
    }
}

folha * cria_folha(int valor){
    
    folha *nova;
    nova = (folha *)malloc(sizeof(folha));        
    
    nova->valor = valor;    
    nova->raiz = NULL;
    nova->esquerda = NULL;
    nova->direita = NULL;

    return nova;
}



#endif /* ARVORE_BINARIA_H */

