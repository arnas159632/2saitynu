
package lt.viko.eif.adrevinskas.courses.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eid.adrevinskas.courses.client package.
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

    private final static QName _UserData_QNAME = new QName("http://www.Courses.lt/viko/eif/adrevinskas/courses/api/userDataCheck", "userData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eid.adrevinskas.courses.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDataCheckRequest }
     * 
     */
    public GetUserDataCheckRequest createGetUserDataCheckRequest() {
        return new GetUserDataCheckRequest();
    }

    /**
     * Create an instance of {@link UserDataType }
     * 
     */
    public UserDataType createUserDataType() {
        return new UserDataType();
    }

    /**
     * Create an instance of {@link GetUserDataCheckResponse }
     * 
     */
    public GetUserDataCheckResponse createGetUserDataCheckResponse() {
        return new GetUserDataCheckResponse();
    }

    /**
     * Create an instance of {@link UserDataCheck_Type }
     * 
     */
    public UserDataCheck_Type createUserDataCheck_Type() {
        return new UserDataCheck_Type();
    }

    /**
     * Create an instance of {@link Courses }
     * 
     */
    public Courses createDedicatedServersType() {
        return new Courses();
    }

    /**
     * Create an instance of {@link UserPackageType }
     * 
     */
    public UserPackageType createUserPackageType() {
        return new UserPackageType();
    }

    /**
     * Create an instance of {@link TeacherType }
     * 
     */
    public TeacherType createCloudServersType() {
        return new TeacherType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.Courses.lt/viko/eif/adrevinskas/courses/api/userDataCheck", name = "userData")
    public JAXBElement<UserDataType> createUserData(UserDataType value) {
        return new JAXBElement<UserDataType>(_UserData_QNAME, UserDataType.class, null, value);
    }

}
