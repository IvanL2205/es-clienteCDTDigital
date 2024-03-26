package com.mibanco.clientecdtdigital.es.gen.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-26T09:50:00.574497500-05:00[America/Bogota]", comments = "Generator version: 7.4.0")
public interface V1ClientecdtdigitalApi {

    @PUT
    @Path("/ClienteCDTDigital/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response actualizarClienteCDTDigital(@PathParam("id") @Min(1) Integer id,@Valid ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse);

    @POST
    @Path("/ClienteCDTDigital")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response crearClienteCDTDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);

    @DELETE
    @Path("/eliminar/ClienteCDTDigital/{id}")
    Response eliminarClienteCDTDigital(@PathParam("id") @Min(1) Integer id);
}
