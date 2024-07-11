package com.alurachallenge.forohub.domain.topicos;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        String id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaCreacion,
        @NotNull
        Status status,
        @NotBlank
        String autor,
        @NotNull
        Curso curso,
        @NotBlank
        String respuestas
) {
}
