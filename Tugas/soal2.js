/*
* Teguh Rijanandi
* program menentukan bilangan fibonacci
*/

var n = 15

var fibonacci = new Array(n)

fibonacci[0] = 0
fibonacci[1] = 1

for (let i = 2; i < n; i++) {
    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
}

for (let i = 0; i < n; i++) {
    console.log(fibonacci[i] + " ")
}