
package service.com.imooc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.com.imooc package. 
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

    private final static QName _PrintReceInfoResponse_QNAME = new QName("http://www.imooc.com.service/", "printReceInfoResponse");
    private final static QName _PrintReceInfo_QNAME = new QName("http://www.imooc.com.service/", "printReceInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.com.imooc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintReceInfo }
     * 
     */
    public PrintReceInfo createPrintReceInfo() {
        return new PrintReceInfo();
    }

    /**
     * Create an instance of {@link PrintReceInfoResponse }
     * 
     */
    public PrintReceInfoResponse createPrintReceInfoResponse() {
        return new PrintReceInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imooc.com.service/", name = "printReceInfoResponse")
    public JAXBElement<PrintReceInfoResponse> createPrintReceInfoResponse(PrintReceInfoResponse value) {
        return new JAXBElement<PrintReceInfoResponse>(_PrintReceInfoResponse_QNAME, PrintReceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imooc.com.service/", name = "printReceInfo")
    public JAXBElement<PrintReceInfo> createPrintReceInfo(PrintReceInfo value) {
        return new JAXBElement<PrintReceInfo>(_PrintReceInfo_QNAME, PrintReceInfo.class, null, value);
    }

}
