package com.aspose.slides.Collections.Generic;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

public class Dictionary$Link extends h0<Dictionary$Link> {
   public int HashCode;
   public int Next;
   // $VF: synthetic field
   static final boolean n5 = !Dictionary.class.desiredAssertionStatus();

   public void CloneTo(Dictionary$Link that) {
      that.HashCode = this.HashCode;
      that.Next = this.Next;
   }

   public Dictionary$Link Clone() {
      Dictionary$Link var1 = new Dictionary$Link();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Dictionary$Link var1) {
      return var1.HashCode == this.HashCode && var1.Next == this.Next;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Dictionary$Link) ? false : this.n5((Dictionary$Link)obj);
      }
   }

   public static boolean equals(Dictionary$Link obj1, Dictionary$Link obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.HashCode;
      return 31 * var1 + this.Next;
   }
}
