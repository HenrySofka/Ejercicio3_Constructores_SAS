package com.ejercicio.constructora.clases.construcciones

import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.TiposMateriales.{Adobe, Arena, Cemento, Grava, Madera}

case class Casa(ce: Cemento, gr: Grava, ar: Arena, ma: Madera, ad: Adobe) extends Construccion {
  def construir( ): Boolean ={
    if( ce >= 100 && gr >= 50 && ar >= 90 && ma >= 20 && ad >= 100 ){
      true
    } else {
      false
    }
  }
}
