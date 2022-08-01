package org.example.web.controller.post;

import lombok.RequiredArgsConstructor;
import org.example.service.PostService;
import org.example.web.dto.post.PostResponseDto;
import org.example.web.dto.post.PostSaveRequestDto;
import org.example.web.dto.post.PostUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostApiController.java       File. Textting. 
// 
@RequiredArgsConstructor
@RestController
public class PostApiController {
   private final PostService postService;

   @PostMapping("/api/v1/post")   public Long save(@RequestBody PostSaveRequestDto requestDto){
       return postService.save(requestDto);
   }

   @PutMapping("/api/v1/post/{id}")
   public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto){
       return postService.update(id, requestDto);
   }

   @GetMapping("/api/v1/post/{id}")
   public PostResponseDto findById (@PathVariable Long id){
       return postService.findById(id);
   }

   @DeleteMapping("/api/v1/post/{id}")
   public Long delete(@PathVariable Long id){
       postService.delete(id);
       return id;
   }
}