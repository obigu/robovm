/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.avfoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVContentKeyResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVContentKeyResponsePtr extends Ptr<AVContentKeyResponse, AVContentKeyResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVContentKeyResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVContentKeyResponse() {}
    protected AVContentKeyResponse(Handle h, long handle) { super(h, handle); }
    protected AVContentKeyResponse(SkipInit skipInit) { super(skipInit); }
    public AVContentKeyResponse(NSData keyResponseData) { super((Handle) null, create(keyResponseData)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public AVContentKeyResponse(NSData keyData, NSData initializationVector) { super((Handle) null, create(keyData, initializationVector)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "contentKeyResponseWithFairPlayStreamingKeyResponseData:")
    protected static native @Pointer long create(NSData keyResponseData);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "contentKeyResponseWithClearKeyData:initializationVector:")
    protected static native @Pointer long create(NSData keyData, NSData initializationVector);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "contentKeyResponseWithAuthorizationTokenData:")
    public static native AVContentKeyResponse createUsingAuthTokenData(NSData authorizationTokenData);
    /*</methods>*/
}
