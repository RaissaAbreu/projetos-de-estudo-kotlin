

fun inverte_lista(lista: MutableList<Any>): MutableList<Any>{
    var lista_invertida = mutableListOf<Any>()
    var tamanho = lista.size
    for (i in lista.indices){
        lista_invertida.add(lista[tamanho-1])
        tamanho -= 1
    }
    return lista_invertida
}

fun main(){
    var lista = mutableListOf<Any>(1,2,3,4,5,6,7,8,9)
    print(inverte_lista(lista))
}