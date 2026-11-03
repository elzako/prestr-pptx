package com.aspose.slides.internal.c8m;

public abstract class y4 {
   private long n5 = Long.MIN_VALUE;
   private String l6;
   private com.aspose.slides.internal.q7.c8 k5;
   private com.aspose.slides.internal.e5a.y2 u3 = null;
   private s7 a6;
   private boolean u9 = false;

   public final long n5() {
      if (this.n5 == Long.MIN_VALUE) {
         this.n5 = this.k5 != null ? com.aspose.slides.internal.h3k.u3.n5(this.k5.n5()) & 4294967295L : Long.MIN_VALUE;
      }

      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return com.aspose.slides.ms.System.d1.l6(this.l6, 1, this.l6.length() - 1);
   }

   public final String u3() {
      return com.aspose.slides.ms.System.d1.k5(this.l6, com.aspose.slides.ms.System.d1.k5(this.l6, '/') + 1);
   }

   public final byte[] a6() {
      if (this.k5 == null) {
         this.y4();
      }

      return this.k5.n5();
   }

   public final void n5(byte[] var1) {
      this.k5 = com.aspose.slides.internal.q7.h0.n5(var1);
      this.u3 = null;
      this.n5 = Long.MIN_VALUE;
   }

   @Override
   public String toString() {
      return this.l6;
   }

   public final String u9() {
      return com.aspose.slides.internal.l7h.u6.z3().l6(this.a6());
   }

   protected y4(s7 var1, String var2, byte[] var3) {
      this.a6 = var1;
      this.l6 = var2;
      this.k5 = com.aspose.slides.internal.q7.h0.n5(var3);
   }

   y4(s7 var1, com.aspose.slides.internal.e5a.y2 var2) {
      this.a6 = var1;
      this.l6 = com.aspose.slides.ms.System.d1.n5(new String[]{"/", var2.u3()});
      this.u3 = var2;
      this.n5 = var2.x8();
   }

   public final com.aspose.slides.internal.z0k.e2 h0() {
      if (this.k5 != null) {
         return new com.aspose.slides.internal.z0k.e2(this.k5.n5());
      } else if (this.u3 != null) {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
         this.u3.n5(var1);
         var1.seek(0L, 0);
         return var1;
      } else {
         return null;
      }
   }

   public final com.aspose.slides.internal.z0k.t4 c8() {
      if (this.k5 != null) {
         return this.k5.l6();
      } else if (this.u3 != null) {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
         this.u3.n5(var1);
         var1.seek(0L, 0);
         return var1;
      } else {
         return null;
      }
   }

   public final com.aspose.slides.internal.e5a.y2 t2() {
      return this.u3;
   }

   public final boolean s7() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final s7 x8() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.q7.c8 var1) {
      this.k5 = var1;
   }

   final void n5(s7 var1) {
      this.a6 = var1;
   }

   public final void n3() {
      this.k5 = null;
      this.u3 = null;
   }

   private void y4() {
      if (this.k5 == null) {
         this.k5 = n5(this.u3);
      }
   }

   private static com.aspose.slides.internal.q7.c8 n5(com.aspose.slides.internal.e5a.y2 var0) {
      byte[] var1 = new byte[(int)var0.t2()];
      com.aspose.slides.internal.e5a.t2 var2 = var0.c4();

      try {
         int var3 = 0;
         int var4 = 0;

         while (var3 < var1.length) {
            var4 = var2.read(var1, var3, var1.length - var3);
            if (var4 == 0 && var3 > 0 && var3 != var0.t2()) {
               break;
            }

            var3 += var4;
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return com.aspose.slides.internal.q7.h0.n5(var1);
   }
}
