let helloPlugin = {
    sayHello: function(name, successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'HellloPlugin',
            'sayHello',
            [{
                "name":name
            }]
        );
    }
}
module.exports = helloPlugin;