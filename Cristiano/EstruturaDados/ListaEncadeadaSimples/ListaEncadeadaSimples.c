#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int valor;
    struct nodo *prox;
}nodo;

void menu();
int buscarValor();
void imprimirLista();
nodo* limparLista();

nodo* inserirInicio();
void inserirSegundaPosicao();
void inserirMeio();
void inserirNaQuartaPosicao();
void inserirAntesDoUltimo();
void inserirFinal();
void inserirDepoisDoMaior();
void inserirZeroAposCadaElementoMaiorQueDez();
nodo* inserirV1AntesDeV2();
void inserirV1DepoisDeV2();
nodo* inserirOrdenado();

nodo* retirarInicio();
void retirarMeio();
void retirarQuintoElemento();
void retirarPenultimo();
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
int quantidadeDeVezesQueOValorAparece();

int somarTodosElementos();
void multiplicarTodosPeloMaior();

int main(int argc, char** argv) {
    int opcao, endereco, tam = 0;
    int v1, v2;
    nodo *ptri = NULL;
    nodo *aux;
    nodo *lista2;
    nodo *lista3;
    do{
        menu();
        printf("\nDigite a opcao desejada: ");
        scanf("%d", &opcao);
        switch(opcao){
            case 1:
                ptri = inserirInicio(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 2:
                inserirSegundaPosicao(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 3:
                inserirNaQuartaPosicao(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 4:
                inserirMeio(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 5:
                inserirDepoisDoMaior(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 6:
                inserirAntesDoUltimo(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 7:
                inserirFinal(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 8:
                inserirZeroAposCadaElementoMaiorQueDez(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 9:
                printf("\nDigite o valor a ser inserido: ");
                scanf("%d", &v1);
                printf("Antes de qual valor deseja inseri-lo?: ");
                scanf("%d", &v2);
                ptri = inserirV1AntesDeV2(ptri, v1, v2, &tam);
                imprimirLista(ptri, tam);
                break;
            case 10:
                printf("\nDigite o valor a ser inserido: ");
                scanf("%d", &v1);
                printf("Depois de qual valor deseja inseri-lo?: ");
                scanf("%d", &v2);
                inserirV1DepoisDeV2(ptri, v1, v2, &tam);
                imprimirLista(ptri, tam);
                break;
            case 11:
                //Inserir Valor ANTES de K (Ex 8)\n");
                printf("\nNao implementado ainda!\n");
                break;
            case 12:
                //Inserir Valor DEPOIS de K (Ex 9)\n");
                printf("\nNao implementado ainda!\n");
                break;
            case 13:
                ptri = inserirOrdenado(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 14:
                ptri = retirarInicio(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 15:
                retirarMeio(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 16:
                retirarQuintoElemento(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 17:
                retirarPenultimo(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 18:
                ptri = retirarFinal(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 19:
                ptri = retirarMaiorElemento(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 20:
                ptri = retirarMenorElemento(ptri, &tam);
                imprimirLista(ptri, tam);
                break;
            case 21:
                ptri = trocarPrimeiroEPenultimo(ptri, tam);
                imprimirLista(ptri, tam);
                break;
            case 22:
                trocarSegundoEPenultimo(ptri, tam);
                imprimirLista(ptri, tam);
                break;
            case 23:
                ptri = trocarMaiorEMenor(ptri, tam);
                imprimirLista(ptri, tam);
                break;
            case 24:
                ptri = trocarValorUmPorZero(ptri);
                imprimirLista(ptri, tam);
                break;
            case 25:
                v1 = buscarMaiorValor(ptri);
                printf("O MAIOR valor e = %d\n", v1);
                break;
            case 26:
                v1 = buscarMenorValor(ptri);
                printf("O MENOR valor e = %d\n", v1);
                break;
            case 27:
                endereco = buscarEnderecoElemento(ptri, &tam, 0);
                printf("\nEndereco do Elemento = %d\n", endereco);
                imprimirLista(ptri, tam);
                break;
            case 28:
                endereco = buscarEnderecoPenultimoElemento(ptri, tam);
                printf("\nEndereco do Penultimo Elemento = %d\n", endereco);
                imprimirLista(ptri, tam);
                break;
            case 29:
                endereco = buscarEnderecoMaiorElemento(ptri);
                printf("\nEndereco do Maior Elemento = %d\n", endereco);
                imprimirLista(ptri, tam);
                break;
            case 30:
                endereco = buscarEnderecoMenorElemento(ptri);
                printf("\nEndereco do Menor Elemento = %d\n", endereco);
                imprimirLista(ptri, tam);
                break;
            case 31:
                v1 = somarTodosElementos(ptri);
                printf("\nA soma de todos elementos = %d\n", v1);
                break;
            case 32:
                multiplicarTodosPeloMaior(ptri, tam);
                break;
            case 33:
                printf("Digite o valor a ser localizado: ");
                scanf("%d", &v1);
                v2 = quantidadeDeVezesQueOValorAparece(ptri, v1);
                printf("\nO valor %d aparece %d vezes na lista\n", v1, v2);
                break;
            case 34:
                break;
            case 35:
                break;
            case 36:
                break;
            case 37:
                break;
            case 38:
                break;
            case 39:
                break;
            case 40:
                imprimirLista(ptri, tam);
                break;
            case 41:
                ptri = limparLista(ptri, &tam);
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
    //printf(" 1 - Inserir no Inicio\n");

    //printf(" 2 - Inserir Segunda Posicao (Ex. 1)\n"); //Ok
    //printf(" 3 - Inserir na Quarta Posicao (Ex. 10)\n"); //Ok
    //printf(" 4 - Inserir no Meio (Ex. 21)\n"); //Ok
    //printf(" 5 - Inserir Depois do Maior (Ex. 37)\n"); //Ok
    //printf(" 6 - Inserir Antes do Ultimo (Ex. 2)\n"); //Ok
    //printf(" 7 - Inserir no Fim\n"); //Ok
    //printf(" 8 - Inserir 0 Apos Cada Elemento Maior que 10 (Ex. 29)\n"); //Ok
    //printf(" 9 - Inserir Valor1 ANTES de Valor2 (Ex 12)\n"); //Ok
    //printf("10 - Inserir Valor1 DEPOIS de Valor2 (Ex 5)\n");

    //printf("11 - Inserir Valor ANTES de K (Ex 8)\n");
    //printf("12 - Inserir Valor DEPOIS de K (Ex 9)\n");
    printf("13 - Inserir de Forma Ordenada\n");

    //printf("14 - Retirar do Inicio (Ex. 11)\n"); //Ok
    //printf("15 - Retirar do Meio (Ex. 22)\n"); //Ok
    //printf("16 - Retirar Quinto Elemento (Ex. 6)\n"); //Ok
    //printf("17 - Retirar Penultimo (Ex. 28)\n"); //Ok
    //printf("18 - Retirar do Fim\n"); //Ok
    //printf("19 - Retirar Maior Elemento (Ex. 19)\n");
    //printf("20 - Retirar Menor Elemento (Ex. 20)\n");//

    //printf("21 - Trocar Primeiro com Penultimo (Ex. 4)\n"); //Ok
    //printf("22 - Trocar Segundo com Penultimo (Ex. 26)\n"); //Ok
    //printf("23 - Trocar Maior e Menor (Ex. 30)\n"); //Ok
    //printf("24 - Trocar Valor Um Por Zero (Ex. 31)\n"); //Ok

    //printf("25 - Mostrar Maior Valor (Ex. 15)\n"); //
    //printf("26 - Mostrar Menor Valor (Ex. 16)\n"); //
    //printf("27 - Mostrar Endereco do Elemento (Ex. 7)\n");//Ok
    //printf("28 - Mostrar Endereco do Penultimo Elemento (Ex. 32)\n"); //ok
    //printf("29 - Mostrar Endereco do Maior Elemento (Ex. 17)\n"); //
    //printf("30 - Mostrar Endereco do Menor Elemento (Ex. 18)\n"); //
    //printf("31 - Somar Todos Elementos (Ex. 33)\n"); //Ok
    //printf("32 - Multiplicar Todos Elementos pelo Maior Valor (Ex. 14)\n");
    //printf("33 - Quantidade de Vezes Que o Valor Aparece (Ex. 27)\n"); //Ok


    //printf("34 - Criar Lista (Ex. 13)\n");
    //printf("35 - Criar Lista (Ex. 24)\n");
    //printf("36 - Criar Lista (Ex. 25)\n");
    //printf("37 - Criar Lista (Ex. 34)\n");
    //printf("38 - Criar Lista (Ex. 35)\n");
    //printf("39 - Criar Lista (Ex. 36)\n");


    printf("40 - Mostrar Lista\n"); //Ok
    printf("41 - Limpar Lista\n"); //Ok
    //printf(" 0 - Sair\n");
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
        (**tam)++;
    }
    return novo;
}


nodo* limparLista(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        int i;
        nodo *aux = inicio;
        nodo *aux2;
        for(i = 1; i < *tam; i++){
            aux2 = aux;
            aux  = aux->prox;
            free(aux2);
        }
        inicio = NULL;
        printf("\nA lista foi esvaziada!\n");
    }
    *tam = 0;
    return inicio;
}


void imprimirLista(nodo *inicio, int tam){
    nodo *aux;
    aux = inicio;
    if(aux == NULL){
        printf("Lista vazia!\n");
    }
    else{
        printf("\nTamanho da lista: %d\n", tam);
        printf("Lista = ");
        while(aux != NULL){
            printf("%d ", aux->valor);
            aux = aux -> prox;
        }
        printf("\n");
    }
}


nodo* inserirInicio(nodo *inicio, int *tam){
    nodo *novo = alocarEspaco(&tam);
    novo->prox = inicio;
    return novo;
}

//Exercicio 1
void inserirSegundaPosicao(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *novo;
        novo = alocarEspaco(&tam);
        novo->prox = inicio->prox;
        inicio->prox = novo;
    }
}

//Exercicio 10
void inserirNaQuartaPosicao(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        if(*tam < 3){
            printf("\nErro! A lista contem menos de 3 elementos!\n");
        }
        else{
            nodo *atual;
            nodo *novo;
            int i;
            atual = inicio;
            novo = alocarEspaco(&tam);
            for(i = 1; i != 3; i++){
                atual = atual->prox;
            }
            novo->prox = atual->prox;
            atual->prox = novo;
        }
    }
    //return inicio;
}

//Exercicio 21
void inserirMeio(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("Lista Vazia!");
    }
    else{
        nodo *novo = alocarEspaco(&tam);
        nodo *aux = inicio;
        int posicao;
        do{
            printf("Em qual posicao deseja inseri-lo?: ");
            scanf("%d", &posicao);
            if(posicao <= 1 || posicao > *tam){
                printf("\nPosicao invalida!\n");
            }
        }
        while(posicao <= 1 || posicao > *tam);
        int i;
        for(i = 1; i < posicao - 1; i++){
            aux = aux->prox;
        }
        novo->prox = aux->prox;
        aux->prox = novo;
    }
}

//Exercicio 2
void inserirAntesDoUltimo(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        if(*tam < 2){
            printf("\nErro! A lista contem menos de 2 elementos!\n");
        }
        else{
            nodo *novo;
            nodo *atual;
            nodo *penultimo;
            int i;
            novo = alocarEspaco(&tam);
            atual = inicio;
            for(i = 1; i < (*tam)-1; i++){
                penultimo = atual;
                atual = atual->prox;
            }
            penultimo->prox = novo;
            novo->prox = atual;
        }
    }
}


void inserirFinal(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *novo = alocarEspaco(&tam);
        nodo *aux = inicio;
        while(aux->prox != NULL){
            aux = aux->prox;
        }
        aux->prox = novo;
    }
}

//Exercicio 37
void inserirDepoisDoMaior(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        int maior;
        nodo *novo;
        nodo *aux;
        aux = inicio;
        maior = buscarMaiorValor(inicio);
        novo = alocarEspaco(&tam);
        while(aux != NULL && aux->valor != maior){
            aux = aux->prox;
        }
        novo->prox = aux->prox;
        aux->prox = novo;
    }
}

//Exercicio 29
void inserirZeroAposCadaElementoMaiorQueDez(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        nodo *aux;
        nodo *aux2;
        nodo *novo;
        aux = inicio;
        while(aux != NULL){
            if(aux->valor > 10){
                novo = (nodo *)malloc(sizeof(nodo));
                if(!novo){
                    printf("\nSem espaço na memória!\n");
                }
                else{
                    novo->valor = 0;
                    novo->prox = NULL;
                    (*tam)++;
                }
                aux2 = aux->prox;
                aux->prox = novo;
                novo->prox = aux2;
            }
            aux = aux->prox;
        }
    }
    return inicio;
}

//Exercicio 12
nodo* inserirV1AntesDeV2(nodo* inicio, int v1, int v2, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *aux = inicio;
        nodo *anterior = aux;
        nodo *novo = (nodo *)malloc(sizeof(nodo));
        if(!novo){
            printf("\nSem espaço na memória!\n");
        }
        //se conseguiu criar o novo nodo
        else{
            //atribui v1 ao valor do novo nodo
            novo->valor = v1;
            novo->prox = NULL;
            //se v2 for o primeiro elemento
            if(aux->valor == v2){
                novo->prox = aux;
                inicio = novo;
            }
            else{
            //percorre a lista até o ultimo elemento ou ate que o valor do elemento seja igual a v2
                while(aux != NULL && aux->valor != v2){
                    //anterior recebe o valor atual
                    anterior = aux;
                    //atual recebe o proximo
                    aux = aux->prox;

                }
                if(aux == NULL){
                    printf("\nO valor %d nao existe na lista!\n", v2);
                }
                else{
                    novo->prox = anterior->prox;
                    anterior->prox = novo;
                    (*tam)++;
                }
            }
        }
    }
    return inicio;
}

/*
 nodo* inserirV1AntesDeV2(nodo* inicio, int v1, int v2, int *tam){
    aux = inicio;
    while(aux != NULL){
        if(aux->valor == v2){
            novo = (nodo *) malloc(sizeof(nodo));
            if(novo != NULL){
                novo->valor = v1;
                novo->prox = aux;
                if(aux == inicio)
                    inicio = novo;
                else
                    p->prox = novo;
            }
            break;
        }
        p = aux;
        aux = aux->prox;
    }
    return inicio;
}
*/
void inserirV1DepoisDeV2(nodo* inicio, int v1, int v2, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *aux = inicio;
        nodo *novo = (nodo *)malloc(sizeof(nodo));
        if(!novo){
            printf("\nSem espaço na memória!\n");
        }
        //se conseguiu criar o novo nodo
        else{
            //atribui v1 ao valor do novo nodo
            novo->valor = v1;
            novo->prox = NULL;
            //percorre a lista até o ultimo elemento ou ate que o valor do elemento seja igual a v2
            while(aux != NULL){
                if(aux->valor == v2){
                //aux recebe o proximo
                    break;
                }
                aux = aux->prox;
            }
            //verifica se v2 foi encontrado
            if(aux == NULL){
                printf("\nO valor %d nao existe na lista!\n", v2);
            }
            //faz a inclusao na lista
            else{
                novo->prox = aux->prox;
                aux->prox = novo;
                (*tam)++;
            }
        }
    }
}

//Exercicio 11
nodo* retirarInicio(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        nodo *aux = inicio;
        inicio = inicio->prox;
        (*tam)--;
        free(aux);
    }
    return inicio;
}

//Exercicio 22
void retirarMeio(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        if(inicio->prox == NULL){
            printf("\nErro! A lista contem somente 1 posicao!\n");
        }
    else{
        int posicao;
        nodo *anterior;
        nodo *atual = inicio;
        do{
            printf("Qual posicao deseja excluir? ");
            scanf("%d", &posicao);
            if(posicao > *tam){
                printf("\nPosicao Invalida!\n");
            }
        }
        while(posicao > *tam);
        if(posicao == 1){
            inicio = inicio->prox;
            free(atual);
        }
        else{
            int i;
            for(i = 1; i < posicao; i++){
                anterior = atual;
                atual = atual->prox;
            }
            anterior->prox = atual->prox;
            free(atual);
        }
        (*tam)--;
    }
    }
}

/*
 lista *aux, *p;
 int v, cont = 1;
 if(inicio != NULL){
     aux = inicio;
     while(aux->prox != NULL && cont<pos){
         p = aux;
         aux = aux->prox;
         cont++;
     }
     if(cont == pos){
         v = aux->prox;
         if(cont == 1){
             inicio = inicio->prox;
         }
         else{
             p->prox = aux->prox;
         }
         free(aux);
         printf("valor excluido = %d", v);
     }
 }
 return inicio;
 */


//Exercicio 6
void retirarQuintoElemento(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        if(*tam < 5){
            printf("\nErro! A lista contem menos de 5 elementos!\n");
        }
        else{
            nodo *atual;
            nodo *anterior;
            int i;
            atual = inicio;
            anterior = atual;
            for(i = 1; i != 5; i++){
                anterior = atual;
                atual = atual->prox;
            }
            anterior->prox = atual->prox;
            free(atual);
            (*tam)--;
        }
    }
    //return inicio;
}

//Exercicio 28
void retirarPenultimo(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        if(*tam <= 2){
            printf("\nErro! A lista contem menos de 3 elementos!\n");
        }
        else{
            nodo *atual;
            nodo *anterior;
            int i;
            atual = inicio;
            anterior = atual;
            for(i = 1; i < *tam - 1; i++){
                anterior = atual;
                atual = atual->prox;
            }
            anterior->prox = atual->prox;
            free(atual);
            (*tam)--;
        }
    }
    //return inicio;
}


nodo* retirarFinal(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nA lista ja esta vazia!\n");
    }
    else{
        nodo *atual = inicio;
        nodo *anterior;
        (*tam)--;
        if(atual->prox == NULL){
            inicio = NULL;
            free(inicio);
        }
        else{
            anterior = atual;
            while(atual->prox != NULL){
                anterior = atual;
                atual = atual->prox;
            }
            free(atual);
            anterior->prox = NULL;
        }
        return inicio;
    }
}

//Exercicio 19
nodo* retirarMaiorElemento(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *atual = inicio;
        nodo *anterior = atual;
        int maior = buscarMaiorValor(inicio);
        if(atual->valor == maior){
            inicio = inicio->prox;
            free(atual);
        }
        else{
            while(atual != NULL && atual->valor != maior){
                anterior = atual;
                atual = atual->prox;
            }
            anterior->prox = atual->prox;
            free(atual);
        }
        (*tam)--;
    }
    return inicio;
}

//Exercicio 20
nodo* retirarMenorElemento(nodo *inicio, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *atual = inicio;
        nodo *anterior = atual;
        int menor = buscarMenorValor(inicio);
        if(atual->valor == menor){
            inicio = inicio->prox;
            free(atual);
        }
        else{
            while(atual != NULL && atual->valor != menor){
                anterior = atual;
                atual = atual->prox;
            }
            anterior->prox = atual->prox;
            free(atual);
        }
        (*tam)--;
    }
    return inicio;
}

//Exercicio 15
int buscarMaiorValor(nodo *inicio){
    if(inicio == NULL){
        printf("Lista vazia!\n");
    }
    else{
        nodo *aux;
        int maior;
        maior = inicio->valor;
        aux = inicio;
        while(aux != NULL){
            if(aux->valor > maior){
                maior = aux->valor;
            }
            aux = aux -> prox;
        }
        return maior;
    }
}

//Exercicio 16
int buscarMenorValor(nodo *inicio){
    if(inicio == NULL){
        printf("Lista vazia!\n");
    }
    else{
        nodo *aux;
        int menor;
        menor = inicio->valor;
        aux = inicio;
        while(aux != NULL){
            if(aux->valor < menor){
                menor = aux->valor;
            }
            aux = aux -> prox;
        }
        return menor;
    }
}

//Exercicio 7
int buscarEnderecoElemento(nodo *inicio, int tam, int pos){
    if(inicio == NULL)
        printf("\nLista Vazia!\n");
    else{
        nodo *aux;
        int i, posicao = pos;
        if(posicao == 0){
            do{
                printf("Digite a posicao do elemento que deseja buscar o endereco: ");
                scanf("%d", &posicao);
                if(posicao < 1 || posicao > tam){
                    printf("\nPosicao Invalida!\n");
                    posicao = 0;
                }
            }
            while(posicao == 0);
        }
        aux = inicio;
        if(tam != 1){
            for(i = 1; i != posicao; i++){
                aux = aux->prox;
            }
        }
        return aux;
    }
}

//Exercicio 17
int buscarEnderecoMaiorElemento(nodo *inicio){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        int maior = buscarMaiorValor(inicio);
        nodo *aux;
        aux = inicio;
        while(aux != NULL && aux->valor != maior){
            aux = aux->prox;
        }
        return aux;
    }
    //return endereco;
}

//Exercicio 18
int buscarEnderecoMenorElemento(nodo *inicio){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        int menor = buscarMenorValor(inicio);
        nodo *aux;
        aux = inicio;
        while(aux != NULL && aux->valor != menor){
            aux = aux->prox;
        }
        return aux;
    }
}

//Exercicio 32
int buscarEnderecoPenultimoElemento(nodo *inicio, int tam){
    nodo *aux;
    aux = buscarEnderecoElemento(inicio, tam, tam-1);
    return aux;
}

//Exercicio 27
int quantidadeDeVezesQueOValorAparece(nodo *inicio, int val){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        nodo *aux = inicio;
        int quantidade = 0;
        while(aux!= NULL){
            if(aux->valor == val)
                quantidade++;
            aux = aux->prox;
        }
        return quantidade;
    }
}

//Exercicio 33
int somarTodosElementos(nodo *inicio){
    int soma = 0;
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *aux = inicio;
        while(aux != NULL){
            soma += aux->valor;
            aux = aux->prox;
        }
    }
    return soma;
}

void multiplicarTodosPeloMaior(nodo *inicio){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *aux = inicio;
        int maior = buscarMaiorValor(inicio);
        printf("\nLista Mulplicada = ");
        while(aux != NULL){
            printf("%d ", aux->valor * maior);
            aux = aux->prox;
        }
        printf("\n\n");
    }
}

//Exercicio 31
nodo* trocarValorUmPorZero(nodo *inicio){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        nodo *aux;
        aux = inicio;
        while(aux!= NULL){
            if(aux->valor == 1)
                aux->valor = 0;
            aux = aux->prox;
        }
    }
    return inicio;
}

//Exercicio 4
nodo* trocarPrimeiroEPenultimo(nodo *inicio, int tam){
    nodo *primeiro;
    nodo *segundo;
    nodo *antepenultimo;
    nodo *penultimo;
    int i;
    if(tam < 4){
        printf("\nErro! A lista contem menos de 4 elementos!\n");
    }
    else{
        primeiro = inicio;
        segundo = primeiro->prox;
        penultimo = inicio;
        for(i = 1; i < tam - 1; i++){
            antepenultimo = penultimo;
            penultimo = penultimo->prox;

        }
        antepenultimo->prox = primeiro;
        primeiro->prox = penultimo->prox;
        penultimo->prox = segundo;
        return penultimo;
    }
}

//Exercicio 26
void trocarSegundoEPenultimo(nodo *inicio, int tam){
    if(tam < 4){
        printf("\nErro! A lista contem menos de 4 elementos!\n");
    }
    else{
        nodo *segundo;
        nodo *terceiro;
        nodo *antepenultimo;
        nodo *penultimo;
        int i;
        segundo = inicio->prox;
        terceiro = segundo->prox;
        penultimo = inicio;
        for(i = 1; i < tam-1; i++){
            antepenultimo = penultimo;
            penultimo = penultimo->prox;
        }
        segundo->prox = penultimo->prox;
        if(penultimo == terceiro){
            penultimo->prox = segundo;
        }
        else{
            penultimo->prox = terceiro;
        }
        inicio->prox = penultimo;
        if(antepenultimo != segundo){
            antepenultimo->prox = segundo;
        }
    }
}

//Exercicio 30
nodo* trocarMaiorEMenor(nodo *inicio, int tam){
    if(inicio == NULL){
        printf("\nA lista esta vazia!\n");
    }
    else{
        int maiorValor = buscarMaiorValor(inicio);
        int menorValor = buscarMenorValor(inicio);
        nodo *anteriorAoMaior = NULL;
        nodo *maior;
        nodo *anteriorAoMenor = NULL;
        nodo *menor;
        nodo *aux;
        nodo *aux2;
        menor = inicio;
        maior = inicio;
        while(menor != NULL && menor->valor != menorValor){
            anteriorAoMenor = menor;
            menor = menor->prox;
        }
        while(maior != NULL && maior->valor != maiorValor){
            anteriorAoMaior = maior;
            maior = maior->prox;
        }

        if(menor->prox == maior){
            menor->prox = maior->prox;
            maior->prox = menor;
            if(anteriorAoMenor == NULL){
                inicio = maior;
            }
            else{
                anteriorAoMenor->prox = maior;
            }
        }

        else if(maior->prox == menor){
                maior->prox = menor->prox;
                menor->prox = maior;
                if(anteriorAoMaior == NULL){
                    inicio = menor;
                }
                else{
                    anteriorAoMaior->prox = menor;
                }
            }
            else{
                aux = menor->prox;
                menor->prox = maior->prox;
                maior->prox = aux;
                if(anteriorAoMaior == NULL){
                    inicio = menor;
                }
                else{
                    anteriorAoMaior->prox = menor;
                }
                if(anteriorAoMenor == NULL){
                    inicio = maior;
                }
                else{
                    anteriorAoMenor->prox = maior;
                }
            }
    }
    return inicio;
}


nodo* inserirAntesDeK(nodo *inicio, int valor, int *tam){
    if(inicio == NULL){
        printf("\nLista Vazia!\n");
    }
    else{
        nodo *aux = inicio, *ant, *novo;
        ant = aux;
        while(aux != NULL){
            if(aux->valor == valor){
                novo = alocarEspaco(&tam);
                if(aux == inicio){
                    novo->prox = aux;
                    inicio = novo;
                }
                else{
                    ant->prox = novo;
                    novo->prox = aux;
                }
                break;
            }
            ant = aux;
            aux = aux->prox;
        }
        return inicio;
    }
}

//Exercicio 3
nodo* inserirOrdenado(nodo *inicio, int *tam){
    nodo *aux, *anterior, *novo;
    novo = alocarEspaco(&tam);
    if(inicio == NULL){
        inicio = novo;
    }
    else{
        aux = inicio;
        while(aux != NULL){
            if(novo->valor > aux->valor){
                anterior = aux;
                if(aux->prox == NULL){
                    aux->prox = novo;
                    break;
                }
                aux = aux->prox;
            }
            else{
                novo->prox = aux;
                if(aux == inicio){
                    inicio = novo;
                }
                else{
                    anterior->prox = novo;
                }
                break;
            }
        }
    }
    return inicio;
}
