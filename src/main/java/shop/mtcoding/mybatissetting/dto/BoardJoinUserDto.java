package shop.mtcoding.mybatissetting.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
}
