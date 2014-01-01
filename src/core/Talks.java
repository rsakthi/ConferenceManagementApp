package core;

import java.util.Date;

/**
 * This class serves the purpose of creation of the Session Details
 * @author ramas7
 *
 */

public class Talks {
	//Automatic generation of the sessionid for any unique session
	private int talksid;
	//Name of the session
	private String name;
	//short information of the session
	private String details;
	//detailed information or extra information of the session
	private String additionalinfo;
	//information on the author's name
	private Date createdby;
	//information of the details creation
	private Date createdtime;
	
	public Talks(int talksid, String name, String details,
			String additionalinfo, Date createdby, Date createdtime) {
		super();
		this.talksid = talksid;
		this.name = name;
		this.details = details;
		this.additionalinfo = additionalinfo;
		this.createdby = createdby;
		this.createdtime = createdtime;
	}
	
	public int getTalksid() {
		return talksid;
	}
	public void setTalksid(int talksid) {
		this.talksid = talksid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getAdditionalinfo() {
		return additionalinfo;
	}
	public void setAdditionalinfo(String additionalinfo) {
		this.additionalinfo = additionalinfo;
	}
	public Date getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Date createdby) {
		this.createdby = createdby;
	}
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((additionalinfo == null) ? 0 : additionalinfo.hashCode());
		result = prime * result
				+ ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result
				+ ((createdtime == null) ? 0 : createdtime.hashCode());
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + talksid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Talks))
			return false;
		Talks other = (Talks) obj;
		if (additionalinfo == null) {
			if (other.additionalinfo != null)
				return false;
		} else if (!additionalinfo.equals(other.additionalinfo))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (createdtime == null) {
			if (other.createdtime != null)
				return false;
		} else if (!createdtime.equals(other.createdtime))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (talksid != other.talksid)
			return false;
		return true;
	}
	
	
	
}
