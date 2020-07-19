package com.springprojects.service.impl;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.dto.UserDto;
import com.springprojects.entity.Address;
import com.springprojects.entity.User;
import com.springprojects.repo.AddressRepository;
import com.springprojects.repo.UserRepository;
import com.springprojects.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    @Override
    @Transactional
    public UserDto save(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        userRepository.save(user);

        List<Address> addressList = new ArrayList<>();
        userDto.getAddressList().forEach(item -> {
            Address address = new Address();
            address.setAddress(item);
            address.setAddressType(Address.AddressType.OTHER);
            address.setActive(true);
            address.setUser(user);

            addressList.add(address);
        });

        addressRepository.saveAll(addressList);
        userDto.setId(user.getId());
        return userDto;
    }

    @Override
    public UserDto getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()){
            return null;
        }
        User user = userOptional.get();

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setAddressList(user.getAddressList().stream()
                .map(Address::getAddress).collect(Collectors.toList()));

        return userDto;
    }

    @Override
    public List<UserDto> getAll() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        userList.forEach( user -> {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setSurname(user.getSurname());
            userDto.setAddressList(user.getAddressList().stream()
                    .map(Address::getAddress).collect(Collectors.toList()));
            userDtoList.add(userDto);
        } );
        return userDtoList;
    }
}
