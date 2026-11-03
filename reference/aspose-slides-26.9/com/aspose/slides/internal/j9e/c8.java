package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public final class c8 {
   private o0 u3 = new o0();
   private String a6;
   static c8 n5;
   static c8 l6;
   static c8 k5;

   public c8(o0 var1) {
      var1.k5(this.u3);
   }

   c8(o0 var1, String var2) {
      var1.k5(this.u3);
      this.a6 = var2;
   }

   public o0 n5() {
      return this.u3;
   }

   public static c8 l6() {
      if (n5 == null) {
         n5 = new c8(new o0("7462dc86-6180-4c7e-8e3f-ee7333a7a483"), "Page");
      }

      return n5;
   }

   public static c8 k5() {
      if (l6 == null) {
         l6 = new c8(new o0("84236f7b-3bd3-428f-8dab-4ea1439ca315"), "Resolution");
      }

      return l6;
   }

   public static c8 u3() {
      if (k5 == null) {
         k5 = new c8(new o0("6aedbd6d-3fb5-418a-83a6-7f45229dc872"), "Time");
      }

      return k5;
   }

   @Override
   public boolean equals(Object o) {
      c8 var2 = o instanceof c8 ? (c8)o : null;
      return var2 != null && o0.n5(this.u3, var2.u3);
   }

   @Override
   public int hashCode() {
      return this.u3.hashCode();
   }

   @Override
   public String toString() {
      if (this.a6 == null) {
         this.a6 = d1.n5("[FrameDimension: {0}]", new Object[]{this.u3.k5()});
      }

      return this.a6;
   }
}
