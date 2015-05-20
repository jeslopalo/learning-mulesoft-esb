package formacion.mule.on;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaPaises", propOrder = {
    "paises"
}, namespace="urn:test-formacion:Direcciones")
public class RespuestaPaises extends RespuestaPaginada {
	
    @XmlElement(name = "pais", required=true)
	private List<Pais> paises;

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	
	

}
