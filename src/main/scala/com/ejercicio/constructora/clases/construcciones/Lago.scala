package com.ejercicio.constructora.clases.construcciones

import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.TiposMateriales.{Adobe, Arena, Cemento, Grava, Madera}

case class Lago(ce: Cemento, gr: Grava, ar: Arena, ma: Madera, ad: Adobe) extends Construccion {
  def construir( ): Boolean ={
    if( ce >= 50 && gr >= 60 && ar >= 80 && ma >= 10 && ad >= 20 ){
      true
    } else {
      false
    }
  }
}
