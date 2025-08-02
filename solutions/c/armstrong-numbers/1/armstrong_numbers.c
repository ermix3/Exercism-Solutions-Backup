#include "armstrong_numbers.h"
#include "math.h"
#include <stdio.h>
#include <string.h>

//bool is_armstrong_number(int candidate) {
//    char candidateString[10];
//    sprintf(candidateString, "%d", candidate);
//    int length = strlen(candidateString);
//    double sum = 0;
//    for (int i = 0; i < length; i++) {
//        int x;
//        char c = candidateString[i];
//        sscanf(&c, "%d", &x);
//        sum += pow(x, length);
//    }
//    return (int) sum == candidate;
//}

// Chat-GPT 2023-10-15 solution
bool is_armstrong_number(int candidate) {
    int original = candidate;
    int length = log10(candidate) + 1;
    int sum = 0;

    while (candidate > 0) {
        int digit = candidate % 10;
        sum += pow(digit, length);
        candidate /= 10;
    }

    return sum == original;
}