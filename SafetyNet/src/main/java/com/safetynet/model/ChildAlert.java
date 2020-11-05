package com.safetynet.model;

import java.util.List;

/**
 * 
 */

/**
 * @author Quentin
 *
 */
public class ChildAlert {
	 private List <Persons> childs;
	 private List <Persons> membersOfFamily;
	 
	 
	 
	public ChildAlert(List<Persons> childs, List<Persons> membersOfFamily) {
		this.childs = childs;
		this.membersOfFamily = membersOfFamily;
	}
	
	public List<Persons> getChilds() {
		return childs;
	}
	public void setChilds(List<Persons> childs) {
		this.childs = childs;
	}
	public List<Persons> getMembersOfFamily() {
		return membersOfFamily;
	}
	public void setMembersOfFamily(List<Persons> membersOfFamily) {
		this.membersOfFamily = membersOfFamily;
	}

	@Override
	public String toString() {
		return "ChildAlert [childs=" + childs + ", membersOfFamily=" + membersOfFamily + "]";
	}
	 
	 
	
}
