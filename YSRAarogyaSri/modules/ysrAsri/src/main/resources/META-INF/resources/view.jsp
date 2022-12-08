
<%@ include file="/init.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 5 Mega Menu Example</title>
    <!-- Bootstrap 5 CSS -->
    <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css'>
    <!-- Google Fonts -->
    <link rel='stylesheet' href='https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@400;700&amp;display=swap'>
    <!-- Font Awesome CSS -->
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css'>
    <!-- Style CSS -->
    <link rel="stylesheet" href="css/style.css">

    <!-- Demo CSS -->
    <link rel="stylesheet" href="css/demo.css">
  
  </head>
  <body>
 <header class="intro">
 <h1>Bootstrap 5 Mega Menu Example</h1>
 <p> A multi level mega dropdown menu using Bootstrap 5.</p>
 <div class="action">
 <a href=" https://www.codehim.com/bootstrap/bootstrap-5-mega-menu-responsive-examples/" title="Back to download and tutorial page" class="btn back">Back to Tutorial</a>
 </div>
 
 </header>
  
 <main>
<!-- Start Mega Menu HTML -->
<nav class="navbar navbar-expand-lg navbar-light bg-dark navbar-dark shadow">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Bootstrap 5 <span class="badge bg-primary">Mega Menu</span></a>
      <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-content">
        <div class="hamburger-toggle">
          <div class="hamburger">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
      </button>
      <div class="collapse navbar-collapse" id="navbar-content">
        <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Home</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" data-bs-auto-close="outside">Multilevel</a>
            <ul class="dropdown-menu shadow">
              <li><a class="dropdown-item" href="#">Gallery</a></li>
              <li><a class="dropdown-item" href="blog.html">Blog</a></li>
              <li class="dropstart">
                <a href="#" class="dropdown-item dropdown-toggle" data-bs-toggle="dropdown">Submenu Left</a>
                <ul class="dropdown-menu shadow">
                  <li><a class="dropdown-item" href=""> Third level 1</a></li>
                  <li><a class="dropdown-item" href=""> Third level 2</a></li>
                  <li><a class="dropdown-item" href=""> Third level 3</a></li>
                  <li><a class="dropdown-item" href=""> Third level 4</a></li>
                  <li><a class="dropdown-item" href=""> Third level 5</a></li>
                </ul>
              </li>
              <li class="dropend">
                <a href="#" class="dropdown-item dropdown-toggle" data-bs-toggle="dropdown" data-bs-auto-close="outside">Submenu Right</a>
                <ul class="dropdown-menu shadow">
                  <li><a class="dropdown-item" href=""> Second level 1</a></li>
                  <li><a class="dropdown-item" href=""> Second level 2</a></li>
                  <li><a class="dropdown-item" href=""> Second level 3</a></li>
                  <li class="dropend">
                    <a href="#" class="dropdown-item dropdown-toggle" data-bs-toggle="dropdown">Let's go deeper!</a>
                    <ul class="dropdown-menu dropdown-submenu shadow">
                      <li><a class="dropdown-item" href=""> Third level 1</a></li>
                      <li><a class="dropdown-item" href=""> Third level 2</a></li>
                      <li><a class="dropdown-item" href=""> Third level 3</a></li>
                      <li><a class="dropdown-item" href=""> Third level 4</a></li>
                      <li><a class="dropdown-item" href=""> Third level 5</a></li>
                    </ul>
                  </li>
                  <li><a class="dropdown-item" href=""> Third level 5</a></li>
                </ul>
              </li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item dropdown dropdown-mega position-static">
            <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" data-bs-auto-close="outside">Megamenu</a>
            <div class="dropdown-menu shadow">
              <div class="mega-content px-4">
                <div class="container-fluid">
                  <div class="row">
                    <div class="col-12 col-sm-4 col-md-3 py-4">
                      <h5>Pages</h5>
                      <div class="list-group">
                        <a class="list-group-item" href="#">Accomodations</a>
                        <a class="list-group-item" href="#">Terms & Conditions</a>
                        <a class="list-group-item" href="#">Privacy</a>
                      </div>
                    </div>
                    <div class="col-12 col-sm-4 col-md-3 py-4">
                      <h5>Card</h5>
                      <div class="card">
                  <img src="img/banner-image.jpg" class="img-fluid" alt="image">
                  <div class="card-body">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  </div>
                </div>
                    </div>
                    <div class="col-12 col-sm-4 col-md-3 py-4">
                      <h5>About CodeHim</h5>
                        <p><b>CodeHim</b> is one of the BEST developer websites that provide web designers and developers with a simple way to preview and download a variety of free code & scripts.</p>
                    </div>
                    <div class="col-12 col-sm-12 col-md-3 py-4">
                      <h5>Damn, so many</h5>
                      <div class="list-group">
                        <a class="list-group-item" href="#">Accomodations</a>
                        <a class="list-group-item" href="#">Terms & Conditions</a>
                        <a class="list-group-item" href="#">Privacy</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
          </li>
        </ul>
        <form class="d-flex ms-auto">
            <div class="input-group">
                <input class="form-control border-0 mr-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-primary border-0" type="submit">Search</button>
            </div>
        </form>
      </div>
    </div>
  </nav>
<!-- END Mega Menu HTML -->

 </main>
 
  <footer class="credit">Author: Simon Köhler - Distributed By: <a title="Awesome web design code & scripts" href="https://www.codehim.com?source=demo-page" target="_blank">CodeHim</a></footer>
  
<!-- Bootstrap 5 JS -->
<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js'></script>
<script>
   // (c) 2020 Written by Simon Köhler in Panama
// github.com/koehlersimon
// simon-koehler.com

// No JavaScript needed for this example anymore!

document.addEventListener('click',function(e){
  // Hamburger menu
  if(e.target.classList.contains('hamburger-toggle')){
    e.target.children[0].classList.toggle('active');
  }
})   
      
</script>
  
  </body>
</html>