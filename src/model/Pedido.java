package model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private BigDecimal valorTotal;

    @Column
    private Date data;

    public Pedido(){

    }
}
