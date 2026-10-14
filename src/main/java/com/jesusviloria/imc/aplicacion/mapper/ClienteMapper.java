package com.jesusviloria.imc.aplicacion.mapper;

import com.jesusviloria.imc.aplicacion.dto.CalcularImcCommand;
import com.jesusviloria.imc.aplicacion.dto.ConectarCommand;
import com.jesusviloria.imc.dominio.modelos.DatosImc;
import com.jesusviloria.imc.dominio.vo.Altura;
import com.jesusviloria.imc.dominio.vo.DestinoServidor;
import com.jesusviloria.imc.dominio.vo.Peso;

import java.util.Objects;

public final class ClienteMapper {
    public DestinoServidor toDestino(final ConectarCommand comando) {
        Objects.requireNonNull(comando, "El comando de conexión es obligatorio.");
        return new DestinoServidor(comando.host(), comando.puerto());
    }

    public DatosImc toDatos(final CalcularImcCommand comando) {
        Objects.requireNonNull(comando, "El comando de cálculo es obligatorio.");
        return new DatosImc(new Peso(comando.peso()), new Altura(comando.altura()));
    }
}
