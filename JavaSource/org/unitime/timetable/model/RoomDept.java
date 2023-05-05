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
package org.unitime.timetable.model;

import org.unitime.timetable.model.base.BaseRoomDept;



/**
 * @author Tomas Muller
 */
public class RoomDept extends BaseRoomDept implements Comparable {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public RoomDept () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public RoomDept (java.lang.Long uniqueId) {
		super(uniqueId);
	}

/*[CONSTRUCTOR MARKER END]*/

	public int compareTo(Object o) {
		if (o==null || !(o instanceof RoomDept)) return -1;
		RoomDept rd = (RoomDept)o;
		int cmp = getDepartment().getDeptCode().compareTo(rd.getDepartment().getDeptCode());
		if (cmp!=0) return cmp;
		return (getUniqueId() == null ? Long.valueOf(-1) : getUniqueId()).compareTo(rd.getUniqueId() == null ? -1 : rd.getUniqueId());
	}

}
