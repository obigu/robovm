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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRemoteCommandCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRemoteCommandCenterPtr extends Ptr<MPRemoteCommandCenter, MPRemoteCommandCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRemoteCommandCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPRemoteCommandCenter() {}
    protected MPRemoteCommandCenter(Handle h, long handle) { super(h, handle); }
    protected MPRemoteCommandCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pauseCommand")
    public native MPRemoteCommand getPauseCommand();
    @Property(selector = "playCommand")
    public native MPRemoteCommand getPlayCommand();
    @Property(selector = "stopCommand")
    public native MPRemoteCommand getStopCommand();
    @Property(selector = "togglePlayPauseCommand")
    public native MPRemoteCommand getTogglePlayPauseCommand();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "enableLanguageOptionCommand")
    public native MPRemoteCommand getEnableLanguageOptionCommand();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "disableLanguageOptionCommand")
    public native MPRemoteCommand getDisableLanguageOptionCommand();
    @Property(selector = "changePlaybackRateCommand")
    public native MPChangePlaybackRateCommand getChangePlaybackRateCommand();
    @Property(selector = "changeRepeatModeCommand")
    public native MPChangeRepeatModeCommand getChangeRepeatModeCommand();
    @Property(selector = "changeShuffleModeCommand")
    public native MPChangeShuffleModeCommand getChangeShuffleModeCommand();
    @Property(selector = "nextTrackCommand")
    public native MPRemoteCommand getNextTrackCommand();
    @Property(selector = "previousTrackCommand")
    public native MPRemoteCommand getPreviousTrackCommand();
    @Property(selector = "skipForwardCommand")
    public native MPSkipIntervalCommand getSkipForwardCommand();
    @Property(selector = "skipBackwardCommand")
    public native MPSkipIntervalCommand getSkipBackwardCommand();
    @Property(selector = "seekForwardCommand")
    public native MPRemoteCommand getSeekForwardCommand();
    @Property(selector = "seekBackwardCommand")
    public native MPRemoteCommand getSeekBackwardCommand();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "changePlaybackPositionCommand")
    public native MPChangePlaybackPositionCommand getChangePlaybackPositionCommand();
    @Property(selector = "ratingCommand")
    public native MPRatingCommand getRatingCommand();
    @Property(selector = "likeCommand")
    public native MPFeedbackCommand getLikeCommand();
    @Property(selector = "dislikeCommand")
    public native MPFeedbackCommand getDislikeCommand();
    @Property(selector = "bookmarkCommand")
    public native MPFeedbackCommand getBookmarkCommand();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedCommandCenter")
    public static native MPRemoteCommandCenter getSharedCommandCenter();
    /*</methods>*/
}
