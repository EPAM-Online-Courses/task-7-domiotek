package efs.task.reflection.model;

import efs.task.reflection.annotations.BuilderProperty;
import efs.task.reflection.annotations.NotNull;
public class Villager implements Fighter {

  public static final String HIDDEN_VILLAGER_NAME = "Anonymous";
  public static final String HIDDEN_VILLAGER_DESC = "Hidden from the world, can hack anything that uses electricity";

  @NotNull
  private final String name;

  @NotNull
  private final String description;
  
  private Integer age;

  int health;

  private Villager() {
    this(HIDDEN_VILLAGER_NAME, HIDDEN_VILLAGER_DESC);
  }
  
  private Villager(Integer age , String name) {
    this(name, HIDDEN_VILLAGER_DESC);
    this.age = age;
  }

  private Villager(String name, Integer age) {
    this(name, HIDDEN_VILLAGER_DESC);
    this.age = age;
  }

  @BuilderProperty(name="init")
  public Villager(@NotNull final String name,@NotNull final String description) {
    this.name = name;
    this.description = description;
  }

  @BuilderProperty(name="health")
  public void setHealth(int health) {
    this.health = health;
  }

  @Override
  public String toString() {
    return "Villager{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", health=" + health +
        '}';
  }
}
