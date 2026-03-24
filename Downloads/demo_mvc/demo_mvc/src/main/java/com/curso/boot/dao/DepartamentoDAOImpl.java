package com.curso.boot.dao;

import org.springframework.stereotype.Repository;
import com.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDAOImpl extends AbstractDAO<Departamento, Long> implements DepartamentoDAO {
}