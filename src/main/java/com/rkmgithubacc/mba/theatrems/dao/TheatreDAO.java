package com.rkmgithubacc.mba.theatrems.dao;

import com.rkmgithubacc.mba.theatrems.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreDAO extends JpaRepository<Theatre, Integer> {
    Theatre findByTheatreIdAndMovieId(int theatreId, int movieId);
}
