package com.moetez.championnat.repos;

import com.moetez.championnat.entities.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionnatRepository extends JpaRepository<Championnat, Long> {
    Championnat findByNom(String nom);

}
