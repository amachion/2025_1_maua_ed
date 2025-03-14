#include <stdio.h>
#include <stdlib.h>

struct no {
    int info;
    struct no * prox;
};

int main () {
    struct no no1;
    struct no no2;

    no1.info = 3;
    no1.prox = &no2;
    printf ("no1.info = %d, no1.prox = %p\n",
             no1.info, no1.prox);
    no2.info = 4;
    no2.prox = NULL;
    printf ("no2.info = %d, no2.prox = %p\n",
            no2.info, no2.prox);
    return 0;
}