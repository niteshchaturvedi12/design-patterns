package solid.srp;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
* this class is focused on  a single functionality
* SRP says that one class should address a specific concern*/
public class UserController {
    private final ObjectMapper mapper;

    public UserController(ObjectMapper mapper) {
        this.mapper = mapper;
    }
}
