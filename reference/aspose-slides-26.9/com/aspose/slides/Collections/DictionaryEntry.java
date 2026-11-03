package com.aspose.slides.Collections;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import java.util.Map.Entry;

@j3
public class DictionaryEntry extends h0<DictionaryEntry> implements Entry {
   private Object l6;
   private Object k5;
   // $VF: synthetic field
   static final boolean n5 = !DictionaryEntry.class.desiredAssertionStatus();

   public DictionaryEntry() {
   }

   public DictionaryEntry(Object key, Object value) {
      this.l6 = key;
      this.k5 = value;
   }

   @Override
   public Object getKey() {
      return this.l6;
   }

   public void setKey(Object value) {
      this.l6 = value;
   }

   @Override
   public Object getValue() {
      return this.k5;
   }

   @Override
   public Object setValue(Object value) {
      Object var2 = this.k5;
      this.k5 = value;
      return var2;
   }

   public void CloneTo(DictionaryEntry that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
   }

   public DictionaryEntry Clone() {
      DictionaryEntry var1 = new DictionaryEntry();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(DictionaryEntry var1) {
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
         return !(obj instanceof DictionaryEntry) ? false : this.n5((DictionaryEntry)obj);
      }
   }

   public static boolean equals(DictionaryEntry obj1, DictionaryEntry obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }
}
