package org.example.web;// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  AdminController.java       File. Textting. 
// 

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class AdminController {

    @GetMapping("/")
    public String indexDefault(){
        return "admin/index_leaf";
    }
    @GetMapping("/admin/index")
    public String index(Model model) //index(Model model, @LoginUser SessionUser user)
    {

//        if(user != null){
//            model.addAttribute("userName", user.getName());
//        }
        // model.addAttribute("posts", postsService.findAllDesc());
        return "admin/index_leaf";
    }
}