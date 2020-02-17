package com.donalo.donalo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donalo.donalo.entidades.Publicacion;

public interface PublicacionRepositorio extends JpaRepository <Publicacion,String>  {

}
