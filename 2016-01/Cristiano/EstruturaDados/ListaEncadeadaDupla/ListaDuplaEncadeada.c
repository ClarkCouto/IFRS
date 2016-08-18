/*
 * File:   main.c
 * Author: 0729159
 */

#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int valor;
    struct nodo *prox;
    struct nodo *ant;
}nodo;

void menu();
int buscarValor();
void imprimirListaInicio();
void imprimirListaFim();
nodo* limparLista();

nodo* inserirInicio();
void inserirDepoisDoPrimeiro();
void inserirNaQuartaPosicao();
nodo* inserirNaPosicao();
nodo* inserirAntesDoMaior();
void inserirDepoisDoMaior();
nodo* inserirAntesDoUltimo();
nodo* inserirFinal();
nodo* inserirFinalAutomatico();
void inserirZeroAposCadaElementoMaiorQueDez();
nodo* inserirV1AntesDeV2();
void inserirV1DepoisDeV2();
nodo* inserirAntesDeK();
void inserirDepoisDeK();
nodo* inserirOrdenado();

nodo* retirarInicio();
nodo* retirarDaPosicao();
void retirarQuintoElemento();
nodo* retirarPenultimo();
nodo* retirarFinal();
nodo* retirarMaiorElemento();
nodo* retirarMenorElemento();

nodo* trocarPrimeiroEPenultimo();
void trocarSegundoEPenultimo();
nodo* trocarMaiorEMenor();
nodo* trocarValorUmPorZero();

int buscarMaiorValor();
int buscarMenorValor();
int buscarEnderecoElemento();
int buscarEnderecoPenultimoElemento();
int buscarEnderecoMaiorElemento();
int buscarEnderecoMenorElemento();

int somarTodosElementos();
void multiplicarTodosPeloMaior();
int quantidadeDeVezesQueOValorAparece();

nodo* criarLista();
nodo* diferencaLista1eLista2();
nodo* valoresMaioresQue10NaLista1();
nodo* uniaoLista1ELista2();

nodo* inserirFinalListaNova();

int main(int argc, char** argv) {
    int opcao, tam = 0, v1, v2, endereco;
    int tamL1 = 0, tamL2 = 0, tamL3 = 0;
    nodo *lista1 = NULL;
    nodo *lista3 = NULL;
    nodo *lista2 = NULL;
    nodo *ptri = NULL;
    do{
        menu();
        printf("\nDigite a opcao desejada: ");
        scanf("%d", &opcao);
        switch(opcao){
            case 1:
                ptri = inserirInicio(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 2:
                inserirDepoisDoPrimeiro(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 3:
                inserirNaQuartaPosicao(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 4:
                ptri = inserirNaPosicao(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 5:
                ptri = inserirAntesDoMaior(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 6:
                inserirDepoisDoMaior(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 7:
                printf("\nDigite o valor a ser inserido: ");
                scanf("%d", &v1);
                printf("Antes de qual valor deseja inseri-lo?: ");
                scanf("%d", &v2);
                ptri = inserirV1AntesDeV2(ptri, v1, v2, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 8:
                printf("\nDigite o valor a ser inserido: ");
                scanf("%d", &v1);
                printf("Depois de qual valor deseja inseri-lo?: ");
                scanf("%d", &v2);
                inserirV1DepoisDeV2(ptri, v1, v2, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 9:
                printf("Antes de qual posicao deseja inserir?: ");
                scanf("%d", &v1);
                ptri = inserirAntesDeK(ptri, v1, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 10:
                printf("Depois de qual posicao deseja inserir?: ");
                scanf("%d", &v1);
                inserirDepoisDeK(ptri, v1, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 11:
                ptri = inserirAntesDoUltimo(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 12:
                ptri = inserirFinal(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 13:
                inserirZeroAposCadaElementoMaiorQueDez(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 14:
                printf("\nNao implementado!\n");
                //ptri = inserirOrdenado(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 15:
                ptri = retirarInicio(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 16:
                ptri = retirarDaPosicao(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 17:
                retirarQuintoElemento(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 18:
                ptri = retirarMaiorElemento(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 19:
                ptri = retirarMenorElemento(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 20:
                ptri = retirarPenultimo(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 21:
                ptri = retirarFinal(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 22:
                printf("\nNao implementado!\n");
                //ptri = trocarPrimeiroEPenultimo(ptri, tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 23:
                printf("\nNao implementado!\n");
                //trocarSegundoEPenultimo(ptri, tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 24:
                printf("\nNao implementado!\n");
                //ptri = trocarMaiorEMenor(ptri, tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 25:
                ptri = trocarValorUmPorZero(ptri);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 26:
                v1 = buscarMaiorValor(ptri);
                printf("O MAIOR valor e = %d\n", v1);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 27:
                v1 = buscarMenorValor(ptri);
                printf("O MENOR valor e = %d\n", v1);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 28:
                printf("\nDigite o valor: ");
                scanf("%d", &v1);
                endereco = buscarEnderecoElemento(ptri, v1);
                if(endereco == 0)
                    printf("\nValor %d nao existe na lista\n", endereco);
                else
                    printf("\nEndereco de memoria do numero %d = %d\n", v1, endereco);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 29:
                endereco = buscarEnderecoPenultimoElemento(ptri, tam);
                printf("\nEndereco de memoria do PENULTIMO Elemento = %d\n", endereco);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 30:
                endereco = buscarEnderecoMaiorElemento(ptri);
                printf("\nEndereco de memoria do MAIOR Elemento = %d\n", endereco);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 31:
                endereco = buscarEnderecoMenorElemento(ptri);
                printf("\nEndereco de memoria do MENOR Elemento = %d\n", endereco);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 32:
                v1 = somarTodosElementos(ptri);
                printf("\nA soma de todos elementos = %d\n", v1);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 33:
                multiplicarTodosPeloMaior(ptri, tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 34:
                printf("Digite o valor a ser localizado: ");
                scanf("%d", &v1);
                v2 = quantidadeDeVezesQueOValorAparece(ptri, v1);
                printf("\nO valor %d aparece %d vezes na lista\n\n", v1, v2);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            case 35:
                lista1 = NULL;
                lista2 = NULL;
                lista3 = NULL;
                tamL1 = 0;
                tamL2 = 0;
                tamL3 = 0;

                printf("\nCriar Lista1:\n");
                lista1 = criarLista(lista1, &tamL1);
                printf("\nCriar Lista2:\n");
                lista2 = criarLista(lista2, &tamL2);

                lista3 = diferencaLista1eLista2(lista1, lista2, tamL1, &tamL3);

                printf("\n============================================");
                printf("\nLista1:");
                imprimirListaInicio(lista1, tamL1);
                printf("--------------------------------------------");
                printf("\nLista2:");
                imprimirListaInicio(lista2, tamL2);
                printf("--------------------------------------------");
                printf("\nDiferenca Entre Lista1 e Lista2 = Lista 3:");
                imprimirListaInicio(lista3, tamL3);
                imprimirListaFim(lista3, tamL3);
                break;
            case 36:
                lista1 = NULL;
                lista2 = NULL;
                tamL1 = 0;
                tamL2 = 0;

                printf("\nCriar Lista1:\n");
                lista1 = criarLista(lista1, &tamL1);
                lista2 = valoresMaioresQue10NaLista1(lista1, tamL1, &tamL2);

                printf("\n============================================");
                printf("\nLista1:");
                imprimirListaInicio(lista1, tamL1);
                printf("--------------------------------------------");
                printf("\nValores Maiores que 10 na Lista1 = Lista2:");
                imprimirListaInicio(lista2, tamL2);
                imprimirListaFim(lista2, tamL2);
                break;
            case 37:
                lista1 = NULL;
                lista2 = NULL;
                lista3 = NULL;
                tamL1 = 0;
                tamL2 = 0;
                tamL3 = 0;

                printf("\nCriar Lista1:\n");
                lista1 = criarLista(lista1, &tamL1);
                printf("\nCriar Lista2:\n");
                lista2 = criarLista(lista2, &tamL2);

                lista3 = uniaoLista1ELista2(lista1, lista2, tamL1, tamL2, &tamL3);

                printf("\n============================================");
                printf("\nLista1:");
                imprimirListaInicio(lista1, tamL1);
                printf("--------------------------------------------");
                printf("\nLista2:");
                imprimirListaInicio(lista2, tamL2);
                printf("--------------------------------------------");
                printf("\nUniao Lista1 + Lista2 = Lista 3:");
                imprimirListaInicio(lista3, tamL3);
                imprimirListaFim(lista3, tamL3);
                break;
            case 38:
                break;
            case 39:
                break;
            case 40:
                break;
            case 41:
                imprimirListaInicio(ptri, tam);
                break;
            case 42:
                imprimirListaFim(ptri, tam);
                break;
            case 43:
                printf("\nTamanho da Lista: %d\n", tam);
                break;
            case 44:
                ptri = limparLista(ptri, &tam);
                imprimirListaInicio(ptri, tam);
                imprimirListaFim(ptri, tam);
                break;
            default:
                break;
        }
    }
    while(opcao != 0);
    return (EXIT_SUCCESS);
}

void menu(int *opcao){
    printf("-------------------------------------------------------\n");
    printf("\t\t\tMENU\n");
    printf("-------------------------------------------------------\n");
    printf(" 1 - Inserir no Inicio\n");
    //printf(" 2 - Inserir Depois do Primeiro (Ex. 1)\n"); //Ok
    //printf(" 3 - Inserir na Quarta Posicao (Ex. 10)\n"); //Ok
    //printf(" 4 - Inserir na Posicao (Ex. 21)\n"); //Ok
    //printf(" 5 - Inserir ANTES do Maior (Ex. 37)\n"); //Ok
    //printf(" 6 - Inserir DEPOIS do Maior (Ex. 38)\n"); //Ok
    //printf(" 7 - Inserir Valor1 ANTES de Valor2 (Ex 12)\n"); //Ok
    //printf(" 8 - Inserir Valor1 DEPOIS de Valor2 (Ex 5)\n"); //Ok
    //printf(" 9 - Inserir Valor ANTES de K (Ex 8)\n"); //Ok
    //printf("10 - Inserir Valor DEPOIS de K (Ex 9)\n"); //Ok
    //printf("11 - Inserir Antes do Ultimo (Ex. 2)\n"); //Ok
    //printf("12 - Inserir no Fim\n"); //Ok
    //printf("13 - Inserir 0 Apos Cada Elemento Maior que 10 (Ex. 29)\n"); //Ok
    //printf("14 - Inserir de Forma Ordenada (Ex. 3)\n"); //
    //printf("15 - Retirar do Inicio (Ex. 11)\n"); //Ok
    //printf("16 - Retirar da Posicao (Ex. 22)\n"); //Ok
    //printf("17 - Retirar Quinto Elemento (Ex. 6)\n"); //Ok
    //printf("18 - Retirar Maior Elemento (Ex. 19)\n");//Ok
    //printf("19 - Retirar Menor Elemento (Ex. 20)\n");//Ok
    //printf("20 - Retirar Penultimo (Ex. 28)\n"); //Ok
    printf("21 - Retirar do Fim\n"); //Ok
    //printf("22 - Trocar Primeiro com Penultimo (Ex. 4)\n"); //
    //printf("23 - Trocar Segundo com Penultimo (Ex. 26)\n"); //
    //printf("24 - Trocar Maior e Menor (Ex. 30)\n"); //
    //printf("25 - Trocar Valor Um Por Zero (Ex. 31)\n"); //Ok
    //printf("26 - Mostrar Maior Valor (Ex. 15)\n"); //Ok
    //printf("27 - Mostrar Menor Valor (Ex. 16)\n"); //Ok
    //printf("28 - Mostrar Endereco do Elemento (Ex. 7)\n");//Ok
    //printf("29 - Mostrar Endereco do Penultimo Elemento (Ex. 32)\n"); //Ok
    //printf("30 - Mostrar Endereco do Maior Elemento (Ex. 17)\n"); //Ok
    //printf("31 - Mostrar Endereco do Menor Elemento (Ex. 18)\n"); //Ok
    //printf("32 - Somar Todos Elementos (Ex. 33)\n"); //Ok
    //printf("33 - Multiplicar Todos Elementos pelo Maior Valor (Ex. 14)\n"); //Ok
    //printf("34 - Quantidade de Vezes Que o Valor Aparece (Ex. 27)\n"); //Ok
    //printf("35 - Criar Lista3 (Diferenca Lista1 e Lista2) (Ex. 13)\n"); //Ok
    //printf("36 - Criar Lista2 (Valores Maiores que 10 na Lista1 (Ex. 34)\n"); //Ok
    printf("37 - Criar Lista3 (Uniao Lista1 e Lista2 (Ex. 35)\n");
    //printf("38 - Criar Lista (Ex. 34)\n");
    //printf("39 - Criar Lista (Ex. 35)\n");
    //printf("40 - Criar Lista (Ex. 36)\n");
    //printf("41 - Imprimir Lista Inicio\n"); //Ok
    //printf("42 - Imprimir Lista Fim\n"); //Ok
    printf("43 - Imprimir Tamanho da Lista\n"); //Ok
    printf("44 - Limpar Lista\n"); //
    printf(" 0 - Sair\n");
    printf("-------------------------------------------------------\n");
}

int buscarValor(){
    int num;
    printf("Digite o valor: ");
    scanf("%d", &num);
    return num;
}

nodo* alocarEspaco(int **tam){
    nodo *novo = (nodo *)malloc(sizeof(nodo));
    if(!novo){
        printf("\nSem espaço na memória!\n");
    }
    else{
        novo->valor = buscarValor();
        novo->prox = NULL;
        novo->ant = NULL;
        (**tam)++;
    }
    return novo;
}

nodo* criarLista(nodo *lista, int *tam){
    int i, tamanho, t;
    nodo *aux = lista;
    t = *tam;
    printf("Digite o tamanho da lista a ser criada: ");
    scanf("%d", &tamanho);
    for(i = 0; i < tamanho; i++)
        aux = inserirFinal(aux, &t);
    *tam = t;
    return aux;
}

void imprimirListaInicio(nodo *inicio, int tam){
    nodo *aux;
    printf("\nTamanho da lista: %d\n", tam);
    if(inicio == NULL){
        printf("[Lista vazia!]\n");
    }
    else{
        aux = inicio;
        printf("[");
        while(aux != NULL){
            printf("%d", aux->valor);
            aux = aux->prox;
            if(aux != NULL)
                printf(", ");
        }
        printf("]\n");
    }
}

void imprimirListaFim(nodo *inicio, int tam){
    nodo *aux;
    printf("\nLista Invertida\n");
    if(inicio == NULL){
        printf("[Lista vazia!]\n");
    }
    else{
        aux = inicio;
        while(aux->prox != NULL)
            aux = aux -> prox;
        printf("[");
        while(aux != NULL){
            printf("%d", aux->valor);
            aux = aux -> ant;
            if(aux != NULL)
                printf(", ");
        }
        printf("]\n");
    }
}

nodo* limparLista(nodo *inicio, int *tam){
    nodo *aux, *anterior;
    if(inicio != NULL){
        aux = inicio;
        while(aux != NULL){
            anterior = aux;
            aux = aux->prox;
            free(anterior);
            (*tam)--;
        }
        inicio = aux;
        printf("\nA lista foi esvaziada!\n");
    }
    return inicio;
}

nodo* inserirInicio(nodo *inicio, int *tam){
    nodo *novo = alocarEspaco(&tam);
    nodo *aux = inicio;
    novo->prox = inicio;
    novo->ant = NULL;
    if(inicio != NULL){
        aux->ant = novo;
    }
    if(novo->prox != NULL){
        nodo *aux2;
        aux2 = novo->prox;
    }
    return novo;
}

//Exercicio 1
void inserirDepoisDoPrimeiro(nodo *inicio, int *tam){
    if(inicio != NULL){
        nodo *novo = alocarEspaco(&tam);
        nodo *segundo;
        if(novo != NULL){
            segundo = inicio->prox;
            novo->prox = segundo;
            novo->ant = inicio;
            inicio->prox = novo;
            if(segundo != NULL)
                segundo->ant = novo;
        }
    }
}


//Exercicio 10
void inserirNaQuartaPosicao(nodo *inicio, int *tam){
    nodo *novo, *terceiro, *quarto;
    int i;
    if(inicio == NULL || *tam < 3){
        printf("\nOpcao Invalida! A lista contem menos de 3 posicoes!");
    }
    else{
        novo = alocarEspaco(&tam);
        if(novo != NULL){
            terceiro = inicio;
            for(i = 1; i < 3; i++){
                terceiro = terceiro->prox;
            }
            quarto = terceiro->prox;
            novo->prox = quarto;
            novo->ant = terceiro;
            terceiro->prox = novo;
            if(quarto != NULL)
                quarto->ant = novo;
        }
    }
}

//exercicio 21
nodo* inserirNaPosicao(nodo *inicio, int *tam){
    nodo *novo, *aux, *aux2;
    int i, posicao;
    printf("Em qual posicao deseja inseri-lo?: ");
    scanf("%d", &posicao);
    if(posicao < 1 || (*tam > 0 && posicao > *tam)){
        printf("\nPosicao Invalida!\n");
    }
    else{
        novo = alocarEspaco(&tam);
        aux = inicio;
        for(i = 1; i < posicao; i++){
            aux = aux->prox;
        }
        if(aux == NULL){
            inicio = novo;
        }
        else{
            novo->prox = aux;
            novo->ant = aux->ant;
            aux->ant = novo;
            if(novo->ant != NULL){
                aux2 = novo->ant;
                aux2->prox = novo;
            }
            else{
                inicio = novo;
            }
        }
    }
    return inicio;
}

//Exercicio 37
nodo* inserirAntesDoMaior(nodo *inicio, int *tam){
    nodo *novo, *aux, *anterior;
    int maior;
    if(inicio != NULL){
        novo = alocarEspaco(&tam);
        maior = buscarMaiorValor(inicio);
        aux = inicio;
        while(aux->valor != maior){
            aux = aux->prox;
        }
        anterior = aux->ant;
        novo->prox = aux;
        novo->ant = anterior;
        aux->ant = novo;
        if(anterior != NULL)
            anterior->prox = novo;
        if(inicio->valor == maior)
            inicio = novo;
    }
    return inicio;
}

//Exercicio 38
void inserirDepoisDoMaior(nodo *inicio, int *tam){
    nodo *novo, *aux, *proximo;
    int maior;
    if(inicio != NULL){
        novo = alocarEspaco(&tam);
        maior = buscarMaiorValor(inicio);
        aux = inicio;
        while(aux->valor != maior){
            aux = aux->prox;
        }
        novo->prox = aux->prox;
        novo->ant = aux;
        aux->prox = novo;
        proximo = novo->prox;
        if(proximo != NULL)
            proximo->ant = novo;
    }
}

//Exercicio 12
nodo* inserirV1AntesDeV2(nodo *inicio, int v1, int v2, int *tam){
    nodo *novo, *aux, *aux2;
    if(inicio != NULL){
        novo = (nodo *)malloc(sizeof(nodo));
        if(novo == NULL){
            printf("\nSem espaco na memoria!\n");
        }
        else{
            aux = inicio;
            while(aux != NULL && aux->valor != v2){
                aux = aux->prox;
            }
            if(aux != NULL){
                novo->valor = v1;
                novo->prox = aux;
                if(aux->ant != NULL){
                    aux2 = aux->ant;
                    aux2->prox = novo;
                }
                novo->ant = aux->ant;
                aux->ant = novo;
                if(aux == inicio)
                    inicio = novo;
                (*tam)++;
            }
            else{
                printf("\nValor %d nao encontrado na lista!\n", v2);
            }
        }
        return inicio;
    }
}

//Exercicio 5
void inserirV1DepoisDeV2(nodo *inicio, int v1, int v2, int *tam){
    nodo *novo, *aux, *aux2;
    if(inicio != NULL){
        novo = (nodo *)malloc(sizeof(nodo));
        if(novo == NULL){
            printf("\nSem espaco na memoria!\n");
        }
        else{
            aux = inicio;
            while(aux != NULL && aux->valor != v2){
                aux = aux->prox;
            }
            if(aux != NULL){
                novo->valor = v1;
                novo->ant = aux;
                if(aux->prox != NULL){
                    aux2 = aux->prox;
                    aux2->ant = novo;
                }
                novo->prox = aux->prox;
                aux->prox = novo;
                (*tam)++;
            }
            else{
                printf("\nValor %d nao encontrado na lista!\n", v2);
            }
        }
        return inicio;
    }
}

//Exercicio 8
nodo* inserirAntesDeK(nodo *inicio, int posicao, int *tam){
    nodo *novo, *atual, *anterior;
    int i;
    if(inicio != NULL){
        if(posicao > *tam){
            printf("\nPosicao %d nao existe na lista!\n", posicao);
        }
        else{
            novo = alocarEspaco(&tam);
            if(novo == NULL){
                printf("\nSem espaco na memoria!\n");
            }
            else{
                atual = inicio;
                for(i = 1; i < posicao; i++)
                    atual = atual->prox;
                novo->prox = atual;
                if(atual->ant != NULL){
                    anterior = atual->ant;
                    anterior->prox = novo;
                }
                novo->ant = atual->ant;
                atual->ant = novo;
                if(atual == inicio)
                    inicio = novo;
            }
        }
    }
    return inicio;
}

//Exercicio 9
void inserirDepoisDeK(nodo *inicio, int posicao, int *tam){
    nodo *novo, *atual, *proximo;
    int i;
    if(inicio != NULL){
        if(posicao > *tam){
            printf("\nPosicao %d nao existe na lista!\n", posicao);
        }
        else{
            novo = alocarEspaco(&tam);
            if(novo == NULL){
                printf("\nSem espaco na memoria!\n");
            }
            else{
                atual = inicio;
                for(i = 1; i != posicao; i++)
                    atual = atual->prox;
                proximo = atual->prox;
                novo->prox = proximo;
                novo->ant = atual;
                atual->prox = novo;
                if(proximo != NULL)
                    proximo->ant = novo;
            }
        }
    }
}

//Exericio 2
nodo* inserirAntesDoUltimo(nodo *inicio, int *tam){
    if(inicio != NULL){
        nodo *novo = alocarEspaco(&tam);
        nodo *ultimo, *penultimo;
        if(novo != NULL){
            ultimo = inicio;
            while(ultimo->prox != NULL)
                ultimo = ultimo->prox;
            penultimo = ultimo->ant;
            novo->prox = ultimo;
            novo->ant = penultimo;
            ultimo->ant = novo;
            if(penultimo != NULL)
                penultimo->prox = novo;
            else
                inicio = novo;
        }
    }
    return inicio;
}

/* TANISI
nodo* inserirAntesDoUltimo(nodo *inicio, int *tam){
      if(inicio != NULL){
          novo = (nodo *)malloc(sizeof(nodo));
          if(novo != NULL){
              novo->valor = v;
              if(inicio->prox == NULL){
                  novo->ant = NULL;
                  novo->prox = inicio;
                  inicio->ant = novo;
                  inicio = novo;
              }
              else{
                  aux = inicio;
                  while(aux->prox != NULL)
                      aux = aux->prox;
                  novo->prox = aux;
                  novo->ant = aux-> ant;
                  (aux->ant)->prox = novo;
                  aux->ant = novo;
              }
          }
      }
   return inicio;
}
*/

nodo* inserirFinal(nodo *inicio, int *tam){
    nodo *novo, *aux;
    novo = alocarEspaco(&tam);
    if(novo != NULL){
        if(inicio == NULL)
            inicio = novo;
        else{
            aux = inicio;
            while(aux->prox != NULL)
                aux = aux->prox;
            aux->prox = novo;
            novo->ant = aux;
        }
        return inicio;
    }
}

//Exercicio 29
void inserirZeroAposCadaElementoMaiorQueDez(nodo *inicio, int *tam){
    nodo *novo, *atual, *proximo;
    if(inicio != NULL){
        atual = inicio;
        while(atual->prox != NULL){
            if(atual->valor > 10){
                novo = (nodo *)malloc(sizeof(nodo));
                if(novo != NULL){
                    novo->valor = 0;
                    proximo = atual->prox;
                    novo->ant = atual;
                    novo->prox = proximo;
                    atual->prox = novo;
                    proximo->ant = novo;
                    (*tam)++;
                }
                else{
                    printf("\nMemoria Insuficiente!\n");
                    break;
                }
            }
            atual = atual->prox;
        }
    }
}

nodo* retirarInicio(nodo *inicio, int *tam){
    nodo *aux;
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        aux = inicio;
        inicio = inicio->prox;
        free(aux);
        (*tam)--;
        if(inicio != NULL)
            inicio->ant = NULL;
    }
    return inicio;
}

//Exercicio 22
nodo* retirarDaPosicao(nodo *inicio, int *tam){
    int i, posicao;
    nodo *atual, *anterior, *posterior;
    if(inicio != NULL){
        printf("Qual posicao deseja excluir? ");
        scanf("%d", &posicao);
        if(posicao < 1 || posicao > *tam){
            printf("\nPosicao Invalida!\n");
        }
        else{
            atual = inicio;
            for(i = 1; i < posicao; i++){
                atual = atual->prox;
            }
            anterior = atual->ant;
            posterior = atual->prox;
            if(anterior != NULL)
                anterior->prox = posterior;
            if(posterior != NULL)
                posterior->ant = anterior;
            if(atual == inicio)
                inicio = posterior;
            free(atual);
            (*tam)--;
        }
    }
    return inicio;
}

//Exercicio 6
void retirarQuintoElemento(nodo *inicio, int *tam){
    if(*tam < 5)
        printf("\nOpcao Invalida! A lista contem menos de 5 elementos!\n");
    else{
        nodo *quarto, *quinto, *sexto;
        int i;
        quarto = inicio;
        for(i = 1; i < 4; i++)
            quarto = quarto->prox;
        quinto = quarto->prox;
        sexto = quinto->prox;
        quarto->prox = sexto;
        if(sexto != NULL)
            sexto->ant = quarto;
        free(quinto);
        (*tam)--;
    }
}

//Exercicio 19
nodo* retirarMaiorElemento(nodo *inicio, int *tam){
    nodo *anterior, *maior, *posterior;
    int maiorValor;
    if(inicio != NULL){
        maiorValor = buscarMaiorValor(inicio);
        maior = inicio;
        while(maior->valor != maiorValor){
            maior = maior->prox;
        }
        posterior = maior->prox;
        anterior = maior->ant;
        if(anterior != NULL)
            anterior->prox = posterior;
        if(posterior != NULL)
            posterior->ant = anterior;
        if(maior == inicio)
            inicio = posterior;
        free(maior);
        (*tam)--;
    }
    return inicio;
}

//Exercicio 20
nodo* retirarMenorElemento(nodo *inicio, int *tam){
    nodo *anterior, *menor, *posterior;
    int menorValor;
    if(inicio != NULL){
        menorValor = buscarMenorValor(inicio);
        menor = inicio;
        while(menor->valor != menorValor){
            menor = menor->prox;
        }
        posterior = menor->prox;
        anterior = menor->ant;
        if(anterior != NULL)
            anterior->prox = posterior;
        if(posterior != NULL)
            posterior->ant = anterior;
        if(menor == inicio)
            inicio = posterior;
        free(menor);
        (*tam)--;
    }
    return inicio;
}

//Exercicio 28
nodo* retirarPenultimo(nodo *inicio, int *tam){
    nodo *antepenultimo, *penultimo, *ultimo;
    int i;
    if(*tam < 2){
        printf("\nOpcao Invalida! A lista contem menos de 2 elementos!\n");
    }
    else{
        ultimo = inicio;
        while(ultimo->prox != NULL){
            ultimo = ultimo->prox;
        }
        penultimo = ultimo->ant;
        antepenultimo = penultimo->ant;
        if(antepenultimo != NULL)
            antepenultimo->prox = ultimo;
        else
            inicio = ultimo;
        ultimo->ant = antepenultimo;
        free(penultimo);
        (*tam)--;
    }
    return inicio;
}

/*
//Exemplo da Tanisi
nodo* exercicio28(nodo *inicio){
    nodo *aux;
    if((inicio != NULL) && (inicio->prox != NULL)){
        if(inicio->prox->prox == NULL){
            aux = inicio;
            inicio = inicio->prox;
            inicio->ant = NULL;
        }
        else{
            aux = inicio;
            while((aux->prox)->prox != NULL)
                aux = aux->prox;
            (aux->ant)->prox = aux->prox;
            (aux->prox)->ant = aux->ant;
        }
        free(aux);
    }
    return inicio;
}
*/

nodo* retirarFinal(nodo *inicio, int *tam){
    nodo *atual, *penultimo;
    if(inicio != NULL){
        atual = inicio;
        while(atual->prox != NULL){
            atual = atual->prox;
        }
        penultimo = atual->ant;
        (*tam)--;
        free(atual);
        if(penultimo == NULL){
            inicio = penultimo;
            return inicio;
        }
        penultimo->prox = NULL;
    }
}


    //printf("22 - Trocar Primeiro com Penultimo (Ex. 4)\n"); //
    //printf("23 - Trocar Segundo com Penultimo (Ex. 26)\n"); //
    //printf("24 - Trocar Maior e Menor (Ex. 30)\n"); //

//Exercicio 31
nodo* trocarValorUmPorZero(nodo *inicio, int *tam){
    nodo *aux;
    if(inicio != NULL){
        aux = inicio;
        while(aux != NULL){
            if(aux->valor == 1)
                aux->valor = 0;
            aux = aux->prox;
        }
    }
    return inicio;
}

//Exercicio 15
int buscarMaiorValor(nodo *inicio){
    if(inicio != NULL){
        nodo *atual;
        int maior = inicio->valor;
        atual = inicio;
        while(atual != NULL){
            if(atual->valor > maior)
                maior = atual->valor;
            atual = atual->prox;
        }
        return maior;
    }
}

//Exercicio 26
int buscarMenorValor(nodo *inicio){
    if(inicio != NULL){
        nodo *atual;
        int menor = inicio->valor;
        atual = inicio;
        while(atual != NULL){
            if(atual->valor < menor)
                menor = atual->valor;
            atual = atual->prox;
        }
        return menor;
    }
}

//Exercicio 7
int buscarEnderecoElemento(nodo *inicio, int valor){
    nodo *aux;
    if(inicio != NULL){
        aux = inicio;
        while(aux != NULL && aux->valor != valor){
            aux = aux->prox;
        }
        if(aux == NULL)
            return 0;
        return aux;
    }
}

//Exercicio 32
int buscarEnderecoPenultimoElemento(nodo *inicio, int tam){
    nodo *aux;
    if(inicio != NULL){
        if(tam < 2)
            printf("\nErro! A lista contem menos de 2 posicoes!\n");
        else{
            aux = inicio;
            while(aux->prox != NULL){
                aux = aux->prox;
            }
            return aux->ant;
        }
    }
    return 0;
}

//Exercicio 17
int buscarEnderecoMaiorElemento(nodo *inicio){
    nodo *aux;
    int maior = 0;
    if(inicio != NULL){
        maior = buscarMaiorValor(inicio);
        printf("\nO MAIOR elemento e = %d\n", maior);
        aux = inicio;
        while(aux->valor != maior){
            aux = aux->prox;
        }
        return aux;
    }
}

//Exercicio 18
int buscarEnderecoMenorElemento(nodo *inicio){
    nodo *aux;
    int menor = 0;
    if(inicio != NULL){
        menor = buscarMenorValor(inicio);
        printf("\nO MENOR elemento e = %d\n", menor);
        aux = inicio;
        while(aux->valor != menor){
            aux = aux->prox;
        }
        return aux;
    }
}

//Exercicio 33
int somarTodosElementos(nodo *inicio){
    if(inicio != NULL){
        nodo *atual;
        int soma = 0;
        atual = inicio;
        while(atual != NULL){
            soma += atual->valor;
            atual = atual->prox;
        }
        return soma;
    }
}

//Exercicio 14
void multiplicarTodosPeloMaior(nodo *inicio, int tam){
    if(inicio != NULL){
        nodo *atual;
        int maior;
        atual = inicio;
        imprimirListaInicio(atual, tam);
        maior = buscarMaiorValor(atual);
        printf("\nMaior Valor = %d\n", maior);
        printf("\nValores multiplicados pelo maior valor\n");
        while(atual != NULL){
            printf("%d ", atual->valor * maior);
            atual = atual->prox;
        }
        printf("\n");
    }
}

//Exercicio 27
int quantidadeDeVezesQueOValorAparece(nodo *inicio, int valor){
    nodo *atual;
    int quantidade;
    if(inicio != NULL){
        quantidade = 0;
        atual = inicio;
        while(atual != NULL){
            if(atual->valor == valor)
                quantidade++;
            atual = atual->prox;
        }
        return quantidade;
    }
}

nodo* inserirFinalListaNova(nodo *inicio, int valor, int **tamL3){
    nodo *novo, *aux;
    novo = (nodo *)malloc(sizeof(nodo));
    if(novo == NULL){
        printf("\nSem espaço na memória!\n");
    }
    else{
        novo->valor = valor;
        novo->prox = NULL;
        novo->ant = NULL;
        (**tamL3)++;
        if(inicio == NULL)
            inicio = novo;
        else{
            aux = inicio;
            while(aux->prox != NULL)
                aux = aux->prox;
            aux->prox = novo;
            novo->ant = aux;
        }
        return inicio;
    }
}

//Exercicio 13
nodo* diferencaLista1eLista2(nodo *l1, nodo *l2, int tamL1, int *tamL3){
    nodo *lista1, *lista2, *lista3;
    lista1 = l1;
    lista3 = NULL;
    int igual;
    if(lista2 == NULL){
        *tamL3 = tamL1;
        return lista1;
    }
    while(lista1 != NULL){
        igual = 0;
        lista2 = l2;
        while(lista2 != NULL){
            if(lista1->valor == lista2->valor){
                igual = 1;
                break;
            }
            lista2 = lista2->prox;
        }
        if(igual == 0)
            lista3 = inserirFinalListaNova(lista3, lista1->valor, &tamL3);
        lista1 = lista1->prox;
    }
    return lista3;
}

//Exercicio 34
nodo* valoresMaioresQue10NaLista1(nodo *l1, int *tamL2){
    nodo *lista1, *lista2 = NULL;
    lista1 = l1;
    if(lista1 != NULL){
        while(lista1 != NULL){
            if(lista1->valor > 10){
                lista2 = inserirFinalListaNova(lista2, lista1->valor, &tamL2);
            }
            lista1 = lista1->prox;
        }
        return lista2;
    }
}

//Exercicio 35
nodo* uniaoLista1ELista2(nodo *l1, nodo *l2, int tamL1, int tamL2, int *tamL3){
    nodo *lista1, *lista2, *lista3, *aux;
    lista1 = l1;
    lista2 = l2;
    lista3 = NULL;
    if(lista1 == NULL && lista2 == NULL)
        return lista3;
    else{
        while(lista1 != NULL){
            lista3 = inserirFinalListaNova(lista3, lista1->valor, &tamL3);
            lista1 = lista1->prox;
        }
        while(lista2 != NULL){
            lista3 = inserirFinalListaNova(lista3, lista2->valor, &tamL3);
            lista2 = lista2->prox;
        }
        return lista3;
    }
}
