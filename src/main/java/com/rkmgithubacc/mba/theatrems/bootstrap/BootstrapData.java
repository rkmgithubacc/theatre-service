package com.rkmgithubacc.mba.theatrems.bootstrap;

import com.rkmgithubacc.mba.theatrems.dao.TheatreDAO;
import com.rkmgithubacc.mba.theatrems.model.Theatre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final TheatreDAO theatreDAO;

    public BootstrapData(TheatreDAO theatreDAO) {
        this.theatreDAO = theatreDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started through bootstrap");
        System.out.println("Starting theatre entity interaction using repository: " + theatreDAO);

        Theatre theatre1 = new Theatre();
        theatre1.setTheatreName("Raga Cinemas");
        theatre1.setMovieId(1);

        System.out.println("Before saving theatre details: " + theatre1);
        Theatre savedTheatre1 = theatreDAO.save(theatre1);
        System.out.println("After saving theatre details: " + savedTheatre1);
    }
}
