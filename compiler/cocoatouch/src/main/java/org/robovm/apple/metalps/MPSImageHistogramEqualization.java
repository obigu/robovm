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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageHistogramEqualization/*</name>*/ 
    extends /*<extends>*/MPSUnaryImageKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageHistogramEqualizationPtr extends Ptr<MPSImageHistogramEqualization, MPSImageHistogramEqualizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageHistogramEqualization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageHistogramEqualization() {}
    protected MPSImageHistogramEqualization(Handle h, long handle) { super(h, handle); }
    protected MPSImageHistogramEqualization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:histogramInfo:")
    public MPSImageHistogramEqualization(MTLDevice device, MPSImageHistogramInfo histogramInfo) { super((SkipInit) null); initObject(init(device, histogramInfo)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSImageHistogramEqualization(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSImageHistogramEqualization(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSImageHistogramEqualization(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "histogramInfo")
    public native @ByVal MPSImageHistogramInfo getHistogramInfo();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:histogramInfo:")
    protected native @Pointer long init(MTLDevice device, MPSImageHistogramInfo histogramInfo);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeTransformToCommandBuffer:sourceTexture:histogram:histogramOffset:")
    public native void encodeTransform(MTLCommandBuffer commandBuffer, MTLTexture source, MTLBuffer histogram, @MachineSizedUInt long histogramOffset);
    /*</methods>*/
}
