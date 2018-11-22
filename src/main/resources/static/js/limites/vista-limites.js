var json = [
    {
        "id": 1,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$6,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2017"
    },
    {
        "id": 2,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$8,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 3,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$10,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 4,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "NO ACTIVO",
        "importe": "$110,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 5,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "NO ACTIVO",
        "importe": "$1,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 6,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "NO ACTIVO",
        "importe": "$13,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 7,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 8,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 9,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 10,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    },
    {
        "id": 11,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "NO ACTIVO",
        "importe": "$60,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018"
    }];
var acuerdo = {
    acuerdo:  "0070718920",
    centro:  5029,
    moneda:  "MXN",
    primerTitular:  "LUIS PEREZ MOTA"
}
var campoSeleccionado;
//inicia document Ready
$(document).ready(function () {
    // cargarTablaLimites(json);
    cargarAcuerdo();
});

$('#tablaAutorizacion').on('click', 'tr', function () {
    var table = $('#tablaAutorizacion').DataTable();
    campoSeleccionado = table.row(this).data();
    seleccionarLimite();
});

function cargarAcuerdo() {
    $('#txtAcuerdo').val(acuerdo.acuerdo);
    $('#txtCentro').val(acuerdo.centro);
    $('#txtMoneda').val(acuerdo.moneda);
    $('#txtPrimerTitular').val(acuerdo.primerTitular);
}

function seleccionarLimite() {
    $('#txtAcuerdoSelec').prop('disabled', true);
    $('#txtCentroSelect').prop('disabled', true);
    $('#txtMonedaSelect').prop('disabled', true);
    $('#txtPrimerTitularSelect').prop('disabled', true);
    $('#btnBuscarLimite').addClass('hide');
    $('#btnSuprimir').removeClass('hide');
    if (!campoSeleccionado) {
        if (typeof campoSeleccionado === 'undefined') {
            return;
        } else {
            msjAlerta("Seleccione un campo");
        }
    } else {
        $("#modalSeleccionarLimite").modal({backdrop: false})
                // $('#').val(campoSeleccionado.tipoAutorización);
                // $('input[type=text]').val("");
                $('#txtAcuerdoSelec').val(acuerdo.acuerdo);
                $('#txtCentroSelect').val(acuerdo.centro);
                $('#txtMonedaSelect').val(acuerdo.moneda);
                $('#txtPrimerTitularSelect').val(acuerdo.primerTitular);
                $('#txtSituacion').val(campoSeleccionado.situación);
                $('#txtImporteAut').val(campoSeleccionado.importe);
                $('#txtFechaAlta').val(campoSeleccionado.fechaAlta);
                $('#txtFechaVencimiento').val(campoSeleccionado.fechaVto);
        $("#modalSeleccionarLimite").on('hide.bs.modal', function () {
                campoSeleccionado = "";
            });
    }
}

function nuevoLimite() {
    $('#modalSeleccionarLimite input[type=text]').val("");
    $('#modalSeleccionarLimite input[type=number]').val("");
    $("#modalSeleccionarLimite").modal({backdrop: false});
    $('#txtAcuerdoSelec').prop('disabled', false);
    $('#txtCentroSelect').prop('disabled', false);
    $('#txtMonedaSelect').prop('disabled', false);
    $('#txtPrimerTitularSelect').prop('disabled', false);
    $('#btnSuprimir').addClass('hide');
    $('#btnBuscarLimite').removeClass('hide');
}

function suprimirLimite() {
    var request;

    $.ajax({
        contentType: 'application/json; charset=UTF-8',
        data: JSON.stringify(request),
        async: false,
        url: "",
        type: "post",
        beforeSend: function () {
            mostrarBarraProgreso();
        },
        success: function (data) {
            // var myTable = $('#tablaAutorizacion').DataTable();
            // myTable.row( this ).delete();
            // for(var i in json){
            //     if(campoSeleccionado.id == json[i].id){
            //         json[i].slice(i,0);
            //     }
            // }
            // cargarTablaLimites(json);
            // $('#tablaAutorizacion tbody').on( 'click', 'img.icon-delete', function () {
            //     table
            //         .row( $(this).parents('tr') )
            //         .remove()
            //         .draw();
            // } );
            CerrarBarraProgreso();
        },
        error: function (data) {
            CerrarBarraProgreso();
            Mensaje("Ocurrio un error: " + data.mensaje,"error","");
        }
    });
}

function consultarLimites(){
    cargarTablaLimites(json)
}

var table;
function cargarTablaLimites(datos) {
     table = $('#tablaAutorizacion').DataTable(
        {
            searching: false,
            data: datos,
            select: true,
            language: {
                select: {
                    rows: {
                        _: " Has seleccionado %d campo(s).",
                        0: " Click en un campo para mostrar su información.",
                        1: " Un campo seleccionado."
                    }
                }
            },
            "columns": [
                {"data": "tipoAutorización"},
                {"data": "situación"},
                {"data": "importe"},
                {"data": "fechaAlta"},
                {"data": "fechaVto"}
            ]
        });
}


function buscarRelPersona() {

    // if (validarCampos()) {
        var numSecAc = 70719620;
        var numSec = 0;
        var stdChar10 = "ACTIVO";
        var busquedaRequest = {
            usuario:"DESA0003",
            password:"CAPAP023",
            entidad:"0166",
            terminal:"12502904",
            numSecAc:"70719620",
            numSec:"0",
            stdChar10:"ACTIVO"
        };
        console.log(JSON.stringify(busquedaRequest));
        $.ajax({
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(busquedaRequest),
            url: "http://172.26.9.65:8288/wsBsfLimitesDescubiertosEx/consulta-limite",
            type: "post",
            beforeSend: function () {
                mostrarBarraProgreso();
            },
            success: function (data) {
                CerrarBarraProgreso();
                if (!data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS) {
                    Mensaje("No se encuentra a la persona","warning","");
                    $("#relacionPersona").addClass("hide");
                }
                else {
                    $("#relacionPersona").removeClass("hide");
                    $("#relacionPersonaMoral").addClass("hide");
                    if (data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS.hasOwnProperty(length)) {
                        console.log(data);
                        for (var i in  data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS) {
                            if (!data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i].IDENTIFICACION) {
                                data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i].IDENTIFICACION = clvCatalogo;
                            }
                        }

                        for (var i in  data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS) {
                            if (data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i].IDENTIFICACION) {
                                data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i].IDENTIFICACION = convertirCodigoIdentificacion(data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i].IDENTIFICACION);
                            }
                        }
                        cargarTablaLimites(data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS);

                    }
                    else {
                        console.log(data);
                        if (!data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS.ID_INTERNO_PE) {
                            $("#relacionPersona").addClass("hide");
                            Mensaje("Ocurrió un error inesperado, revise los datos y el inicio de sesión","warning","");
                            if (data.BusquedaPersonaResponse.return.RESPONSE.ERROR_DESC) {
                                console.log(data.BusquedaPersonaResponse.return.RESPONSE.ERROR_DESC);
                            }
                        } else {
                            var busquedaLimpia = [];
                            for (var i in data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS) {
                                if (data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i]) {
                                    busquedaLimpia[i] = data.BusquedaPersonaResponse.return.RESPONSE.PERSONA.DATOS[i];
                                }
                            }
                            if (!busquedaLimpia.IDENTIFICACION) {
                                busquedaLimpia.IDENTIFICACION = clvCatalogo;
                            }
                            busquedaLimpia.IDENTIFICACION = convertirCodigoIdentificacion(busquedaLimpia.IDENTIFICACION);
                            var busqueda = [];
                            busqueda[0] = busquedaLimpia;
                            cargarTablaLimites(busqueda);

                        }
                    }

                }
            },
            error: function (data) {
                CerrarBarraProgreso();
                Mensaje("Aviso: " + data.mensaje,"error","");
            }
        });
    // }

}

function post(path, parameters) {
    var form = $('<form></form>');

    form.attr("method", "post");
    form.attr("action", path);

    $.each(parameters, function(key, value) {
        var field = $('<input></input>');

        field.attr("type", "hidden");
        field.attr("name", key);
        field.attr("value", value);

        form.append(field);
    });

    // The form needs to be a part of the document in
    // order for us to be able to submit it.
    $(document.body).append(form);
    form.submit();
}