class Usuario{
	List<Prenda> prendas;
	void cargarPrenda(Prenda prenda){
		prendas.add(prenda);
	}
}

class Prenda{
	Prenda(String tipo, Categoria categoria, String material, String colorPrincipal){
		if(!categoria.seCondiceCon(tipo)){
			throw new TipoYCategoriaNoCoincidenException 
				("El tipo ("+ tipo +") y la categoria ("+ categoria +") de la prenda que se quiere crear no coinciden");
		}
		this.tipo = tipo;
		this.categoria = categoria;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = "No color";
	}

	Prenda(String tipo, Categoria categoria, String material, String colorPrincipal, String colorSecundario){
		if(!categoria.seCondiceCon(tipo)){
			throw new TipoYCategoriaNoCoincidenException 
				("El tipo ("+ tipo +") y la categoria ("+ categoria +") de la prenda que se quiere crear no coinciden");
		}
		this.tipo = tipo;
		this.categoria = categoria;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}
}

class Categoria{
	List<Tipo> tipoCondicentes;
	boolean seCondiceCon(Tipo tipo){
		return tiposCondicentes.contains(tipo);
	}
}

public enum Tipo {
	ZAPATOS, CAMISAMANGACORTA, PANTALON /*, ... */;
}

class TipoYCategoriaNoCoincidenException extends Exception {
	TipoYCategoriaNoCoincidenException(String msg){
		super(msg);
	}
}
