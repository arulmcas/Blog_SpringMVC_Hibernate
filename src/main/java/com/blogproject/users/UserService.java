package com.blogproject.users;

import com.blogproject.address.Address;
import com.blogproject.address.AddressService;

import java.util.function.Function;

public class UserService {

    private UserRepository userRepository = new UserRepository();
    private AddressService addressService = new AddressService();

    public User createUser(UserDTO userDTO) {
        //Do Address creation
        Address address = addressService.createAddress(userDTO.getAddress());
        User user = mapUserDTOtoUser.apply(userDTO);
        user.setAddress(address);
        User user1 = userRepository.createUser(user);

        return user1;
    }

    Function<UserDTO, User> mapUserDTOtoUser = (userdto) -> {
        User user = new User();
        user.setEmail(userdto.getEmail());
        user.setLocation(userdto.getLocation());
        user.setName(userdto.getName());
        return user;
    };
}
