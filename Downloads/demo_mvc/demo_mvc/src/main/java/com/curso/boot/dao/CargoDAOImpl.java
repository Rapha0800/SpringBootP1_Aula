package com.curso.boot.dao;

import org.springframework.stereotype. Repository;
import com.curso.boot.domain.Cargo;

@Repository
public class CargoDAOImpl extends AbstractDAO <Cargo, Long> implements CargoDAO{
}
