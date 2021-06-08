package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	Set<Curso> cursos;
	
	public static void main(String[] args) {
		
		Curso java8 = new Curso("Java8");
		Curso oracle12c= new Curso("Oracle12c");
		
		Set<Curso> cursoA =	new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursoA.add(java8);
		cursoA.add(oracle12c);
		
		cursosB.add(java8);
		
		//Interseção A e B faz
		cursoA.retainAll(cursosB);
		System.out.println("A intersec B");
		System.out.println(cursoA);
		
		//A faz e B não faz
		cursoA.removeAll(cursosB);
		System.out.println("A - B");
		System.out.println(cursoA);
		
		//B faz e A não faz
		cursosB.removeAll(cursoA);
		System.out.println("B - A");
		System.out.println(cursosB);
		
		
		Cliente A = new Cliente();
		A.setCursos(cursoA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
		
		
		
		
		
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
