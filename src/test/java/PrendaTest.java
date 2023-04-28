import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTest {
  
  private Prenda prenda;
  @Test
  public void crearUnaPrendaConColorPrimario(){
    prenda = new Prenda(Trama.CUADRADO,TipoDePrenda.CAMISA,Material.ALGODON, Color.BLUE, null);
    assertEquals(prenda.obtenerTipoPrenda(),TipoDePrenda.CAMISA);
    assertEquals(prenda.obtenerColorPrimario(), Color.BLUE);
    assertEquals(TipoDePrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
  }

  @Test
  public void crearUnaPrendaConColorSecundario(){
    prenda = new Prenda(Trama.LISA,TipoDePrenda.CAMISA,Material.ALGODON, Color.BLUE,Color.BLACK);
    assertEquals(prenda.obtenerTipoPrenda(),TipoDePrenda.CAMISA);
    assertEquals(prenda.obtenerColorPrimario(), Color.BLUE);
    assertEquals(prenda.obtenerColorSecundario(),Color.BLACK);
    assertEquals(TipoDePrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
  }

}