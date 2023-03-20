package shop.mtcoding.mybatissetting.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import shop.mtcoding.mybatissetting.dto.BoardDetailOutDto2.UserDto;

@Getter
@Setter
@ToString // dto는 toString 막 붙여도 ok
public class BoardDetailOutDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user; // 얘는 안받아도 됨
    private Timestamp createdAt;

    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}
