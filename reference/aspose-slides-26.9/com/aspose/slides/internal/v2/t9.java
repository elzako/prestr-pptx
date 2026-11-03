package com.aspose.slides.internal.v2;

import com.aspose.slides.ms.System.p3;

public class t9 {
   private long n5;
   private long l6;

   public final long n5() {
      return this.n5;
   }

   private void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   private void l6(long var1) {
      this.l6 = var1;
   }

   public t9(u9 var1) {
      this(var1.n5().k5(), var1.l6().k5());
   }

   public t9(long var1, long var3) {
      this.n5(var1);
      this.l6(var3);
   }

   @Override
   public int hashCode() {
      int var1 = p3.n5(this.n5());
      int var2 = p3.n5(this.l6());
      return var1 + var2;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, t9.class)) {
         return false;
      }

      t9 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, t9.class);
      return this.n5() == var2.n5() && this.l6() == var2.l6();
   }
}
