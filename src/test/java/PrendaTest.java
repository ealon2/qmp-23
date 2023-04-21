import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTest {
  
  private Prenda prenda;
  @Test
  public void crearUnaPrendaConColorPrimario(){
    prenda = new Prenda(TipoDePrenda.CAMISA,Material.ALGODON, ColorPrimario.AZUL);
    assertEquals(prenda.obtenerTipoPrenda(),TipoDePrenda.CAMISA);
    assertEquals(prenda.obtenerColorPrimario(), ColorPrimario.AZUL);
    assertEquals(TipoDePrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
  }

  @Test
  public void crearUnaPrendaConColorSecundario(){
    prenda = new Prenda(TipoDePrenda.CAMISA,Material.ALGODON, ColorPrimario.AZUL,ColorSecundario.VERDE);
    assertEquals(prenda.obtenerTipoPrenda(),TipoDePrenda.CAMISA);
    assertEquals(prenda.obtenerColorPrimario(), ColorPrimario.AZUL);
    assertEquals(prenda.obtenerColorSecundario(),ColorSecundario.VERDE);
    assertEquals(TipoDePrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
  }

}