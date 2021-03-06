package taxes;

public class TaxCalculator {
	

	 double calculateTax (String empName , boolean isIndian , double empSal ) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		double taxAmount;
		if(!isIndian) {
        throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax "); 
		}
		else if(empName==null || "".equals(empName)) {
	        throw new EmployeeNameInvalidException("The employee name cannot be empty"); 
		}
		else {
				if(empSal>=10000 && empSal<30000) {
					taxAmount =empSal *4/100 ;
				}
				else if(empSal>=30000 && empSal<50000) {
					taxAmount =empSal *5/100 ;
				}
				else if(empSal>=50000 && empSal<100000) {
					taxAmount =empSal *6/100 ;
				}
				else if(empSal>=100000) {
					taxAmount =empSal *8/100 ;
				}
				else {
					throw new TaxNotEligibleException("The employee does not need to pay tax"); 
					
				}
			}
     
	
	return taxAmount;
}

	
	
}