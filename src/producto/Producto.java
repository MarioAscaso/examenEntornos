package producto;

import java.util.UUID;

public class Producto {

    UUID uuid;
    String referencia;
    byte numUnidades;
    String fechaCreacion;
    String fechaModificacion;

    public Producto(UUID uuid, String referencia, byte numUnidades,  String fechaCreacion) {
        this.uuid = UUID.randomUUID();
        this.referencia = referencia;
        this.numUnidades = numUnidades;
        this.fechaCreacion = fechaCreacion;
    }

    public Producto(UUID uuid, String referencia, byte numUnidades,  String fechaCreacion, String fechaModificacion) {
        this.uuid = UUID.randomUUID();
        this.referencia = referencia;
        this.numUnidades = numUnidades;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
}
