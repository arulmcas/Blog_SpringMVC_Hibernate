package com.blogproject.address;

import java.util.function.Function;

public class AddressService {

    private AddressRepository addressRepository = new AddressRepository();

    public Address createAddress(AddressDTO addressDTO) {

        Address address = mapAddressDTOToAddress.apply(addressDTO);
        Address address1 = addressRepository.createAddress(address);
        return address1;
    }

    Function<AddressDTO, Address> mapAddressDTOToAddress = (addressDTO) -> {

        Address address = new Address(addressDTO.getStreetaddress(), addressDTO.getZip(), addressDTO.getLandmark());
        return address;
    };
}
