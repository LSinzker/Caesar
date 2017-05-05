package Ceasar.Cripto

class Cripto(private val chave: Int = 3){

  private val indiceInicial = 'a'.toInt
  private val indiceFinal = 'z'.toInt

  private val alfabeto = 1 + indiceFinal - indiceInicial
  private val alfabeto2 = 1 + 'Z'.toInt - 'A'.toInt

  def codificar(c : Char) : Char = {
    if(c >= 'a' && c <= 'z'){
      (indiceInicial + ((c.toInt + chave - indiceInicial) % alfabeto)).toChar

    }else if(c >= 'A' && c <= 'Z'){
      ('A'.toInt + ((c.toInt + chave - 'A'.toInt) % alfabeto2)).toChar

    }else{
      c
    }
  }

  def decodificar(c : Char) : Char = {
    if(c >= 'a' && c <= 'z'){
      (indiceFinal - ((indiceFinal - (c.toInt - chave)) % alfabeto)).toChar

    }else if(c >= 'A' && c <= 'Z'){
      ('Z'.toInt - (('Z'.toInt - (c.toInt - chave)) % alfabeto2)).toChar

    }else{
      c
    }
  }

  def codificaString(texto : String) : String = texto.map(c => codificar(c))

  def decodificaString(texto : String) : String = texto.map(c => decodificar(c))
}
