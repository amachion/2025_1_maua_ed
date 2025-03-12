#include <stdio.h>
#include <stdlib.h>
int main () {
    printf ("hello, world\n");
    int v[10];
    for (int i=0; i<100; i++) {
        v[i] = i;
        printf ("%d ", v[i]);
    }

    //system ("pause");
    return 0;
}