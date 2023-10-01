package com.app.InkaManu.Model.Service;

import java.util.List;

import com.app.InkaManu.Model.DTO.ProductoDTO;
import com.app.InkaManu.Model.Entity.Producto;

public interface ProductoService {
    Producto saveProduct(Producto producto);

    Producto getProductById(int producotId);

    List<Producto> getAllProducts();

    void updateProduct(ProductoDTO producto);

    void deleteProduct(int productoId);
}
