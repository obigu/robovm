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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioUnitParameter/*</name>*/ 
    extends /*<extends>*/Struct<AudioUnitParameter>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioUnitParameterPtr extends Ptr<AudioUnitParameter, AudioUnitParameterPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(AudioUnitParameter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioUnitParameter() {}
    public AudioUnitParameter(AudioUnit audioUnit, AUParameterType type, AUScope scope, int element) {
        this.setAudioUnit(audioUnit);
        this.setType(type);
        this.setScope(scope);
        this.setElement(element);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native AudioUnit getAudioUnit();
    @StructMember(0) public native AudioUnitParameter setAudioUnit(AudioUnit audioUnit);
    @StructMember(1) public native AUParameterType getType();
    @StructMember(1) public native AudioUnitParameter setType(AUParameterType type);
    @StructMember(2) public native AUScope getScope();
    @StructMember(2) public native AudioUnitParameter setScope(AUScope scope);
    @StructMember(3) public native int getElement();
    @StructMember(3) public native AudioUnitParameter setElement(int element);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="AUParameterValueFromLinear", optional=true)
    public static native float fromLinear(float inLinearValue, AudioUnitParameter inParameter);
    @Bridge(symbol="AUParameterValueToLinear", optional=true)
    public static native float toLinear(float inParameterValue, AudioUnitParameter inParameter);
    /*</methods>*/

    public float fromLinear(float inLinearValue) {
        return fromLinear(inLinearValue, this);
    }

    public float toLinear(float inParameterValue) {
        return toLinear(inParameterValue, this);
    }
}
