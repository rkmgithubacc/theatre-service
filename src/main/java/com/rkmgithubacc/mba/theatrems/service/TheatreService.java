package com.rkmgithubacc.mba.theatrems.service;

import com.rkmgithubacc.mba.theatrems.model.Theatre;

public interface TheatreService {
    Theatre getTheatreDetails(int theatreId, int movieId);
}
