package builder.builder;

import builder.dto.UserDTO;
import builder.dto.UserWebDTO;
import builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());
        age = Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber()+", "+address.getStreet()+"\n"
                +address.getCity()+", "+address.getState()+"\n"
                +address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}