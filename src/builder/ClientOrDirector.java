package builder;

import builder.builder.UserWebDTOBuilder;
import builder.dto.UserDTO;
import builder.entity.Address;
import builder.entity.User;

import java.time.LocalDate;

public class ClientOrDirector {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO dto = new UserWebDTOBuilder().withFirstName(user.getFirstName())
                .withLastName(user.getLastName()).withBirthday(user.getBirthDay())
                .withAddress(user.getAddress()).build();
        System.out.println(dto);
    }

    public static final User createUser() {
        User user = new User();
        user.setBirthDay(LocalDate.of(1960,5,6));
        user.setFirstName("Rameshwar");
        user.setLastName("Chaturvedi");
        Address address = new Address();
        address.setHouseNumber("155");
        address.setStreet("Janta Colony");
        address.setCity("Deoli");
        address.setState("Rajasthan");
        address.setZipCode("304804");
        user.setAddress(address);
        return user;
    }
}