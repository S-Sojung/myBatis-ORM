package shop.mtcoding.mybatissetting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatissetting.model.user.User;
import shop.mtcoding.mybatissetting.model.user.UserRepository;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        User user = userRepository.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
