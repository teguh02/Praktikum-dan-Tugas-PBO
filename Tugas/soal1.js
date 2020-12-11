/*
* Teguh Rijanandi
* program menampilkan bilangan prima
*/


var bilangan

for (let i = 1; i <=50; i++){
    bilangan = 0
    for (let j = 1; j <=i; j++) {
        if(i%j==0){
            bilangan = bilangan+1
        }
    }

    if(bilangan==2){
        console.log(i+ " ")
    }
}