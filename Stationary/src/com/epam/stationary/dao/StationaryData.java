package com.epam.stationary.dao;

import java.util.ArrayList;
import java.util.List;

import com.epam.stationary.domain.File;
import com.epam.stationary.domain.Folder;
import com.epam.stationary.domain.Marker;
import com.epam.stationary.domain.Pen;
import com.epam.stationary.domain.Pencil;
import com.epam.stationary.domain.StationaryItems;
import com.epam.stationary.domain.StickNotes;

public class StationaryData {
  
	public List<StationaryItems> data(){
		List<StationaryItems> kit = new ArrayList<>();
		
		kit.add(new Pen("Reynalod", 10));
		kit.add(new Pencil("NatRaj", 7));
		kit.add(new File("Cliper", 50));
		kit.add(new Folder("ZipFolder", 120));
		kit.add(new Marker("Black", 45));
		kit.add(new StickNotes("Manoj", 65));
		
		return kit;
	}
}
