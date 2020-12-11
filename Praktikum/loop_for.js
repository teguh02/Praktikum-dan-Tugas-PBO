// for loop
for(let i = 0; i < 5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

// for/in

var nama = [{fName : 'Rifqi', lName : 'Ganteng', age : 20}, {fName : 'Jodoh', lName : 'Ga tau', age : 25}]

for(var x in nama){
    console.log('Hayo iki sopo\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}


// for/of
var buah = ['apel', 'jeruk', 'semongko']
for(var x in buah){
    console.log('Ini adalah buah '+buah[x])
}