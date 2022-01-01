package com.rkmgithubacc.mba.theatrems.service;

import com.rkmgithubacc.mba.theatrems.dao.TheatreDAO;
import com.rkmgithubacc.mba.theatrems.model.Theatre;
import org.springframework.stereotype.Service;

@Service
public class TheatreServiceImpl implements TheatreService {
    private final TheatreDAO theatreDAO;

    public TheatreServiceImpl(TheatreDAO theatreDAO) {
        this.theatreDAO = theatreDAO;
    }

    @Override
    public Theatre getTheatreDetails(int theatreId, int movieId) {
        Theatre requestedTheatre = theatreDAO.findByTheatreIdAndMovieId(theatreId, movieId);

        return requestedTheatre;
    }
}
