package org.example.web.dto.post;// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostSaveRequestDto.java       File. Textting. 
// 

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.post.Post;

@Getter
@NoArgsConstructor
public class PostSaveRequestDto {
   private String title;
   private String content;
   private String author;


   @Builder
   public PostSaveRequestDto(String title,
String content,
String author
                  ){
       this.title = title;
       this.content = content;
       this.author = author;

   }

   public Post toEntity() {

       return Post.builder()
                 .title(title)
                 .content(content)
                 .author(author).build();
      }
}
