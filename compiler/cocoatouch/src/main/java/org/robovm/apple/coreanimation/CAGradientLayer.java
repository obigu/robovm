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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAGradientLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAGradientLayerPtr extends Ptr<CAGradientLayer, CAGradientLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAGradientLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAGradientLayer() {}
    protected CAGradientLayer(Handle h, long handle) { super(h, handle); }
    protected CAGradientLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public CAGradientLayer(CALayer layer) { super(layer); }
    /*</constructors>*/
    public void setLocations(double... locations) {
        if (locations != null && locations.length > 0) {
            NSArray<NSNumber> loc = new NSMutableArray<>();
            for (double l : locations) {
                loc.add(NSNumber.valueOf(l));
            }
            setLocations(loc);
        }
    }
    /*<properties>*/
    @Property(selector = "colors")
    public native @org.robovm.rt.bro.annotation.Marshaler(CGColor.AsListMarshaler.class) List<CGColor> getColors();
    @Property(selector = "setColors:")
    public native void setColors(@org.robovm.rt.bro.annotation.Marshaler(CGColor.AsListMarshaler.class) List<CGColor> v);
    @Property(selector = "locations")
    public native NSArray<NSNumber> getLocations();
    @Property(selector = "setLocations:")
    public native void setLocations(NSArray<NSNumber> v);
    @Property(selector = "startPoint")
    public native @ByVal CGPoint getStartPoint();
    @Property(selector = "setStartPoint:")
    public native void setStartPoint(@ByVal CGPoint v);
    @Property(selector = "endPoint")
    public native @ByVal CGPoint getEndPoint();
    @Property(selector = "setEndPoint:")
    public native void setEndPoint(@ByVal CGPoint v);
    @Property(selector = "type")
    public native CAGradientType getType();
    @Property(selector = "setType:")
    public native void setType(CAGradientType v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    /*</methods>*/
}
