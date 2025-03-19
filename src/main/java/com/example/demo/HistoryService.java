package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    private final List<String> history = new ArrayList<>();

    public void addHistory(String record) {
        history.add(record);
    }

    public List<String> getHistory() {
        return history;
    }
}

