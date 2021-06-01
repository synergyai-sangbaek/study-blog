package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.User;

//	DAO
//	자동으로 bean 등록이 된다.
//	@Repository // 생략 가능하다.
public interface UserRepository extends JpaRepository<User, Integer>{
	//	JPA Naming 전략
	//	SELECT * FROM user WHERE username = ? AND password = ?2;
	User findByUsernameAndPassword(String username, String password);

//	@Query(value="SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true)
//	User login(String username, String password);
}
