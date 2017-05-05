package Ceasar.Cripto

class Rotation{

  private val indiceInicial = 'a'.toInt
  private val indiceFinal = 'z'.toInt

  private val alfabeto = 1 + indiceFinal - indiceInicial
  private val alfabeto2 = 1 + 'Z'.toInt - 'A'.toInt

  private var chave = 'j'.toInt - 'a'.toInt - 1

  def codificaRot(c : Char) : Char = {
    chave += 1
    if(c >= 'a' && c <= 'z'){
      (indiceInicial + ((c.toInt + chave - indiceInicial) % alfabeto)).toChar

    }else if(c >= 'A' && c <= 'Z'){
      ('A'.toInt + ((c.toInt + chave - 'A'.toInt) % alfabeto2)).toChar

    }else{
      c
    }
  }
  def decodificaRot(c : Char) : Char = {
    chave += 1
    if(c >= 'a' && c <= 'z'){
      (indiceFinal - ((indiceFinal - (c.toInt - chave)) % alfabeto)).toChar

    }else if(c >= 'A' && c <= 'Z'){
      ('Z'.toInt - (('Z'.toInt - (c.toInt - chave)) % alfabeto2)).toChar

    }else{
      c
    }
  }
  def codificaStringRot(texto : String) : String = texto.map(c => codificaRot(c))

  def decodificaStringRot(texto : String) : String = texto.map(c => decodificaRot(c))
}