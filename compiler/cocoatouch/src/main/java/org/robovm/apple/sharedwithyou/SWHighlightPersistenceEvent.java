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
package org.robovm.apple.sharedwithyou;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYou") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWHighlightPersistenceEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SWHighlightEvent/*</implements>*/ {

    /*<ptr>*/public static class SWHighlightPersistenceEventPtr extends Ptr<SWHighlightPersistenceEvent, SWHighlightPersistenceEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWHighlightPersistenceEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SWHighlightPersistenceEvent() {}
    protected SWHighlightPersistenceEvent(Handle h, long handle) { super(h, handle); }
    protected SWHighlightPersistenceEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHighlight:trigger:")
    public SWHighlightPersistenceEvent(SWHighlight highlight, SWHighlightPersistenceEventTrigger trigger) { super((SkipInit) null); initObject(init(highlight, trigger)); }
    @Method(selector = "initWithCoder:")
    public SWHighlightPersistenceEvent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistenceEventTrigger")
    public native SWHighlightPersistenceEventTrigger getPersistenceEventTrigger();
    @Property(selector = "highlightURL")
    public native NSURL getHighlightURL();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHighlight:trigger:")
    protected native @Pointer long init(SWHighlight highlight, SWHighlightPersistenceEventTrigger trigger);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
