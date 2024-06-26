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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MKMapViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("mapView:regionWillChangeAnimated:")
    public void willChangeRegion(MKMapView mapView, boolean animated) {}
    @NotImplemented("mapView:regionDidChangeAnimated:")
    public void didChangeRegion(MKMapView mapView, boolean animated) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("mapViewDidChangeVisibleRegion:")
    public void mapViewDidChangeVisibleRegion(MKMapView mapView) {}
    @NotImplemented("mapViewWillStartLoadingMap:")
    public void willStartLoadingMap(MKMapView mapView) {}
    @NotImplemented("mapViewDidFinishLoadingMap:")
    public void didFinishLoadingMap(MKMapView mapView) {}
    @NotImplemented("mapViewDidFailLoadingMap:withError:")
    public void didFailLoadingMap(MKMapView mapView, NSError error) {}
    @NotImplemented("mapViewWillStartRenderingMap:")
    public void willStartRenderingMap(MKMapView mapView) {}
    @NotImplemented("mapViewDidFinishRenderingMap:fullyRendered:")
    public void didFinishRenderingMap(MKMapView mapView, boolean fullyRendered) {}
    @NotImplemented("mapView:viewForAnnotation:")
    public MKAnnotationView getAnnotationView(MKMapView mapView, MKAnnotation annotation) { return null; }
    @NotImplemented("mapView:didAddAnnotationViews:")
    public void didAddAnnotationViews(MKMapView mapView, NSArray<MKAnnotationView> views) {}
    @NotImplemented("mapView:annotationView:calloutAccessoryControlTapped:")
    public void calloutAccessoryControlTapped(MKMapView mapView, MKAnnotationView view, UIControl control) {}
    @NotImplemented("mapView:didSelectAnnotationView:")
    public void didSelectAnnotationView(MKMapView mapView, MKAnnotationView view) {}
    @NotImplemented("mapView:didDeselectAnnotationView:")
    public void didDeselectAnnotationView(MKMapView mapView, MKAnnotationView view) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("mapView:didSelectAnnotation:")
    public void didSelectAnnotation(MKMapView mapView, MKAnnotation annotation) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("mapView:didDeselectAnnotation:")
    public void didDeselectAnnotation(MKMapView mapView, MKAnnotation annotation) {}
    @NotImplemented("mapViewWillStartLocatingUser:")
    public void willStartLocatingUser(MKMapView mapView) {}
    @NotImplemented("mapViewDidStopLocatingUser:")
    public void didStopLocatingUser(MKMapView mapView) {}
    @NotImplemented("mapView:didUpdateUserLocation:")
    public void didUpdateUserLocation(MKMapView mapView, MKUserLocation userLocation) {}
    @NotImplemented("mapView:didFailToLocateUserWithError:")
    public void didFailToLocateUser(MKMapView mapView, NSError error) {}
    @NotImplemented("mapView:annotationView:didChangeDragState:fromOldState:")
    public void didChangeDragState(MKMapView mapView, MKAnnotationView view, MKAnnotationViewDragState newState, MKAnnotationViewDragState oldState) {}
    @NotImplemented("mapView:didChangeUserTrackingMode:animated:")
    public void didChangeUserTrackingMode(MKMapView mapView, MKUserTrackingMode mode, boolean animated) {}
    @NotImplemented("mapView:rendererForOverlay:")
    public MKOverlayRenderer getOverlayRenderer(MKMapView mapView, MKOverlay overlay) { return null; }
    @NotImplemented("mapView:didAddOverlayRenderers:")
    public void didAddOverlayRenderers(MKMapView mapView, NSArray<MKOverlayRenderer> renderers) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use -mapView:rendererForOverlay:
     */
    @Deprecated
    @NotImplemented("mapView:viewForOverlay:")
    public MKOverlayView getOverlayView(MKMapView mapView, MKOverlay overlay) { return null; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use -mapView:didAddOverlayRenderers:
     */
    @Deprecated
    @NotImplemented("mapView:didAddOverlayViews:")
    public void didAddOverlayViews(MKMapView mapView, NSArray<MKOverlayView> overlayViews) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("mapView:clusterAnnotationForMemberAnnotations:")
    public MKClusterAnnotation getClusterAnnotationForMemberAnnotations(MKMapView mapView, NSArray<?> memberAnnotations) { return null; }
    /*</methods>*/
}
