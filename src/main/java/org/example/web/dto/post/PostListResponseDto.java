package org.example.web.dto.post;// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostListResponseDto.java       File. Textting. 
// 

import lombok.Getter;
import org.example.domain.post.Post;

import java.time.LocalDateTime;

@Getter
public class PostListResponseDto {
   private Long postId;
   private String title;
   private String content;
   private String author;

   private LocalDateTime createdDate;

   public PostListResponseDto(Post entity){
       this.postId = entity.getPostId();
       this.title = entity.getTitle();
       this.content = entity.getContent();
       this.author = entity.getAuthor();

       this.createdDate = entity.getCreatedDate();
   }

}
