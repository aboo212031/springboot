package com.codewithmosh.store.dtos;

import java.time.LocalDateTime;

// import com.fasterxml.jackson.annotation.JsonFormat;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonInclude;
// import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    // @JsonProperty("user_id")
    private Long id;
    private String name;
    private String email;
    // @JsonInclude(JsonInclude.Include.NON_NULL)
    // private String phoneNumber;
    // @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    // private LocalDateTime createdAt;
}
