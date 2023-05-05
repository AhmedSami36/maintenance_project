/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;

import org.unitime.timetable.model.PosMajor;
import org.unitime.timetable.model.PosMajorConcentration;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BasePosMajorConcentration implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iExternalUniqueId;
	private String iCode;
	private String iName;

	private PosMajor iMajor;

	public static String PROP_UNIQUEID = "uniqueId";
	public static String PROP_EXTERNAL_UID = "externalUniqueId";
	public static String PROP_CODE = "code";
	public static String PROP_NAME = "name";

	public BasePosMajorConcentration() {
		initialize();
	}

	public BasePosMajorConcentration(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { return iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

	public String getExternalUniqueId() { return iExternalUniqueId; }
	public void setExternalUniqueId(String externalUniqueId) { iExternalUniqueId = externalUniqueId; }

	public String getCode() { return iCode; }
	public void setCode(String code) { iCode = code; }

	public String getName() { return iName; }
	public void setName(String name) { iName = name; }

	public PosMajor getMajor() { return iMajor; }
	public void setMajor(PosMajor major) { iMajor = major; }

	public boolean equals(Object o) {
		if (o == null || !(o instanceof PosMajorConcentration)) return false;
		if (getUniqueId() == null || ((PosMajorConcentration)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((PosMajorConcentration)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "PosMajorConcentration["+getUniqueId()+" "+getName()+"]";
	}

	public String toDebugString() {
		return "PosMajorConcentration[" +
			"\n	Code: " + getCode() +
			"\n	ExternalUniqueId: " + getExternalUniqueId() +
			"\n	Major: " + getMajor() +
			"\n	Name: " + getName() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
