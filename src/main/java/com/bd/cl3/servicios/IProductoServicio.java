package com.bd.cl3.servicios;

import java.util.List;

import com.bd.cl3.modelo.Producto;

public interface IProductoServicio {
	public List<Producto> ListadoProducto();
	public void RegistrarProducto(Producto p);
	public Producto BuscarProducto(Integer id);
	public void BorrarProducto(Integer id);
}
