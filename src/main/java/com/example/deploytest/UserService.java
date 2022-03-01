package com.example.deploytest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;;

    /**
     * 유저 등록
     * @return 유저 권한을 가지고 있는 유저
     */
    @Transactional
    public List<User> saveUser(User user)   {
            List<User> users = new ArrayList<>();
            users.add(userRepository.save(user));
            return users;
        }

    @Transactional
    public List<User> findUser()   {
        return userRepository.findAll();
    }

}
