<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Payment</title>
    <link rel="stylesheet" href="css/paymentstyle.css">
  </head>
  <body>
  <%String total = request.getParameter("total"); %>
    <div class="payment-method">
      <h2>Online Payment Method</h2>
      <div class="container-payment">
      
        <form action="insert" method="post">
          <div class="row">
            <div class="col">
              <h3 class="title-address">Billing address</h3>
              
              <div class="address-label">
                <label for="fullname">total payment:</label>
                <input
                  class="input-label-form"
                  type="text"
                  value=<%=total %>
                  id="fullname"
                  name="total"
                  readonly
                />
              </div>
              <div class="address-label">
                <label for="fullname">Full Name:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="fullname"
                  name="fullname"
                />
              </div>
              <div class="address-label">
                <label for="email">Email:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="email"
                  name="email"
                />
              </div>
              <div class="address-label">
                <label for="address">Address</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="address"
                  name="address"
                />
              </div>
              <div class="address-label">
                <label for="city">City:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="city"
                  name="city"
                />
              </div>
              <div class="address-label">
                <label for="zip-code">Zip Code:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="zip-code"
                  name="zip-code"
                />
              </div>
            </div>
  
            <div class="col">
              <h3 class="title-address">Payment</h3>
  
              <div class="address-label">
                <label for="cards-accepted">Cards Accepted:</label>
                <img src="Payment_Options.jpg" alt="Payment"/>
              </div>
              <div class="address-label">
                <label for="name-on-card">Name on Card:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="name-on-card"
                  name="name-on-card"
                />
              </div>
              <div class="address-label">
                <label for="credit-card-number">Credit card number:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="credit-card-number"
                  name="credit-card-number"
                  placeholder="xxxx-xxxx-xxxx-xxxx"
                />
              </div>
              <div class="address-label">
                <label for="exp-month">Exp month:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="exp-month"
                  name="exp-month"
                />
              </div>
              <div class="flex-label">
                <div class="address-label">
                  <label for="exp-year">Exp year:</label>
                  <input
                    class="input-label-form"
                    type="text"
                    id="exp-year"
                    name="exp-year"
                  />
                </div>
              </div>
              <div class="address-label">
                <label for="cvv">CVV:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="cvv"
                  name="cvv"
                  placeholder="1234"
                />
              </div>
            </div>
          </div>
  
          <input type="submit" value="submit" class="submit-payment" name="paymentsubmit"/>
        </form>
      </div>
    </div>
  </body>
</html>







