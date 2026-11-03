package com.aspose.slides.Collections.Generic;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class KeyValuePair<TKey, TValue> extends h0<KeyValuePair> {
   private TKey l6;
   private TValue k5;
   // $VF: synthetic field
   static final boolean n5 = !KeyValuePair.class.desiredAssertionStatus();

   public KeyValuePair() {
   }

   public TKey getKey() {
      return this.l6;
   }

   public TValue getValue() {
      return this.k5;
   }

   public KeyValuePair(TKey key, TValue value) {
      this.l6 = key;
      this.k5 = value;
   }

   @Override
   public String toString() {
      return d1.n5("[", this.getKey() != null ? this.getKey().toString() : "", ", ", this.getValue() != null ? this.getValue().toString() : "", "]");
   }

   public void CloneTo(KeyValuePair that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
   }

   public KeyValuePair Clone() {
      KeyValuePair var1 = new KeyValuePair();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(KeyValuePair var1) {
      return j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof KeyValuePair) ? false : this.n5((KeyValuePair)obj);
      }
   }

   public static boolean equals(KeyValuePair obj1, KeyValuePair obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(KeyValuePair.class, new KeyValuePair$1());
   }
}
