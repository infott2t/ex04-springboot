package org.example.domain.post;

import org.example.web.dto.post.PostListResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Please, Table name(camelcase and first letter lower case.).. interface make need, file name, IDE tool in. Need first letter, Upper case. Then not bug. Possiible.
//  PostRepository.java       File. Textting. 
// 
public interface PostRepository extends JpaRepository<Post,Long> {

   @Query("SELECT p from Post p ORDER BY p.id DESC")
   Page<Post> findAllDesc(Pageable pageable);
}
