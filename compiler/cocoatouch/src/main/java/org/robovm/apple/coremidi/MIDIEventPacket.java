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
package org.robovm.apple.coremidi;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIEventPacket/*</name>*/ 
    extends /*<extends>*/Struct<MIDIEventPacket>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIEventPacketPtr extends Ptr<MIDIEventPacket, MIDIEventPacketPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MIDIEventPacket.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDIEventPacket() {}
    public MIDIEventPacket(long timeStamp, int wordCount, IntBuffer words) {
        this.setTimeStamp(timeStamp);
        this.setWordCount(wordCount);
        this.setWords(words);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getTimeStamp();
    @StructMember(0) public native MIDIEventPacket setTimeStamp(long timeStamp);
    @StructMember(1) public native int getWordCount();
    @StructMember(1) public native MIDIEventPacket setWordCount(int wordCount);
    @StructMember(2) public native @Array({64}) IntBuffer getWords();
    @StructMember(2) public native MIDIEventPacket setWords(@Array({64}) IntBuffer words);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="MIDIEventPacketSysexBytesForGroup", optional=true)
    public native OSStatus getSysexBytesForGroup(byte groupIndex, NSData.NSDataPtr outData);
    /*</methods>*/
}
