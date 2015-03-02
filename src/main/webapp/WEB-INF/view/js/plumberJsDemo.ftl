<html>

    <head>
        <title>${title}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="/static/common/css/bootstrap.min.css">
        <link rel="stylesheet" href="/static/mobile/css/demo.css">

        <script type="text/javascript">
            (function(global){
                var modules = {};

                var ensureModule = function(name){
                    if(!modules[name]){
                        modules[name] = {
                            ready:false,
                            queue:[]
                        };
                    }
                };
                var executeModule = function(name){
                    var queue = modules[name].queue ;
                    var fn;
                    while(fn = queue.shift()){
                        fn.call(this);
                    }
                };

                var plumber = {
                    ready:function(name){
                        ensureModule(name);
                        modules[name].ready = true;
                        executeModule(name);
                    },
                    execute:function(name,fn){
                        ensureModule(name);
                        modules[name].queue.push(fn);
                        if(modules[name].ready){
                            executeModule(name);
                        }
                }
            };

                global.plumber = plumber;

            })(this);
        </script>
    </head>



    <body>

    <div class="bs-callout bs-callout-orange item" pb-barrier="jsFirstPagelet">
        ${jsFirstPagelet}
    </div>

    <div class="bs-callout bs-callout-grey item" pb-barrier="jsSecondPagelet">
        ${jsSecondPagelet}
    </div>

    <script src="/static/common/js/jquery.min.js"></script>
    <script src="/static/common/js/bootstrap.min.js"></script>
    <script src="/static/js/demo.js"></script>

    <div class="hide" pb-pipe="jsThirdPagelet@1"></div>
    <div class="hide" pb-pipe="jsFourthPagelet@2"></div>

    <#--</body>-->
<#--</html>-->