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

    public String getReferencia() {
        return referencia;
    }

    public byte getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(byte numUnidades) {
        this.numUnidades = numUnidades;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "uuid=" + uuid +
                ", referencia='" + referencia + '\'' +
                ", numUnidades=" + numUnidades +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", fechaModificacion='" + fechaModificacion + '\'' +
                '}';
    }
}
