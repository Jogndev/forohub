package com.alurachallenge.forohub.domain.topicos;

public record DatosListadoTopico(String titulo, String mensaje, String fechaCreacion, String status, String autor,
                                 String curso) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus().name(), topico.getAutor(), topico.getCurso().name());
    }
}
