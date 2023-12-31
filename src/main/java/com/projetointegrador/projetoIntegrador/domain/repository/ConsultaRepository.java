package com.projetointegrador.projetoIntegrador.domain.repository;

import com.projetointegrador.projetoIntegrador.domain.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, UUID> {
    Optional<Consulta> findById(UUID id);

}

