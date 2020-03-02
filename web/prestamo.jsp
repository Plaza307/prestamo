<%-- 
    Document   : prestamo
    Created on : 02-mar-2020, 19:19:09
    Author     : Ángel Plaza Cámara
--%>
<%@page import="modelo.Cuota"%>
<%@page import="modelo.Prestamo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Banco Bosco</h1>
        <h2>Solicitud de Préstamos</h2>
        <% ArrayList<String> meses = ( ArrayList<String> ) request.getAttribute("meses"); 
        String nombre = ( String ) request.getAttribute("nombre");
        
        
       if ( nombre==null ) {
           nombre=""; 
       }
        Prestamo  miPrestamo = ( Prestamo ) request.getAttribute("prestamo");
        String importePrestamo, cantidad, intereses, tiempo;
        
        if ( miPrestamo==null) {
            importePrestamo="0"; cantidad = "0"; intereses="0";tiempo="12";
        } else {
            importePrestamo = String.valueOf(miPrestamo.getImportePrestamo());
            cantidad = String.valueOf(miPrestamo.getCantidad());
            intereses = String.valueOf(miPrestamo.getIntereses());
            tiempo = String.valueOf(miPrestamo.getTiempo());
        }
        %>
        <form action="prestamo" method="post">
            <p><label for="nombre">Nombre:</label><input type="text" id="nombre" name="nombre" value="<%=nombre%>" ></p><br>
            <p><label for="cantidad">Cantidad que solicita:</label><input type="text" id="cantidad" name="cantidad" value="<%=cantidad%>"  ></p><br>
            <p><label for="intereses">Interés:</label><input type="text" id="intereses" name="interes" value="<%=intereses%>" ></p><br>
            <p><label for="tiempo">Tiempo(meses):</label><select id="tiempo" name="tiempo" >
                    
                       <% for (int i=0; i<meses.size(); i++) {
                       String cadenaSelected="";
                       if ( tiempo.equals(meses.get(i))) {
                           cadenaSelected = "selected";
                       }
                       %>
                       <option value="<%=meses.get(i) %>" <%=cadenaSelected%> ><%=meses.get(i) %></option>   
                       <% } %>     
                     </select>
            <input type="submit" value="Consultar">
            
            
            
            
            
            
            <!-- Compruebo que el importe del prestamo no es null, para generar la tabla con las cuotas -->
            <% if ( importePrestamo!="" ) { %>
                    <h1>ImporteTotalPrestamo: <%=importePrestamo %></h1>
           <% }%>
           <table border="5">
           <% ArrayList<Cuota> cuotas = (ArrayList<Cuota>) request.getAttribute("cuotas");
           if (cuotas!=null) { %>
           <tr>
               <th>NumCuota</th>
               <th>Importe</th>
               <th>Cantidad</th>
               <th>Interés</th>
               
            <%for (int i=0; i<cuotas.size(); i++){ %>
              
                <tr>
                    <td><%=cuotas.get(i).numeroCuota%></td>
                    <td><%=cuotas.get(i).getImporteString()%></td>
                    <td><%=cuotas.get(i).getCantidadString()%></td>
                    <td><%=cuotas.get(i).getInteresesString()%></td>
              <% }
           }
           %>
           </table>
        </form>
    </body>
</html>