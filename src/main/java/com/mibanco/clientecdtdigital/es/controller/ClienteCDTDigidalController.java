package com.mibanco.clientecdtdigital.es.controller;

import com.mibanco.clientecdtdigital.es.gen.contract.V1ClientecdtdigitalApi;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalImpl;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClienteCDTDigidalController implements V1ClientecdtdigitalApi {
    private  static  final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigidalController.class);

    @Inject
    ClienteCDTDigitalImpl clienteCDTDigitalImpl;


    @Override
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
    @Override
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

    @Override
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
    @Override
    public Response buscarClienteCDTDigital(Integer id) {
        LOG.info("Inicia el metodo listarClienteCdtDigital Controller");
        try {
            clienteCDTDigitalImpl.listarClienteCDTDigital(id);
            return Response.status(Response.Status.OK).build();
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo listarClienteCdtDigital controller" + e.getMessage());
        }
        LOG.info("Finaliza el metodo listarClienteCdtDigital");
        return null;
    }
}
