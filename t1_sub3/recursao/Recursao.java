public class Recursao {
    static long fatorialIterativo (int n) {
        long f = 1;
        // for (int i=2; i<=n; i++) {
        //     f = f * i;
        // }
        while (n > 1) {
            f *= n--;
        }
        return f;
    }
    static long fatorialRecursivo (int n) {
        if (n <= 1) return 1;
        return n * fatorialRecursivo(n-1);
    }
    static long fibonacciRecursivo (int n) {
        if (n <= 1) return 1;
        return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }
    //entradas k (base), n (expoente), saída: k elevado a n
    static long potenciaIterativo (int k, int n) {
        long potencia = 1;
        for (int cont=1; cont<=n; cont++) {
            potencia = potencia * k;
        }
        return potencia;
    }
    static long potenciaRec (int k, int n) {
        if (n == 0) return 1;
        return k * potenciaRec(k, n-1);
    }
    //entradas: fatores da multiplicação, saída: produto
    static long multiplicaIterativo (int a, int b) {
        long soma = 0;
        while (b > 0) {
            soma = soma + a;
            b--; 
        }
        return soma;
    }
    static long multiplicaRecursivo (int a, int b) {
        if (b == 0) return 0;
        return a + multiplicaRecursivo(a, b-1);
    }
    //entrada: n inteiro positivo, saída: valores de 0 a n
    static void exibe0aN1 (int i, int n) { //crescente
        System.out.print(i + " ");
        if (i < n) {
            exibe0aN1(i+1, n);
        }
    }
    static void exibe0aN2 (int i, int n) { //decrescente
        if (i < n) {
            exibe0aN2(i+1, n);
        }
        System.out.print(i + " ");
    }
    static void exibe0aN3 (int n) { //crescente
        if (n > 0) exibe0aN3(n-1);
        System.out.print(n + " ");
    }
    static void exibe0aN4 (int n) { //decrescente
        System.out.print(n + " ");
        if (n>0) exibe0aN4(n-1);
    }
    //entrada: um vetor de inteiros, saída: soma dos elementos
    static int somaVet1 (int[] v, int pos) {
        if (pos == v.length - 1) return v[v.length-1];
        return v[pos] + somaVet1(v, pos+1);
    }
    static int somaVet2 (int[] v, int pos) {
        if (pos == 0) return v[0];
        return v[pos] + somaVet2(v, pos-1);
    }
    //entradas: vetor e a posição atual, saída: menor elemento do vetor
    static int menorElemento (int[] v, int pos) {
        if (pos == v.length-1) return v[pos];
        int menor = menorElemento(v, pos+1);
        return v[pos] < menor ? v[pos] : menor;
    }
    public static void main(String[] args) {
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialIterativo(i));
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialRecursivo(i));
        for (int i=0; i<=20; i++)
            System.out.println("fibonacci em " + i + " = " + fibonacciRecursivo(i));
        System.out.println("3 a quarta iterativo: " + potenciaIterativo(3, 4));
        System.out.println("3 a quarta recursivo: " + potenciaRec(3, 4));
        System.out.println("3 x 4 = " + multiplicaRecursivo(3, 4));
        exibe0aN1(0, 4);
        System.out.println();
        exibe0aN2(0, 4);
        System.out.println();
        exibe0aN3(4);
        System.out.println();
        exibe0aN4(4);
        System.out.println();
        int[] v = {3, 4, 1, 7};
        System.out.println("soma 1: " + somaVet1(v, 0));
        System.out.println("soma 2: " + somaVet2(v, v.length-1));
        System.out.println("menor elemento: " + menorElemento(v, 0));
    }
    
}