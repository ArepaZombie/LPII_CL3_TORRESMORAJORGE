package com.bd.cl3.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.cl3.modelo.Producto;

public interface IProducto extends CrudRepository<Producto, Integer> {

}
