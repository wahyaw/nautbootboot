package com.example.dto;

import com.example.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private Integer id;
    private String username;

    public UserResponseDto(UserEntity entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
    }
}
