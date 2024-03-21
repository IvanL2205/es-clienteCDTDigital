package com.mibanco.clientecdtdigital.es.service.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import jakarta.transaction.Transactional;

public interface IClienteCDTDigital {
    @Transactional
    public ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalType ClienteCDTDigitalType);

    @Transactional
    public ClienteCDTDigitalTypeResponse actualizarClienteCDTDigital(Long id, ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse);

    @Transactional
    public void eliminarClienteCDTDigital(Long id);
}
