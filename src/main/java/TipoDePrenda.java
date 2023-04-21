public enum TipoDePrenda {

  CAMISA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR),
  REMERA(CategoriaPrenda.SUPERIOR);

  CategoriaPrenda categoriaPrenda;

  TipoDePrenda(CategoriaPrenda categoriaPrenda){
    this.categoriaPrenda = categoriaPrenda;
  }

  CategoriaPrenda getCategoria(){
    return categoriaPrenda;
  }
}
