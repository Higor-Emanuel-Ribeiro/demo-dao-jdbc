package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
    
    private Integer id;
    private String name;

    public Department() {
    }
    
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        return Objects.equals(this.id, other.id);
    }
    
    @Override
    public String toString() {
        return "DEPARTMENT = Id: " + id + ", Name: " + name;
    }    
}
