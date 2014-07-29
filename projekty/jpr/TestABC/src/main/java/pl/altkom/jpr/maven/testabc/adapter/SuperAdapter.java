package pl.altkom.jpr.maven.testabc.adapter;

import pl.altkom.jpr.maven.testabc.adapter.zakupionabiblioteka.Prezenter;
import pl.altkom.jpr.maven.testabc.adapter.zakupionabiblioteka.SuperCompressor;
import pl.altkom.jpr.maven.testabc.adapter.zakupionabiblioteka.SuperDekompressor;

public class SuperAdapter implements Kompressor {

	private Prezenter prezenter = new Prezenter();
	private SuperCompressor superCompressor = new SuperCompressor();
	private SuperDekompressor superDekompressor = new SuperDekompressor();
	
	@Override
	public void komresuj() {
		superCompressor.compresss();

	}

	@Override
	public void wyswietl() {
	
		prezenter.show();

	}

	@Override
	public void dekompresuj() {
		superDekompressor.dekompress();

	}

}
