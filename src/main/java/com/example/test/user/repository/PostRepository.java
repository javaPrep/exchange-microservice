
package com.example.test.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.user.dto.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
