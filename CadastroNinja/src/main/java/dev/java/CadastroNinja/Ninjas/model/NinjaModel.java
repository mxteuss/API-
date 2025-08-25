package dev.java.CadastroNinja.Ninjas.model;

import dev.java.CadastroNinja.Ninjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String email;
    // @ManyToOne O ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key
    private MissoesModel missoes;
}
