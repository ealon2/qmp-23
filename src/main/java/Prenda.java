import java.awt.*;

public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(Trama trama, TipoDePrenda tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario){
    this.trama = trama;
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
  public TipoDePrenda obtenerTipoPrenda() {
    return tipoDePrenda;
  }

  public Color obtenerColorPrimario() {
    return this.colorPrimario;
  }

  public Color obtenerColorSecundario() {
    return this.colorSecundario;
  }

  public Material obtenerMaterial(){
    return this.material;
  }
}
