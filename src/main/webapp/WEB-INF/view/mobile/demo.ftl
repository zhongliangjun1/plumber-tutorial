<html>

    <head>
        <title>${title}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="/static/common/css/bootstrap.min.css">
        <link rel="stylesheet" href="/static/mobile/css/demo.css">
    </head>

    <body>

    <div class="header" pb-barrier="mobileHeadBarrier">
        ${mobileHeadBarrier}
    </div>

    <div class="bs-callout bs-callout-orange item" pb-barrier="mobileMainBarrier">
        ${mobileMainBarrier}
    </div>

    <script src="/static/common/js/jquery.min.js"></script>
    <script src="/static/common/js/bootstrap.min.js"></script>

    <div class="hide" pb-pipe="mobileFirstPipe@1"></div>
    <div class="hide" pb-pipe="mobileSecondPipe@2"></div>
    <div class="hide" pb-pipe="mobileThirdPipe@3"></div>
    <div class="hide" pb-pipe="mobileFourthPipe@4"></div>

    <#--</body>-->
<#--</html>-->