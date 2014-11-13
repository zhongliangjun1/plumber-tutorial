<html>
    <head>
        <title>${title}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" type="text/css" href="/static/css/demo.css">
    </head>

<body>

    <div id="head">
        head
    </div>

    <div id="content">
        <div id="main" pb-pipe="mainPipe">
            main
        </div>

        <div id="right" pb-barrier="rightBarrier">
            right ${rightBarrier}
        </div>

        <div class="clear-both"></div>
    </div>

    <div id="foot">
        foot
    </div>

    <script src="/static/js/lib/jquery-min.js"></script>
    <script src="/static/js/demo.js"></script>

<#--</body>-->
<#--</html>-->