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
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKModifyRecordZonesOperation/*</name>*/ 
    extends /*<extends>*/CKDatabaseOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKModifyRecordZonesOperationPtr extends Ptr<CKModifyRecordZonesOperation, CKModifyRecordZonesOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKModifyRecordZonesOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKModifyRecordZonesOperation() {}
    protected CKModifyRecordZonesOperation(Handle h, long handle) { super(h, handle); }
    protected CKModifyRecordZonesOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRecordZonesToSave:recordZoneIDsToDelete:")
    public CKModifyRecordZonesOperation(NSArray<CKRecordZone> recordZonesToSave, NSArray<CKRecordZoneID> recordZoneIDsToDelete) { super((SkipInit) null); initObject(init(recordZonesToSave, recordZoneIDsToDelete)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recordZonesToSave")
    public native NSArray<CKRecordZone> getRecordZonesToSave();
    @Property(selector = "setRecordZonesToSave:")
    public native void setRecordZonesToSave(NSArray<CKRecordZone> v);
    @Property(selector = "recordZoneIDsToDelete")
    public native NSArray<CKRecordZoneID> getRecordZoneIDsToDelete();
    @Property(selector = "setRecordZoneIDsToDelete:")
    public native void setRecordZoneIDsToDelete(NSArray<CKRecordZoneID> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "perRecordZoneSaveBlock")
    public native @Block VoidBlock3<CKRecordZoneID, CKRecordZone, NSError> getPerRecordZoneSaveBlock();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPerRecordZoneSaveBlock:")
    public native void setPerRecordZoneSaveBlock(@Block VoidBlock3<CKRecordZoneID, CKRecordZone, NSError> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "perRecordZoneDeleteBlock")
    public native @Block VoidBlock2<CKRecordZoneID, NSError> getPerRecordZoneDeleteBlock();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPerRecordZoneDeleteBlock:")
    public native void setPerRecordZoneDeleteBlock(@Block VoidBlock2<CKRecordZoneID, NSError> v);
    @Property(selector = "modifyRecordZonesCompletionBlock")
    public native @Block VoidBlock3<NSArray<CKRecordZone>, NSArray<CKRecordZoneID>, NSError> getModifyRecordZonesCompletionBlock();
    @Property(selector = "setModifyRecordZonesCompletionBlock:")
    public native void setModifyRecordZonesCompletionBlock(@Block VoidBlock3<NSArray<CKRecordZone>, NSArray<CKRecordZoneID>, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRecordZonesToSave:recordZoneIDsToDelete:")
    protected native @Pointer long init(NSArray<CKRecordZone> recordZonesToSave, NSArray<CKRecordZoneID> recordZoneIDsToDelete);
    /*</methods>*/
}
