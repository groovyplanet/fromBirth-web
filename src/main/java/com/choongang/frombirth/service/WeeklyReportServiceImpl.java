package com.choongang.frombirth.service.impl;

import com.choongang.frombirth.dto.WeeklyReportDTO;
import com.choongang.frombirth.entity.WeeklyReport;
import com.choongang.frombirth.repository.WeeklyReportRepository;
import com.choongang.frombirth.service.WeeklyReportService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeeklyReportServiceImpl implements WeeklyReportService {
    private final WeeklyReportRepository weeklyReportRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public WeeklyReportServiceImpl(WeeklyReportRepository weeklyReportRepository, ModelMapper modelMapper) {
        this.weeklyReportRepository = weeklyReportRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<WeeklyReportDTO> getAllReports(Integer childId) {
        return weeklyReportRepository.findByChildId(childId).stream()
                .map(report -> modelMapper.map(report, WeeklyReportDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public WeeklyReportDTO getReportById(Integer reportId) {
        WeeklyReport report = weeklyReportRepository.findById(reportId).orElseThrow();
        return modelMapper.map(report, WeeklyReportDTO.class);
    }

    @Override
    public void addReport(WeeklyReportDTO weeklyReportDTO) {
        WeeklyReport report = modelMapper.map(weeklyReportDTO, WeeklyReport.class);
        weeklyReportRepository.save(report);
    }

    @Override
    public void updateReport(WeeklyReportDTO weeklyReportDTO) {
        WeeklyReport report = modelMapper.map(weeklyReportDTO, WeeklyReport.class);
        weeklyReportRepository.save(report);
    }

    @Override
    public void deleteReport(Integer reportId) {
        weeklyReportRepository.deleteById(reportId);
    }
}
