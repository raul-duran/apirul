package fca.suayed.dto;

import java.sql.Date;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class OrdenesDto {
    private Long id;
    private Long cliente_id;
    private Long producto_id;
    private Integer cantidad;
    private String fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("cliente_id")
    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    @ColumnName("producto_id")
    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    @ColumnName("cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    @ColumnName("fecha")
    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
