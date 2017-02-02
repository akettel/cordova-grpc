#import "CordovaGrpc.h"

#import <Cordova/CDVAvailability.h>

@implementation CordovaGrpc

- (void)pluginInitialize {
}

-(void)startServer:(CDVInvokedUrlCommand *)command {
  NSInteger port = [command.arguments objectAtIndex:0];
  NSLog(@"%@", port);
}

-(void)stopServer:(CDVInvokedUrlCommand *)command {

}

-(void)getPort:(CDVInvokedUrlCommand *)command {

}

@end
