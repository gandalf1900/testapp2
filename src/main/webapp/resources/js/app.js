'use strict';

var testapp2 = {};

var App = angular.module('testapp2', ['testapp2.filters', 'testapp2.services', 'testapp2.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/players', {
        templateUrl: 'players/layout',
        controller: PlayerController
    });

    $routeProvider.otherwise({redirectTo: '/players'});
}]);
