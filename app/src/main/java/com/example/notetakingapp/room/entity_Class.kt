package com.example.notetakingapp.room

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.versionedparcelable.ParcelField
import kotlinx.parcelize.Parcelize

@Entity(tableName = "Notes")
@Parcelize
data class entity_Class(
    @PrimaryKey
    @ColumnInfo(name = "id")
     val id: Int,
     @ColumnInfo(name ="title")
     val noteTitle: String,
    @ColumnInfo(name = "body")
    val notBody: String,

): Parcelable
