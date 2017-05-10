package com.guonl.pattern.adapter;

public class NoteBook {
	
	private ThreePlugIF plug;
	
	public NoteBook(ThreePlugIF plug){
		this.plug = plug;
	}
	
	//使用插座充电
	public void charge(){
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		//笔记本要充电，但是我只有两孔的插座，如何给笔记本充电
		GBTwoPlug two =  new GBTwoPlug();
		ThreePlugIF three =  new TwoPlugAdapter(two);//把二相的转三相
		NoteBook nb =  new NoteBook(three);
		nb.charge();
		
		//继承式的插座适配器
		three =  new TwoPlugAdapterExtends();
		nb =  new NoteBook(three);
		nb.charge();
	}

}
