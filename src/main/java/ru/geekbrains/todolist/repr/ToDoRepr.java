package ru.geekbrains.todolist.repr;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

public class ToDoRepr {
  private Long id;

  @NotEmpty private String description;
  private String username;

  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate targetDate;

  public ToDoRepr() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LocalDate getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(LocalDate targetDate) {
    this.targetDate = targetDate;
  }

  @Override
  public String toString() {
    return "UserRepr{" +
        "id=" + id +
        ", description='" + description + '\'' +
        ", username='" + username + '\'' +
        ", targetDate=" + targetDate +
        '}';
  }
}
