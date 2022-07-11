package com.ejercicio.constructora.clases.ordenes

import com.ejercicio.constructora.clases.solicitud.Solicitud
import com.ejercicio.constructora.tipos.Estado.Estado

import java.time.{LocalDate, LocalDateTime, LocalTime}

case class OrdenConstruccion
  (solicitud: Solicitud, estado: Estado, fechaInicio: LocalDateTime, fechaFin: LocalDateTime) extends Orden {

  def consultarEstado() ={
    val horaDia = LocalTime.of(6,0)
    val horaNoche= LocalTime.of(20,0)




  }

}