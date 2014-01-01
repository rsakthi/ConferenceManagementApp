import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import manager.ConferenceManager;
import utility.IConstants;


public class Test {
	
	
	
	public HashSet receiveInputFromConsole(){
		HashSet<String> sessionset = new HashSet<String>();	
		boolean isInputRequired = false;
		do{
			isInputRequired = false;
			System.out.print(IConstants.INPUT_DISPLAY_TALKNAME);			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			try {			
				String talkname = br.readLine();
				System.out.print(IConstants.INPUT_DISPLAY_TALKTIME);
				String talktime = br.readLine();
				String talkdetail = talkname + " " + talktime + "min";
				sessionset.add(talkdetail);	
				System.out.println(IConstants.INPUT_DISPLAY_CONFIRMATION);
				String loop = br.readLine();
				if(loop.equalsIgnoreCase("yes")){
					isInputRequired = true;					
				}
			} catch (IOException e) {			
				e.printStackTrace();
			}
			
		}while(isInputRequired);
		return sessionset;
	}
	
	public void printRegistrations(HashSet param){
		System.out.println("Session Information");
		Iterator itr = param.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().toString());
		}
	}
	

	public static void main(String[] args) {
		Test obj = new Test();
		ConferenceManager cm = new ConferenceManager();
		HashSet hs = obj.receiveInputFromConsole();
		obj.printRegistrations(hs);
		HashMap hm = cm.readTrackList(hs);
		Set keys = hm.keySet();
		Iterator it = keys.iterator();
		List key = new ArrayList();
		while(it.hasNext()){
			 key.add((List)hm.get(it.next()));			
		}
		for(int i = 0; i < key.size(); i++){
			System.out.println("The values are "+ key.get(i).toString());
		}
		
	}
}
