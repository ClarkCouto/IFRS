#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
// Definindo o struct nodo = lista

typedef struct nodo {
    int valor;
    struct nodo *prox;
} lista;


// Declaração de funções antes da main

int maiorNumero();
void imprimeLista ();
lista * limparLista();
lista * insereNodoInicio();
void insereNodoSegundo();
void insereAntesElemento();
lista * insereNodoFim ();
lista * removeNodoInicio();
lista * removeNodoFim ();
lista * removeNodoElemento();

// MAIN

int main(int argc, char** argv) {

    lista *p_raiz = NULL;
    int i, m1, m2, v1, v2;
    do {
        printf("\n1 - Inserir");
        printf("\n2 - Remover");
        printf("\n3 - Exibir maior elemento da lista");
        printf("\n4 - Exibir lista");
        printf("\n5 - Limpar lista");
        printf("\n0 - Sair");
        printf("\nSelecione uma opção: ");
        scanf("%d", &m1);
        switch(m1) {
            case 1:
                printf("\n1 - Inserir no início da lista");
                printf("\n2 - Inserir na segunda posição da lista");
                printf("\n3 - Inserir no final da lista");
                printf("\n4 - Inserir elemento antes do valor digitado");

                printf("\nQual a opção desejada? ");
                scanf("%d", &m2);
                switch(m2){
                    case 1:
                        printf("\n\nDigite um número para inserir no início: ");
                        scanf("%d", &v1);
                        p_raiz = insereNodoInicio(p_raiz, v1);
                        break;
                    case 2:
                        printf("\n\nDigite um número para inserir na segunda posição: ");
                        scanf("%d", &v1);
                        insereNodoSegundo(p_raiz, v1);
                        break;
                    case 3:
                        printf("\n\nDigite um número para inserir no fim: ");
                        scanf("%d", &v1);
                        p_raiz = insereNodoFim(p_raiz, v1);
                        break;
                    case 7:
                        if (p_raiz != NULL) {
                            printf("\n\nInserir novo valor antes de qual elemento? ");
                            scanf("%d", &v2);
                            printf("Digite o valor a ser inserido: ");
                            scanf("%d", &v1);
                            insereAntesElemento(p_raiz, v1, v2);
                        }
                        else
                            printf("\nA lista está vazia!\n");
                        break;
                    default:
                        printf("Opção inválida!");
                        break;
                }
                break;
            case 2:
                printf("\n1 - Remover do início da lista");
                printf("\n2 - Remover do final da lista");
                printf("\n3 - Remover elemento específico da lista");
                printf("\n4 - Remover elemento de posição específica da lista");
                printf("\nQual a opção desejada? ");
                scanf("%d", &m2);
                switch(m2){
                    case 1:
                        printf("\n\nRemover o nodo do início.");
                        p_raiz = removeNodoInicio(p_raiz);
                        break;
                    case 2:
                        printf("\n\nRemover o nodo do fim.");
                        p_raiz = removeNodoFim(p_raiz);
                        break;
                    case 3:
                        printf("Em construção.");
                        break;
                    case 4:
                        printf("Também em construção.");
                        break;
                    default:
                        printf("Opção inválida!");
                        break;
                }
            case 3:
                if (p_raiz != NULL)
                    printf("\n\nMaior elemento: %d\n", maiorNumero(p_raiz));
                else
                    printf("A lista está vazia!");
                break; 

            case 4:
                imprimeLista(p_raiz);
                break;
            case 5:
                p_raiz  = limparLista();
                printf("\nLista limpa.\n");
                break;
            case 0:
                printf("\n\nVALOR FINAL = ");
                imprimeLista(p_raiz);
                break;
            default:
                printf("Opção inválida!");
                break;
        }
    } while (m1 != 0);
    
    return (EXIT_SUCCESS);
}

// FUNÇÕES

int maiorNumero (lista *inicio) {
    if (inicio != NULL) {
        lista *aux;
        int maior = inicio -> valor;
        aux = inicio;
        while (aux != NULL) {
            if (aux -> valor > maior)
                maior = aux -> valor;
            aux = aux -> prox;
        }

        return maior;
    }
    else
        return 0;
}

void imprimeLista (lista *inicio) {
    if (inicio != NULL)
    {
        printf("\nLista = ");
        lista *aux;
        aux = inicio;
        while (aux != NULL) {
            printf("%d ", aux -> valor);
            aux = aux -> prox;
        }
        printf("\n");
    }
    else
        printf("\nA lista está vazia!\n");
}

lista * limparLista (lista *inicio) {
    lista *aux = inicio, *ant;
    while (aux != NULL) {
        ant = aux;
        free(ant);
        aux = aux->prox;
    }    
    
    return NULL;
}

lista * insereNodoInicio (lista *inicio, int v) {
    lista *novo = (lista *) malloc(sizeof(lista));
    if (novo != NULL) {
        novo -> valor = v;
        novo -> prox = inicio;
    }
    return novo;
    
}

void insereNodoSegundo (lista *inicio, int v) {
    if (inicio != NULL) {
        lista *novo = (lista *) malloc(sizeof(lista));
        if (novo != NULL) {
            novo -> valor = v;
            novo -> prox = NULL;
            lista *aux;
            aux = inicio -> prox;
            inicio -> prox = novo;
            novo -> prox = aux;
        }
    }

    else
        printf("\nA lista está vazia!\n"); 
}

void insereAntesElemento(lista *inicio, int v1, int v2) {
    if (inicio != NULL) {
        lista *aux, *ant;
        aux = inicio;
        while (aux != NULL && aux -> valor != v2){
                ant = aux;
                aux = aux -> prox;
        }
        if (aux != NULL) {
            lista *novo = (lista *) malloc(sizeof(lista));
            if (novo != NULL) {
                novo -> valor = v1;
                if (aux == inicio){
                    novo -> prox = inicio;
                    inicio = novo;
                }
                else {
                    novo -> prox = ant -> prox;
                    ant -> prox = novo;
                }
            }
            
        }
        else
            printf("\nValor não encontrado!\n");
        
    }
}

lista * insereNodoFim (lista *inicio, int v) {       
    if (inicio != NULL) {
        lista *novo = (lista *) malloc(sizeof(lista));
        if (novo != NULL) {
            novo -> valor = v;
            novo -> prox = NULL;
            lista *aux;
            aux = inicio;
            while (aux -> prox != NULL) {
                aux = aux -> prox;
            }

            aux -> prox = novo;
            return inicio;
        }
    }

    else
        insereNodoInicio(inicio, v);

}

lista * removeNodoInicio (lista *inicio){
    if (inicio != NULL) {
        int v = inicio -> valor;
        lista *aux;
        aux = inicio;
        inicio = inicio -> prox;
        free(aux);
        printf("\nRemovido valor %d.\n", v);
    }
    
    else
        printf("\nNão há elementos na lista!\n");
    
    return inicio;
}

lista * removeNodoFim (lista *inicio) {
    if (inicio != NULL) {    
        int v;
        lista *ult, *penult;
        ult = inicio;
        while (ult -> prox != NULL) {
            penult = ult;
            ult = ult -> prox;
        }
        v = ult -> valor;
        free(ult);
        penult -> prox = NULL;
        printf("\nRemovido valor %d.\n", v);
    }
        
    else
        printf("\nNão há elementos na lista!\n");
    
    return inicio;
}

lista * removeNodoElemento (lista *inicio, int v) {
    if (inicio != NULL) {
        lista *aux = inicio, *ant;
        while (aux != NULL && aux != v){
            ant = aux;
            aux = aux -> prox;
        } 
         if (aux == inicio) {
             inicio = aux -> prox;
             free(aux);
        }
         else if (aux != NULL) {
             ant -> prox = aux -> prox;
             free(aux);
         }
         else
             printf("Valor não encontrado na lista.");
    }
    else
        printf("A lista está vazia!");
    return inicio;
}
