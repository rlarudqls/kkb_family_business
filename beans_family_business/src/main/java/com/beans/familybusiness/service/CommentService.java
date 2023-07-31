package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.CommentDTO;
import java.util.List;

public interface CommentService {
    CommentDTO getCommentById(Long id);
    List<CommentDTO> getAllComments();
    CommentDTO createComment(CommentDTO commentDTO);
    CommentDTO updateComment(Long id, CommentDTO commentDTO);
    void deleteComment(Long id);
}
