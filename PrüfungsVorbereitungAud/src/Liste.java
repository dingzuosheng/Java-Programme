
public class Liste {
		private Link anfang;
		private Link ende;
		
		public Liste() {
			
		}
		public void einfuegen(final Person daten) {
			anfang=new Link(daten,anfang);// einfuegen am Anfang;
			if(ende==null) {
				anfang=ende;
			}
		}
		public void entfernen() {
			// loeschen am Anfang;
			if(anfang!=null) {
				if(anfang==ende) {
					ende=null;
				}
				anfang=anfang.naechster;
			}
		}
		public void anfuegen(final Person daten) {
			//einfuegen am Ende ;
			Link neu=new Link(daten,null);
			if(anfang==null) {
				anfang=ende=neu;
			}else {
				ende.naechster=neu;
				ende=neu;
			}
		}
		public void leeren() {
			anfang=ende=null;
		}
		public void iterieren() {
			Link zeiger=anfang;
			while(zeiger!=null) {
				zeiger=zeiger.naechster;
			}
		}
		public void ausgeben() {
			Link zeiger=anfang;
			while(zeiger!=null) {
				System.out.println(zeiger);
				zeiger=zeiger.naechster;
			}
		}
		public int zaehlen() {
			int anz=0;
			Link zeiger=anfang;
			while(zeiger!=null) {
				zeiger=zeiger.naechster;
				anz++;
			}
			return anz;
		}
		public boolean suchen(final Person daten) {
			Link zeiger=anfang;
			while(zeiger!=null) {
				if(zeiger.daten.equals(daten))
					return true;
				zeiger=zeiger.naechster;
			}
			return false;
		}
		
}
