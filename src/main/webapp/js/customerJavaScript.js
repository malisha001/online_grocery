/**
 * 
 */
   //validate phone number
   
      function validatePhoneNumber(event) {
          var input = event.target;
          input.value = input.value.replace(/\D/g, ''); // Remove non-numeric characters

          if (input.value.length > 10) {
              input.value = input.value.slice(0, 10); // Limit to 10 digits
          }
      }
      
      // validate email
      function validateEmail(event) {
          var input = event.target;
          var regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

          if (!regex.test(input.value)) {
              alert('Please enter a valid email address');
              input.value = ''; // Clear the invalid input
          }
      }
      
      // validate password
      function validatePassword(event) {
    var input = event.target;
    var password = input.value;
    var regex = /^(?=.*[a-zA-Z])(?=.*\d).{8,}$/;

    if (!regex.test(password)) {
        alert('Password must be at least 8 characters long and contain both letters and numbers');
        input.value = ''; // Clear the invalid input
    }
}
    // confirm delete
    function confirmAction() {
    var result = confirm("Are you sure you want to DELETE your Account ?");
    if (result) {
        // User clicked "OK"
        // Add your action here
        alert("Action confirmed!");
    } else {
        // User clicked "Cancel" or closed the dialog
        alert("Action cancelled.");
    }
  }
  
  
   // confirm update
     function confirmUpdate() {
    
        alert("Updated Successfully !!");
     }
     
     // create account after re login
     function createAccount() {
    
        alert("Please Re Login !!");
    }
    


 
 