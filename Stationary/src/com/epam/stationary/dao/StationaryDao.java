package com.epam.stationary.dao;

import java.util.ArrayList;
import java.util.List;

import com.epam.stationary.exception.BaseException;
import com.epam.stationary.model.File;
import com.epam.stationary.model.Folder;
import com.epam.stationary.model.Marker;
import com.epam.stationary.model.Pen;
import com.epam.stationary.model.Pencil;
import com.epam.stationary.model.StationaryItems;
import com.epam.stationary.model.StickNotes;

public class StationaryDao {
  
	public List<StationaryItems> data() throws BaseException{
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
