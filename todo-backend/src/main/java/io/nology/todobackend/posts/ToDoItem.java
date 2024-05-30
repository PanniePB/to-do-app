package io.nology.todobackend.posts;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "to_dos")
public class ToDoItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // to make ID a primary key
  private Long id;

  @Column
  private Boolean completed;

  @Column(columnDefinition = "NVARCHAR(MAX)")
  private String content;
  @Column
  private Date createdAt;
  @Column
  private Date updatedAt;

  public ToDoItem() {
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ToDoItem [id=" + id + ", completed=" + completed + ", content=" + content + ", createdAt=" + createdAt
        + ", updatedAt=" + updatedAt + "]";
  }

  public Long getId() {
    return id;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public String getContent() {
    return content;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

}
