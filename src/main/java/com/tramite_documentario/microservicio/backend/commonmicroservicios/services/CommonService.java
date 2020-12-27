package com.tramite_documentario.microservicio.backend.commonmicroservicios.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CommonService<E> {
    public E save(E entity);

    public Iterable<E> findAll();

    //Para hacer paginación
    public Page<E> findAll(Pageable pageable);

    public Optional<E> findById(Long id);


    public void deleteById(Long id);
}
