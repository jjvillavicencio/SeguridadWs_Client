/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.seguridadws_client;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import test.WsAuth;
import test.WsAuthImplService;

/**
 *
 * @author jjvillavicencio
 */
public class pruebas {
    public static void main(String[] args) {
        WsAuthImplService wais = new WsAuthImplService();
        WsAuth soap = wais.getWsAuthImplPort();
        soap.authTest();
        System.out.println(soap.authTest());
        
        Map<String,Object> reqMap = ((BindingProvider) soap).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/SeguridadWS/WsAuthImplService?wsdl");
        Map<String, List<String>> header = new HashMap<>();
        header.put("Username", Collections.singletonList("jjvillavicencio"));
        header.put("Password", Collections.singletonList("12354"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);
        System.out.println(soap.authTest());
        
    }
}
