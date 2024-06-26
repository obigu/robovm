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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CKRecordZoneCapabilities/*</name>*/ extends Bits</*<name>*/CKRecordZoneCapabilities/*</name>*/> {
    /*<values>*/
    public static final CKRecordZoneCapabilities None = new CKRecordZoneCapabilities(0L);
    public static final CKRecordZoneCapabilities FetchChanges = new CKRecordZoneCapabilities(1L);
    public static final CKRecordZoneCapabilities Atomic = new CKRecordZoneCapabilities(2L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CKRecordZoneCapabilities Sharing = new CKRecordZoneCapabilities(4L);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CKRecordZoneCapabilities ZoneWideSharing = new CKRecordZoneCapabilities(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CKRecordZoneCapabilities/*</name>*/[] values = _values(/*<name>*/CKRecordZoneCapabilities/*</name>*/.class);

    public /*<name>*/CKRecordZoneCapabilities/*</name>*/(long value) { super(value); }
    private /*<name>*/CKRecordZoneCapabilities/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CKRecordZoneCapabilities/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CKRecordZoneCapabilities/*</name>*/(value, mask);
    }
    protected /*<name>*/CKRecordZoneCapabilities/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CKRecordZoneCapabilities/*</name>*/[] values() {
        return values.clone();
    }
}
