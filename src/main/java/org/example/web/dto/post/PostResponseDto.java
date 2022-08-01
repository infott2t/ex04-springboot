package org.example.web.dto.post;
// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostResponseDto.java       File. Textting. 
// 

import lombok.Getter;
import org.example.domain.post.Post;

@Getter
public class PostResponseDto {
   private Long postId;
   private String title;
   private String content;
   private String author;


   public PostResponseDto(Post entity){
       this.postId = entity.getPostId();
       this.title = entity.getTitle();
       this.content = entity.getContent();
       this.author = entity.getAuthor();

   }

}
