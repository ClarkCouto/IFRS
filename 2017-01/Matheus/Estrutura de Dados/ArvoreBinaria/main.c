#include "arvore_binaria_busca.h"

int main(int argc, char** argv) {
    
    folha *arvore = cria_folha(2);
    arvore = insere(cria_folha(1), arvore);

    imprime_arvore(arvore);
    
    return (EXIT_SUCCESS);
}

