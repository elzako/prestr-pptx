package com.aspose.slides.internal.k9;

import com.aspose.slides.ms.System.d1;

public class a6 extends k5 {
   private final String n5;

   public a6(String var1) {
      this.n5 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      a6 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, a6.class);
      return var2 == null ? false : super.equals(obj) && d1.a6(this.n5, var2.n5);
   }

   @Override
   public int hashCode() {
      int var1 = -324743029 + this.n5.hashCode();
      return var1 * 486187739 + super.hashCode();
   }

   @Override
   public String toString() {
      return d1.n5("{0}ImageCacheDerivedTransformationsKey, tag: {1}",new Object[]{ super.toString(), this.n5});
   }
}
