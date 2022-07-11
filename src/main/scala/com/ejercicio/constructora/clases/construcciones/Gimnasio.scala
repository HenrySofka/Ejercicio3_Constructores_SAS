package com.ejercicio.constructora.clases.construcciones

import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.TiposMateriales.{Adobe, Arena, Cemento, Grava, Madera}

case class Gimnasio(ce: Cemento, gr: Grava, ar: Arena, ma: Madera, ad: Adobe) extends Construccion {
  def construir( ): Boolean ={
    if( ce >= 50 && gr >= 25 && ar >= 45 && ma >= 10 && ad >= 50 ){
      true
    } else {
      false
    }
  }
}
