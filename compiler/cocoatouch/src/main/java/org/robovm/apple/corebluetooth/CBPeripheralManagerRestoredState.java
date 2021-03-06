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
package org.robovm.apple.corebluetooth;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreBluetooth")/*</annotations>*/
@Marshaler(/*<name>*/CBPeripheralManagerRestoredState/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBPeripheralManagerRestoredState/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CBPeripheralManagerRestoredState toObject(Class<CBPeripheralManagerRestoredState> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CBPeripheralManagerRestoredState(o);
        }
        @MarshalsPointer
        public static long toNative(CBPeripheralManagerRestoredState o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CBPeripheralManagerRestoredState> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CBPeripheralManagerRestoredState> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CBPeripheralManagerRestoredState(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CBPeripheralManagerRestoredState> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CBPeripheralManagerRestoredState i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CBPeripheralManagerRestoredState(NSDictionary data) {
        super(data);
    }
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    

    public NSArray<CBMutableService> getServices() {
        if (has(Keys.Services())) {
            NSArray<CBMutableService> val = (NSArray<CBMutableService>) get(Keys.Services());
            return val;
        }
        return null;
    }
    public CBAdvertisementData getAdvertisementData() {
        if (has(Keys.AdvertisementData())) {
            NSDictionary val = (NSDictionary) get(Keys.AdvertisementData());
            return new CBAdvertisementData(val);
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreBluetooth")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="CBPeripheralManagerRestoredStateServicesKey", optional=true)
        public static native NSString Services();
        @GlobalValue(symbol="CBPeripheralManagerRestoredStateAdvertisementDataKey", optional=true)
        public static native NSString AdvertisementData();
    }
    /*</keys>*/
}
