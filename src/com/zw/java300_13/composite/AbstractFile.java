package com.zw.java300_13.composite;

import java.util.ArrayList;
import java.util.List;

//����ṹ
public interface AbstractFile {
	void killVirus();//ɱ��
}

class ImageFile implements AbstractFile{
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---ͼ���ļ���"+name+"�����в�ɱ��");
		
	}
	
}
class TextFile implements AbstractFile{
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---�ı��ļ���"+name+"�����в�ɱ��");
		
	}
	
}
class VideoFile implements AbstractFile{
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}


	@Override
	public void killVirus() {
		System.out.println("---��Ƶ�ļ���"+name+"�����в�ɱ��");
		
	}
	
}

class Folder implements AbstractFile{
	private String name;
	//����������������ű������ṹ���µ��ӽڵ�
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	public void add(AbstractFile file) {
		list.add(file);
	}
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	public AbstractFile getChild(int index) {
		return list.get(index);	
	}

	@Override
	public void killVirus() {
		System.out.println("---�ļ��У�"+name+",���в�ɱ");
		
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}
	
}

