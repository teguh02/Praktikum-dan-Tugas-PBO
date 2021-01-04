function mixin(receiver, supplier) {
    for (var property in supplier){
        if(supplier.hasOwnProperty(property)){
            receiver[property] = supplier[property]
        }
    }

    return receiver
}

var person = (function(){
    var name = 'Chara'
    var age = 25

    function setName(newName) {
        name = newName
    }

    function getName() {
        return name
    }

    function getAge() {
        return age
    }

    return { setName : setName, getName : getName, getAge : getAge}
}())

var Title = (function(){
    var element = 'Anemo'

    function InnerTitle(title) {
        this.title = title
        this.element = element
    }

    return InnerTitle
}())

person.setName('Jean')
var title = new Title('Grand Master')

mixin(person, title)

console.log('Nama\t: '+person.getName())
console.log('Umur\t: '+person.getAge())
console.log('Title\t: '+person.title)
console.log('Element\t: '+person.element)