
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _ConsulerRelever_QNAME = new QName("http://ws/", "ConsulerRelever");
    private final static QName _ConsulerReleverResponse_QNAME = new QName("http://ws/", "ConsulerReleverResponse");
    private final static QName _Operation_QNAME = new QName("http://ws/", "operation");
    private final static QName _Releve_QNAME = new QName("http://ws/", "releve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulerRelever }
     * 
     * @return
     *     the new instance of {@link ConsulerRelever }
     */
    public ConsulerRelever createConsulerRelever() {
        return new ConsulerRelever();
    }

    /**
     * Create an instance of {@link ConsulerReleverResponse }
     * 
     * @return
     *     the new instance of {@link ConsulerReleverResponse }
     */
    public ConsulerReleverResponse createConsulerReleverResponse() {
        return new ConsulerReleverResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulerRelever }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulerRelever }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConsulerRelever")
    public JAXBElement<ConsulerRelever> createConsulerRelever(ConsulerRelever value) {
        return new JAXBElement<>(_ConsulerRelever_QNAME, ConsulerRelever.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulerReleverResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulerReleverResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConsulerReleverResponse")
    public JAXBElement<ConsulerReleverResponse> createConsulerReleverResponse(ConsulerReleverResponse value) {
        return new JAXBElement<>(_ConsulerReleverResponse_QNAME, ConsulerReleverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

}
