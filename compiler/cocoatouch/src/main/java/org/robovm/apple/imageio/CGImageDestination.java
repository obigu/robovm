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
package org.robovm.apple.imageio;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageDestination/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGImageDestinationPtr extends Ptr<CGImageDestination, CGImageDestinationPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGImageDestination.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGImageDestination() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CGImageDestinationGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CGImageDestinationCopyTypeIdentifiers", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFArray.AsStringListMarshaler.class) List<String> getTypeIdentifiers();
    @Bridge(symbol="CGImageDestinationCreateWithDataConsumer", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImageDestination create(CGDataConsumer consumer, String type, @MachineSizedUInt long count, NSDictionary options);
    @Bridge(symbol="CGImageDestinationCreateWithData", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImageDestination create(NSData data, String type, @MachineSizedUInt long count, NSDictionary options);
    @Bridge(symbol="CGImageDestinationCreateWithURL", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImageDestination create(NSURL url, String type, @MachineSizedUInt long count, NSDictionary options);
    @Bridge(symbol="CGImageDestinationSetProperties", optional=true)
    public native void setProperties(CGImageDestinationProperties properties);
    @Bridge(symbol="CGImageDestinationAddImage", optional=true)
    public native void addImage(CGImage image, CGImageDestinationProperties properties);
    @Bridge(symbol="CGImageDestinationAddImageFromSource", optional=true)
    public native void addImageFromSource(CGImageSource isrc, @MachineSizedUInt long index, CGImageDestinationProperties properties);
    @Bridge(symbol="CGImageDestinationFinalize", optional=true)
    public native boolean finalizeDestination();
    @Bridge(symbol="CGImageDestinationAddImageAndMetadata", optional=true)
    public native void addImageAndMetadata(CGImage image, CGImageMetadata metadata, NSDictionary options);
    public boolean copyImageSource(CGImageSource isrc, CGImageDestinationCopySourceOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = copyImageSource(isrc, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Bridge(symbol="CGImageDestinationCopyImageSource", optional=true)
    private native boolean copyImageSource(CGImageSource isrc, CGImageDestinationCopySourceOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CGImageDestinationAddAuxiliaryDataInfo", optional=true)
    public native void addAuxiliaryDataInfo(String auxiliaryImageDataType, NSDictionary auxiliaryDataInfoDictionary);
    /*</methods>*/
}
