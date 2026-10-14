package com.jesusviloria.imc.dominio.vo;

import com.jesusviloria.imc.dominio.excepciones.PesoIncorrectoException;

public record Peso(double valor) {
    public Peso {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new PesoIncorrectoException("El peso debe ser un número finito mayor que cero.");
        }
    }
}
