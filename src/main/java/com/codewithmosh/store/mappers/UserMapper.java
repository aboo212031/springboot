package com.codewithmosh.store.mappers;

import com.codewithmosh.store.dtos.RegisterUserRequest;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
// import org.mapstruct.Mapping;

import com.codewithmosh.store.dtos.UpdateUserRequest;
import com.codewithmosh.store.dtos.UserDto;
import com.codewithmosh.store.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // @Mapping(target="createdAt", expression="java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request,@MappingTarget User user);
}

