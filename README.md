# Anagram
Code for Anagram

You are to write a program that has to generate all possible words from a given set of letters. 

Example: Given the word "abc", your program should - by exploring all different combination of the three letters - output the words "abc", "acb", "bac", "bca", "cab" and "cba". 

In the word taken from the input file, some letters may appear more than once. For a given word, your program should not produce the same word more than once, and the words should be output in alphabetically ascending order. 

Input

The input file consists of several words. The first line contains a number giving the number of words to follow. Each following line contains one word. A word consists of uppercase or lowercase letters from A to Z. Uppercase and lowercase letters are to be considered different. 

Output

For each word in the input file, the output file should contain all different words that can be generated with the letters of the given word. The words generated from the same input word should be output in alphabetically ascending order. An upper case letter goes before the corresponding lower case letter. 

    Sample Input
    3
    aAb
    abc
    acba
    
    Sample Output
    Aab
    Aba
    aAb
    abA
    bAa
    baA
    abc
    acb
    bac
    bca
    cab
    cba
    aabc
    aacb
    abac
    abca
    acab
    acba
    baac
    baca
    bcaa
    caab
    caba
    cbaa
