<!DOCTYPE html>
<html lang="en" ng-app="app" class="no-js">
<head>
    <meta charset="utf-8">
    <title>Spring and Angularjs </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../resources/static/css/app.css">
</head>
<body>
<div class="container">
    <h2 class="bg-info">Spring with Angularjs </h2>
    <div class="home-section">
        <ul class="menu-list">
            <li><a href="#/gallery">Photo Gallery</a></li>
            <li><a href="#/contactus">Contact</a></li>
            <li><a class="button" href="#/form">Form</a></li>
            <li><a class="btn" href="#/home">Home</a></li>
        </ul>
    </div>
    <!-- SHOW ERROR/SUCCESS MESSAGES -->
    <div id="messages">{{message}}</div>

    <div ng-view></div>
</div>

<script src="../resources/static/angular/angular.min.js"></script>
<script src="../resources/static/angular/angular-resource.min.js"></script>
<script src="../resources/static/angular/angular-route.min.js"></script>
<script src="../resources/static/angular/angular-messages.min.js"></script>

<script src="../resources/static/js/app.js"></script>
<script src="../resources/static/js/controller.js"></script>
<link rel="stylesheet" href="./webjars/bootstrap/3.3.7-1/css/bootstrap.css">
</body>
</html>
