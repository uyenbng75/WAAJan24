package miu.edu.waa_jan24.controller;

import miu.edu.waa_jan24.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CommentController {

    //@Autowired
    CommentService commentService;


}
