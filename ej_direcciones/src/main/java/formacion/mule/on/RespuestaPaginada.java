package formacion.mule.on;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaPaginada", propOrder = {
    "numPagina",
    "tamPagina",
    "total"
}, namespace="urn:test-formacion:Direcciones")
public abstract class RespuestaPaginada {

    @XmlAttribute(name = "numPagina", required=true)
    protected int numPagina = 0;
    @XmlAttribute(name = "tamPagina", required=true)
    protected int tamPagina = 50;
    @XmlAttribute(name = "total", required=true)
    protected int total = 0;
    
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	public int getTamPagina() {
		return tamPagina;
	}
	public void setTamPagina(int tamPagina) {
		this.tamPagina = tamPagina;
	}
    
    
}
