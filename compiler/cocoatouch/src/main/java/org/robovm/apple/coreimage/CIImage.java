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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CIImagePtr extends Ptr<CIImage, CIImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIImage() {}
    protected CIImage(Handle h, long handle) { super(h, handle); }
    protected CIImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCGImage:")
    public CIImage(CGImage image) { super((SkipInit) null); initObject(init(image)); }
    @Method(selector = "initWithCGImage:options:")
    public CIImage(CGImage image, CIImageOptions options) { super((SkipInit) null); initObject(init(image, options)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithCGImageSource:index:options:")
    public CIImage(CGImageSource source, @MachineSizedUInt long index, CIImageOptions dict) { super((SkipInit) null); initObject(init(source, index, dict)); }
    @Method(selector = "initWithData:")
    public CIImage(NSData data) { super((SkipInit) null); initObject(init(data)); }
    @Method(selector = "initWithData:options:")
    public CIImage(NSData data, CIImageOptions options) { super((SkipInit) null); initObject(init(data, options)); }
    @Method(selector = "initWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public CIImage(NSData data, @MachineSizedUInt long bytesPerRow, @ByVal CGSize size, int format, CGColorSpace colorSpace) { super((SkipInit) null); initObject(init(data, bytesPerRow, size, format, colorSpace)); }
    /**
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "initWithTexture:size:flipped:colorSpace:")
    public CIImage(int name, @ByVal CGSize size, boolean flipped, CGColorSpace colorSpace) { super((SkipInit) null); initObject(init(name, size, flipped, colorSpace)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithMTLTexture:options:")
    public CIImage(MTLTexture texture, CIImageOptions options) { super((SkipInit) null); initObject(init(texture, options)); }
    @Method(selector = "initWithContentsOfURL:")
    public CIImage(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithContentsOfURL:options:")
    public CIImage(NSURL url, CIImageOptions options) { super((SkipInit) null); initObject(init(url, options)); }
    @Method(selector = "initWithIOSurface:")
    public CIImage(IOSurface surface) { super((SkipInit) null); initObject(init(surface)); }
    @Method(selector = "initWithIOSurface:options:")
    public CIImage(IOSurface surface, CIImageOptions options) { super((SkipInit) null); initObject(init(surface, options)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithCVImageBuffer:")
    public CIImage(CVImageBuffer imageBuffer) { super((SkipInit) null); initObject(init(imageBuffer)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithCVImageBuffer:options:")
    public CIImage(CVImageBuffer imageBuffer, CIImageOptions options) { super((SkipInit) null); initObject(init(imageBuffer, options)); }
    @WeaklyLinked
    @Method(selector = "initWithCVPixelBuffer:")
    public CIImage(CVPixelBuffer pixelBuffer) { super((SkipInit) null); initObject(init(pixelBuffer)); }
    @WeaklyLinked
    @Method(selector = "initWithCVPixelBuffer:options:")
    public CIImage(CVPixelBuffer pixelBuffer, CIImageOptions options) { super((SkipInit) null); initObject(init(pixelBuffer, options)); }
    @Method(selector = "initWithColor:")
    public CIImage(CIColor color) { super((SkipInit) null); initObject(init(color)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDepthData:options:")
    public CIImage(org.robovm.apple.avfoundation.AVDepthData data, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(data, options)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDepthData:")
    public CIImage(org.robovm.apple.avfoundation.AVDepthData data) { super((SkipInit) null); initObject(init(data)); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPortaitEffectsMatte:options:")
    public CIImage(org.robovm.apple.avfoundation.AVPortraitEffectsMatte matte, CIImageOptions options) { super((SkipInit) null); initObject(init(matte, options)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithPortaitEffectsMatte:")
    public CIImage(org.robovm.apple.avfoundation.AVPortraitEffectsMatte matte) { super((SkipInit) null); initObject(init(matte)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithSemanticSegmentationMatte:options:")
    public CIImage(AVSemanticSegmentationMatte matte, CIImageOptions options) { super((SkipInit) null); initObject(init(matte, options)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithSemanticSegmentationMatte:")
    public CIImage(AVSemanticSegmentationMatte matte) { super((SkipInit) null); initObject(init(matte)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithImageProvider:size::format:colorSpace:options:")
    public CIImage(NSObject p, @MachineSizedUInt long width, @MachineSizedUInt long height, int f, CGColorSpace cs, CIImageOptions options) { super((SkipInit) null); initObject(init(p, width, height, f, cs, options)); }
    @Method(selector = "initWithCoder:")
    public CIImage(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "blackImage")
    public static native CIImage getBlackImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "whiteImage")
    public static native CIImage getWhiteImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "grayImage")
    public static native CIImage getGrayImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "redImage")
    public static native CIImage getRedImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "greenImage")
    public static native CIImage getGreenImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "blueImage")
    public static native CIImage getBlueImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "cyanImage")
    public static native CIImage getCyanImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "magentaImage")
    public static native CIImage getMagentaImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "yellowImage")
    public static native CIImage getYellowImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "clearImage")
    public static native CIImage getClearImage();
    @Property(selector = "extent")
    public native @ByVal CGRect getExtent();
    @Property(selector = "properties")
    public native NSDictionary<NSString, ?> getProperties();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "url")
    public native NSURL getUrl();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "colorSpace")
    public native CGColorSpace getColorSpace();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "pixelBuffer")
    public native CVPixelBuffer getPixelBuffer();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "CGImage")
    public native CGImage getCGImage();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "depthData")
    public native org.robovm.apple.avfoundation.AVDepthData getDepthData();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "portraitEffectsMatte")
    public native org.robovm.apple.avfoundation.AVPortraitEffectsMatte getPortraitEffectsMatte();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "semanticSegmentationMatte")
    public native AVSemanticSegmentationMatte getSemanticSegmentationMatte();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIImage(org.robovm.apple.uikit.UIImage image) {
        super((SkipInit) null);
        CIImage i = org.robovm.apple.uikit.CIImageExtensions.create(image);
        initObject(i.getHandle());
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIImage(org.robovm.apple.uikit.UIImage image, CIImageOptions options) {
        super((SkipInit) null);
        CIImage i = org.robovm.apple.uikit.CIImageExtensions.create(image, options);
        initObject(i.getHandle());
    }
    /*<methods>*/
    @Method(selector = "initWithCGImage:")
    protected native @Pointer long init(CGImage image);
    @Method(selector = "initWithCGImage:options:")
    protected native @Pointer long init(CGImage image, CIImageOptions options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithCGImageSource:index:options:")
    protected native @Pointer long init(CGImageSource source, @MachineSizedUInt long index, CIImageOptions dict);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "initWithData:options:")
    protected native @Pointer long init(NSData data, CIImageOptions options);
    @Method(selector = "initWithBitmapData:bytesPerRow:size:format:colorSpace:")
    protected native @Pointer long init(NSData data, @MachineSizedUInt long bytesPerRow, @ByVal CGSize size, int format, CGColorSpace colorSpace);
    /**
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "initWithTexture:size:flipped:colorSpace:")
    protected native @Pointer long init(int name, @ByVal CGSize size, boolean flipped, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithMTLTexture:options:")
    protected native @Pointer long init(MTLTexture texture, CIImageOptions options);
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithContentsOfURL:options:")
    protected native @Pointer long init(NSURL url, CIImageOptions options);
    @Method(selector = "initWithIOSurface:")
    protected native @Pointer long init(IOSurface surface);
    @Method(selector = "initWithIOSurface:options:")
    protected native @Pointer long init(IOSurface surface, CIImageOptions options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithCVImageBuffer:")
    protected native @Pointer long init(CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithCVImageBuffer:options:")
    protected native @Pointer long init(CVImageBuffer imageBuffer, CIImageOptions options);
    @WeaklyLinked
    @Method(selector = "initWithCVPixelBuffer:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer);
    @WeaklyLinked
    @Method(selector = "initWithCVPixelBuffer:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, CIImageOptions options);
    @Method(selector = "initWithColor:")
    protected native @Pointer long init(CIColor color);
    @Method(selector = "imageByApplyingTransform:")
    public native CIImage newImageByApplyingTransform(@ByVal CGAffineTransform matrix);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByApplyingTransform:highQualityDownsample:")
    public native CIImage newImageByApplyingTransform(@ByVal CGAffineTransform matrix, boolean highQualityDownsample);
    @WeaklyLinked
    @Method(selector = "imageByApplyingOrientation:")
    public native CIImage newImageByApplyingOrientation(CGImagePropertyOrientation orientation);
    @WeaklyLinked
    @Method(selector = "imageTransformForOrientation:")
    public native @ByVal CGAffineTransform getImageTransformForOrientation(CGImagePropertyOrientation orientation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageByApplyingCGOrientation:")
    public native CIImage newImageByApplyingCGOrientation(CGImagePropertyOrientation orientation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageTransformForCGOrientation:")
    public native @ByVal CGAffineTransform imageTransformForCGOrientation(CGImagePropertyOrientation orientation);
    @Method(selector = "imageByCompositingOverImage:")
    public native CIImage newImageByCompositingOverImage(CIImage dest);
    @Method(selector = "imageByCroppingToRect:")
    public native CIImage newImageByCroppingToRect(@ByVal CGRect rect);
    @Method(selector = "imageByClampingToExtent")
    public native CIImage newImageByClampingToExtent();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByClampingToRect:")
    public native CIImage newImageByClampingToRect(@ByVal CGRect rect);
    @Method(selector = "imageByApplyingFilter:withInputParameters:")
    public native CIImage newImageByApplyingFilter(String filterName, CIFilterInputParameters params);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageByApplyingFilter:")
    public native CIImage newImageByApplyingFilter(String filterName);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByColorMatchingColorSpaceToWorkingSpace:")
    public native CIImage newImageByColorMatchingColorSpaceToWorkingSpace(CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByColorMatchingWorkingSpaceToColorSpace:")
    public native CIImage newImageByColorMatchingWorkingSpaceToColorSpace(CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByPremultiplyingAlpha")
    public native CIImage newImageByPremultiplyingAlpha();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByUnpremultiplyingAlpha")
    public native CIImage newImageByUnpremultiplyingAlpha();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageBySettingAlphaOneInExtent:")
    public native CIImage newImageBySettingAlphaOneInExtent(@ByVal CGRect extent);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageByApplyingGaussianBlurWithSigma:")
    public native CIImage newImageByApplyingGaussianBlurWithSigma(double sigma);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageBySettingProperties:")
    public native CIImage newImageBySettingProperties(NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageBySamplingLinear")
    public native CIImage newImageBySamplingLinear();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageBySamplingNearest")
    public native CIImage newImageBySamplingNearest();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "imageByInsertingIntermediate")
    public native CIImage newImageByInsertingIntermediate();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "imageByInsertingIntermediate:")
    public native CIImage newImageByInsertingIntermediate(boolean cache);
    @Method(selector = "regionOfInterestForImage:inRect:")
    public native @ByVal CGRect getRegionOfInterest(CIImage image, @ByVal CGRect rect);
    @Method(selector = "emptyImage")
    public static native CIImage getEmptyImage();
    @Method(selector = "autoAdjustmentFilters")
    public native NSArray<CIFilter> getAutoAdjustmentFilters();
    @Method(selector = "autoAdjustmentFiltersWithOptions:")
    public native NSArray<CIFilter> getAutoAdjustmentFilters(CIImageAutoAdjustmentOptions options);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "imageByConvertingWorkingSpaceToLab")
    public native CIImage newImageByConvertingWorkingSpaceToLab();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "imageByConvertingLabToWorkingSpace")
    public native CIImage newImageByConvertingLabToWorkingSpace();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDepthData:options:")
    protected native @Pointer long init(org.robovm.apple.avfoundation.AVDepthData data, NSDictionary<NSString, ?> options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDepthData:")
    protected native @Pointer long init(org.robovm.apple.avfoundation.AVDepthData data);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPortaitEffectsMatte:options:")
    protected native @Pointer long init(org.robovm.apple.avfoundation.AVPortraitEffectsMatte matte, CIImageOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithPortaitEffectsMatte:")
    protected native @Pointer long init(org.robovm.apple.avfoundation.AVPortraitEffectsMatte matte);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithSemanticSegmentationMatte:options:")
    protected native @Pointer long init(AVSemanticSegmentationMatte matte, CIImageOptions options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithSemanticSegmentationMatte:")
    protected native @Pointer long init(AVSemanticSegmentationMatte matte);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithImageProvider:size::format:colorSpace:options:")
    protected native @Pointer long init(NSObject p, @MachineSizedUInt long width, @MachineSizedUInt long height, int f, CGColorSpace cs, CIImageOptions options);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
