<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


    <style>
        * {
            box-sizing: border-box;
        }

        :root {
            --bg: #36280788;
        }

        body {
            min-height: 100vh;
            background: var(--bg);
            display: grid;
            place-items: center;
        }

        @property --a {
            initial-value: 0deg;
            inherits: false;
            syntax: '<angle>';
        }

        @property --h {
            initial-value: 0;
            inherits: false;
            syntax: '<number>';
        }

        .loader {
            padding: 2rem 4rem;
            font-family: monospace;
            font-weight: bold;
            color: #fff;
            border-style: solid;
            border-width: 1vmin;
            font-size: 2rem;
            --charge: hsl(var(--h, 0), 80%, 50%);
            -o-border-image: conic-gradient(var(--charge) var(--a), transparent calc(var(--a) + 0.5deg)) 30;
            border-image: conic-gradient(var(--charge) var(--a), transparent calc(var(--a) + 0.5deg)) 30;
            -webkit-animation: load 2s infinite ease-in-out;
            animation: load 2s infinite ease-in-out;
        }

        @-webkit-keyframes load {

            0%,
            10% {
                --a: 0deg;
                --h: 0;
            }

            100% {
                --a: 360deg;
                --h: 100;
            }
        }

        @keyframes load {

            0%,
            10% {
                --a: 0deg;
                --h: 0;
            }

            100% {
                --a: 360deg;
                --h: 100;
            }
        }
    </style>
</head>

<body>




    <div class="loader">網頁讀取中...</div>

</body>

</html>