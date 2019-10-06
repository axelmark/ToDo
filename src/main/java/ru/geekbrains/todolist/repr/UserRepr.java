package ru.geekbrains.todolist.repr;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRepr {
  private Long id;

  @NotNull
  @Size(min=2, max=30)
  private String username;


  @NotNull
  @Min(3)
  private String password;

  @NotNull
  @Min(3)
  private String matchingPassword;

  public UserRepr() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMatchingPassword() {
    return matchingPassword;
  }

  public void setMatchingPassword(String matchingPassword) {
    this.matchingPassword = matchingPassword;
  }
}
