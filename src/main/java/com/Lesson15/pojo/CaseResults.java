package com.Lesson15.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CaseResults {
    @SerializedName("entries")
    private List<Entries> entriesList = new ArrayList<>();

    public List<Entries> getEntriesList() {
        return entriesList;
    }

    public void setEntriesList(List<Entries> entriesList) {
        this.entriesList = entriesList;
    }
}
