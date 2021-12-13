package ro.unibuc.springlab8example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.springlab8example1.domain.User;
import ro.unibuc.springlab8example1.domain.UserType;
import ro.unibuc.springlab8example1.dto.UserDto;
import ro.unibuc.springlab8example1.mapper.UserMapper;
import ro.unibuc.springlab8example1.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserDto create(UserDto userDto, UserType type) {
        User user = userMapper.mapToEntity(userDto);
        user.setUserType(type);
        User savedUser = userRepository.save(user);

        return userMapper.mapToDto(savedUser);
    }

    public UserDto getOne(String username) {
        return userMapper.mapToDto(userRepository.get(username));
    }

    //TODO

    public UserDto update(UserDto userDto, UserType type) {
        User user = userMapper.mapToEntity(userDto);
        user.setUserType(type);
        User updatedUser = userRepository.update(user);

        return userMapper.mapToDto(updatedUser);
    }

    public UserDto delete(String username) {
        return userMapper.mapToDto(userRepository.delete(username));
    }

    public List<UserDto> getAll(String type) {
        List<User> users = userRepository.getByType(type);
        List<UserDto> userDtos = new ArrayList<>();
        for(User user : users) {
            userDtos.add(userMapper.mapToDto(user));
        }
        return userDtos;
    }

}
