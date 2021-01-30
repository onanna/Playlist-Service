package com.galvanize.playlistservice.controller;

import com.galvanize.playlistservice.entities.Playlist;
import com.galvanize.playlistservice.service.AddSongService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags="add songs")
public class AddSongController {

    private AddSongService addSongService;

    public AddSongController(AddSongService addSongService) {
        this.addSongService = addSongService;
    }


    @PatchMapping("api/v1/playlist/{playlistId}/{songId}")
    public Playlist addSongsToPlaylist(@PathVariable Long playlistId, @PathVariable Long songId){
        Playlist playList = addSongService.addSongsToPlaylist(playlistId,songId);
        return playList;
    }
}
