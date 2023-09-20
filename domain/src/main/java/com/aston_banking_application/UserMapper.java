package com.aston_banking_application;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserDto toUserDto(User user);
	User toUser(UserDto userDto);

}
