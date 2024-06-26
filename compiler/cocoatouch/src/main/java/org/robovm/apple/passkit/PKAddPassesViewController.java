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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAddPassesViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAddPassesViewControllerPtr extends Ptr<PKAddPassesViewController, PKAddPassesViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAddPassesViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKAddPassesViewController() {}
    protected PKAddPassesViewController(Handle h, long handle) { super(h, handle); }
    protected PKAddPassesViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPass:")
    public PKAddPassesViewController(PKPass pass) { super((SkipInit) null); initObject(init(pass)); }
    @Method(selector = "initWithPasses:")
    public PKAddPassesViewController(NSArray<PKPass> passes) { super((SkipInit) null); initObject(init(passes)); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIssuerData:signature:error:")
    public PKAddPassesViewController(NSData issuerData, NSData signature, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(issuerData, signature, error)); }
    @Method(selector = "initWithNibName:bundle:")
    public PKAddPassesViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public PKAddPassesViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKAddPassesViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKAddPassesViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPass:")
    protected native @Pointer long init(PKPass pass);
    @Method(selector = "initWithPasses:")
    protected native @Pointer long init(NSArray<PKPass> passes);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIssuerData:signature:error:")
    protected native @Pointer long init(NSData issuerData, NSData signature, NSError.NSErrorPtr error);
    @Method(selector = "canAddPasses")
    public static native boolean canAddPasses();
    /*</methods>*/
}
