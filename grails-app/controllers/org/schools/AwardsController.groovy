package org.schools

class AwardsController {
		
	//This creates Dynamic Scaffolding (CRUD) for Award
	static scaffold = Awards

	def index() {

		//render(view: "index")
	}

 	def awards() {
 		render(view: "awards")
			//redirect(controller: "scholarships", action: "index")
	}
		
		
	

		
		
}