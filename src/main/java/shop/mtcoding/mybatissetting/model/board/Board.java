package shop.mtcoding.mybatissetting.model.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.mybatissetting.model.user.User;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private User user;
    private Timestamp createdAt;
}