package com.curso.boot.domain;


import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "FUNCIONARIOS")
public class Funcionario extends  AbstractEntity<Long> {


    @Column(nullable = false, unique = true)
    private String nome;

    @NumberFormat(style = NumberFormat.Style.CURRENCY, pattern = "#,##0.00")

    @Column(nullable = false, columnDefinition = "DECIMAL (7,2) DEFAULT 0.00")
    private BigDecimal salario;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name = "data_saida", columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datasaida;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    private Cargo cargo;

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) { this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada (LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() { return datasaida;
    }

    public void setDataSaida (LocalDate datasaida) { this.datasaida = datasaida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() { return cargo;
    }

    public void setCargo (Cargo cargo) { this.cargo = cargo;
}


}
