package gr.housespiffingapp.dto.userDTO;

import gr.housespiffingapp.core.enums.GenderType;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserReadOnlyDTO {

    private Long id;

    private String firstname;

    private String lastname;

    private String username;

    private String password;

    private LocalDate dateOfBirth;

    private GenderType gender;

    private String role;

    private Boolean isActive;

}
