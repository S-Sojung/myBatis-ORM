package shop.mtcoding.mybatissetting.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user;
    private Timestamp createdAt;
}
