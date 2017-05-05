package Ceasar.Cripto

import scala.io.StdIn

object Main extends App {

  println("(1) Codificar")
  println("(2) Decodificar")
  val opt = StdIn.readInt()

  println("Input")
  val frase = StdIn.readLine()

  val v1 = new Cripto
  val v2 = new Rotation

  if(opt == 1) {
    println("(1) Basico")
    println("(2) Rotacionado")
    val opt2 = StdIn.readInt()

    if(opt2 == 1) {
      val out = v1.codificaString(frase)
      println("CODIFICADA:   " + out)
    }else if(opt2 == 2) {
      val out = v2.codificaStringRot(frase)
      println("CODIFICADA:   " + out)
    }else
      println("Opção Invalida.")
  }
  else if(opt == 2){
    println("(1) Basico")
    println("(2) Rotacionado")
    val opt2 = StdIn.readInt()

    if(opt2 == 1) {
      val out = v1.decodificaString(frase)
      println("DECODIFICADA:   " + out)
    }else if(opt2 == 2) {
      val out = v2.decodificaStringRot(frase)
      println("DECODIFICADA:   " + out)
    }else
      println("Opção Invalida.")
  }else
    println("Opção Invalida.")
}
