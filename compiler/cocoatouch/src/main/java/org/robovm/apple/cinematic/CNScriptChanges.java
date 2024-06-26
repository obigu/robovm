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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNScriptChanges/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNScriptChangesPtr extends Ptr<CNScriptChanges, CNScriptChangesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNScriptChanges.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNScriptChanges() {}
    protected CNScriptChanges(Handle h, long handle) { super(h, handle); }
    protected CNScriptChanges(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataRepresentation:")
    public CNScriptChanges(NSData dataRepresentation) { super((SkipInit) null); initObject(init(dataRepresentation)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataRepresentation")
    public native NSData getDataRepresentation();
    @Property(selector = "fNumber")
    public native float getFNumber();
    @Property(selector = "userDecisions")
    public native NSArray<CNDecision> getUserDecisions();
    @Property(selector = "addedDetectionTracks")
    public native NSArray<CNDetectionTrack> getAddedDetectionTracks();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataRepresentation:")
    protected native @Pointer long init(NSData dataRepresentation);
    /*</methods>*/
}
