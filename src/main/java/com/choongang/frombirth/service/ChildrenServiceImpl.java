package com.choongang.frombirth.service.impl;

import com.choongang.frombirth.dto.ChildrenDTO;
import com.choongang.frombirth.entity.Children;
import com.choongang.frombirth.repository.ChildrenRepository;
import com.choongang.frombirth.service.ChildrenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChildrenServiceImpl implements ChildrenService {
    private final ChildrenRepository childrenRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ChildrenServiceImpl(ChildrenRepository childrenRepository, ModelMapper modelMapper) {
        this.childrenRepository = childrenRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ChildrenDTO> getAllChildren(String userId) {
        return childrenRepository.findByUserId(userId).stream()
                .map(child -> modelMapper.map(child, ChildrenDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ChildrenDTO getChildById(Integer childId) {
        Children child = childrenRepository.findById(childId).orElseThrow();
        return modelMapper.map(child, ChildrenDTO.class);
    }

    @Override
    public void addChild(ChildrenDTO childrenDTO) {
        Children child = modelMapper.map(childrenDTO, Children.class);
        childrenRepository.save(child);
    }

    @Override
    public void updateChild(ChildrenDTO childrenDTO) {
        Children child = modelMapper.map(childrenDTO, Children.class);
        childrenRepository.save(child);
    }

    @Override
    public void deleteChild(Integer childId) {
        childrenRepository.deleteById(childId);
    }
}
