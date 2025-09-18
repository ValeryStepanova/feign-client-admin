package com.itechart.admin_service_api.dto;

import com.itechart.admin_service_api.dto.enums.SpecialistProgramStatus;
import com.itechart.admin_service_api.dto.enums.TaskInternStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskInternDto {
    private Long id;

    private Long taskId;

    private UUID internId;

    private String githubLink;

    private TaskInternStatus taskStatus;

    private SpecialistProgramStatus status;

    private LocalDateTime createdAt;
    private UUID createdBy;

    private LocalDateTime updatedAt;
    private UUID updatedBy;

    private LocalDateTime deletedAt;
    private UUID deletedBy;
}