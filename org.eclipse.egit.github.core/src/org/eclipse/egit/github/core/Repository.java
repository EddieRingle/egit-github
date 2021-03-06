/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import org.eclipse.egit.github.core.util.DateUtils;

/**
 * Repository model class
 */
public class Repository implements IRepositoryIdProvider {

	private boolean fork;

	private boolean hasDownloads;

	private boolean hasIssues;

	private boolean hasWiki;

	@SerializedName("private")
	private boolean isPrivate;

	private Date createdAt;

	private Date pushedAt;

	private int forks;

	private int openIssues;

	private int size;

	private int watchers;

	private String defaultBranch;

	private String description;

	private String htmlUrl;

	private String language;

	private String masterBranch;

	private String name;

	private String url;

	private User owner;

	/**
	 * @return fork
	 */
	public boolean isFork() {
		return fork;
	}

	/**
	 * @param fork
	 * @return this repository
	 */
	public Repository setFork(boolean fork) {
		this.fork = fork;
		return this;
	}

	/**
	 * @return hasDownloads
	 */
	public boolean isHasDownloads() {
		return hasDownloads;
	}

	/**
	 * @param hasDownloads
	 * @return this repository
	 */
	public Repository setHasDownloads(boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
		return this;
	}

	/**
	 * @return hasIssues
	 */
	public boolean isHasIssues() {
		return hasIssues;
	}

	/**
	 * @param hasIssues
	 * @return this repository
	 */
	public Repository setHasIssues(boolean hasIssues) {
		this.hasIssues = hasIssues;
		return this;
	}

	/**
	 * @return hasWiki
	 */
	public boolean isHasWiki() {
		return hasWiki;
	}

	/**
	 * @param hasWiki
	 * @return this repository
	 */
	public Repository setHasWiki(boolean hasWiki) {
		this.hasWiki = hasWiki;
		return this;
	}

	/**
	 * @return isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}

	/**
	 * @param isPrivate
	 * @return this repository
	 */
	public Repository setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
		return this;
	}

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this rdateepository
	 */
	public Repository setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return pushedAt
	 */
	public Date getPushedAt() {
		return DateUtils.clone(pushedAt);
	}

	/**
	 * @param pushedAt
	 * @return this repository
	 */
	public Repository setPushedAt(Date pushedAt) {
		this.pushedAt = DateUtils.clone(pushedAt);
		return this;
	}

	/**
	 * @return forks
	 */
	public int getForks() {
		return forks;
	}

	/**
	 * @param forks
	 * @return this repository
	 */
	public Repository setForks(int forks) {
		this.forks = forks;
		return this;
	}

	/**
	 * @return openIssues
	 */
	public int getOpenIssues() {
		return openIssues;
	}

	/**
	 * @param openIssues
	 * @return this repository
	 */
	public Repository setOpenIssues(int openIssues) {
		this.openIssues = openIssues;
		return this;
	}

	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 * @return this repository
	 */
	public Repository setSize(int size) {
		this.size = size;
		return this;
	}

	/**
	 * @return watchers
	 */
	public int getWatchers() {
		return watchers;
	}

	/**
	 * @param watchers
	 * @return this repository
	 */
	public Repository setWatchers(int watchers) {
		this.watchers = watchers;
		return this;
	}

	/**
	 * @return defaultBranch
	 */
	public String getDefaultBranch() {
		return defaultBranch;
	}

	/**
	 * @param defaultBranch
	 * @return this repository
	 */
	public Repository setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
		return this;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 * @return this repository
	 */
	public Repository setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @return htmlUrl
	 */
	public String getHtmlUrl() {
		return htmlUrl;
	}

	/**
	 * @param htmlUrl
	 * @return this repository
	 */
	public Repository setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	/**
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 * @return this repository
	 */
	public Repository setLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * @return masterBranch
	 */
	public String getMasterBranch() {
		return masterBranch;
	}

	/**
	 * @param masterBranch
	 * @return this repository
	 */
	public Repository setMasterBranch(String masterBranch) {
		this.masterBranch = masterBranch;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this repository
	 */
	public Repository setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this repository
	 */
	public Repository setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 * @return this repository
	 */
	public Repository setOwner(User owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * Generate id for this repository
	 * 
	 * @see IRepositoryIdProvider#generateId()
	 */
	public String generateId() {
		final User owner = this.owner;
		final String name = this.name;
		if (owner == null || name == null || name.length() == 0)
			return null;
		final String login = owner.getLogin();
		if (login == null || login.length() == 0)
			return null;
		return login + "/" + name;
	}
}
