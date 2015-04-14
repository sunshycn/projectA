define(['jquery'],
    function($){
        'use strict';
        function add(x,y){
            $.add(x,y);
        }
        return{
            add : add
        };
    }
);

