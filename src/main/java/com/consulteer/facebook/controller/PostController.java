package com.consulteer.facebook.controller;

import com.consulteer.facebook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PutMapping("/{id}/like")
    public Integer likePost(@PathVariable("id") Long id){
        return postService.likePost(id);
    }
  @DeleteMapping("/{id}")

    public ResponseEntity<Void> deletePostsByUser(@PathVariable("id") Long id) {
      postService.deleteAllPostsByUser(id);
        return ResponseEntity.noContent().build();
  }

}
