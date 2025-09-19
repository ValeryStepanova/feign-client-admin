package com.itechart.admin_service_api.dto;

public record UpdateTaskLinkDto(
        Long taskId,
        String gitHubLink
) {

}
