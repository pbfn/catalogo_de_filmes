package com.example.catologo_filmes.repository.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.catologo_filmes.data.Movie


@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg movie:Movie)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(vararg movie:Movie)

    @Query("SELECT * FROM movie")
    fun getAll(): List<Movie>


}