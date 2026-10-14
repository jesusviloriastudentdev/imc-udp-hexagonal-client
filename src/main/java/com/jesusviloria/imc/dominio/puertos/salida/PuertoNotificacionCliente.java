package com.jesusviloria.imc.dominio.puertos.salida;

import com.jesusviloria.imc.dominio.enums.EstadoConexion;
import com.jesusviloria.imc.dominio.modelos.EventoCliente;
import com.jesusviloria.imc.dominio.modelos.ResultadoImc;

public interface PuertoNotificacionCliente {
    void notificarEstado(EstadoConexion estado, String endpoint);

    void notificarEvento(EventoCliente evento);

    void notificarResultado(ResultadoImc resultado);

    void notificarError(String mensaje);
}
