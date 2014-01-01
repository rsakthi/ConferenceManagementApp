/**
 * 
 */
package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author ramas7
 *
 */
public class ConferenceManager {
	List conflist = new ArrayList();
	
	
	public HashMap readTrackList(HashSet param){
		HashMap<Integer, List> confmap = new HashMap();
		Iterator it = param.iterator();
		while(it.hasNext()){
			conflist.add(it.next().toString());
		}
		//System.out.println(conflist.size());
		Iterator itr = conflist.iterator();
		//while(itr.hasNext()){
		for(int i=0; i < conflist.size(); i++){	
			//String talk = itr.next().toString();	
			String talk = (String) conflist.get(i);
			if(confmap.containsKey(Integer.parseInt(talk.substring(talk.lastIndexOf(" ")+1, talk.lastIndexOf("min"))))){
				List values = confmap.get(confmap.get(Integer.parseInt(talk.substring(talk.lastIndexOf(" ")+1, talk.lastIndexOf("min")))));
				values.add(talk.substring(0, talk.lastIndexOf(" ")));
				confmap.put(Integer.parseInt(talk.substring(talk.lastIndexOf(" ")+1, talk.lastIndexOf("min"))), values);
			}else{
				List values = new ArrayList();
				values.add(talk.substring(0,talk.lastIndexOf(" ")));
				confmap.put(Integer.parseInt(talk.substring(talk.lastIndexOf(" ")+1, talk.lastIndexOf("min"))), values);
			}
			//conf.add(Integer.parseInt(talk.substring(talk.lastIndexOf(" ")+1, talk.lastIndexOf("min"))),talk.substring(talk.lastIndexOf(" "), talk.lastIndexOf("min")));
		}	
		return confmap;
	}
	
}
