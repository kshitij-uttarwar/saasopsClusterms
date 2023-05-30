package com.reflexis.saasopsportal.cluster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reflexis.saasopsportal.cluster.entity.Cluster;
import com.reflexis.saasopsportal.cluster.service.ClusterService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/clusterapi")
@Slf4j
public class ClusterController {
	@Autowired
	private ClusterService clusterService;
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ClusterController.class);

	@PostMapping("/add")
	public Cluster addCluster(@RequestBody Cluster cluster){
		logger.info("AddCluster "+cluster);		
		Cluster clust = clusterService.addCluster(cluster);
		return clust;
	}
	
	@GetMapping("/getById/{id}")
	public Cluster getCluster(@PathVariable("id") Long clusterId){
		logger.info("getCluster "+clusterId);	
		Cluster cluster = clusterService.getCluster(clusterId);
		return cluster;
	}
	
	@GetMapping("/getAllClusters")
	public List<Cluster> getAllClusters(){
		logger.info("getAllClusters ");	
		List<Cluster> clusters = clusterService.getAllClusters();
		return clusters;
	}
}
