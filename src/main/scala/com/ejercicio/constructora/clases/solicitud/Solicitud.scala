package com.ejercicio.constructora.clases.solicitud

import com.ejercicio.constructora.clases.construcciones.{CanchaFutbol, Casa, Edificio, Gimnasio, Lago}
import com.ejercicio.constructora.clases.coordenada.Coordenada
import com.ejercicio.constructora.clases.ordenes.OrdenConstruccion
import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.Estado

import java.time.LocalDateTime

case class Solicitud(construccion: Construccion, coordenada: Coordenada) {
  def realizarConstruccion(ultimaFecha: LocalDateTime = LocalDateTime.now()): Option[OrdenConstruccion] = {
    if (construccion.construir()) {
      val orden = Solicitud.setearFechaConstruccion(this, ultimaFecha)
      Some(orden)
    } else {
      println("Materiales insuficientes")
      None
    }
  }
}

object Solicitud {

  def apply(construccion: Construccion, coordenada: Coordenada):
  Solicitud = new Solicitud(construccion, coordenada)

  def setearFechaConstruccion(solicitud: Solicitud, ultimaFecha: LocalDateTime = LocalDateTime.now()): OrdenConstruccion = {

    val dia = ultimaFecha.getDayOfMonth
    val mes = ultimaFecha.getMonthValue
    val anio = ultimaFecha.getYear

    solicitud.construccion match {
      case casa: Casa => {
        println("La casa se contruira en 3 Dias")
        val fechaInicio = LocalDateTime.of(anio, mes, dia + 1, 7, 0)
        val fechaFin = LocalDateTime.of(anio, mes, dia + 5, 20, 0)

        OrdenConstruccion(solicitud, Estado.EN_PROGRESO, fechaInicio, fechaFin)
      }
      case lago: Lago => {
        println("La casa se contruira en 2 Dias")
        val fechaInicio = LocalDateTime.of(anio, mes, dia + 1, 7,0)
        val fechaFin = LocalDateTime.of(anio, mes, dia + 4, 20,0)

        val ordenConstruccion = OrdenConstruccion(solicitud, Estado.EN_PROGRESO, fechaInicio, fechaFin)
        ordenConstruccion
      }
      case canchaFutbol: CanchaFutbol => {
        println("La casa se contruira en 1 Dias")
        val fechaInicio = LocalDateTime.of(anio, mes, dia + 1, 7, 0)
        val fechaFin = LocalDateTime.of(anio, mes, dia + 3, 20, 0)

        val ordenConstruccion = OrdenConstruccion(solicitud, Estado.EN_PROGRESO, fechaInicio, fechaFin)
        ordenConstruccion
      }
      case edificio: Edificio => {
        println("La casa se contruira en 6 Dias")
        val fechaInicio = LocalDateTime.of(anio, mes, dia + 1, 7, 0)
        val fechaFin = LocalDateTime.of(anio, mes, dia + 8, 20, 0)

        val ordenConstruccion = OrdenConstruccion(solicitud, Estado.EN_PROGRESO, fechaInicio, fechaFin)
        ordenConstruccion
      }
      case gimnasio: Gimnasio => {
        println("La casa se contruira en 2 Dias")
        val fechaInicio = LocalDateTime.of(anio, mes, dia + 1, 7, 0)
        val fechaFin = LocalDateTime.of(anio, mes, dia + 3, 20, 0)

        val ordenConstruccion = OrdenConstruccion(solicitud, Estado.EN_PROGRESO, fechaInicio, fechaFin)
        ordenConstruccion
      }
    }
  }


}
