package com.mibanco.clientecdtdigital.es.entity;

import com.mibanco.clientecdtdigital.es.gen.type.*;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Data
@Entity
@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_clientecdtdigital")
public class ClienteCDTDigital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;
    @Column(name = "tipoTelefonoPrincipal")
    private String tipoTelefonoPrincipal;
    @Column(name = "telefonoPrincipal")
    private String telefonoPrincipal;
    @Column(name = "tipoCorreoElectronico")
    private String tipoCorreoElectronico;
    @Column(name = "genero")
    private GeneroEnum genero;
    @Column(name = "fechaNacimientoDia")
    private Integer fechaNacimientoDia;
    @Column(name = "fechaNacimientoMes")
    private Integer fechaNacimientoMes;
    @Column(name = "fechaNacimientoAno")
    private Integer fechaNacimientoAno;
    @Column(name = "lugarNacimientoPais")
    private String lugarNacimientoPais;
    @Column(name = "lugarNacimientoDpto")
    private DepartamentoEnum lugarNacimientoDpto;
    @Column(name = "lugarNacimientoCiudad")
    private CiudadEnum lugarNacimientoCiudad;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "nivelConsulta")
    private String nivelConsulta;
    @Column(name = "fechaExpedicionDocumentoDia")
    private Integer fechaExpedicionDocumentoDia;
    @Column(name = "fechaExpedicionDocumentoMes")
    private Integer fechaExpedicionDocumentoMes;
    @Column(name = "fechaExpedicionDocumentoAno")
    private Integer fechaExpedicionDocumentoAno;
    @Column(name = "expedicionDocumentoPais")
    private String expedicionDocumentoPais;
    @Column(name = "expedicionDocumentoDpto")
    private DepartamentoEnum expedicionDocumentoDpto;
    @Column(name = "expedicionDocumentoCiudad")
    private CiudadEnum expedicionDocumentoCiudad;
    @Column(name = "paisResidencia")
    private String paisResidencia;
    @Column(name = "subActividadEconomica")
    private String subActividadEconomica;
    @Column(name = "ocupacion")
    private String ocupacion;
    @Column(name = "actividadEconomicaCIIU")
    private TipoActividadCIIUEnum actividadEconomicaCIIU;
    @Column(name = "sectorEconomico")
    private String sectorEconomico;
    @Column(name = "registroBiometria")
    private Boolean registroBiometria;
    @Column(name = "causalNoBiometria")
    private Integer causalNoBiometria;
    @Column(name = "direccionPersonal")
    private String direccionPersonal;
    @Column(name = "direccionPersonalPais")
    private String direccionPersonalPais;
    @Column(name = "direccionPersonalDpto")
    private DepartamentoEnum direccionPersonalDpto;
    @Column(name = "direccionPersonalCiudad")
    private CiudadEnum direccionPersonalCiudad;
    @Column(name = "barrioDireccionPersonal")
    private String barrioDireccionPersonal;
    @Column(name = "usoDireccionPersonal")
    private String usoDireccionPersonal;
    @Column(name = "tipoDireccionPersonal")
    private String tipoDireccionPersonal;
    @Column(name = "categoriaDireccionPersonal")
    private String categoriaDireccionPersonal;
    @Column(name = "envioCorrespondencia")
    private String envioCorrespondencia;
    @Column(name = "ingresosMensuales")
    private Integer ingresosMensuales;
    @Column(name = "patrimonio")
    private Integer patrimonio;
    @Column(name = "declaracionOrigenFondos")
    private String declaracionOrigenFondos;
    @Column(name = "reconocimientoPublicoExtranjero")
    private Boolean reconocimientoPublicoExtranjero;
    @Column(name = "reconocimientoPublicoNacional")
    private Boolean reconocimientoPublicoNacional;
    @Column(name = "segmento")
    private String segmento;
    @Column(name = "nicho")
    private String nicho;
    @Column(name = "canalContactoPreferido")
    private String canalContactoPreferido;
    @Column(name = "asesorComercial")
    private Integer asesorComercial;
    @Column(name = "tipoVinculacion")
    private String tipoVinculacion;
    @Column(name = "porqueMedioSeEnteroDeNosotros")
    private String porqueMedioSeEnteroDeNosotros;
    @Column(name = "agenciaVinculacion")
    private Integer agenciaVinculacion;
    @Column(name = "fechaDiligenciamientoFormularioDia")
    private Integer fechaDiligenciamientoFormularioDia;
    @Column(name = "fechaDiligenciamientoFormularioMes")
    private Integer fechaDiligenciamientoFormularioMes;
    @Column(name = "fechaDiligenciamientoFormularioAno")
    private Integer fechaDiligenciamientoFormularioAno;
    @Column(name = "fechaVinculacionDia")
    private Integer fechaVinculacionDia;
    @Column(name = "fechaVinculacionMes")
    private Integer fechaVinculacionMes;
    @Column(name = "fechaVinculacionAno")
    private Integer fechaVinculacionAno;
    @Column(name = "lugarDiligenciamientoFormularioPais")
    private String lugarDiligenciamientoFormularioPais;
    @Column(name = "lugarDiligenciamientoFormularioDpto")
    private DepartamentoEnum lugarDiligenciamientoFormularioDpto;
    @Column(name = "lugarDiligenciamientoFormularioCiudad")
    private CiudadEnum lugarDiligenciamientoFormularioCiudad;
    @Column(name = "residenteFiscalEnOtroPais")
    private Boolean residenteFiscalEnOtroPais;
    @Column(name = "identificacionFiscal1")
    private Integer identificacionFiscal1;
    @Column(name = "direccionExtranjero")
    private Boolean direccionExtranjero;
    @Column(name = "tin1")
    private Integer tin1;
    @Column(name = "residenciaFiscalPais")
    private String residenciaFiscalPais;
    @Column(name = "clasificacionFatca")
    private String clasificacionFatca;
    @Column(name = "fechaClasificacionFatca")
    private String fechaClasificacionFatca;
    @Column(name = "clasificacionCRS")
    private String clasificacionCRS;
    @Column(name = "fechaClasificacionCRS")
    private String fechaClasificacionCRS;
    @Column(name = "autorizacionEnvioCelularCorreo")
    private Boolean autorizacionEnvioCelularCorreo;
    @Column(name = "canalEnvioCelularYCorreo")
    private String canalEnvioCelularYCorreo;
    @Column(name = "productoSolicitado")
    private String productoSolicitado;
    @Column(name = "codigoNovedadListas")
    private String codigoNovedadListas;
}
