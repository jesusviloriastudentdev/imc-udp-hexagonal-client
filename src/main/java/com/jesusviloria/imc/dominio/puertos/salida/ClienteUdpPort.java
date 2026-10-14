package com.jesusviloria.imc.dominio.puertos.salida;

import com.jesusviloria.imc.aplicacion.excepciones.ClienteRedException;
import com.jesusviloria.imc.dominio.modelos.DatosImc;
import com.jesusviloria.imc.dominio.modelos.ResultadoImc;
import com.jesusviloria.imc.dominio.vo.DestinoServidor;

public interface ClienteUdpPort {
    void conectar(DestinoServidor destino) throws ClienteRedException;

    void desconectar() throws ClienteRedException;

    ResultadoImc solicitarCalculo(DatosImc datos) throws ClienteRedException;

    boolean estaConectado();
}
