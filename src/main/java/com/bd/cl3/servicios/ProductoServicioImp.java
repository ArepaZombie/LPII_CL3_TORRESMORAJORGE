package com.bd.cl3.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.cl3.modelo.Producto;
import com.bd.cl3.repositorio.IProducto;

@Service
public class ProductoServicioImp implements IProductoServicio {
	@Autowired
	private IProducto iproducto;
	
	@Override
	public List<Producto> ListadoProducto() {
		// TODO Auto-generated method stub
		return (List<Producto>) iproducto.findAll();
	}

	@Override
	public void RegistrarProducto(Producto p) {
		// TODO Auto-generated method stub
		iproducto.save(p);

	}

	@Override
	public Producto BuscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return iproducto.findById(id).orElse(null);
	}

	@Override
	public void BorrarProducto(Integer id) {
		// TODO Auto-generated method stub
		iproducto.deleteById(id);
	}

}
