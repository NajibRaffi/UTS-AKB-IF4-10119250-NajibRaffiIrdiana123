package com.example.diary_10119250.ui.dashboard;

import android.database.Cursor;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}