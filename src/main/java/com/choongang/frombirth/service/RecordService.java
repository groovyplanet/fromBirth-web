package com.choongang.frombirth.service;

import com.choongang.frombirth.dto.RecordDTO;
import java.util.List;

public interface RecordService {
    List<RecordDTO> getAllRecords(Integer childId);
    RecordDTO getRecordById(Integer recordId);
    void addRecord(RecordDTO recordDTO);
    void updateRecord(RecordDTO recordDTO);
    void deleteRecord(Integer recordId);
}
