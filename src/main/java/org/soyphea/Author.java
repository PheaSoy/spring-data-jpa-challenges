package org.soyphea;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Slf4j
public class Author {

    @Id
    private Long id;

    private String name;

    @PrePersist
    public void save(){
      log.info("Saving the author with name: {}",this.getName());
    }
    @PreUpdate
    public void update(){
        log.info("Updating the author with name: {}",this.getName());
    }

}
