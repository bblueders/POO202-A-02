package bomba;

import java.util.ArrayList;

import javax.swing.JPanel;


public class Enigma extends JPanel{
	
	private int executions;
	
	private ArrayList<RaciocinioLogico> raciocinioLogico = new ArrayList();
	private ArrayList<RaciocinioLogico2> raciocinioLogico2 = new ArrayList();
	private ArrayList<LogicaProposicional> logicaProposicional = new ArrayList();
	private ArrayList<LogicaProposicional2> logicaProposicional2 = new ArrayList();
	private ArrayList<LogicaPredicados> logicaPredicados = new ArrayList();
	private ArrayList<LogicaPredicados1> logicaPredicados1 = new ArrayList();
	
	
	public void getRightAnswers() {
		int total = 0;
		for(RaciocinioLogico r: this.raciocinioLogico) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers() {
		int total = 0;
		for(RaciocinioLogico r: this.raciocinioLogico) {
			total += r.getRespostaErrada();
		}
	}
	
	public void getRightAnswers1() {
		int total = 0;
		for(RaciocinioLogico2 r: this.raciocinioLogico2) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers1() {
		int total = 0;
		for(RaciocinioLogico2 r: this.raciocinioLogico2) {
			total += r.getRespostaErrada();
		}
	}
	
	public void getRightAnswers2() {
		int total = 0;
		for(LogicaProposicional r: this.logicaProposicional) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers2() {
		int total = 0;
		for(LogicaProposicional r: this.logicaProposicional) {
			total += r.getRespostaErrada();
		}
	}
	
	public void getRightAnswers3() {
		int total = 0;
		for(LogicaProposicional2 r: this.logicaProposicional2) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers3() {
		int total = 0;
		for(LogicaProposicional2 r: this.logicaProposicional2) {
			total += r.getRespostaErrada();
		}
	}
	
	public void getRightAnswers4() {
		int total = 0;
		for(LogicaPredicados r: this.logicaPredicados) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers4() {
		int total = 0;
		for(LogicaPredicados r: this.logicaPredicados) {
			total += r.getRespostaErrada();
		}
	}
	
	public void getRightAnswers5() {
		int total = 0;
		for(LogicaPredicados1 r: this.logicaPredicados1) {
			total += r.getRespostaCorreta();
		}
	}
	
	public void getWrongAnswers5() {
		int total = 0;
		for(LogicaPredicados1 r: this.logicaPredicados1) {
			total += r.getRespostaErrada();
		}
	}
	
	public int getExecutions() {
		return executions;
	}
	public void setExecutions(int executions) {
		this.executions = executions;
	}
	public ArrayList<RaciocinioLogico> getRaciocinioLogico() {
		return raciocinioLogico;
	}
	public void setRaciocinioLogico(ArrayList<RaciocinioLogico> raciocinioLogico) {
		this.raciocinioLogico = raciocinioLogico;
	}
	public ArrayList<RaciocinioLogico2> getRaciocinioLogico2() {
		return raciocinioLogico2;
	}
	public void setRaciocinioLogico2(ArrayList<RaciocinioLogico2> raciocinioLogico2) {
		this.raciocinioLogico2 = raciocinioLogico2;
	}
	public ArrayList<LogicaProposicional> getLogicaProposicional() {
		return logicaProposicional;
	}
	public void setLogicaProposicional(ArrayList<LogicaProposicional> logicaProposicional) {
		this.logicaProposicional = logicaProposicional;
	}
	public ArrayList<LogicaProposicional2> getLogicaProposicional2() {
		return logicaProposicional2;
	}
	public void setLogicaProposicional2(ArrayList<LogicaProposicional2> logicaProposicional2) {
		this.logicaProposicional2 = logicaProposicional2;
	}
	public ArrayList<LogicaPredicados> getLogicaPredicados() {
		return logicaPredicados;
	}
	public void setLogicaPredicados(ArrayList<LogicaPredicados> logicaPredicados) {
		this.logicaPredicados = logicaPredicados;
	}
	public ArrayList<LogicaPredicados1> getLogicaPredicados1() {
		return logicaPredicados1;
	}
	public void setLogicaPredicados1(ArrayList<LogicaPredicados1> logicaPredicados1) {
		this.logicaPredicados1 = logicaPredicados1;
	}
	
	

}
