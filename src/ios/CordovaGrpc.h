#import <Cordova/CDVPlugin.h>

@interface CordovaGrpc : CDVPlugin {
}

// The hooks for our plugin commands
- (void)startServer:(CDVInvokedUrlCommand *)command;
- (void)stopServer:(CDVInvokedUrlCommand *)command;
- (void)getPort:(CDVInvokedUrlCommand *)command;
@end
