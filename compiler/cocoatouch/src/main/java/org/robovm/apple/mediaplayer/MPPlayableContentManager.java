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
 * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPPlayableContentManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPPlayableContentManagerPtr extends Ptr<MPPlayableContentManager, MPPlayableContentManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPPlayableContentManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPPlayableContentManager() {}
    protected MPPlayableContentManager(Handle h, long handle) { super(h, handle); }
    protected MPPlayableContentManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSource")
    public native MPPlayableContentDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(MPPlayableContentDataSource v);
    @Property(selector = "delegate")
    public native MPPlayableContentDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPPlayableContentDelegate v);
    /**
     * @since Available in iOS 8.4 and later.
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @Property(selector = "context")
    public native MPPlayableContentManagerContext getContext();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @Property(selector = "nowPlayingIdentifiers")
    public native NSArray<NSString> getNowPlayingIdentifiers();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @Property(selector = "setNowPlayingIdentifiers:")
    public native void setNowPlayingIdentifiers(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadData")
    public native void reloadData();
    @Method(selector = "beginUpdates")
    public native void beginUpdates();
    @Method(selector = "endUpdates")
    public native void endUpdates();
    @Method(selector = "sharedContentManager")
    public static native MPPlayableContentManager getSharedContentManager();
    /*</methods>*/
}
