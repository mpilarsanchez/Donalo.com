package com.donalo.donalo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donalo.donalo.entidades.Foto;

public interface Fotorepositorio extends JpaRepository <Foto,String> {

}
