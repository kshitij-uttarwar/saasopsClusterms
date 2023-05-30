package com.reflexis.saasopsportal.cluster.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Environment")
public class Environment {
		 
	 @Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	private Long envId;
	private String envName;
	
	private Product product;
	private String version;
	private EnvironmentType envType;
	private String clientId;
	//appurl,dburl
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	private Date deployedOn;
	
	
	public Long getEnvId() {
		return envId;
	}
	public void setEnvId(Long envId) {
		this.envId = envId;
	}
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public EnvironmentType getEnvType() {
		return envType;
	}
	public void setEnvType(EnvironmentType envType) {
		this.envType = envType;
	}
	public Date getDeployedOn() {
		return deployedOn;
	}
	public void setDeployedOn(Date deployedOn) {
		this.deployedOn = deployedOn;
	}
	@Override
	public String toString() {
		return "Environment [ envId=" + envId + ", product=" + product + ", version=" + version
				+ ", envType=" + envType + ", clientId=" + clientId + ", deployedOn=" + deployedOn + "]";
	}
	
	
}
