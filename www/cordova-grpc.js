
var exec = require('cordova/exec');

var PLUGIN_NAME = 'CordovaGrpc';

var CordovaGrpc = {
  startServer: function(port, cb) {
    exec(cb, null, PLUGIN_NAME, 'startServer', [port]);
  },
  stopServer: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'stopServer', []);
  },
  getPort: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'getPort', []);
  }
};

module.exports = CordovaGrpc;
