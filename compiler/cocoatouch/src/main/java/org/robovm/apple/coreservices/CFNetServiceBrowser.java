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
package org.robovm.apple.coreservices;

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
/*<annotations>*/@Library("CFNetwork")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFNetServiceBrowser/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFNetServiceBrowserPtr extends Ptr<CFNetServiceBrowser, CFNetServiceBrowserPtr> {}/*</ptr>*/
    
    public interface ClientCallback {
        void invoke(CFNetServiceBrowser browser, CFNetServiceBrowserFlags flags, CFType domainOrService, CFStreamError error);
    }
  
    private static final java.util.concurrent.atomic.AtomicLong refconId = new java.util.concurrent.atomic.AtomicLong();
    private long localRefconId;
    private static final LongMap<ClientCallback> callbacks = new LongMap<>();
    private static final java.lang.reflect.Method cbInvoke;
    
    static {
        try {
            cbInvoke = CFNetServiceBrowser.class.getDeclaredMethod("cbInvoke", CFNetServiceBrowser.class, CFNetServiceBrowserFlags.class, CFType.class, CFStreamError.CFStreamErrorPtr.class, long.class);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    /*<bind>*/static { Bro.bind(CFNetServiceBrowser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFNetServiceBrowser() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Callback
    private static void cbInvoke(CFNetServiceBrowser browser, CFNetServiceBrowserFlags flags, CFType domainOrService, CFStreamError.CFStreamErrorPtr error, @Pointer long refcon) {
        ClientCallback callback = null;
        synchronized (callbacks) {
            callback = callbacks.get(refcon);
        }
        CFStreamError err = null;
        if (error != null) err = error.get();
        callback.invoke(browser, flags, domainOrService, err);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CFNetServiceBrowser create(ClientCallback clientCB) {
        long refconId = CFNetServiceBrowser.refconId.getAndIncrement();
        CFNetServiceClientContext context = new CFNetServiceClientContext();
        context.setInfo(refconId);
        synchronized (callbacks) {
            callbacks.put(refconId, clientCB);
        }
        CFNetServiceBrowser service = create(null, new FunctionPtr(cbInvoke), context);
        if (service != null) service.localRefconId = refconId;
        return service;
    }
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    public void scheduleInRunLoop(CFRunLoop runLoop, CFRunLoopMode runLoopMode) {
        scheduleInRunLoop(runLoop, runLoopMode.value().toString());
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public void unscheduleFromRunLoop(CFRunLoop runLoop, CFRunLoopMode runLoopMode) {
        unscheduleFromRunLoop(runLoop, runLoopMode.value().toString());
    }
    /*<methods>*/
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserCreate", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFNetServiceBrowser create(CFAllocator alloc, FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserInvalidate", optional=true)
    public native void invalidate();
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    public boolean searchForDomains(boolean registrationDomains) throws CFStreamErrorException {
       CFStreamError.CFStreamErrorPtr ptr = new CFStreamError.CFStreamErrorPtr();
       boolean result = searchForDomains(registrationDomains, ptr);
       if (ptr.get() != null) { throw new CFStreamErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserSearchForDomains", optional=true)
    private native boolean searchForDomains(boolean registrationDomains, CFStreamError.CFStreamErrorPtr error);
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    public boolean searchForServices(String domain, String serviceType) throws CFStreamErrorException {
       CFStreamError.CFStreamErrorPtr ptr = new CFStreamError.CFStreamErrorPtr();
       boolean result = searchForServices(domain, serviceType, ptr);
       if (ptr.get() != null) { throw new CFStreamErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserSearchForServices", optional=true)
    private native boolean searchForServices(String domain, String serviceType, CFStreamError.CFStreamErrorPtr error);
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    public void stopSearch() throws CFStreamErrorException {
       CFStreamError.CFStreamErrorPtr ptr = new CFStreamError.CFStreamErrorPtr();
       stopSearch(ptr);
       if (ptr.get() != null) { throw new CFStreamErrorException(ptr.get()); }
    }
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserStopSearch", optional=true)
    private native void stopSearch(CFStreamError.CFStreamErrorPtr error);
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserScheduleWithRunLoop", optional=true)
    public native void scheduleInRunLoop(CFRunLoop runLoop, String runLoopMode);
    /**
     * @deprecated Use nw_browser_t or nw_listener_t in Network framework instead
     */
    @Deprecated
    @Bridge(symbol="CFNetServiceBrowserUnscheduleFromRunLoop", optional=true)
    public native void unscheduleFromRunLoop(CFRunLoop runLoop, String runLoopMode);
    /*</methods>*/
}
