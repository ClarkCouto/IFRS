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

folha * bt_new(int valor, folha *pai){
    
    folha *nova;
    nova = (folha *)malloc(sizeof(folha));        
    
    nova->valor = valor;    
    nova->raiz = pai;
    nova->esquerda = NULL;
    nova->direita = NULL;

    return nova;
}

folha * bt_add(int valor, folha *raiz){           
    if (raiz == NULL){
        printf("ERRO: Impossível inserir pois a raiz não foi criada.\n"
               "Utilize a função cria_folha() para criar a raiz da árvore.\n\n");
        return raiz;
    }
    
    if (valor < raiz->valor)
        if (raiz->esquerda == NULL)
            raiz->esquerda = bt_new(valor, raiz);
        else
            raiz->esquerda = bt_add(valor, raiz->esquerda);
    else if (valor > raiz->valor)     
        if (raiz->direita == NULL)
            raiz->direita = bt_new(valor, raiz);
        else
            raiz->direita = bt_add(valor, raiz->direita);
    else {
        printf("ERRO: Impossível inserir pois a raiz não foi criada.\n"
               "Utilize a função cria_folha() para criar a raiz da árvore.\n\n");
        return raiz;
    }       
    
    return raiz;
}

void imprime_arvore(folha *folha) {
    if (folha->raiz == NULL) {
      printf("R >");
    }

    printf("%d\n", folha->valor);    
    
    if (folha->esquerda != NULL) {
        printf("E >");
        imprime_arvore(folha->esquerda);        
    }
    
    if (folha->direita != NULL) {
        printf("D >");
        imprime_arvore(folha->direita);
    }
}


#endif /* ARVORE_BINARIA_H */

