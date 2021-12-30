package ro.unibuc.springlab8example1.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToMany(targetEntity=User.class, mappedBy="course",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @OneToMany(targetEntity=User.class, mappedBy="course",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

}
