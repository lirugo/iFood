package ua.iFood.service;

import ua.iFood.entity.User;
import ua.iFood.entity.UserDto;

public interface UserService {
    User registerNewUserAccount(UserDto userDto) throws Exception;
}
