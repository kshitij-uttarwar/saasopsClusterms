package com.reflexis.saasopsportal.cluster.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cluster")
public class Cluster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long clusterId;
	private String clusterName;
	
	@OneToMany(targetEntity = Environment.class,cascade=CascadeType.ALL)
	@JoinColumn(name ="cl_en_fk", referencedColumnName= "clusterId")
	private List<Environment> environments;
	//zone,type,component
	public Long getClusterId() {
		return clusterId;
	}
	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public List<Environment> getEnvironments() {
		return environments;
	}
	public void setEnvironments(List<Environment> environments) {
		this.environments = environments;
	}
	@Override
	public String toString() {
		return "Cluster [clusterId=" + clusterId + ", clusterName=" + clusterName + ", environments=" + environments
				+ "]";
	}

}
