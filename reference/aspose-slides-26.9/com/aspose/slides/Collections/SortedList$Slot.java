package com.aspose.slides.Collections;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class SortedList$Slot extends h0<SortedList$Slot> {
   Object n5;
   Object l6;
   // $VF: synthetic field
   static final boolean k5 = !SortedList.class.desiredAssertionStatus();

   public void CloneTo(SortedList$Slot that) {
      that.n5 = this.n5;
      that.l6 = this.l6;
   }

   public SortedList$Slot Clone() {
      SortedList$Slot var1 = new SortedList$Slot();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(SortedList$Slot var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof SortedList$Slot) ? false : this.n5((SortedList$Slot)obj);
      }
   }

   public static boolean equals(SortedList$Slot obj1, SortedList$Slot obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      return 31 * var1 + (this.l6 != null ? this.l6.hashCode() : 0);
   }
}
