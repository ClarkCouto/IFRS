#include "arvore_binaria_busca.h"

int main(int argc, char** argv) {
    
    folha *arvore = NULL;
    
    arvore = bt_new(2, arvore);
    arvore = bt_add(1, arvore);
    arvore = bt_add(3, arvore);
    arvore = bt_add(4, arvore);
    arvore = bt_add(6, arvore);
    arvore = bt_add(5, arvore);
    imprime_arvore(arvore);
    
    return (EXIT_SUCCESS);
}

