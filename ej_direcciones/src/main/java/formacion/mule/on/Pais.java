package formacion.mule.on;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import formacion.mule.utils.parsemaps.annotations.Map2BeanPropSetter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pais", propOrder = {
    "id",
    "cod",
    "nombre"
}, namespace="urn:test-formacion:Direcciones")
public class Pais {
	
    @XmlAttribute(name = "id", required=true)
	protected BigDecimal id;
    @XmlAttribute(name = "cod", required=true)
    protected String cod;
    @XmlAttribute(name = "nombre", required=true)
    protected String nombre;
	public BigDecimal getId() {
		return id;
	}
	@Map2BeanPropSetter(key="ID_ISO")
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getCod() {
		return cod;
	}
	@Map2BeanPropSetter(key="COD_ISO")
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	@Map2BeanPropSetter(key="NOMBRE")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
    
}
