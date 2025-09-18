package com.itechart.admin_service_api.dto.request;

import jakarta.validation.constraints.Pattern;

public record UpdateLinkRequest(@Pattern(regexp = "^https://github\\.com/[A-Za-z0-9_.-]+(/[A-Za-z0-9_.-]+)?$", message = "Please pin the correct gitHub link") String gitHubLink) {
}
