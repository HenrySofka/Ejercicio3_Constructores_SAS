package com.ejercicio.constructora.clases.construcciones

import com.ejercicio.constructora.clases.traits.Construccion
import com.ejercicio.constructora.tipos.TiposMateriales.{Adobe, Arena, Cemento, Grava, Madera}

case class Edificio(ce: Cemento, gr: Grava, ar: Arena, ma: Madera, ad: Adobe) extends  Construccion {
  def construir(): Boolean = {
    if (ce >= 200 && gr >= 100 && ar >= 180 && ma >= 40 && ad >= 200) {
      true
    } else {
      false
    }
  }
}
