package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.DetailsEquipe;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class DetailsEquipeService implements IDetailsEquipeService{
    @Override
    public List<DetailsEquipe> retrieveAllDetailsEquipe() {
        return null;
    }

    @Override
    public Integer idDetailEquipeaddDetailsEquipe(DetailsEquipe de) {
        return null;
    }

    @Override
    public DetailsEquipe updateDetailsEquipe(DetailsEquipe de) {
        return null;
    }

    @Override
    public DetailsEquipe retrieveDetailsEquipe(Integer idDetailEquipe) {
        return null;
    }

    @Override
    public void deleteDetailsEquipe(Integer idDetailEquipe) {

    }
}
