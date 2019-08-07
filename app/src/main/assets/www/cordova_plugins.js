cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "toast-plugin.MyToast",
      "file": "plugins/toast-plugin/www/MyToast.js",
      "pluginId": "toast-plugin",
      "clobbers": [
        "cordova.plugins.MyToast"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.4",
    "toast-plugin": "1.0.0"
  };
});