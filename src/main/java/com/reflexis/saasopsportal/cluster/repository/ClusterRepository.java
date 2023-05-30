package com.reflexis.saasopsportal.cluster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reflexis.saasopsportal.cluster.entity.Cluster;

@Repository
public interface ClusterRepository extends JpaRepository<Cluster,Long>{

	public Cluster findByClusterId(Long clusterId);
	
	public List<Cluster> findAll();
}
