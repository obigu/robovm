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
package org.robovm.apple.gamekit;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKTurnBasedMatchmakerViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKTurnBasedMatchmakerViewControllerPtr extends Ptr<GKTurnBasedMatchmakerViewController, GKTurnBasedMatchmakerViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKTurnBasedMatchmakerViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKTurnBasedMatchmakerViewController() {}
    protected GKTurnBasedMatchmakerViewController(Handle h, long handle) { super(h, handle); }
    protected GKTurnBasedMatchmakerViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public GKTurnBasedMatchmakerViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public GKTurnBasedMatchmakerViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public GKTurnBasedMatchmakerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public GKTurnBasedMatchmakerViewController(NSCoder coder) { super(coder); }
    @Method(selector = "initWithMatchRequest:")
    public GKTurnBasedMatchmakerViewController(GKMatchRequest request) { super((SkipInit) null); initObject(init(request)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "turnBasedMatchmakerDelegate")
    public native GKTurnBasedMatchmakerViewControllerDelegate getTurnBasedMatchmakerDelegate();
    @Property(selector = "setTurnBasedMatchmakerDelegate:", strongRef = true)
    public native void setTurnBasedMatchmakerDelegate(GKTurnBasedMatchmakerViewControllerDelegate v);
    @Property(selector = "showExistingMatches")
    public native boolean showsExistingMatches();
    @Property(selector = "setShowExistingMatches:")
    public native void setShowsExistingMatches(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "matchmakingMode")
    public native GKMatchmakingMode getMatchmakingMode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMatchmakingMode:")
    public native void setMatchmakingMode(GKMatchmakingMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMatchRequest:")
    protected native @Pointer long init(GKMatchRequest request);
    /*</methods>*/
}
