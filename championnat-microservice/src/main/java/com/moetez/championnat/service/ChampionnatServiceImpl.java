package com.moetez.championnat.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moetez.championnat.dto.ChampionnatDto;
import com.moetez.championnat.entities.Championnat;
import com.moetez.championnat.repos.ChampionnatRepository;

@AllArgsConstructor
@Service
public class ChampionnatServiceImpl implements CampionnatService {

    private ChampionnatRepository championnatRepository;

    @Override
    public ChampionnatDto getChampionnatByNom(String nom) {
        Championnat championnat = championnatRepository.findByNom(nom);

        // Sécurité : vérifier que le championnat existe
        if (championnat == null) {
            throw new RuntimeException("Championnat non trouvé avec le nom : " + nom);
        }

        // Conversion entité → DTO
        return new ChampionnatDto(
                championnat.getId(),
                championnat.getNom(),
                championnat.getAnnee()
        );
    }
}
