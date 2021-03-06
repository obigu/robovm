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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Packed(4) @Library("CoreMedia")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTimeRange/*</name>*/ 
    extends /*<extends>*/Struct<CMTimeRange>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class AsValuedListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CMTimeRange> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSValue> o = (NSArray<NSValue>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMTimeRange> list = new ArrayList<>();
            for (NSValue v : o) {
                list.add(v.timeRangeValue());
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMTimeRange> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSMutableArray<NSValue> array = new NSMutableArray<>();
            for (CMTimeRange i : l) {
                array.add(NSValue.valueOf(i));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    
    /*<ptr>*/public static class CMTimeRangePtr extends Ptr<CMTimeRange, CMTimeRangePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMTimeRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMTimeRange() {}
    public CMTimeRange(CMTime start, CMTime duration) {
        this.setStart(start);
        this.setDuration(duration);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal CMTime getStart();
    @StructMember(0) public native CMTimeRange setStart(@ByVal CMTime start);
    @StructMember(1) public native @ByVal CMTime getDuration();
    @StructMember(1) public native CMTimeRange setDuration(@ByVal CMTime duration);
    /*</members>*/
    @Override
    public String toString() {
        return getDescription(null, this);
    }
    /*<methods>*/
    @GlobalValue(symbol="kCMTimeRangeZero", optional=true)
    public static native @ByVal CMTimeRange Zero();
    @GlobalValue(symbol="kCMTimeRangeInvalid", optional=true)
    public static native @ByVal CMTimeRange Invalid();
    
    @Bridge(symbol="CMTimeRangeMake", optional=true)
    public static native @ByVal CMTimeRange create(@ByVal CMTime start, @ByVal CMTime duration);
    public CMTimeRange union(CMTimeRange otherRange) { return union(this, otherRange); }
    @Bridge(symbol="CMTimeRangeGetUnion", optional=true)
    private static native @ByVal CMTimeRange union(@ByVal CMTimeRange range, @ByVal CMTimeRange otherRange);
    public CMTimeRange intersection(CMTimeRange otherRange) { return intersection(this, otherRange); }
    @Bridge(symbol="CMTimeRangeGetIntersection", optional=true)
    private static native @ByVal CMTimeRange intersection(@ByVal CMTimeRange range, @ByVal CMTimeRange otherRange);
    public boolean equals(CMTimeRange range2) { return equals(this, range2); }
    @Bridge(symbol="CMTimeRangeEqual", optional=true)
    private static native boolean equals(@ByVal CMTimeRange range1, @ByVal CMTimeRange range2);
    public boolean containsTime(CMTime time) { return containsTime(this, time); }
    @Bridge(symbol="CMTimeRangeContainsTime", optional=true)
    private static native boolean containsTime(@ByVal CMTimeRange range, @ByVal CMTime time);
    public boolean containsTimeRange(CMTimeRange otherRange) { return containsTimeRange(this, otherRange); }
    @Bridge(symbol="CMTimeRangeContainsTimeRange", optional=true)
    private static native boolean containsTimeRange(@ByVal CMTimeRange range, @ByVal CMTimeRange otherRange);
    public CMTime getEnd() { return getEnd(this); }
    @Bridge(symbol="CMTimeRangeGetEnd", optional=true)
    private static native @ByVal CMTime getEnd(@ByVal CMTimeRange range);
    @Bridge(symbol="CMTimeRangeFromTimeToTime", optional=true)
    public static native @ByVal CMTimeRange fromTimeToTime(@ByVal CMTime start, @ByVal CMTime end);
    public NSDictionary asDictionary(CFAllocator allocator) { return asDictionary(this, allocator); }
    @Bridge(symbol="CMTimeRangeCopyAsDictionary", optional=true)
    private static native NSDictionary asDictionary(@ByVal CMTimeRange range, CFAllocator allocator);
    @Bridge(symbol="CMTimeRangeMakeFromDictionary", optional=true)
    public static native @ByVal CMTimeRange create(NSDictionary dictionaryRepresentation);
    @Bridge(symbol="CMTimeRangeCopyDescription", optional=true)
    private static native String getDescription(CFAllocator allocator, @ByVal CMTimeRange range);
    public void show() { show(this); }
    @Bridge(symbol="CMTimeRangeShow", optional=true)
    private static native void show(@ByVal CMTimeRange range);
    /*</methods>*/
}
