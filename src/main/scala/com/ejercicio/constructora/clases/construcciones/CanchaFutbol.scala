package com.ejercicio.constructora.clases.construcciones

import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.TiposMateriales.{Adobe, Arena, Cemento, Grava, Madera}

case class CanchaFutbol(ce: Cemento, gr: Grava, ar: Arena, ma: Madera, ad: Adobe) extends Construccion {

  def construir( ): Boolean ={
    if( ce >= 20 && gr >= 20 && ar >= 20 && ma >= 20 && ad >= 20 ){
      true
    } else {
      false
    }
  }

}

