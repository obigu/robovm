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
package org.robovm.apple.sensorkit;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.arkit.*;
import org.robovm.apple.speech.*;
import org.robovm.apple.soundanalysis.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SRSensorReaderDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "sensorReader:fetchingRequest:didFetchResult:")
    boolean didFetchResult(SRSensorReader reader, SRFetchRequest fetchRequest, SRFetchResult result);
    @Method(selector = "sensorReader:didCompleteFetch:")
    void didCompleteFetch(SRSensorReader reader, SRFetchRequest fetchRequest);
    @Method(selector = "sensorReader:fetchingRequest:failedWithError:")
    void failed(SRSensorReader reader, SRFetchRequest fetchRequest, NSError error);
    @Method(selector = "sensorReader:didChangeAuthorizationStatus:")
    void didChangeAuthorizationStatus(SRSensorReader reader, SRAuthorizationStatus authorizationStatus);
    @Method(selector = "sensorReaderWillStartRecording:")
    void sensorReaderWillStartRecording(SRSensorReader reader);
    @Method(selector = "sensorReader:startRecordingFailedWithError:")
    void startRecordingFailed(SRSensorReader reader, NSError error);
    @Method(selector = "sensorReaderDidStopRecording:")
    void sensorReaderDidStopRecording(SRSensorReader reader);
    @Method(selector = "sensorReader:stopRecordingFailedWithError:")
    void stopRecordingFailed(SRSensorReader reader, NSError error);
    @Method(selector = "sensorReader:didFetchDevices:")
    void didFetchDevices(SRSensorReader reader, NSArray<SRDevice> devices);
    @Method(selector = "sensorReader:fetchDevicesDidFailWithError:")
    void fetchDevicesDidFail(SRSensorReader reader, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
