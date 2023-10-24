<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Items</title>
    <link rel="stylesheet" href="AdminDashboard.css">
    <link rel="stylesheet" href="home.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid fs-4">
    <div class="row">
        <!-- Sidebar -->
        <div class="col-md-2 bg-dark text-light sidebar">
            <h3 class="my-5" style="text-align: center">Admin Panel</h3>
            <div class="profile-pic mt-5">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH-bASq_TMp6SDNjUmz89fWJ4rpWc68W5P9JdzPIxrcg3OKMgYJLZM9q0M22_jxemTE_E&usqp=CAU"
                     alt="Profile Pic">
            </div>
            <div class="fs-3 p-5 fw-bold" style="text-align: center">
                <c:forEach var="admin" items="${adminDetails}">
                    ${admin.name}<br/>
                    ${admin.email}<br/>
                </c:forEach>
            </div>
            <ul class="nav nav-pills flex-column mb-auto fs-4 px-5 d-grid gap-2">
                <li class="nav-item">
                    <a href="#" class="nav-link text-white" >
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#speedometer2"></use>
                        </svg>
                        Dashboard
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#table"></use>
                        </svg>
                        Orders
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link active" style="background-color: #27ae60" aria-current="page">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#grid"></use>
                        </svg>
                        Products
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#people-circle"></use>
                        </svg>
                         Policies
                    </a>
                </li>
                <div class="sidebar-footer">
                    <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
                </div>
            </ul>
        </div>
        <!-- Right-side Section -->
        <div class="col-md-10 py-4" style="background-color: #f5f5f5">
            <div class="container-fluid">
                <div class="border-0 rounded-3 shadow-sm bg-body rounded p-4" style="background-color: #f9f9f9">

                    <div class="d-grid gap-2 d-md-flex justify-content-between">
                        <div>
                            <button type="button" class="btn btn-success me-md-2 btn-lg"
                                    style="height: 5rem; font-size: 1.7rem; background-color: #27ae60">Add Item
                            </button>
                            <button type="button" class="btn btn-warning me-md-2 btn-lg" disabled
                                    style="height: 5rem; font-size: 1.7rem; color: white;  background-color: #e67e22">
                                Item List
                            </button>
                        </div>
                        <form action="" class="search-boxx-cont">
                            <input type="search" id="search-boxx" placeholder="search hear...">
                            <label for="search-boxx"><i class="uil uil-search"></i></label>
                        </form>

                    </div>
                </div>
                <div class="row justify-content-center border-0 rounded-3 shadow-sm bg-body rounded p-4 mt-5 bg-green">
                    <table class="table" style="font-size: 17px">
                        <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Name</th>
                            <th scope="col">Category</th>
                            <th scope="col">Brand</th>
                            <th scope="col">Unit Price</th>
                            <th scope="col">Quantity</th>
                            <th scope="col">Description</th>
                            <th scope="col" style="width: 130px; min-width: 120px; max-width: 150px;">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%--<tr>
                            <td>1</td>
                            <td>Product 1</td>
                            <td>Category A</td>
                            <td>Brand X</td>
                            <td>10.00</td>
                            <td>100</td>
                            <td>Description for Product 1</td>
                            <td>
                                <button type="button" class="btn btn-danger" onclick="deleteItem(${item.id})"><i
                                        class="uil uil-trash-alt" style="font-size: 15px"></i></button>

                                <button type="button" data-bs-toggle="modal" data-bs-target="#updateModal"
                                        class="btn btn-warning" style="font-size: 15px"><i
                                        class="uil uil-edit"></i></button>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Product 2</td>
                            <td>Category B</td>
                            <td>Brand Y</td>
                            <td>15.50</td>
                            <td>75</td>
                            <td>Description for Product 2</td>
                            <td>
                                <button type="button" class="btn btn-danger" onclick="deleteItem(${item.id})"><i
                                        class="uil uil-trash-alt" style="font-size: 15px"></i></button>

                                <button type="button" data-bs-toggle="modal" data-bs-target="#updateModal"
                                        class="btn btn-warning" style="font-size: 15px"><i
                                        class="uil uil-edit"></i></button>
                            </td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Product 3</td>
                            <td>Category A</td>
                            <td>Brand Z</td>
                            <td>12.75</td>
                            <td>50</td>
                            <td>Description for Product 3</td>
                            <td>
                                <button type="button" class="btn btn-danger" onclick="deleteItem(${item.id})"><i
                                        class="uil uil-trash-alt" style="font-size: 15px"></i></button>

                                <button type="button" data-bs-toggle="modal" data-bs-target="#updateModal"
                                        class="btn btn-warning" style="font-size: 15px"><i
                                        class="uil uil-edit"></i></button>
                            </td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Product 4</td>
                            <td>Category C</td>
                            <td>Brand X</td>
                            <td>9.99</td>
                            <td>120</td>
                            <td>Description for Product 4</td>
                            <td>
                                <button type="button" class="btn btn-danger" onclick="deleteItem(${item.id})"><i
                                        class="uil uil-trash-alt" style="font-size: 15px"></i></button>

                                <button type="button" data-bs-toggle="modal" data-bs-target="#updateModal"
                                        class="btn btn-warning" style="font-size: 15px"><i
                                        class="uil uil-edit"></i></button>
                            </td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Product 5</td>
                            <td>Category B</td>
                            <td>Brand Z</td>
                            <td>18.25</td>
                            <td>60</td>
                            <td>Description for Product 5</td>
                            <td style="    display: flex;
    justify-content: space-evenly;">

                                <form action="UpdateItems.jsp" method="post">
                                    <input type="hidden" name="id" value="${item.id}">
                                    <button type="submit" class="btn btn-warning" style="font-size: 15px"><i
                                            class="uil uil-edit"></i></button>
                                </form>

                                <form action="DeleteItemServlet" method="post">
                                    <input type="hidden" name="delete" value="${item.id}">
                                    <button type="submit" class="btn btn-danger"><i
                                            class="uil uil-trash-alt" style="font-size: 15px"></i></button>
                                </form>
                            </td>
                        </tr>--%>

                        <c:forEach items="${items}" var="item">

                            <c:set var = "id" value = "${item.id}"/>
                            <c:set var = "name" value = "${item.name}"/>
                            <c:set var = "category" value = "${item.category}"/>
                            <c:set var = "brand" value = "${item.brand}"/>
                            <c:set var = "price" value = "${item.unitPrice}"/>
                            <c:set var = "qty" value = "${item.quantity}"/>
                            <c:set var = "description" value = "${item.description}"/>

                            <c:url value = "UpdateItems.jsp" var ="itemUpdate">
                                <c:param name ="id" value ="${id }"/>
                                <c:param name ="name" value ="${name }"/>
                                <c:param name ="category" value ="${category }"/>
                                <c:param name ="brand" value ="${brand }"/>
                                <c:param name ="price" value ="${price }"/>
                                <c:param name ="qty" value ="${qty }"/>
                                <c:param name ="description" value ="${description }"/>
                            </c:url>

                            <tr>
                                <td>${item.id}</td>
                                <td>${item.name}</td>
                                <td>${item.category}</td>
                                <td>${item.brand}</td>
                                <td>${item.unitPrice}</td>
                                <td>${item.quantity}</td>
                                <td>${item.description}</td>
                                <td style="display: flex; justify-content: space-evenly;">

                                    <form action="${itemUpdate}" method="post">
                                        <input type="hidden" name="id" value="${item.id}">
                                        <button type="submit" class="btn btn-warning" style="font-size: 15px"><i
                                                class="uil uil-edit"></i></button>
                                    </form>

                                    <form action="DeleteItemServlet" method="post">
                                        <input type="hidden" name="delete" value="${item.id}">
                                        <button type="submit" class="btn btn-danger"><i
                                                class="uil uil-trash-alt" style="font-size: 15px"></i></button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Update item modal -->
<div class="modal fade fs-4" id="updateModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg modal-dialog-centered modal-dialog-scrollable">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fw-bold" id="exampleModalLabel">Update Item</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form class="row g-3">

                    <div class="col-6 mb-3">
                        <label for="name" class="col-form-label fw-bold">Name:</label>
                        <input type="text" class="form-control" id="name">
                    </div>
                    <div class="col-6 mb-3">
                        <label for="category" class="col-form-label fw-bold">Category:</label>
                        <input class="form-control" id="category"></input>
                    </div>

                    <div class="col-6 mb-3">
                        <label for="brand" class="col-form-label fw-bold">Brand:</label>
                        <input type="text" class="form-control" id="brand">
                    </div>
                    <div class="col-6 mb-3">
                        <label for="quantity" class="col-form-label fw-bold">Quantity:</label>
                        <input class="form-control" id="quantity"></input>
                    </div>
                    <div class="col-6 mb-3">
                        <label for="unit-price" class="col-form-label fw-bold">Unit Price:</label>
                        <input class="form-control" id="unit-price"></input>
                    </div>
                    <div class="col-6 mb-3">
                        <label for="description" class="col-form-label fw-bold">Description:</label>
                        <textarea class="form-control" id="description"></textarea>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary btn-lg" data-bs-dismiss="modal"
                        style="font-size: 1.5rem;">Close
                </button>
                <button type="button" class="btn btn-primary btn-lg"
                        style="font-size: 1.5rem; background-color: #27ae60">Update
                </button>
            </div>
        </div>
    </div>
</div>
<script>
    // JavaScript function to delete an item
    function deleteItem(itemId) {
       
        if (confirm("Are you sure you want to delete this item?")) {
            alert("Item with ID " + itemId + " has been deleted.");
        }
    }
</script>
<%--<footer>
    <p style="margin-bottom: 0px;">&copy; 2023 Grocery</p>
</footer>--%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>