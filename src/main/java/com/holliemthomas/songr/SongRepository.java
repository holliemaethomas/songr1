package com.holliemthomas.songr;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<AddSong, Long> {
    public List<AddSong> findByTitle(String title);
}