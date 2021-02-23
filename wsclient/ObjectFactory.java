
package wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
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

    private final static QName _GetAllPackages_QNAME = new QName("http://wsserver/", "getAllPackages");
    private final static QName _AddPath_QNAME = new QName("http://wsserver/", "addPath");
    private final static QName _DummyOpResponse_QNAME = new QName("http://wsserver/", "dummyOpResponse");
    private final static QName _GetPathForPackage_QNAME = new QName("http://wsserver/", "getPathForPackage");
    private final static QName _GetAllPackagesResponse_QNAME = new QName("http://wsserver/", "getAllPackagesResponse");
    private final static QName _DeletePackage_QNAME = new QName("http://wsserver/", "deletePackage");
    private final static QName _DeletePackageResponse_QNAME = new QName("http://wsserver/", "deletePackageResponse");
    private final static QName _GetPathForPackageResponse_QNAME = new QName("http://wsserver/", "getPathForPackageResponse");
    private final static QName _AddPackage_QNAME = new QName("http://wsserver/", "addPackage");
    private final static QName _GetUser_QNAME = new QName("http://wsserver/", "getUser");
    private final static QName _TrackPackage_QNAME = new QName("http://wsserver/", "trackPackage");
    private final static QName _AddUser_QNAME = new QName("http://wsserver/", "addUser");
    private final static QName _AddPackageResponse_QNAME = new QName("http://wsserver/", "addPackageResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://wsserver/", "getAllUsers");
    private final static QName _GetUserResponse_QNAME = new QName("http://wsserver/", "getUserResponse");
    private final static QName _DummyOp_QNAME = new QName("http://wsserver/", "dummyOp");
    private final static QName _LoginControlResponse_QNAME = new QName("http://wsserver/", "loginControlResponse");
    private final static QName _AddPathResponse_QNAME = new QName("http://wsserver/", "addPathResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://wsserver/", "addUserResponse");
    private final static QName _LoginControl_QNAME = new QName("http://wsserver/", "loginControl");
    private final static QName _TrackPackageResponse_QNAME = new QName("http://wsserver/", "trackPackageResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://wsserver/", "getAllUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DummyOp }
     * 
     */
    public DummyOp createDummyOp() {
        return new DummyOp();
    }

    /**
     * Create an instance of {@link LoginControlResponse }
     * 
     */
    public LoginControlResponse createLoginControlResponse() {
        return new LoginControlResponse();
    }

    /**
     * Create an instance of {@link AddPackageResponse }
     * 
     */
    public AddPackageResponse createAddPackageResponse() {
        return new AddPackageResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link AddPathResponse }
     * 
     */
    public AddPathResponse createAddPathResponse() {
        return new AddPathResponse();
    }

    /**
     * Create an instance of {@link GetPathForPackageResponse }
     * 
     */
    public GetPathForPackageResponse createGetPathForPackageResponse() {
        return new GetPathForPackageResponse();
    }

    /**
     * Create an instance of {@link DeletePackageResponse }
     * 
     */
    public DeletePackageResponse createDeletePackageResponse() {
        return new DeletePackageResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddPackage }
     * 
     */
    public AddPackage createAddPackage() {
        return new AddPackage();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link TrackPackage }
     * 
     */
    public TrackPackage createTrackPackage() {
        return new TrackPackage();
    }

    /**
     * Create an instance of {@link GetAllPackagesResponse }
     * 
     */
    public GetAllPackagesResponse createGetAllPackagesResponse() {
        return new GetAllPackagesResponse();
    }

    /**
     * Create an instance of {@link GetPathForPackage }
     * 
     */
    public GetPathForPackage createGetPathForPackage() {
        return new GetPathForPackage();
    }

    /**
     * Create an instance of {@link DeletePackage }
     * 
     */
    public DeletePackage createDeletePackage() {
        return new DeletePackage();
    }

    /**
     * Create an instance of {@link GetAllPackages }
     * 
     */
    public GetAllPackages createGetAllPackages() {
        return new GetAllPackages();
    }

    /**
     * Create an instance of {@link AddPath }
     * 
     */
    public AddPath createAddPath() {
        return new AddPath();
    }

    /**
     * Create an instance of {@link DummyOpResponse }
     * 
     */
    public DummyOpResponse createDummyOpResponse() {
        return new DummyOpResponse();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link TrackPackageResponse }
     * 
     */
    public TrackPackageResponse createTrackPackageResponse() {
        return new TrackPackageResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link LoginControl }
     * 
     */
    public LoginControl createLoginControl() {
        return new LoginControl();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getAllPackages")
    public JAXBElement<GetAllPackages> createGetAllPackages(GetAllPackages value) {
        return new JAXBElement<GetAllPackages>(_GetAllPackages_QNAME, GetAllPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addPath")
    public JAXBElement<AddPath> createAddPath(AddPath value) {
        return new JAXBElement<AddPath>(_AddPath_QNAME, AddPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "dummyOpResponse")
    public JAXBElement<DummyOpResponse> createDummyOpResponse(DummyOpResponse value) {
        return new JAXBElement<DummyOpResponse>(_DummyOpResponse_QNAME, DummyOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPathForPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getPathForPackage")
    public JAXBElement<GetPathForPackage> createGetPathForPackage(GetPathForPackage value) {
        return new JAXBElement<GetPathForPackage>(_GetPathForPackage_QNAME, GetPathForPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getAllPackagesResponse")
    public JAXBElement<GetAllPackagesResponse> createGetAllPackagesResponse(GetAllPackagesResponse value) {
        return new JAXBElement<GetAllPackagesResponse>(_GetAllPackagesResponse_QNAME, GetAllPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "deletePackage")
    public JAXBElement<DeletePackage> createDeletePackage(DeletePackage value) {
        return new JAXBElement<DeletePackage>(_DeletePackage_QNAME, DeletePackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "deletePackageResponse")
    public JAXBElement<DeletePackageResponse> createDeletePackageResponse(DeletePackageResponse value) {
        return new JAXBElement<DeletePackageResponse>(_DeletePackageResponse_QNAME, DeletePackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPathForPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getPathForPackageResponse")
    public JAXBElement<GetPathForPackageResponse> createGetPathForPackageResponse(GetPathForPackageResponse value) {
        return new JAXBElement<GetPathForPackageResponse>(_GetPathForPackageResponse_QNAME, GetPathForPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addPackage")
    public JAXBElement<AddPackage> createAddPackage(AddPackage value) {
        return new JAXBElement<AddPackage>(_AddPackage_QNAME, AddPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "trackPackage")
    public JAXBElement<TrackPackage> createTrackPackage(TrackPackage value) {
        return new JAXBElement<TrackPackage>(_TrackPackage_QNAME, TrackPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addPackageResponse")
    public JAXBElement<AddPackageResponse> createAddPackageResponse(AddPackageResponse value) {
        return new JAXBElement<AddPackageResponse>(_AddPackageResponse_QNAME, AddPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "dummyOp")
    public JAXBElement<DummyOp> createDummyOp(DummyOp value) {
        return new JAXBElement<DummyOp>(_DummyOp_QNAME, DummyOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "loginControlResponse")
    public JAXBElement<LoginControlResponse> createLoginControlResponse(LoginControlResponse value) {
        return new JAXBElement<LoginControlResponse>(_LoginControlResponse_QNAME, LoginControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addPathResponse")
    public JAXBElement<AddPathResponse> createAddPathResponse(AddPathResponse value) {
        return new JAXBElement<AddPathResponse>(_AddPathResponse_QNAME, AddPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "loginControl")
    public JAXBElement<LoginControl> createLoginControl(LoginControl value) {
        return new JAXBElement<LoginControl>(_LoginControl_QNAME, LoginControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "trackPackageResponse")
    public JAXBElement<TrackPackageResponse> createTrackPackageResponse(TrackPackageResponse value) {
        return new JAXBElement<TrackPackageResponse>(_TrackPackageResponse_QNAME, TrackPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

}
