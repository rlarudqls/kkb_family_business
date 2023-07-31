package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.EducationContentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducationContentServiceImpl implements EducationContentService {

    // EducationContentDTO 객체를 저장할 임시 리스트
    private List<EducationContentDTO> educationContents = new ArrayList<>();

    @Override
    public EducationContentDTO getEducationContentById(Long id) {
        // id에 해당하는 EducationContentDTO 객체를 찾아 반환하는 로직 구현
        // 예시로 임시 리스트에서 해당 id로 객체를 찾는 방법을 사용하겠습니다.
        for (EducationContentDTO content : educationContents) {
            if (content.getId().equals(id)) {
                return content;
            }
        }
        return null; // 해당 id로 EducationContentDTO 객체를 찾지 못한 경우 null 반환
    }

    @Override
    public List<EducationContentDTO> getAllEducationContents() {
        // 모든 EducationContentDTO 객체를 리스트로 반환하는 로직 구현
        return educationContents;
    }

    @Override
    public EducationContentDTO createEducationContent(EducationContentDTO educationContentDTO) {
        // 새로운 EducationContentDTO 객체를 생성하여 리스트에 추가하는 로직 구현
        // 예시로 ID를 자동 생성하여 사용하겠습니다.
        Long newId = generateNewId(); // ID를 생성하는 메서드 호출
        educationContentDTO.setId(newId); // 새로운 ID 설정
        educationContents.add(educationContentDTO); // 리스트에 객체 추가
        return educationContentDTO;
    }

    @Override
    public EducationContentDTO updateEducationContent(Long id, EducationContentDTO educationContentDTO) {
        // id에 해당하는 EducationContentDTO 객체를 찾아 업데이트하는 로직 구현
        // 예시로 임시 리스트에서 해당 id로 객체를 찾아 업데이트하겠습니다.
        for (EducationContentDTO content : educationContents) {
            if (content.getId().equals(id)) {
                // 해당 id로 객체를 찾은 경우, 전달받은 educationContentDTO 정보로 업데이트
                content.setTitle(educationContentDTO.getTitle());
                content.setDescription(educationContentDTO.getDescription());
                // 필요한 필드들에 대해서도 업데이트 작업 수행
                // ...
                return content;
            }
        }
        return null; // 해당 id로 EducationContentDTO 객체를 찾지 못한 경우 null 반환
    }

    @Override
    public void deleteEducationContent(Long id) {
        // id에 해당하는 EducationContentDTO 객체를 찾아 삭제하는 로직 구현
        // 예시로 임시 리스트에서 해당 id로 객체를 찾아 삭제하겠습니다.
        educationContents.removeIf(content -> content.getId().equals(id));
    }

    // 새로운 ID를 생성하는 메서드 (예시용)
    private Long generateNewId() {
        // 여기에서 적절한 방법으로 새로운 ID를 생성하여 반환하도록 구현
        // 예시로 간단하게 시간 기반으로 ID를 생성하겠습니다.
        return System.currentTimeMillis();
    }
}
