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
package org.robovm.apple.coretext;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTTypesetter/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTTypesetterPtr extends Ptr<CTTypesetter, CTTypesetterPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CTTypesetter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CTTypesetter() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CTTypesetterGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CTTypesetterCreateWithAttributedString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTTypesetter create(NSAttributedString string);
    @Bridge(symbol="CTTypesetterCreateWithAttributedStringAndOptions", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTTypesetter create(NSAttributedString string, CTTypesetterOptions options);
    @Bridge(symbol="CTTypesetterCreateLineWithOffset", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTLine createLine(@ByVal CFRange stringRange, double offset);
    @Bridge(symbol="CTTypesetterCreateLine", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTLine createLine(@ByVal CFRange stringRange);
    @Bridge(symbol="CTTypesetterSuggestLineBreakWithOffset", optional=true)
    public native @MachineSizedSInt long suggestLineBreak(@MachineSizedSInt long startIndex, double width, double offset);
    @Bridge(symbol="CTTypesetterSuggestLineBreak", optional=true)
    public native @MachineSizedSInt long suggestLineBreak(@MachineSizedSInt long startIndex, double width);
    @Bridge(symbol="CTTypesetterSuggestClusterBreakWithOffset", optional=true)
    public native @MachineSizedSInt long suggestClusterBreak(@MachineSizedSInt long startIndex, double width, double offset);
    @Bridge(symbol="CTTypesetterSuggestClusterBreak", optional=true)
    public native @MachineSizedSInt long suggestClusterBreak(@MachineSizedSInt long startIndex, double width);
    /*</methods>*/
}
