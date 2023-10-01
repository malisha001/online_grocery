<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="home.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
</head>
<body>
    <!-- header section -->
    <header>
        <div class="header-1">
            <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
            <form action="" class="search-boxx-cont">
                <input type="search" id="search-boxx" placeholder="search hear...">
                <label for="search-boxx"><i class="uil uil-search"></i></label>
            </form>
        </div>

        <div class="header-2">
            <nav class="navbar">
                <a href="#">home</a>
                <div class="dropdown">
                    <a href="#">catergary</a>
                    <div class="dropdown-content">
                        <a href="#">beverage</a>
                        <a href="#">backery items</a>
                        <a href="#">diary broduct</a>
                        <a href="#">cofee & tea</a>
                        <a href="#">drocery &stap</a>
                        <a href="#">houce hold</a>
                    </div>
                </div>
                <a href="#">product</a>
                <a href="#">contact</a>
            </nav>
            

            <div class="icons">
                <a href="#"><i class="uil uil-shopping-cart-alt"></i></a>
                <a href="#"><i class="uil uil-heart"></i></a>
                <a href="#" class="user-pic" onclick="toggleMenu()"><i class="uil uil-user-circle"></i></a>
                <div class="subb-men-wrapp" id="subMenu">
                    <div class="subb-men">
                        <div class="user-info">
                            <img src="image/user.png" alt="">
                            <h2>malisha</h2>
                        </div>
                        <hr>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/setting.png" alt="">
                            <p>setting</p>
                            <span>></span>
                        </a>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/logout.png" alt="">
                            <p>log out</p>
                            <span>></span>
                        </a>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/help.png" alt="">
                            <p>edite profile</p>
                            <span>></span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <script src="home.js"></script>`
    <!-- header section end -->
    <!-- home/banner section start -->

    <section class="home" id="home">
        <div class="image">
            <img src="image/grocery-homapage-bg-image.png" alt="" width="700px" height="auto">
        </div>
        <div class="contt">
            <span>fresh and organic</span>
            <h4>your daily need product</h4>
            <a href="#" class="buttn">get start</a>
        </div>
    </section>

    <!-- home/banner section end -->
    <!-- catergary start -->
    <section class="catergary" id="catergary">
        <h1 class="heading">shop by <span>catergary</span></h1>
        <div>

        </div>
    </section>
    <div class="grid-container">
        <div><a href="#"><img src="image/BEVERAGES-1-removebg-preview.png" alt="" width="150px"><p>beverage</p></a></div>
        <div><a href="#"><img src="image/BREAKFAST-BAKERY-removebg-preview.png" alt="" width="150px"><p>bakery items</p></a></div>
        <div><a href="#"><img src="image/DAIRY-PRODUCTS-removebg-preview.png" alt="" width="150px"><p>diary product</p></a></div>  
        <div><a href="#"><img src="image/Untitled-design-22.png" alt="" width="150px"><p>coffee,tea and molts</p></a></div>
        <div><a href="#"><img src="image/GROCERY-STAPLES-removebg-preview.png" alt="" width="150px"><p>grocery & staples</p></a></div>
        <div><a href="#"><img src="image/HOUSEHOLD-removebg-preview.png" alt="" width="150px"><p>houose hold</p></a></div>
        <div><a href="#"><img src="image/iconss-14-removebg-preview.png" alt="" width="150px"><p>snack and confectionary</p></a></div>
        <div><a href="#"><img src="image/Untitled-design-20.png" alt="" width="150px"><p>frozen</p></a></div>
    </div>
    <!-- catergary end -->
    <!-- product start -->
    <section class="product" id="product">
        <h1 class="heading">latest <span>product</span></h1>
        <div>
            <div class="boxx-cont">
                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic banana</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic tomato</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic banana</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic banana</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic banana</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                <div class="boxx">
                    <span class="discount">-33%</span>
                    <div class="icons">
                        <a href="#"><i class="uil uil-heart-sign"></i></a>
                        <a href="#"><i class="uil uil-eye"></i></a>
                    </div>
                    <img src="image/Banana-Single.jpg" alt="" height="100px">
                    <h3>organic banana</h3>
                    <div class="price">$10.0 <span>$13.20</span></div>
                    <div class="quentity">
                        <span>quentity:</span>
                        <input type="number" min="1" max="100" value="1">
                        <span>/kg</span>
                    </div>
                    <a href="#" class="buttn">add to cart</a>
                </div>

                
            </div>
        </div>
    </section>
    <!-- product end -->
    <!-- footer start -->
    <section class="footer">
    <hr>
        <div class="boxx-cont">
            <div class="boxx">
                <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
                <p>this is discription of web site</p>
                <div class="share">
                    <a href="#" class="buttn fab fa-facebook-f"></a>
                    <a href="#" class="buttn fab fa-twitter"></a>
                    <a href="#" class="buttn fab fa-instagram"></a>
                </div>
            </div>
            <div class="boxx">
                <h3>our location</h3>
                <div class="links">
                    <a href="#">home</a>
                    <a href="#">usa</a>
                    <a href="#">catergary</a>    
                </div>
            </div>
            <div class="boxx">
                <h3>our location</h3>
                <div class="links">
                    <a href="#">home</a>
                    <a href="#">usa</a>
                    <a href="#">catergary</a>    
                </div>
            </div>
        </div>
        <h1 class="credit">created by <span>CMBU</span>|all right reserve</h1>
    </section>
    <!-- footer end -->
    <script>
        let subMenu = document.getElementById("subMenu");

        function toggleMenu(){
            subMenu.classList.toggle("open-menu");
        }
    </script>
</body>
</html>