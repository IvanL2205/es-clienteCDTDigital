package com.mibanco.clientecdtdigital.es.controller;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.contract.V1ClientecdtdigitalApi;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalImpl;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;

@GraphQLApi
public class ClienteCDTDigitalControllerGraphQL implements V1ClientecdtdigitalApi {
    private  static  final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalControllerGraphQL.class);

    @Inject
    ClienteCDTDigitalImpl clienteCDTDigitalImpl;


    @Mutation
    @Description("ActualizarClienteCDTDigital")
    public Response actualizarClienteCDTDigital(Integer id, ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse) {
        LOG.info("Inicia el metodo actualizarClienteCDTDigital");
        try {
            clienteCDTDigitalImpl.actualizarClienteCDTDigital(id, clienteCDTDigitalTypeResponse);
            return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalTypeResponse).build();
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo actualizarClienteCDTDigital");
        }
        LOG.info("Se finaliza el metodo actualizarClienteCDTDigital");
        return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalTypeResponse).build();
    }
    @Query
    @Description("CrearClienteCDTDigital")
    public Response crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el metodo crearClienteCdtDigital Controller");
        ClienteCDTDigitalType clienteCDTDigitalTypeResponse = null;
        try{
            clienteCDTDigitalTypeResponse = clienteCDTDigitalImpl.crearClienteCdtDigital(clienteCDTDigitalType);
        }catch(ApplicationException e){
            LOG.error("Se presento un error en el metodo crearClienteCDTDigital controller"+ e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Finaliza el metodo crearClienteCdtDigital Controller");
        return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalTypeResponse).build();
    }

    @Mutation
    @Description("EliminarClienteCDTDigital")
    public Response eliminarClienteCDTDigital(Integer id) {
        try{
        clienteCDTDigitalImpl.eliminarClienteCDTDigital(id);
        return Response.status(Response.Status.OK).build();
        }catch (ApplicationException e){
            LOG.error("Se presento un error en el metodo eliminarClienteCDTDigital");
        }
        LOG.info("Finaliza el metodo eliminarClienteCDTDigital");
        return null;
    }

    @Mutation
    @Description("obtenerClienteCDTDigital")
    public List<ClienteCDTDigital> obtenerClienteCDTDigital(){
        LOG.info("Inicio obtenerClienteCDTDigital controller");
        try {
            List<ClienteCDTDigital> clientes = clienteCDTDigitalImpl.obtenerClienteCDTDigital();
            LOG.info("Fin obtenerClienteCDTDigital controller");
            return clientes;
        } catch (ApplicationException e){
            LOG.error("Se presento un error en el metodo obtenerClienteCDTDigital controller" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + "obtenerClienteCDTDigital controller");
        }
    }
}
