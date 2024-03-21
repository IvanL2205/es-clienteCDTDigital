package com.mibanco.clientecdtdigital.es.service.implemt;

import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.utils.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.ClienteCDTDigitalMapper;

import com.mibanco.clientecdtdigital.es.service.contract.IClienteCDTDigital;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;


@ApplicationScoped
public class ClienteCDTDigitalImpl implements IClienteCDTDigital {
    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalImpl.class);

    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;

    @Transactional
    public ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalType ClienteCDTDigitalType) {
        LOG.info("Inicio crearClienteCDTDigital impl");
        try {
            ClienteCDTDigital cliente = clienteCDTDigitalMapper.clienteCDTDigitalTypeToEntity(ClienteCDTDigitalType);
            clienteCDTDigitalDao.persist(cliente);
            LOG.info("Fin crearClienteCDTDigital impl");
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo crearClienteCDTDigital Impl" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + "crearClienteCdtDigital Impl");
        }
        return ClienteCDTDigitalType;
    }

    @Transactional
    public ClienteCDTDigitalTypeResponse actualizarClienteCDTDigital(Long id, ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse) {
        LOG.info("Inicio actualizarClienteCDTDigital impl");
        try {
            ClienteCDTDigital clienteUpdate = clienteCDTDigitalMapper.clienteCDTDigitalTypeResponseToEntity(clienteCDTDigitalTypeResponse);
            ClienteCDTDigital cliente = clienteCDTDigitalDao.findById(id);
            cliente.setTipoTelefonoPrincipal(clienteUpdate.getTipoTelefonoPrincipal());
            cliente.setTelefonoPrincipal(clienteUpdate.getTelefonoPrincipal());
            cliente.setTipoCorreoElectronico(clienteUpdate.getTipoCorreoElectronico());
            LOG.info("Fin actualizarClienteCDTDigital impl");
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo actualizarClienteCDTDigital Impl" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + "actualizarClienteCDTDigital Impl");
        }
        return clienteCDTDigitalTypeResponse;
    }

    @Transactional
    public void eliminarClienteCDTDigital(Long id) {
        LOG.info("Inicio eliminarClienteCDTDigital impl");
        try {
            clienteCDTDigitalDao.deleteById(id);
            LOG.info("Fin eliminarClienteCDTDigital impl");
        } catch (ApplicationException e) {
            LOG.error("Se presento un error en el metodo eliminarClienteCDTDigital Impl" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + "eliminarClienteCDTDigital Impl");
        }
    }
}
