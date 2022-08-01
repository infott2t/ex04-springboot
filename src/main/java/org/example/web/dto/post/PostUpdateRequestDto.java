package org.example.web.dto.post;// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostUpdateRequestDto.java       File. Textting. 
// 

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostUpdateRequestDto {
   private String title;
   private String content;
   private String author;


   @Builder
   public PostUpdateRequestDto(String title,
String content,
String author
                  ){
       this.title = title;
       this.content = content;
       this.author = author;

   }

}
