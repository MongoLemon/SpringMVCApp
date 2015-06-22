package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by AnthonySU on 4/14/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
