package com.videovixx.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {

	public enum Type{
		YOUTUBE;
	}
	@Id 
	private String id;
	private String name,src,thumbnail;
	
	
	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the src
	 */
	public final String getSrc() {
		return src;
	}
	
	/**
	 * @param src the src to set
	 */
	public final void setSrc(String src) {
		this.src = src;
	}
	
	/**
	 * @return the thumbnail
	 */
	public final String getThumbnail() {
		return thumbnail;
	}
	
	/**
	 * @param thumbnail the thumbnail to set
	 */
	public final void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
