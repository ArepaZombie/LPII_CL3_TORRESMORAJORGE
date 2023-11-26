package com.bd.cl3.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.autos.modelo.ClassAuto;
import com.bd.cl3.modelo.Producto;
import com.bd.cl3.servicios.ProductoServicioImp;

@Controller
@RequestMapping("/Producto")
public class ProductoController {
	@Autowired
	private ProductoServicioImp servicio;
	
	@GetMapping("/Listado")
	public String ListadoProductos(Model modelo) {
		//sacamos la data
		List<Producto> lista = servicio.ListadoProducto();
		
		//enviar a la vista
		modelo.addAttribute("lista",lista);
		
		//vamos a la vista
		return "Vistas/Producto/ListadoProducto";
	}
	
	//REGISTRAR
	@GetMapping("/Registrar")
	public String RegistrarProducto(Model model) {
		//realizamos la respectiva instancia
		Producto p = new Producto();
		//enviamos objeto a la vista
		model.addAttribute("producto",p);
		//retornar a la vista
		return "Vistas/Producto/FrmProducto";
	}//fin registrarauto
	
}
