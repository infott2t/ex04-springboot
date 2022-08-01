package org.example.domain.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  Post.java       File. Textting. 
// import, javax.persistance.Entity, ...GenerationValue, ...GenerationType, ...Id. 
// 
@Getter
@NoArgsConstructor
@Entity
public class Post extends BaseTimeEntity {
 @Id //primary key field.
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment.
private Long postId;

private String title;
private String content;
private String author;


@Builder
public Post(
  String title,
  String content,
  String author

){
this.title = title;
this.content = content;
this.author = author;

}

public void update(  String title,
  String content,
  String author

){this.title = title;
this.content = content;
this.author = author;

}
}