/**
 * 
 */
package core;

import utility.Validation;

/**
 * @author ramas7
 *
 */
public class Profile {
	
	private String profileid;
	private String name;
	private int contactno;
	private String email;
	
	public String getProfileid() {
		return profileid;
	}
	public void setProfileid(String profileid) {
		this.profileid = profileid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!(name.isEmpty()) && (Validation.containsOnlyAlphabets(name))){
			this.name = name;
		}
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
