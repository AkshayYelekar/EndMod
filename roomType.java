package Utils;

	public enum roomType {
		
		GENERAL(2000),SPECIAL(5000),SEMISPECIAL(3000),ICU(7000);
		
		private int cost;
		
		private roomType(int cost)
		{
			this.cost=cost;
		}

		
		public int getCost() {
			return cost;
		}


		public String toString()
		{
			return name()+" "+cost;
		}
	}



