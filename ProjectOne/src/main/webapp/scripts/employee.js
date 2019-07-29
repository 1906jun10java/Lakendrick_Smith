var Reimbursements = [];
var PendingReimbursements = [];

var acceptedReimbursements = [];

function addReimbursement() {
	var reID = prompt("ReimbursmentID: ");
	var amount = prompt("amount: ");
	var userID = prompt("userID: ");
	  var reimbursement = [reID, amount, "Pending", userID];
	  var x = reimbursement.toString();
	  
	  PendingReimbursements.push(reimbursement);
	  Reimbursements.push(reimbursement);
	}
<!--
function allReimbursements(Reimbursements){
	
	
		  
		  var x = Reimbursements.toString();
		  document.getElementById("demo").innerHTML = x;
		}

-->