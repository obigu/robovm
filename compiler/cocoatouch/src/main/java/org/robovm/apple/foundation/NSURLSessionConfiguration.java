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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/
import org.robovm.apple.coreservices.CFProxy;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSessionConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLSessionConfigurationPtr extends Ptr<NSURLSessionConfiguration, NSURLSessionConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLSessionConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLSessionConfiguration() {}
    protected NSURLSessionConfiguration(Handle h, long handle) { super(h, handle); }
    protected NSURLSessionConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultSessionConfiguration")
    public static native NSURLSessionConfiguration getDefaultSessionConfiguration();
    @Property(selector = "ephemeralSessionConfiguration")
    public static native NSURLSessionConfiguration getEphemeralSessionConfiguration();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "requestCachePolicy")
    public native NSURLRequestCachePolicy getRequestCachePolicy();
    @Property(selector = "setRequestCachePolicy:")
    public native void setRequestCachePolicy(NSURLRequestCachePolicy v);
    @Property(selector = "timeoutIntervalForRequest")
    public native double getTimeoutIntervalForRequest();
    @Property(selector = "setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double v);
    @Property(selector = "timeoutIntervalForResource")
    public native double getTimeoutIntervalForResource();
    @Property(selector = "setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double v);
    @Property(selector = "networkServiceType")
    public native NSURLRequestNetworkServiceType getNetworkServiceType();
    @Property(selector = "setNetworkServiceType:")
    public native void setNetworkServiceType(NSURLRequestNetworkServiceType v);
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Property(selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAllowsExpensiveNetworkAccess:")
    public native void setAllowsExpensiveNetworkAccess(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAllowsConstrainedNetworkAccess:")
    public native void setAllowsConstrainedNetworkAccess(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "requiresDNSSECValidation")
    public native boolean requiresDNSSECValidation();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setRequiresDNSSECValidation:")
    public native void setRequiresDNSSECValidation(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "waitsForConnectivity")
    public native boolean isWaitsForConnectivity();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWaitsForConnectivity:")
    public native void setWaitsForConnectivity(boolean v);
    @Property(selector = "isDiscretionary")
    public native boolean isDiscretionary();
    @Property(selector = "setDiscretionary:")
    public native void setDiscretionary(boolean v);
    @Property(selector = "sharedContainerIdentifier")
    public native String getSharedContainerIdentifier();
    @Property(selector = "setSharedContainerIdentifier:")
    public native void setSharedContainerIdentifier(String v);
    @Property(selector = "sessionSendsLaunchEvents")
    public native boolean sendsLaunchEvents();
    @Property(selector = "setSessionSendsLaunchEvents:")
    public native void setSendsLaunchEvents(boolean v);
    @Property(selector = "connectionProxyDictionary")
    public native CFProxy getConnectionProxy();
    @Property(selector = "setConnectionProxyDictionary:")
    public native void setConnectionProxy(CFProxy v);
    /**
     * @deprecated Use TLSMinimumSupportedProtocolVersion
     */
    @Deprecated
    @WeaklyLinked
    @Property(selector = "TLSMinimumSupportedProtocol")
    public native SSLProtocol getTLSMinimumSupportedProtocol();
    /**
     * @deprecated Use TLSMinimumSupportedProtocolVersion
     */
    @Deprecated
    @WeaklyLinked
    @Property(selector = "setTLSMinimumSupportedProtocol:")
    public native void setTLSMinimumSupportedProtocol(SSLProtocol v);
    /**
     * @deprecated Use TLSMaximumSupportedProtocolVersion
     */
    @Deprecated
    @WeaklyLinked
    @Property(selector = "TLSMaximumSupportedProtocol")
    public native SSLProtocol getTLSMaximumSupportedProtocol();
    /**
     * @deprecated Use TLSMaximumSupportedProtocolVersion
     */
    @Deprecated
    @WeaklyLinked
    @Property(selector = "setTLSMaximumSupportedProtocol:")
    public native void setTLSMaximumSupportedProtocol(SSLProtocol v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "TLSMinimumSupportedProtocolVersion")
    public native TlsProtocolVersion getTLSMinimumSupportedProtocolVersion();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setTLSMinimumSupportedProtocolVersion:")
    public native void setTLSMinimumSupportedProtocolVersion(TlsProtocolVersion v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "TLSMaximumSupportedProtocolVersion")
    public native TlsProtocolVersion getTLSMaximumSupportedProtocolVersion();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setTLSMaximumSupportedProtocolVersion:")
    public native void setTLSMaximumSupportedProtocolVersion(TlsProtocolVersion v);
    @Property(selector = "HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    @Property(selector = "setHTTPShouldUsePipelining:")
    public native void setShouldUseHTTPPipelining(boolean v);
    @Property(selector = "HTTPShouldSetCookies")
    public native boolean shouldSetHTTPCookies();
    @Property(selector = "setHTTPShouldSetCookies:")
    public native void setShouldSetHTTPCookies(boolean v);
    @Property(selector = "HTTPCookieAcceptPolicy")
    public native NSHTTPCookieAcceptPolicy getHTTPCookieAcceptPolicy();
    @Property(selector = "setHTTPCookieAcceptPolicy:")
    public native void setHTTPCookieAcceptPolicy(NSHTTPCookieAcceptPolicy v);
    @Property(selector = "HTTPAdditionalHeaders")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getGetAdditionalHTTPHeaders();
    @Property(selector = "setHTTPAdditionalHeaders:")
    public native void setGetAdditionalHTTPHeaders(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> v);
    @Property(selector = "HTTPMaximumConnectionsPerHost")
    public native @MachineSizedSInt long getMaximumHTTPConnectionsPerHost();
    @Property(selector = "setHTTPMaximumConnectionsPerHost:")
    public native void setMaximumHTTPConnectionsPerHost(@MachineSizedSInt long v);
    @Property(selector = "HTTPCookieStorage")
    public native NSHTTPCookieStorage getHTTPCookieStorage();
    @Property(selector = "setHTTPCookieStorage:")
    public native void setHTTPCookieStorage(NSHTTPCookieStorage v);
    @Property(selector = "URLCredentialStorage")
    public native NSURLCredentialStorage getURLCredentialStorage();
    @Property(selector = "setURLCredentialStorage:")
    public native void setURLCredentialStorage(NSURLCredentialStorage v);
    @Property(selector = "URLCache")
    public native NSURLCache getURLCache();
    @Property(selector = "setURLCache:")
    public native void setURLCache(NSURLCache v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "shouldUseExtendedBackgroundIdleMode")
    public native boolean shouldUseExtendedBackgroundIdleMode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShouldUseExtendedBackgroundIdleMode:")
    public native void setShouldUseExtendedBackgroundIdleMode(boolean v);
    @Property(selector = "protocolClasses")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<ObjCClass> getProtocolClasses();
    @Property(selector = "setProtocolClasses:")
    public native void setProtocolClasses(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<ObjCClass> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "multipathServiceType")
    public native NSURLSessionMultipathServiceType getMultipathServiceType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMultipathServiceType:")
    public native void setMultipathServiceType(NSURLSessionMultipathServiceType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "backgroundSessionConfigurationWithIdentifier:")
    public static native NSURLSessionConfiguration getBackgroundSessionConfiguration(String identifier);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -backgroundSessionConfigurationWithIdentifier:
     */
    @Deprecated
    @Method(selector = "backgroundSessionConfiguration:")
    public static native NSURLSessionConfiguration getBackgroundSessionConfiguration7(String identifier);
    /*</methods>*/
}
