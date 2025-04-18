package com.lazaro.comprecoisas.repository;

import com.lazaro.comprecoisas.model.Categoria;
import com.lazaro.comprecoisas.model.Produto;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findProdutoBySubCategoria(Categoria subCategoria);
}
