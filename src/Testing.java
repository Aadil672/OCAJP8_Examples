/*class Testing{  
	public List<BigDecimal> getMonthWiseOutstandingAmount(boolean isDemandLoan) {
		
	}
		List<BigDecimal> result = new LinkedList<>();
		BigDecimal monthOne, monthTwo, monthThree;
		monthOne = monthTwo = monthThree = BigDecimal.ZERO;
		for (Long identifier : loanSummaryObjectMap.keySet()) {
			ServiceChargeLoanProductSummary summaryObj = loanSummaryObjectMap.get(identifier);
			if (summaryObj.isDemandLaon() ^ isDemandLoan) {
				List<BigDecimal> outstanding = summaryObj.getPeriodicOutstanding();
				int size = outstanding.size();
				if (size > 0) {
					monthOne = monthOne.add(outstanding.get(0));
					if (size > 1) {
						monthTwo = monthTwo.add(outstanding.get(1));
						if (size > 2) {
							monthThree = monthThree.add(outstanding.get(2));
						}
					}
				}
			}
		}
		result.add(monthOne);
		result.add(monthTwo);
		result.add(monthThree);
		return result;
	}*/