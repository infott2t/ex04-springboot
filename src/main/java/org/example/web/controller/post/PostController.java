package org.example.web.controller.post;

import lombok.RequiredArgsConstructor;
import org.example.service.PostService;
import org.example.web.dto.post.PostResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  PostController.java       File. Textting. 
// 
@RequiredArgsConstructor
@Controller
public class PostController {

   private final PostService postService;
/* //세션 만든 후에 SessionUser를 넘기는 코드.
* @GetMapping("/post")
   public String index(Model model, @LoginUser SessionUser user) {

       if(user != null){
           model.addAttribute("userName", user.getName());
       }
       model.addAttribute("post", postService.findAllDesc());
       return "tables/post/index;";
   }
   *
   *   @GetMapping("/post/save")
   public String postSave(Model model, @LoginUser SessionUser user) {
       if(user != null){
           model.addAttribute("userName", user.getName());
       }
       return "tables/post/post-save";
   }
* */
   @GetMapping("/post")
   public String index(Model model, @PageableDefault( sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {


       model.addAttribute("post", postService.findAllDesc(pageable));
       return "tables/post/index_leaf";
   }


   @GetMapping("/post/save")
   public String postSave(Model model) {

       return "tables/post/post-save_leaf";
   }

   @RequestMapping(value="/post/update/{id}", method= RequestMethod.GET)
   public String postUpdate(@PathVariable Long id, Model model, @RequestParam(name="page") String page){
       PostResponseDto dto = postService.findById(id);

       model.addAttribute("page", page);
       model.addAttribute("post",dto);


       return "tables/post/post-update_leaf";
   }
}
