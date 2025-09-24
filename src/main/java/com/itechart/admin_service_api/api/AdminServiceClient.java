package com.itechart.admin_service_api.api;

import com.itechart.admin_service_api.config.FeignConfig;
import com.itechart.admin_service_api.dto.TaskDto;
import com.itechart.admin_service_api.dto.TaskInternDto;
import com.itechart.admin_service_api.dto.request.UpdateLinkRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

@FeignClient(
        name="ADMIN-MANAGEMENT-SERVICE",
        path = "api/v1/admin/task-intern",
        configuration = FeignConfig.class
)
public interface AdminServiceClient {
    @GetMapping("/interns/{internId}/pull-requests")
    List<TaskDto> getPullRequests(@PathVariable UUID internId);

    @GetMapping("/{taskId}/{interId}")
    ResponseEntity<TaskInternDto> getTaskInternByTaskID(@PathVariable Long taskId, @PathVariable UUID interId);

    @PostMapping("/updateLink")
    ResponseEntity<TaskInternDto> updateGitLink(@RequestBody TaskInternDto taskInternDto);

    @PutMapping("/{task-id}")
    ResponseEntity<UpdateLinkRequest> updateTaskLink(@PathVariable(name = "task-id") Long taskId, @RequestBody UpdateLinkRequest linkRequest);
    @GetMapping("/taskinterns/{taskInternId}")
    ResponseEntity<TaskInternDto> getTaskInternById(@PathVariable Long taskInternId);
}
