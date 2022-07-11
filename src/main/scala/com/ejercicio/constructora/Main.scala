package com.ejercicio.constructora

import com.ejercicio.constructora.clases.construcciones._
import com.ejercicio.constructora.clases.coordenada.Coordenada
import com.ejercicio.constructora.clases.ordenes.{OrdenConstruccion, OrdenDenegada}
import com.ejercicio.constructora.clases.solicitud.Solicitud

import java.time.{LocalDate, LocalDateTime}

object Main {
  def main(args: Array[String]): Unit = {

    //    test1()


    val lista: List[Solicitud] = List(
      Solicitud(Casa(111, 22, 70, 90, 90), Coordenada(1, 4)),
      Solicitud(Lago(111, 111, 41, 55, 90), Coordenada(2, 4)),
      Solicitud(Lago(100, 100, 100, 100, 100), Coordenada(3, 4)),
      Solicitud(CanchaFutbol(100, 100, 100, 100, 100), Coordenada(3, 4)),
      Solicitud(Casa(11, 22, 47, 50, 70), Coordenada(1, 7)),
      Solicitud(Gimnasio(111, 232, 400, 505, 600), Coordenada(1, 4)),
      Solicitud(Casa(111, 232, 400, 505, 600), Coordenada(1, 4)),
    )

    try {
      val listaNueva = test2(lista)
      listaNueva.foreach(a => println(a))
    } catch {
      case e: Exception => println(s"ERROR: ${e.getMessage}")
    }


  }

  def test1(): Unit = {
    val lista = List(
      Casa(111, 22, 4, 55, 90),
      Casa(11, 332, 40, 5, 90),
      Casa(100, 100, 100, 100, 100),
      Lago(100, 100, 100, 100, 100),
      Edificio(100, 100, 100, 100, 100)
    )


    for (item <- lista) {
      val solicitud: Solicitud = Solicitud(item, Coordenada(1, 2))
      val orden: Option[OrdenConstruccion] = solicitud.realizarConstruccion()
      val orden2: Option[OrdenConstruccion] = solicitud.realizarConstruccion(LocalDateTime.of(2022, 7, 15, 7, 0))


      println(orden)
      println(orden2)

    }

  }

  def test2(lista: List[Solicitud]) = {
    lista.filter(item => item.realizarConstruccion().isDefined)
      .map(solicitud => {
        solicitud.realizarConstruccion().get
      })
  }


}
