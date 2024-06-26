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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVAudio3DMixing/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "renderingAlgorithm")
    AVAudio3DMixingRenderingAlgorithm getRenderingAlgorithm();
    @Property(selector = "setRenderingAlgorithm:")
    void setRenderingAlgorithm(AVAudio3DMixingRenderingAlgorithm v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sourceMode")
    AVAudio3DMixingSourceMode getSourceMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setSourceMode:")
    void setSourceMode(AVAudio3DMixingSourceMode v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pointSourceInHeadMode")
    AVAudio3DMixingPointSourceInHeadMode getPointSourceInHeadMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPointSourceInHeadMode:")
    void setPointSourceInHeadMode(AVAudio3DMixingPointSourceInHeadMode v);
    @Property(selector = "rate")
    float getRate();
    @Property(selector = "setRate:")
    void setRate(float v);
    @Property(selector = "reverbBlend")
    float getReverbBlend();
    @Property(selector = "setReverbBlend:")
    void setReverbBlend(float v);
    @Property(selector = "obstruction")
    float getObstruction();
    @Property(selector = "setObstruction:")
    void setObstruction(float v);
    @Property(selector = "occlusion")
    float getOcclusion();
    @Property(selector = "setOcclusion:")
    void setOcclusion(float v);
    @Property(selector = "position")
    @ByVal AVAudio3DPoint getPosition();
    @Property(selector = "setPosition:")
    void setPosition(@ByVal AVAudio3DPoint v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
