package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.EducationContentDTO;
import java.util.List;

public interface EducationContentService {
    EducationContentDTO getEducationContentById(Long id);
    List<EducationContentDTO> getAllEducationContents();
    EducationContentDTO createEducationContent(EducationContentDTO educationContentDTO);
    EducationContentDTO updateEducationContent(Long id, EducationContentDTO educationContentDTO);
    void deleteEducationContent(Long id);
}
