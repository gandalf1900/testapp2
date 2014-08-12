'use strict';

/* Directives */

var AppDirectives = angular.module('testapp2.directives', []);

AppDirectives.directive('appVersion', ['version', function (version) {
    return function (scope, elm, attrs) {
        elm.text(version);
    };
}]);
