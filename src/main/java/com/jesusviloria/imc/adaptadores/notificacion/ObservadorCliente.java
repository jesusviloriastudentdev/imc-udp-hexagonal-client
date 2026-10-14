package com.jesusviloria.imc.adaptadores.notificacion;

import com.jesusviloria.imc.dominio.enums.EstadoConexion;
import com.jesusviloria.imc.dominio.modelos.EventoCliente;
import com.jesusviloria.imc.dominio.modelos.ResultadoImc;

public interface ObservadorCliente {
    void onEstado(EstadoConexion estado, String endpoint);

    void onEvento(EventoCliente evento);

    void onResultado(ResultadoImc resultado);

    void onError(String mensaje);
}
