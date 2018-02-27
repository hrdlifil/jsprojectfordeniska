package com.itforhumanity.jsprojectfordeniska.repositories;

import com.itforhumanity.jsprojectfordeniska.entities.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser,Long> {

}
