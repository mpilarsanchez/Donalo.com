package com.donalo.donalo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.donalo.donalo.entidades.Mensaje;

public interface MensajeRepositorio extends JpaRepository <Mensaje,String>  {

}
