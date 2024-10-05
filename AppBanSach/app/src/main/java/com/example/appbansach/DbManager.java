package com.example.appbansach;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ql_bansach";
    private static final int DATABASE_VERSION = 1;
    public DbManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_danhmuc" +
                " (MaDM text primary key, " +
                "TenDM text not null);");
        db.execSQL("create table tbl_nhacungcap" +
                " (MaNCC text primary key, " +
                "TenNCC text not null,"+"Sdt text not null, "+ "DiaChi text,"+ "Email text);");
        db.execSQL("create table tbl_nhavanchuyen" +
                " (MaNVC text primary key, " +
                "TenNVC text not null,"+"Sdt text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
        db.execSQL("create table tbl_tacgia" +
                " (MaTG text primary key, " +
                "TenTG text not null,"+"GioiTinh text not null);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_tacgia");
        onCreate(db);
    }
}
