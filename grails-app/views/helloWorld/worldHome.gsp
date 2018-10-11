<!doctype.html>
<html>
<head>
  <title>Welcome </title>
<style>
*{
   margin:0px;
   padding:0px;
}
    #container ul{
     list-style:none;
}
#container ul li{
     background-color:orange;
     width:136px;
     border:1px solid white;
     height:50px;
     line-height:50px;
     text-align:center;
     float:left;
     color:white;
     position:relative;
}
#container ul li:hover{
          background-color:red;
 }
#container ul ul{
               display:none;
}
#container ul li:hover>ul{
display:block; 
}
#container ul ul ul{
             margin-left:136px;
             top=0px;
             position:absolute;
}
header{
         background-color:red;
         padding:35px;
         text-align:center;
         font-size:45px;

}
.header img {
  float: right;
  width: 220px;
  height: 125px;
  background: #555;
 
}

.header h1 {
  position: relative;
  top: 18px;
  left: 10px;
}
#bodyimg img{
     width:1240px;
     height:500px;


}
footer{
         background-color:red;
         padding:15px;

}



  </style>
</head>
 <body>
<div class="header">
  <img src="happiie.jpg" alt="filenot specified properly" />
  <header >welcome to the world of fun</header>
</div>
<div id="container">
  
  <ul>
      <li>Home</li>
      <li>About</li>
      <li>Entertainment
              <ul>
                  <li>Hollywood</li>
                  <li>Bollywood</li>
                  <li>Tollywood
                      <ul>
                           <li>Family</li>
                           <li>Friends</li>
                           <li>LoveStories</li>
                      </ul>
                 </li>
             </ul></li>
     <li>Tv Shows</li>
     <li>Serials</li>
     <li>News</li>
     <li>Share fun</li>
     <li>Go join fun</li>
      <li>Contact</li></div>
         <div id="bodyimg">
             <img src="hpy.jpg" alt="image not supported"/>
         
         <g:form float="left">
         <tr>
   <td>Enter First Name: <g:textField name="Enter First Name" /><td></td><br>
   <td>Enter Last Name: <g:textField name="Enter Last Name"  /></td><br>
   <td>Enter Password:  <g:textField name="Enter Password" /></td><br>
   <td>Confirm password:<g:textField name="Confirm password" /></td><br>
        <g:actionSubmit value="signup" />
         
         
         </g:form>
         </div>
         <footer style="background-color:red"></footer>
 </body>
</html>