package com.reflexis.saasopsportal.cluster.service;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reflexis.saasopsportal.cluster.entity.Cluster;
import com.reflexis.saasopsportal.cluster.repository.ClusterRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClusterService {
	@Autowired
	private ClusterRepository clusterRepo;
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ClusterService.class);

	public Cluster getCluster(Long clusterId) {
		logger.info("ClusterService.getCluster for : "+clusterId);		
		Cluster cluster = clusterRepo.findByClusterId(clusterId);
		return cluster;
	}
	
	public Cluster addCluster(Cluster cluster) {
		logger.info("ClusterService.AddCluster: "+cluster);		
		return clusterRepo.save(cluster);
	}
	
	public List<Cluster> getAllClusters() {
		logger.info("***ClusterService.getAllClusters for : ");		
		List<Cluster> clusters = clusterRepo.findAll();
		return clusters;
	}
}
