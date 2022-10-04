<h1 align="center" style="color:maroon"><u>KETTLES KART</u></h1><br><br>
<style>
    u
    {
        border-bottom: 5px dotted #000;
    }
    h1
    {
        font-size: 60px;
    }
    body
    {
        background-color: antiquewhite;
    }
    body
    {
        background-image: url('kk.jpg');
        background-repeat: no-repeat;
        background-position: top left;
    }
    
    table, tr, td {
  border: 1px solid black;
  
    }
  tr, td{
    background-color: lightgray;
  }
  
</style>
<form action="/auth1.jsp" method="post">

<table align="center" border="2">
    <tr>
        <td>Enter Name:</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>Enter Password:</td>
        <td><input type="password" name="password"></td>
    </tr>
    <tr>
        <td>Enter PhoneNo:</td>
        <td><input type="text" name="phoneNo"></td>
    </tr>
    <tr>
        <td>Enter Email:</td>
        <td><input type="email" name="email"></td>
    </tr>
    <tr>
        <td>Enter Address:</td>
        <td><input type="text" name="address"></td>
    </tr>
    <tr>
        <td>Choose Destiny:</td>
        <td><input type="radio" id="b2c" name="b2c" value="isVendor">Vendor
            <input type="radio" id="b2c" name="b2c" value="isCustomer">Customer</td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Submit"></td>
    </tr>


</table>
</form>