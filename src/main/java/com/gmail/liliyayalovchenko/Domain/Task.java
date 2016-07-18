package com.gmail.liliyayalovchenko.Domain;

public class Task {

    private long id;
    private String name;
    private String category;
    private boolean isDone;

    public Task(String name, String category, boolean isDone) {
        this.name = name;
        this.category = category;
        this.isDone = isDone;
    }

    public Task() {}

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (isDone != task.isDone) return false;
        if (category != null ? !category.equals(task.category) : task.category != null) return false;
        if (name != null ? !name.equals(task.name) : task.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (isDone ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
