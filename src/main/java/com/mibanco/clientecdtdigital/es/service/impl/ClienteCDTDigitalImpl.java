package com.mibanco.clientecdtdigital.es.service.impl;

import com.mibanco.clientecdtdigital.es.controller.ClienteCDTDigidalController;
import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.service.contract.IClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.mapper.ClienteCDTDigitalMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;

@ApplicationScoped
public class ClienteCDTDigitalImpl implements IClienteCDTDigital {
    private  static  final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigidalController.class);
    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;
    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Transactional
    public ClienteCDTDigitalType crearClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el metodo crearClienteCdtDigital Impl");
        try {
            ClienteCDTDigital clienteCDTDigital = clienteCDTDigitalMapper.clienteCDTDigitalTypeToEntity(clienteCDTDigitalType);
            clienteCDTDigitalDao.persist(clienteCDTDigital);
        }catch(ApplicationException e){
            LOG.error("Se presento un error en el metodo crearClienteCdtDigital Impl"+ e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
        LOG.info("Finaliza el metodo crearClienteCdtDigital Impl");
        return clienteCDTDigitalType;
    }

    @Transactional
    public void eliminarClienteCDTDigital(Integer ID) {
        LOG.info("Inicia el metodo eliminar cliente");
        try {
            Long clienteID = Long.valueOf(ID);
            clienteCDTDigitalDao.deleteById(clienteID);
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo crearClienteCdtDigital Impl" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
        LOG.info("Finaliza el metodo eliminarClienteCdtDigital Impl");
    }
    @Transactional
    public ClienteCDTDigitalTypeResponse actualizarClienteCDTDigital (Integer ID, ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse) {
        try {
            Long clienteID = Long.valueOf(ID);
            ClienteCDTDigital clienteCDTDigital = clienteCDTDigitalDao.findById(clienteID);
            ClienteCDTDigital clienteActualizar = clienteCDTDigitalMapper.clienteCDTDigitalTypeResponseToEntity(clienteCDTDigitalTypeResponse);
            clienteCDTDigital.setTipoTelefonoPrincipal(clienteActualizar.getTipoTelefonoPrincipal());
            clienteCDTDigital.setTelefonoPrincipal(clienteActualizar.getTelefonoPrincipal());
            clienteCDTDigital.setTipoCorreoElectronico(clienteActualizar.getTipoCorreoElectronico());
            return clienteCDTDigitalTypeResponse;
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo crearClienteCdtDigital Impl" + e.getMessage());
        }
        LOG.info("Finaliza el metodo actualizarClienteCdtDigital Impl");
        return clienteCDTDigitalTypeResponse;
    }
}
