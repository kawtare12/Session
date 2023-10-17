<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NouveauMdp</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #000000; /* Fond noir */
            color: #ffffff; /* Texte blanc */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .form-container {
            background-color: #1a1a1a; /* Gris foncé */
            border: 2px solid #333; /* Bordure plus large */
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
            padding: 30px;
            width: 300px;
        }

        .form-container h1 {
            color: #993366; /* Couleur du texte mauve */
            font-size: 24px;
        }

        .form {
            margin-top: 20px;
        }

        .form input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #555; /* Bordure grise */
            border-radius: 4px;
            background-color: #333; /* Gris foncé */
            color: #ffffff; /* Texte blanc */
        }

        .form input[type="submit"] {
            background-color: #993366; /* Nouvelle couleur du bouton mauve */
            color: white;
            border: none;
            cursor: pointer;
        }

        .form input[type="submit"]:hover {
            background-color: #cc6699; /* Couleur au survol du bouton */
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Entrer Votre nouveau mot de passe</h1>
        <form class="form" action="ChangePwd" method="POST">
            <input type="text" name="password" placeholder="Nouveau mot de passe">
            <input type="submit" value="Valider">
        </form>
    </div>
</body>
</html>
