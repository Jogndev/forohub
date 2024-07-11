package com.alurachallenge.forohub.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, String status, String autor, String curso) {

}
