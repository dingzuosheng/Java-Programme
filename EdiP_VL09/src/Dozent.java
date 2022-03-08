
public class Dozent {
		String name;
		String lehrgebiet;
		boolean dekan=false;
		char geschlecht;
		Dozent(String name,String lehrgebiet,char geschlecht){
			this.name=name;
			this.lehrgebiet=lehrgebiet;
			this.geschlecht=geschlecht;
		}
		void setName(String name) {
			this.name=name;
		}
		void setLehrgebiet(String lehrgebiet) {
			this.lehrgebiet=lehrgebiet;
		}
		void setDekan(boolean dekan) {
			this.dekan=dekan;
		}
		void setGeschlecht(char geschlecht) {
			this.geschlecht=geschlecht;
		}
		String getName() {
			return this.name;
		}
		String getLehrgebiet() {
			return this.lehrgebiet;
		}
		boolean isDekan() {
			return this.dekan;
		}
		char getGeschlecht() {
			return this.geschlecht;
		}
	
}
