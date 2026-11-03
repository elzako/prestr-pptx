package com.aspose.slides.internal.l6j;

import com.aspose.slides.ms.System.x9;

public abstract class n5 {
   private Object l6;
   private final int k5;
   private final int u3;
   public static final n5 n5 = n5(null);

   protected n5(Object var1, int var2, int var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   public Object n5() {
      return this.l6;
   }

   public int l6() {
      return this.k5;
   }

   public int k5() {
      return this.u3;
   }

   public long u3() {
      return n5(this.l6(), this.k5());
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         n5 var2 = (n5)o;
         return this.u3 == var2.u3 && (this.l6 == null ? var2.l6 == null : this.l6 == var2.l6);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Long.valueOf(this.u3()).hashCode();
   }

   public static long n5(int var0, int var1) {
      return (long)var0 << 32 | var1;
   }

   public static n5 n5(long var0) {
      int var2 = (int)(var0 >> 32);
      int var3 = (int)var0;
      Object var4 = com.aspose.slides.internal.l6j.u3.n5(var2);
      return a6.n5(var4, var2, var3);
   }

   public static n5 n5(Object var0) {
      return n5(var0, 0);
   }

   public static n5 n5(Object var0, int var1) {
      int var2 = var0 == null ? 0 : com.aspose.slides.internal.l6j.u3.n5(var0);
      return a6.n5(var0, var2, var1);
   }

   public x9 a6() {
      return new x9(this);
   }

   public void u9() {
      com.aspose.slides.internal.l6j.u3.n5(Integer.valueOf(this.k5));
   }
}
