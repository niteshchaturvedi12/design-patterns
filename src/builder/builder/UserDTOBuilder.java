package builder.builder;

import builder.dto.UserDTO;
import builder.entity.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {
    /*
    * methods to build parts of UserDTO
    * */
    UserDTOBuilder withFirstName(String fName);
    UserDTOBuilder withLastName(String lName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    /*
    * methods to assemble final UserDTO object
    * */
    UserDTO build();

    /*
    * this is optional method to fetch already created object
    * */
    UserDTO getUserDTO();
}
