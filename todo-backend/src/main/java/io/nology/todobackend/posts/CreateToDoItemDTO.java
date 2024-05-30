package io.nology.todobackend.posts;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateToDoItemDTO {
  @NotNull
  private Boolean completed;

  @NotBlank
  private String content;

  public Boolean getCompleted() {
    return completed;
  }

  public String getContent() {
    return content;
  }

}
