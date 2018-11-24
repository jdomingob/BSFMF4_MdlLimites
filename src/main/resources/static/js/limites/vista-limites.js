var json = [
    {
        "id": 1,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$6,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2017",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 2,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$8,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 3,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "INACTIVO",
        "importe": "$10,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 4,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "INACTIVO",
        "importe": "$110,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 5,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "CANCELADO",
        "importe": "$1,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 6,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "CANCELADO",
        "importe": "$13,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 7,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "INACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 8,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "VENCIDO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 9,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "VENCIDO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 10,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "ACTIVO",
        "importe": "$14,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    },
    {
        "id": 11,
        "tipoAutorización": "AUTORIZACIÓN MASIVA",
        "situación": "INACTIVO",
        "importe": "$60,000.00",
        "fechaAlta": "01/09/2015",
        "fechaVto": "01/10/2018",
        "cOperaciones": "123",
        "concepto": "asdadsf",
        "numAutorizacion": "123",
        "empleado": "654321"
    }];
var clean = [{}];
// var acuerdo = {
//     acuerdo:  "0070718920",
//     centro:  5029,
//     moneda:  "MXN",
//     nombre:  "LUIS PEREZ MOTA"
// }
var campoSeleccionado;
//inicia document Ready
$(document).ready(function () {
    cargarTablaLimites();
    // $('#txtAcuerdo').on("cut copy paste",function(e) {
    //     e.preventDefault("");
    // });

});

$('#tablaAutorizacion').on('click', 'tr', function () {
    var table = $('#tablaAutorizacion').DataTable();
    campoSeleccionado = table.row(this).data();
    seleccionarLimite();
});

function cargarAcuerdo(acuerdo) {
    $('#txtCentro').val(acuerdo.centro);
    $('#txtMoneda').val(acuerdo.moneda);
    $('#txtPrimerTitular').val(acuerdo.nombre);
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
                $('#datosLimite input[type=text]').prop('disabled', true);
                $('#datosLimite select').prop('disabled', true);
                $('#txtAcuerdoSelec').val($('#txtAcuerdo').val());
                $('#txtCentroSelect').val($('#txtCentro').val());
                $('#txtMonedaSelect').val($('#txtMoneda').val());
                $('#txtPrimerTitularSelect').val($('#txtPrimerTitular').val());
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

    $('#datosLimite input[type=text]').val("");
    $('#datosLimite input[type=number]').val("");
    $('#datosLimite input[type=text]').prop('disabled', false);
    $('#datosLimite select').prop('disabled', false);
    $('#selectMonedasModalSelect').val("-1").selectpicker("refresh");
    $('#selectCOperaciones').val("-1").selectpicker("refresh");
    $('#txtAcuerdoSelec').val($('#txtAcuerdo').val());
    $('#txtCentroSelect').val($('#txtCentro').val());
    $('#txtMonedaSelect').val($('#txtMoneda').val());
    $('#txtPrimerTitularSelect').val($('#txtPrimerTitular').val());
    $("#modalSeleccionarLimite").modal({backdrop: false});
    $('#txtAcuerdoSelec').prop('disabled', true);
    $('#txtCentroSelect').prop('disabled', true);
    $('#txtMonedaSelect').prop('disabled', true);
    $('#txtPrimerTitularSelect').prop('disabled', true);
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

$('#txtAcuerdo').bind("enterKey",function(e){
    var acuerdo =  $('#txtAcuerdo').val();
    var request = {acuerdo: acuerdo};
    $.ajax({
        contentType: 'application/json; charset=UTF-8',
        data: JSON.stringify(request),
        url: "/BsfLimites/consultaDatosPorAcuerdo",
        type: "post",
        beforeSend: function () {
            mostrarBarraProgreso();
        },
        success: function (data) {
            CerrarBarraProgreso();
            console.log(data);
            cargarAcuerdo(data);
        },
        error: function (data) {
            CerrarBarraProgreso();
            Mensaje("No se encuentra el acuerdo" + data);
        }
    });
});
$('#txtAcuerdo').keyup(function(e){
    if(e.keyCode == 13)
    {
        $(this).trigger("enterKey");
    }
});

function consultarLimites(){

    if($('#txtAcuerdo').val()){
        // cargarAcuerdo();
        cargarTablaLimites(json);
        $('#nuevoLimite').prop('disabled',false);
    }else{
        $('input[type=text]').val("");
        $('input[type=number]').val("");
        Mensaje("No se encuentra el acuerdo");
        var tabla = $('#tablaAutorizacion').DataTable();
        tabla.clear().draw();
        $('#nuevoLimite').prop('disabled',true);
        $('#selectMonedas').val("-1").selectpicker("refresh");
        $('#selectTipoSeleccion').val("-1").selectpicker("refresh");

    }
}

var table;
function cargarTablaLimites(datos) {
     table = $('#tablaAutorizacion').DataTable(
        {
            searching: false,
            data: datos,
            select: true,
            // bPaginate: false,
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
                {"data": "fechaVto"},
                {"data": "cOperaciones"},
                {"data": "concepto"},
                {"data": "numAutorizacion"},
                {"data": "empleado"}
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