package com.choongang.frombirth.service;

import com.choongang.frombirth.dto.PhotoDTO;
import java.util.List;

public interface PhotoService {
    List<PhotoDTO> getAllPhotos(Integer recordId);
    PhotoDTO getPhotoById(Integer photoId);
    void addPhoto(PhotoDTO photoDTO);
    void updatePhoto(PhotoDTO photoDTO);
    void deletePhoto(Integer photoId);
}
