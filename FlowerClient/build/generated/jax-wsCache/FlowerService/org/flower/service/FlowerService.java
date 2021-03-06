
package org.flower.service;

import java.awt.Image;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlowerService", targetNamespace = "http://service.flower.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlowerService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service.flower.org/", className = "org.flower.service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service.flower.org/", className = "org.flower.service.HelloResponse")
    @Action(input = "http://service.flower.org/FlowerService/helloRequest", output = "http://service.flower.org/FlowerService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<java.awt.Image>
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getThumbnails", targetNamespace = "http://service.flower.org/", className = "org.flower.service.GetThumbnails")
    @ResponseWrapper(localName = "getThumbnailsResponse", targetNamespace = "http://service.flower.org/", className = "org.flower.service.GetThumbnailsResponse")
    @Action(input = "http://service.flower.org/FlowerService/getThumbnailsRequest", output = "http://service.flower.org/FlowerService/getThumbnailsResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://service.flower.org/FlowerService/getThumbnails/Fault/IOException")
    })
    public List<Image> getThumbnails()
        throws IOException_Exception
    ;

    /**
     * 
     * @param name
     * @return
     *     returns java.awt.Image
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlower", targetNamespace = "http://service.flower.org/", className = "org.flower.service.GetFlower")
    @ResponseWrapper(localName = "getFlowerResponse", targetNamespace = "http://service.flower.org/", className = "org.flower.service.GetFlowerResponse")
    @Action(input = "http://service.flower.org/FlowerService/getFlowerRequest", output = "http://service.flower.org/FlowerService/getFlowerResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://service.flower.org/FlowerService/getFlower/Fault/IOException")
    })
    public Image getFlower(
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws IOException_Exception
    ;

}
