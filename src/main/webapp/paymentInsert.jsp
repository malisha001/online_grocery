<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Payment</title>
    <link rel="stylesheet" href="css/paymentstyle.css">
    <script src="js/customerJavaScript.js"></script>
  </head>
  <body>
  <%String total = request.getParameter("total"); %>
    <div class="payment-method">
      <h2><i></i><b>PAYMENT METHOD</b></h2>
      <div class="container-payment">
      
        <form action="PaymentServlet" method="post">
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
                  required
                />
              </div>
              <div class="address-label">
                <label for="email">Email:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="email"
                  name="email"
                  onblur="validateEmail(event)"
                  required
                />
              </div>
              <div class="address-label">
                <label for="address">Address</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="address"
                  name="address"
                  required
                />
              </div>
              <div class="address-label">
                <label for="city">City:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="city"
                  name="city"
                  required
                />
              </div>
              <div class="address-label">
                <label for="zip-code">Zip Code:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="zip-code"
                  name="zip-code"
                  required
                />
              </div>
            </div>
  
            <div class="col">
              <h3 class="title-address">Payment</h3>
  
              <div class="address-label">
                <label for="cards-accepted">Cards Accepted:</label>
                <img src="paymentsss.jpg" alt="Payment"/>
              </div>
              <div class="address-label">
                <label for="name-on-card">Name on Card:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="name-on-card"
                  name="name-on-card"
                  required
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
                  required
                />
              </div>
              <div class="address-label">
                <label for="exp-month">Exp month:</label>
                <input
                  class="input-label-form"
                  type="text"
                  id="exp-month"
                  name="exp-month"
                  required
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
                    required
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
                  placeholder="123"
                  required
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







