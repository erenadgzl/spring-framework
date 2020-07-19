package com.springprojects.api;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.entity.User;
import com.springprojects.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/{search}")
    public ResponseEntity<List<User>> getAll(@PathVariable String search){
        return ResponseEntity.ok(userRepository.findByNameLikeOrLastnameLike(search, search));
    }

    @PostConstruct
    private void init(){
        User user = new User();
        user.setName("Veysel");
        user.setLastname("Kaya");
        user.setAddress("Merkez Mah. Kadıköy/ISTANBUL");
        user.setBirthDate(Calendar.getInstance().getTime());
        userRepository.save(user);

        User user2 = new User();
        user2.setName("Mehmet");
        user2.setLastname("Yıldız");
        user2.setAddress("Merkez Mah. Üsküdar/ISTANBUL");
        user2.setBirthDate(Calendar.getInstance().getTime());
        userRepository.save(user2);
    }
}
