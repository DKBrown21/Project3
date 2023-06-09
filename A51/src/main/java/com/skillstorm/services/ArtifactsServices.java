package com.skillstorm.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.exception.ArtifactNotFoundException;
import com.skillstorm.models.Artifacts;
import com.skillstorm.repositories.ArtifactsRepository;

@Service
public class ArtifactsServices 	{
	private final ArtifactsRepository artifactsRepo;
	
	@Autowired
	public ArtifactsServices(ArtifactsRepository artifactsRepo) {
		this.artifactsRepo = artifactsRepo;
	}
	public Artifacts addArtifact(Artifacts artifact) {
		artifact.setId(0);
		return artifactsRepo.save(artifact);
		
	}
	public List<Artifacts> findAllArtifacts(){
		return artifactsRepo.findAll();
	}
	public Artifacts updateArtifact(Artifacts artifact) {
		return artifactsRepo.save(artifact);
	}
	public Artifacts findArtifactById(Integer id) {
		return artifactsRepo.findArtifactById(id)
				.orElseThrow(() -> new ArtifactNotFoundException("Artifact by id " + id + " was not found"));
		
	}
	public void deleteArtifact(Integer id) {
		artifactsRepo.deleteArtifactByID(id);
	}
}
