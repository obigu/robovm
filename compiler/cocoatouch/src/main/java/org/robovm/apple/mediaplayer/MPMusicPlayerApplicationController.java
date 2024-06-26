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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMusicPlayerApplicationController/*</name>*/ 
    extends /*<extends>*/MPMusicPlayerController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMusicPlayerApplicationControllerPtr extends Ptr<MPMusicPlayerApplicationController, MPMusicPlayerApplicationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMusicPlayerApplicationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMusicPlayerApplicationController() {}
    protected MPMusicPlayerApplicationController(Handle h, long handle) { super(h, handle); }
    protected MPMusicPlayerApplicationController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "applicationMusicPlayer")
    public static native MPMusicPlayerController getApplicationMusicPlayer();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "applicationQueuePlayer")
    public static native MPMusicPlayerApplicationController getApplicationQueuePlayer();
    @Property(selector = "systemMusicPlayer")
    public static native MPMusicPlayerController getSystemMusicPlayer();
    /**
     * @deprecated Deprecated in iOS 8.0. Use systemMusicPlayer
     */
    @Deprecated
    @Property(selector = "iPodMusicPlayer")
    public static native MPMusicPlayerController getIPodMusicPlayer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "performQueueTransaction:completionHandler:")
    public native void performQueueTransaction(@Block VoidBlock1<MPMusicPlayerControllerMutableQueue> queueTransaction, @Block VoidBlock2<MPMusicPlayerControllerQueue, NSError> completionHandler);
    /*</methods>*/
}
