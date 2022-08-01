package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.post.Post;
import org.example.domain.post.PostRepository;
import org.example.web.dto.post.PostListResponseDto;
import org.example.web.dto.post.PostResponseDto;
import org.example.web.dto.post.PostSaveRequestDto;
import org.example.web.dto.post.PostUpdateRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

// Please, Table name(camelcase and first letter lower case.).. Need first letter, Upper case. And requestDto.getnull(). That Thing. Need erase.  Then not bug. Possiible.
//  PostService.java       File. Textting. 
// 
@RequiredArgsConstructor
@Service
public class PostService{
private final PostRepository postRepository;

@Transactional
public Long save(PostSaveRequestDto requestDto){

    return postRepository.save(requestDto.toEntity()).getPostId();
}

@Transactional
public Long update(Long id, PostUpdateRequestDto requestDto) {
    Post post = postRepository.findById(id)
.orElseThrow(()->new IllegalArgumentException("No find that article. id="+id));

post.update(
requestDto.getTitle(),
requestDto.getContent(),
requestDto.getAuthor()

);
return id;
}

@Transactional(readOnly = true)
public Page<Post> findAllDesc(Pageable pageable){
     Page<Post> list =  postRepository.findAllDesc(pageable);
            // postRepository.findAllDesc().stream().map(PostListResponseDto::new).collect(Collectors.toList());
     return list;
}

public PostResponseDto findById(Long id) {
       Post entity = postRepository.findById(id)
                   .orElseThrow(()->new IllegalArgumentException("No finding that article. id="+id));

       return new PostResponseDto(entity);
}

@Transactional
public void delete (Long id) {
       Post post = postRepository.findById(id)
.orElseThrow(()-> new IllegalArgumentException("No finding that article. id="+id));
postRepository.delete(post);
}
}