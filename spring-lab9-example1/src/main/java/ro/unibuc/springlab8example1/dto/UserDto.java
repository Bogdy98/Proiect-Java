package ro.unibuc.springlab8example1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.unibuc.springlab8example1.domain.Address;
import ro.unibuc.springlab8example1.domain.Course;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String username;

    private String fullName;

    private String cnp;

    private Integer age;

    private String otherInformation;

    private Long courseId;

    private String address;

    private AddressDto addressDto;

}
