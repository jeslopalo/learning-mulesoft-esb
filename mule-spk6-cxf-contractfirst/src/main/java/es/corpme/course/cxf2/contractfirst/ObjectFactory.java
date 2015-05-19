
package es.corpme.course.cxf2.contractfirst;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.corpme.course.cxf2.contractfirst package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FirstMethod_QNAME = new QName("http://cxf.mulesoft.com/", "firstMethod");
    private final static QName _FirstMethodResponse_QNAME = new QName("http://cxf.mulesoft.com/", "firstMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.corpme.course.cxf2.contractfirst
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnType }
     * 
     */
    public ReturnType createReturnType() {
        return new ReturnType();
    }

    /**
     * Create an instance of {@link FirstMethod }
     * 
     */
    public FirstMethod createFirstMethod() {
        return new FirstMethod();
    }

    /**
     * Create an instance of {@link FirstMethodResponse }
     * 
     */
    public FirstMethodResponse createFirstMethodResponse() {
        return new FirstMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.mulesoft.com/", name = "firstMethod")
    public JAXBElement<FirstMethod> createFirstMethod(FirstMethod value) {
        return new JAXBElement<FirstMethod>(_FirstMethod_QNAME, FirstMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.mulesoft.com/", name = "firstMethodResponse")
    public JAXBElement<FirstMethodResponse> createFirstMethodResponse(FirstMethodResponse value) {
        return new JAXBElement<FirstMethodResponse>(_FirstMethodResponse_QNAME, FirstMethodResponse.class, null, value);
    }

}
