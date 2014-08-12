'use strict';

var PlayerController = function($scope, $http) {
    $scope.fetchPlayersList = function() {
        $http.get('players/playerlist.json').success(function(playerList){
            $scope.players = playerList;
        });
    };

    $scope.addNewPlayer = function(newPlayer) {
        $http.post('players/addPlayer/' + newPlayer).success(function() {
            $scope.fetchPlayersList();
        });
        $scope.playerName = '';
    };

    $scope.removePlayer = function(player) {
        $http.delete('players/removePlayer/' + player).success(function() {
            $scope.fetchPlayersList();
        });
    };

    $scope.removeAllPlayers = function() {
        $http.delete('players/removeAllPlayers').success(function() {
            $scope.fetchPlayersList();
        });

    };

    $scope.fetchPlayersList();
};