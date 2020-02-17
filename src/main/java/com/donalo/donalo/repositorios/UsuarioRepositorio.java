package com.donalo.donalo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donalo.donalo.entidades.Usuario;



public interface UsuarioRepositorio extends JpaRepository <Usuario,String>  {

}
