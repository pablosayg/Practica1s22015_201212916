package com.Main;
import com.Listas.*;
import com.Pojos.*;

public class CargaObjetos {
	
	ListaD Goomba, Koopa, Suelo, Pared, Moneda, Vida, Castillo, Jugador;
	
	public CargaObjetos(){
		Goomba = new ListaD(); 
		Koopa = new ListaD();
		Suelo = new ListaD();
		Pared = new ListaD();
		Moneda = new ListaD();
		Vida = new ListaD();
		Castillo = new ListaD();
		Jugador = new ListaD();
		
		
		this.ejecutar();
		
	}
	
	public void ejecutar(){
		this.CargaGoomba();
		this.CargaKoopa();
		this.CargaSuelo();
		this.CargaPared();
		this.CargaMoneda();
		this.CargaVida();
		this.CargaCastillo();
		this.CargaJugador();
	}
	
	public void CargaGoomba(){
		try{
			for(int i= 0 ; i<5; i++){
				Goomba.agregarNodo(new Goomba(i+1));
			}	
		}catch(Exception e){
			System.out.println("Error en metodo CargaGoomba() " + e);
		}
	}
	
	public void CargaKoopa() {
		try {
			for (int i = 0; i < 5; i++) {
				Koopa.agregarNodo(new Koopa(i + 1));
			}
		} catch (Exception e) {
			System.out.println("Error en metodo CargaKoopa() " + e);
		}
	}
	
	public void CargaSuelo() {
		try {
			for (int i = 0; i < 5; i++) {
				Suelo.agregarNodo(new Suelo(i + 1));
			}
		} catch (Exception e) {
			System.out.println("Error en metodo CargaSuelo() " + e);
		}
	}
	
	public void CargaPared() {
		try {
			for (int i = 0; i < 5; i++) {
				Pared.agregarNodo(new Pared(i + 1));
			}
		} catch (Exception e) {
			System.out.println("Error en metodo CargaPared() " + e);
		}
	}
	
	public void CargaMoneda() {
		try {
			for (int i = 0; i < 5; i++) {
				Moneda.agregarNodo(new Moneda(i + 1));
			}
		} catch (Exception e) {
			System.out.println("Error en metodo CargaMoneda() " + e);
		}
	}
	
	public void CargaVida() {
		try {
			for (int i = 0; i < 5; i++) {
				Vida.agregarNodo(new Vida(i + 1));
			}
		} catch (Exception e) {
			System.out.println("Error en metodo CargaVida() " + e);
		}
	}
	
	public void CargaCastillo() {
		try {
			Castillo.agregarNodo(new Castillo(1));
		} catch (Exception e) {
			System.out.println("Error en metodo CargaCastillo() " + e);
		}
	}
	
	public void CargaJugador() {
		try {
			Jugador.agregarNodo(new Personaje(1));
		} catch (Exception e) {
			System.out.println("Error en metodo CargaJugador() " + e);
		}
	}
	

}
