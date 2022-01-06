package com.Lesson15.pojo;


import com.google.gson.annotations.SerializedName;

public class Entries {
    private String id;
    private String description;
    private String name;
    @SerializedName("runs")
    private RunsResults runsResults;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunsResults getRunsResults() {
        return runsResults;
    }

    public void setRunsResults(RunsResults runsResults) {
        this.runsResults = runsResults;
    }
}
