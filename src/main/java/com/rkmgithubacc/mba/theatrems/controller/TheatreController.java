package com.rkmgithubacc.mba.theatrems.controller;

import com.rkmgithubacc.mba.theatrems.dto.TheatreDTO;
import com.rkmgithubacc.mba.theatrems.model.Theatre;
import com.rkmgithubacc.mba.theatrems.service.TheatreService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/theatre_service/v1")
public class TheatreController {
    
    private final TheatreService theatreService;
    private final ModelMapper modelMapper;
    
    public TheatreController(TheatreService theatreService, ModelMapper modelMapper) {
        this.theatreService = theatreService;
        this.modelMapper = modelMapper;
    }
    
    @GetMapping(value = "/theatres/{theatreId}/movie/{movieId}", produces = "application/json")
    public ResponseEntity<TheatreDTO> getTheatre(@PathVariable(name = "theatreId") int theatreId,
                                                 @PathVariable(name = "movieId") int movieId) {
        Theatre responseTheatre = theatreService.getTheatreDetails(theatreId, movieId);
        
        if (responseTheatre != null) {
            TheatreDTO responseTheatreDTO = modelMapper.map(responseTheatre, TheatreDTO.class);
            return new ResponseEntity<>(responseTheatreDTO, HttpStatus.OK);
        } else {
            return null;
        }
    }
}
