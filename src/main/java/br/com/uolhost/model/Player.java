package br.com.uolhost.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "players")
public class Player implements Serializable {

    private static final long serialVersionUID = 7316762802971383667L;

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private Long telefone;

    @Column(name = "codinome")
    private String codinome;

    @Column(name = "grupo")
    private String grupo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;

        if (!Objects.equals(id, player.id)) return false;
        if (!Objects.equals(name, player.name)) return false;
        if (!Objects.equals(email, player.email)) return false;
        if (!Objects.equals(telefone, player.telefone)) return false;
        if (!Objects.equals(codinome, player.codinome)) return false;
        return Objects.equals(grupo, player.grupo);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (codinome != null ? codinome.hashCode() : 0);
        result = 31 * result + (grupo != null ? grupo.hashCode() : 0);
        return result;
    }
}
