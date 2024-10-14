package com.choongang.frombirth.service;

import com.choongang.frombirth.dto.ChildrenDTO;
import java.util.List;

public interface ChildrenService {
    List<ChildrenDTO> getAllChildren(String userId);
    ChildrenDTO getChildById(Integer childId);
    void addChild(ChildrenDTO childrenDTO);
    void updateChild(ChildrenDTO childrenDTO);
    void deleteChild(Integer childId);
}
