package Aula_22_10;

public class ConstrutorProfessor {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor();
		Professor professor2 = new Professor("Walmir","Solos");
		
		System.out.println(professor2.getNome());
		System.out.println(professor2.getDisciplina());

	}

}
