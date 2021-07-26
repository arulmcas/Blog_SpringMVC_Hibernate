package com.blogproject.users;

import com.blogproject.address.AddressDTO;

public class UserController {

    public static UserService userService = new UserService();

    public static void main(String[] args) {

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setLandmark("thiruvalluvar nagar");
        addressDTO.setStreetaddress("nearby vinayagar temple");
        addressDTO.setZip("600081");

        UserDTO userDTO = new UserDTO();
        userDTO.setName("Kumaran");
        userDTO.setLocation("chennai");
        userDTO.setEmail("c.kumaran.kumaran@gmail.com");
        userDTO.setAddress(addressDTO);

        User user = userService.createUser(userDTO);
        System.out.println(user);
    }
}
