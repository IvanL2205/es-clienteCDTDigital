package com.mibanco.clientecdtdigital.es.utils;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;
@ApplicationScoped
public class ClienteCDTDigitalMapper {

    public ClienteCDTDigital clienteCDTDigitalTypeToEntity(ClienteCDTDigitalType ClienteCDTDigitalType){
        return new ModelMapper().map(ClienteCDTDigitalType, ClienteCDTDigital.class);
    }

    public ClienteCDTDigital clienteCDTDigitalTypeResponseToEntity(ClienteCDTDigitalTypeResponse ClienteCDTDigitalTypeResponse){
        return new ModelMapper().map(ClienteCDTDigitalTypeResponse, ClienteCDTDigital.class);
    }


}
