package com.skillstorm.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.models.Artifacts;

public interface ArtifactsRepository extends JpaRepository<Artifacts, Integer >{

	void deleteArtifactByID(Integer id);

	Optional<Artifacts> findArtifactById(Integer id);

	

}
