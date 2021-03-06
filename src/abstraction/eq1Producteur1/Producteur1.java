package abstraction.eq1Producteur1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import abstraction.fourni.IActeur;
import abstraction.fourni.Journal;
import abstraction.fourni.Variable;
import abstraction.fourni.Filiere;

public class Producteur1 implements IActeur {

	private Variable stockFeves;
	private Integer cryptogramme;
	private Journal journalEq1;

	public Producteur1() {
		this.stockFeves=new Variable(getNom()+" stock feves", this, 0, 10000, 1000);
		this.journalEq1 = new Journal("Eq1 activites", this);
	}

	public void setCryptogramme(Integer crypto) {
		this.cryptogramme = crypto;
	}

	public String getNom() {
		return "EQ1";
	}

	public String getDescription() {
		return "Producteur bla bla bla";
	}

	public Color getColor() {
		return new Color(26, 188, 156);
	}

	public void initialiser() {
	}

	public void next() {
	}

	public List<String> getNomsFilieresProposees() {
		return new ArrayList<String>();
	}

	public Filiere getFiliere(String nom) {
		return null;
	}

	public List<Variable> getIndicateurs() {
		List<Variable> res=new ArrayList<Variable>();
		res.add(this.stockFeves);
		return res;
	}

	public List<Variable> getParametres() {
		List<Variable> res=new ArrayList<Variable>();
		return res;
	}

	public List<Journal> getJournaux() {
		List<Journal> res=new ArrayList<Journal>();
		res.add(this.journalEq1);
		return res;
	}

	public void notificationFaillite(IActeur acteur) {
		if (this==acteur) {
			System.out.println("I'll be back... or not... "+this.getNom());
		} else {
			System.out.println("Poor "+acteur.getNom()+"... We will miss you. "+this.getNom());
		}
	}

	public void notificationOperationBancaire(double montant) {
	}
}
