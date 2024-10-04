package program;

public class CalculadoraRanks {
	private int vitorias;
	private int derrotas;
	
	public CalculadoraRanks (int vitorias, int derrotas) {
		if (vitorias < 0 || derrotas < 0) {
			throw new IllegalArgumentException("As quantidades de vitórias ou derrotas não podem ser negativas");
		}
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		
	}
	
    public int getVitorias() {
        return vitorias;
    }

    
    public void setVitorias(int vitorias) {
        if (vitorias < 0) {
            throw new IllegalArgumentException("A quantidade de vitórias não pode ser negativa");
        }
        this.vitorias = vitorias;
    }

    
    public int getDerrotas() {
        return derrotas;
    }

    
    public void setDerrotas(int derrotas) {
    	if (derrotas < 0) {
            throw new IllegalArgumentException("A quantidade de derrotas não pode ser negativa");
        }
        this.derrotas = derrotas;
    }

    public int calculaSaldoRankeadas() {
    	return this.vitorias - this.derrotas;
    }
    
    public String ClassificaRank(int vitorias) {
    	if (vitorias <= 10) { // apenas menor que 10 não iria incluir 10 vitórias, assim colocando ele como Imortal caso tivesse 10 vitórias
    		return "Ferro";
    	} else if (vitorias >= 11 && vitorias <= 20) {
    		return "Bronze";
    	} else if (vitorias >= 21 && vitorias <= 50) {
    		return "Prata";
    	} else if (vitorias >= 51 && vitorias <= 80) {
    		return "Ouro";
    	} else if (vitorias >= 81 && vitorias <= 90) {
    		return "Diamante";
    	} else if (vitorias >= 91 && vitorias <= 100) {
    		return "Lendário";
    	} else {
    		return "Imortal";
    	}
    }
}	

