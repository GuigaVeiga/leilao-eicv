package org.escolacidadeviva.leilao.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.escolacidadeviva.leilao.lance.Lance;

@ManagedBean
@RequestScoped
public class ImagensBean {
private List<String> imagens;
private List<String> ano2A;
private List<String> ano2B;
private List<String> ano3A;
private List<String> ano3B;
private List<String> ano3C;
private List<String> ano4A;
private List<String> ano4B;
private List<String> ano5A;
private List<String> ano5B;
private List<String> ano6A;
private List<String> ano6B;
private List<String> ano7A;
private List<String> ano7B;
private List<String> ano8A;
private List<String> ano8B;
private List<String> ano9A;
private List<String> ano9B;
private List<String> ano1Em;
private List<String> ano2Em;

private Lance id;
    
    @PostConstruct
    public void init() {
        imagens = new ArrayList<String>();
        for (int i = 1; i <= 178; i++) {
            imagens.add(""+i);
        }
        
        ano2A = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
        	 ano2A.add(""+i);
        }
        
        ano2B = new ArrayList<String>();
        for (int i = 11; i <= 20; i++) {
        	ano2B.add(""+i);
        }
        
        ano3A = new ArrayList<String>();
        for (int i = 21; i <= 30; i++) {
        	ano3A.add(""+i);
        }
        
        ano3B = new ArrayList<String>();
        for (int i = 31; i <= 39; i++) {
        	ano3B.add(""+i);
        }
        
        ano3C = new ArrayList<String>();
        for (int i = 40; i <= 49; i++) {
        	ano3C.add(""+i);
        }
        
        ano4A = new ArrayList<String>();
        for (int i = 50; i <= 59; i++) {
        	ano4A.add(""+i);
        }
        
        ano4B = new ArrayList<String>();
        for (int i = 60; i <= 69; i++) {
        	ano4B.add(""+i);
        }
        
        ano5A = new ArrayList<String>();
        for (int i = 70; i <= 79; i++) {
        	ano5A.add(""+i);
        }
        
        ano5B = new ArrayList<String>();
        for (int i = 80; i <= 88; i++) {
        	ano5B.add(""+i);
        }
        
        ano6A = new ArrayList<String>();
        for (int i = 89; i <= 98; i++) {
        	ano6A.add(""+i);
        }
        
        ano6B = new ArrayList<String>();
        for (int i = 99; i <= 106; i++) {
        	ano6B.add(""+i);
        }
        
        ano7A = new ArrayList<String>();
        for (int i = 107; i <= 115; i++) {
        	ano7A.add(""+i);
        }
        
        ano7B = new ArrayList<String>();
        for (int i = 116; i <= 124; i++) {
        	ano7B.add(""+i);
        }
        
        ano8A = new ArrayList<String>();
        for (int i = 125; i <= 132; i++) {
        	ano8A.add(""+i);
        }
        
        ano8B = new ArrayList<String>();
        for (int i = 133; i <= 140; i++) {
        	ano8B.add(""+i);
        }
        
        ano9A = new ArrayList<String>();
        for (int i = 141; i <= 150; i++) {
        	ano9A.add(""+i);
        }
        
        ano9B = new ArrayList<String>();
        for (int i = 151; i <= 158; i++) {
        	ano9B.add(""+i);
        }
        
        ano1Em = new ArrayList<String>();
        for (int i = 159; i <= 168; i++) {
        	ano1Em.add(""+i);
        }
        
        ano2Em = new ArrayList<String>();
        for (int i = 169; i <= 178; i++) {
        	ano2Em.add(""+i);
        }
    }
 
    public List<String> getImagens() {
        return imagens;
    }

	public Lance getId() {
		return id;
	}

	public void setId(Lance id) {
		this.id = id;
	}

	public List<String> getAno2A() {
		return ano2A;
	}

	public void setAno2A(List<String> ano2a) {
		ano2A = ano2a;
	}

	public List<String> getAno2B() {
		return ano2B;
	}

	public void setAno2B(List<String> ano2b) {
		this.ano2B = ano2b;
	}

	public List<String> getAno3A() {
		return ano3A;
	}

	public void setAno3A(List<String> ano3a) {
		ano3A = ano3a;
	}

	public List<String> getAno3B() {
		return ano3B;
	}

	public void setAno3B(List<String> ano3b) {
		ano3B = ano3b;
	}

	public List<String> getAno3C() {
		return ano3C;
	}

	public void setAno3C(List<String> ano3c) {
		ano3C = ano3c;
	}

	public List<String> getAno4A() {
		return ano4A;
	}

	public void setAno4A(List<String> ano4a) {
		ano4A = ano4a;
	}

	public List<String> getAno4B() {
		return ano4B;
	}

	public void setAno4B(List<String> ano4b) {
		ano4B = ano4b;
	}

	public List<String> getAno5A() {
		return ano5A;
	}

	public void setAno5A(List<String> ano5a) {
		ano5A = ano5a;
	}

	public List<String> getAno5B() {
		return ano5B;
	}

	public void setAno5B(List<String> ano5b) {
		ano5B = ano5b;
	}

	public List<String> getAno6A() {
		return ano6A;
	}

	public void setAno6A(List<String> ano6a) {
		ano6A = ano6a;
	}

	public List<String> getAno6B() {
		return ano6B;
	}

	public void setAno6B(List<String> ano6b) {
		ano6B = ano6b;
	}

	public List<String> getAno7A() {
		return ano7A;
	}

	public void setAno7A(List<String> ano7a) {
		ano7A = ano7a;
	}

	public List<String> getAno7B() {
		return ano7B;
	}

	public void setAno7B(List<String> ano7b) {
		ano7B = ano7b;
	}

	public List<String> getAno8A() {
		return ano8A;
	}

	public void setAno8A(List<String> ano8a) {
		ano8A = ano8a;
	}

	public List<String> getAno8B() {
		return ano8B;
	}

	public void setAno8B(List<String> ano8b) {
		ano8B = ano8b;
	}

	public List<String> getAno9A() {
		return ano9A;
	}

	public void setAno9A(List<String> ano9a) {
		ano9A = ano9a;
	}

	public List<String> getAno9B() {
		return ano9B;
	}

	public void setAno9B(List<String> ano9b) {
		ano9B = ano9b;
	}

	public List<String> getAno1Em() {
		return ano1Em;
	}

	public void setAno1Em(List<String> ano1Em) {
		this.ano1Em = ano1Em;
	}

	public List<String> getAno2Em() {
		return ano2Em;
	}

	public void setAno2Em(List<String> ano2Em) {
		this.ano2Em = ano2Em;
	}

	public void setImagens(List<String> imagens) {
		this.imagens = imagens;
	}
    
    
}
