package com.Lesson15.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class CaseModelConstructor {
    public static void main(String[] args) {
        CaseModelConstructor caseModelConstructor = new CaseModelConstructor();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(caseModelConstructor.getCaseModel()));

    }
    public CaseResults getCaseModel(){
        RunsResults runsResults = new RunsResults();
        runsResults.setBlocked_count(0);
        runsResults.setCompleted_on("null");
        runsResults.setConfig("Firefox, Ubuntu 12");

        Entries entries = new Entries();
        entries.setId("3933d74b-4282-4c1f-be62-a641ab427063");
        entries.setDescription("some description");
        entries.setName("File Formats");
        entries.setRunsResults(runsResults);

        List<Entries> entriesList = new ArrayList<>();
        entriesList.add(entries);

        CaseResults caseResults = new CaseResults();
        caseResults.setEntriesList(entriesList);
        return caseResults;

    }
}
