package com.jesusviloria.imc.aplicacion.puertos.entrada;

import com.jesusviloria.imc.aplicacion.dto.CalcularImcCommand;
import com.jesusviloria.imc.dominio.modelos.ResultadoImc;

import java.util.concurrent.CompletableFuture;

public interface CalcularImcInputPort {
    CompletableFuture<ResultadoImc> calcular(CalcularImcCommand comando);
}
