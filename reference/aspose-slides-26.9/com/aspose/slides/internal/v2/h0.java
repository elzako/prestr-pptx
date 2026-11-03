package com.aspose.slides.internal.v2;

public class h0 extends t2 {
   private static final h0[] n5 = new h0[357];
   private long l6;

   public static h0 n5() {
      return n5(0L);
   }

   public final long l6() {
      return this.l6;
   }

   private void l6(long var1) {
      this.l6 = var1;
   }

   public h0(long var1) {
      super((float)var1);
      this.l6(var1);
   }

   public static h0 n5(long var0) {
      if (-100L <= var0 && var0 <= 256L) {
         int var2 = (int)var0 - -100;
         if (n5[var2] == null) {
            n5[var2] = new h0(var0);
         }

         return n5[var2];
      } else {
         return new h0(var0);
      }
   }
}
