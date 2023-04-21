public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private ColorPrimario colorPrimario;
  private ColorSecundario colorSecundario;
  public Prenda(TipoDePrenda tipoDePrenda, Material material, ColorPrimario colorPrimario){
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  public Prenda(TipoDePrenda tipoDePrenda, Material material, ColorPrimario colorPrimario, ColorSecundario colorSecundario){
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public TipoDePrenda obtenerTipoPrenda() {
    return tipoDePrenda;
  }

  public ColorPrimario obtenerColorPrimario() {
    return this.colorPrimario;
  }

  public ColorSecundario obtenerColorSecundario() {
    return this.colorSecundario;
  }
}
