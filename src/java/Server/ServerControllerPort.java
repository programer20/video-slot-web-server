/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author User
 */
@Path("servercontrollerport")
public class ServerControllerPort {

    private Server_client.ServerController port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServerControllerPort
     */
    public ServerControllerPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method getSymbols
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("getsymbols/")
    public JAXBElement<Server_client.WebServerTransferObject> postGetSymbols(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.getSymbols(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getLinePayouts
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("getlinepayouts/")
    public JAXBElement<Server_client.WebServerTransferObject> postGetLinePayouts(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.getLinePayouts(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method createSpin
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("createspin/")
    public JAXBElement<Server_client.WebServerTransferObject> postCreateSpin(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.createSpin(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method randomizeMathValues
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("randomizemathvalues/")
    public JAXBElement<Server_client.WebServerTransferObject> postRandomizeMathValues(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.randomizeMathValues(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getPositions
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("getpositions/")
    public JAXBElement<Server_client.WebServerTransferObject> postGetPositions(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.getPositions(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateUser
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("updateuser/")
    public JAXBElement<Server_client.WebServerTransferObject> postUpdateUser(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.updateUser(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method createGame
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("creategame/")
    public JAXBElement<Server_client.WebServerTransferObject> postCreateGame(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.createGame(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method createSpinLinePayouts
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.WebServerTransferObject>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("createspinlinepayouts/")
    public JAXBElement<Server_client.WebServerTransferObject> postCreateSpinLinePayouts(JAXBElement<Server_client.WebServerTransferObject> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.WebServerTransferObject result = port.createSpinLinePayouts(arg0.getValue());
                return new JAXBElement<Server_client.WebServerTransferObject>(new QName("http//Server_client/", "webservertransferobject"), Server_client.WebServerTransferObject.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private Server_client.ServerController getPort() {
        try {
            // Call Web Service Operation
            Server_client.ServerController_Service service = new Server_client.ServerController_Service();
            Server_client.ServerController p = service.getServerControllerPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
