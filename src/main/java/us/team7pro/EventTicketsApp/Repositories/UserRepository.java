package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import us.team7pro.EventTicketsApp.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
