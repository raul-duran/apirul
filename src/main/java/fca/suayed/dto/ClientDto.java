package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @ColumnName("apellido_paterno")
    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    @ColumnName("apellido_materno")
    public String getAmaterno() {
        return this.amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }
    
    @ColumnName("rfc")
    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
