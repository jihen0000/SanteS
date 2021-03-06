package com.bri.santeS.entities;

import javax.persistence.*;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@CrossOrigin(origins = "*")
@Entity
@DiscriminatorValue(value = "BU")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Bureau extends ElementChambre{
    public Bureau(boolean nombreAdequat, boolean etatPropre, boolean etatActive) {
        super(nombreAdequat, etatPropre, etatActive);
        // TODO Auto-generated constructor stub
    }

    public Bureau() {
        super();
        // TODO Auto-generated constructor stub
    }

}
