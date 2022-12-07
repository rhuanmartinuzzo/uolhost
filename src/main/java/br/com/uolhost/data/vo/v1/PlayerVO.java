package br.com.uolhost.data.vo.v1;


import com.github.dozermapper.core.Mapping;

import java.io.Serializable;
import java.util.Objects;

public class PlayerVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Mapping("id")
    private Long key;

    private String name;

    private String email;

    private Long telefone;

    private String codinome;

    private String grupo;

    public PlayerVO(){}

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
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
        if (!(o instanceof PlayerVO playerVO)) return false;

        if (!Objects.equals(key, playerVO.key)) return false;
        if (!Objects.equals(name, playerVO.name)) return false;
        if (!Objects.equals(email, playerVO.email)) return false;
        if (!Objects.equals(telefone, playerVO.telefone)) return false;
        if (!Objects.equals(codinome, playerVO.codinome)) return false;
        return Objects.equals(grupo, playerVO.grupo);
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (codinome != null ? codinome.hashCode() : 0);
        result = 31 * result + (grupo != null ? grupo.hashCode() : 0);
        return result;
    }
}
