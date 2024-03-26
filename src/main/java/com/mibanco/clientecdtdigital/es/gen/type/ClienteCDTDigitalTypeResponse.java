package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteCDTDigitalTypeResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-26T12:28:23.145806400-05:00[America/Bogota]", comments = "Generator version: 7.4.0")
public class ClienteCDTDigitalTypeResponse   {
  private @Valid String tipoTelefonoPrincipal;
  private @Valid String telefonoPrincipal;
  private @Valid String tipoCorreoElectronico;

  /**
   **/
  public ClienteCDTDigitalTypeResponse tipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    return this;
  }

  
  @JsonProperty("tipoTelefonoPrincipal")
  public String getTipoTelefonoPrincipal() {
    return tipoTelefonoPrincipal;
  }

  @JsonProperty("tipoTelefonoPrincipal")
  public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalTypeResponse telefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
    return this;
  }

  
  @JsonProperty("telefonoPrincipal")
  public String getTelefonoPrincipal() {
    return telefonoPrincipal;
  }

  @JsonProperty("telefonoPrincipal")
  public void setTelefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalTypeResponse tipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
    return this;
  }

  
  @JsonProperty("tipoCorreoElectronico")
  public String getTipoCorreoElectronico() {
    return tipoCorreoElectronico;
  }

  @JsonProperty("tipoCorreoElectronico")
  public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse = (ClienteCDTDigitalTypeResponse) o;
    return Objects.equals(this.tipoTelefonoPrincipal, clienteCDTDigitalTypeResponse.tipoTelefonoPrincipal) &&
        Objects.equals(this.telefonoPrincipal, clienteCDTDigitalTypeResponse.telefonoPrincipal) &&
        Objects.equals(this.tipoCorreoElectronico, clienteCDTDigitalTypeResponse.tipoCorreoElectronico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoTelefonoPrincipal, telefonoPrincipal, tipoCorreoElectronico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteCDTDigitalTypeResponse {\n");
    
    sb.append("    tipoTelefonoPrincipal: ").append(toIndentedString(tipoTelefonoPrincipal)).append("\n");
    sb.append("    telefonoPrincipal: ").append(toIndentedString(telefonoPrincipal)).append("\n");
    sb.append("    tipoCorreoElectronico: ").append(toIndentedString(tipoCorreoElectronico)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

