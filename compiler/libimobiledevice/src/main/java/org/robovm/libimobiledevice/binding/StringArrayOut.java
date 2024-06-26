/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class StringArrayOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringArrayOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringArrayOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StringArrayOut obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_StringArrayOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringArray getValue() {
    long cPtr = LibIMobileDeviceJNI.StringArrayOut_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new StringArray(cPtr, false);
  }

  public StringArrayOut() {
    this(LibIMobileDeviceJNI.new_StringArrayOut(), true);
  }

}
