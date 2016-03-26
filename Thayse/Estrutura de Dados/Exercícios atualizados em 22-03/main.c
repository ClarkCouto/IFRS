/* 
 * File:   main.c
 * Author: 0584150
 *
 * Created on 16 de MarÃ§o de 2016, 09:12
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

void menu() {
    printf("Digite a opção desejada para manipular a lista.\n");
    printf("Para inserir um valor antes de outro determinado valor, digite 1.\n");
    printf("Para esvaziar a lista, digite 2.\n");
    printf("Para excluir uma determinada posição, digite 3.\n");
    printf("Para excluir um valor do início da lista, digite 4.\n");
    printf("Para excluir um valor do fim da lista, digite 5.\n");
    printf("Para inserir um valor depois do primeiro elemento, digite 6.\n");
    printf("Para descobrir qual o maior elemento da lista, digite 7.\n");
    printf("Para encerrar, digite 0. \n");
    
}

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
        printf("NÃ£o hÃ¡ lista para imprimir");
    } else {
        while (aux != NULL) {
        printf("%d\n", aux->valor);
        aux = aux->prox;
        }
    }
    
}
//exercicio 12
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
        printf("Lista jÃ¡ estÃ¡ vazia \n");
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

//exercicio 22
void excluir_posicao (lista *inicio) {
    if (inicio == NULL) {
        printf("Lista vazia.\n");
    } else if (inicio->prox == NULL) {
        printf("A lista só contém um elemento. \n");
    } else {
        int pos, i;
        lista *anterior;
        lista *atual;
        atual = inicio;
        printf("Insira a posicao que deseja excluir \n");
        scanf("%d", &pos);
        
        for (i = 1; i < pos; i++) {
            anterior = atual;
            atual = atual->prox; 
        }
        anterior->prox = atual->prox;
        free(atual);
    }
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
    } else {
        printf("A lista esta vazia. \n");
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
    int num, num2, valor1, valor2, opcao;
    lista *ptri, *novo;
    ptri = NULL;
    
    printf("Vamos criar uma lista. Para finalizar, insira o valor 0.\n");
    do {
        printf("Insira um valor \n");
        scanf("%d", &num);
        if (num!=0) {
            ptri = insere_inicio (ptri, num);
        }
    } while (num!=0);
    
    printf("Lista criada: \n");
    imprime_lista(ptri);
    menu();
    
    do {
        scanf("%d", &opcao);
        switch(opcao) {
            case 1:
                printf("Insira o numero que deseja inserir: \n");
                scanf("%d", &valor1);
                printf("Insira o numero que deseja buscar na lista: \n");
                scanf("%d", &valor2);

                valores_v1_v2(ptri, valor1, valor2);

                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
            case 2:
                printf("Lista sera esvaziada: \n");
                libera_lista(ptri);
                break;

            case 3:
                excluir_posicao(ptri);
                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
                
            case 4:
                ptri = remove_inicio(ptri);
                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
                
            case 5:
                remove_fim(ptri);
                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
                
            case 6:
                printf("Insira um valor depois do primeiro elemento: \n");
                scanf("%d", &num2);
                insere_depois (ptri, num2);
                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
                
            case 7:
                printf("O maior elemento da lista: %d", maior_elemento(ptri));
                printf("Lista depois das alteracoes: \n");
                imprime_lista(ptri);
                break;
        } 
        menu();
    } while (opcao != 0);
    
    
    
    

    

    
    
    
    return (EXIT_SUCCESS);
}

