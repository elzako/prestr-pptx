package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentException;

public final class l2 extends v2 {
   private int n5;
   private String l6;
   private String k5;
   private int u3 = 65535;
   private byte[] a6;

   public l2() {
      this.n5((String)null);
      this.l6(null);
   }

   @Override
   public com.aspose.slides.ms.System.o0 n5() {
      return e7.l6;
   }

   public final int l6() {
      return com.aspose.slides.internal.n8e.v4.n5(this.n5);
   }

   public final long a6() {
      return (this.l6 != null ? this.l6.length() - (this.n5 & 65535) * 3 : 0) + 1 & 4294967295L;
   }

   public final String u9() {
      return this.l6;
   }

   public final void n5(String var1) {
      if (var1 != null) {
         int var2 = k5(var1);
         if (var1.length() - (var2 & 65535) * 3 > 32767) {
            throw new ArgumentException("AnsiPath length can't be more than 32767 (with null-terminator inclusive).");
         }

         this.n5 = var2;
         this.l6 = var1;
      } else {
         this.n5 = 0;
         this.l6 = null;
      }
   }

   public final int h0() {
      return com.aspose.slides.internal.n8e.v4.n5(this.u3);
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final long c8() {
      return (this.k5 != null && this.k5.length() > 0 ? this.k5.length() * 2 + 6 : 0) & 4294967295L;
   }

   public final long t2() {
      return (this.k5 != null && this.k5.length() > 0 ? this.k5.length() * 2 : 0) & 4294967295L;
   }

   public final String s7() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   @Override
   public long k5() {
      return (
               (((((6L + (this.a6() & 4294967295L) & 4294967295L) + 2L & 4294967295L) + 2L & 4294967295L) + 16L & 4294967295L) + 4L & 4294967295L) + 4L
                  & 4294967295L
            )
            + (((this.c8() & 4294967295L) > 0L ? this.c8() : 0L) & 4294967295L)
         & 4294967295L;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      long var3 = var1.c4();
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      if ((var3 & 4294967295L) > 1L) {
         var5.n5(com.aspose.slides.internal.l7h.j5.u3(1252).l6(var1.c8((int)var3 - 1)));

         for (int var6 = 0; var6 < (var2 & 65535); var6++) {
            var5.l6(0, com.aspose.slides.internal.z0k.z1.k5);
            var5.n5(0, "..");
         }

         this.n5(var5.toString());
      }

      var1.z1();
      this.n5(var1.r4());
      int var12 = var1.r4();
      var1.c8(16);
      var1.c8(4);
      long var7 = var1.c4();
      if ((var7 & 4294967295L) > 0L) {
         long var9 = var1.c4();
         int var11 = var1.r4();
         this.l6(com.aspose.slides.internal.l7h.j5.z1().l6(var1.c8((int)var9)));
         if ((var7 & 4294967295L) > ((var9 & 4294967295L) + 6L & 4294967295L)) {
            this.a6 = var1.c8((int)var7 - 6 - (int)var9);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.l6()));
      var1.n5(this.a6());
      if ((this.a6() & 4294967295L) > 1L) {
         var1.n5(com.aspose.slides.internal.l7h.j5.u3(1252).u3(com.aspose.slides.ms.System.d1.k5(this.u9(), (this.l6() & 65535) * 3)));
      }

      var1.n5((byte)0);
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.h0()));
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(57005));
      var1.n5(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
      var1.n5(new byte[]{0, 0, 0, 0});
      var1.n5(this.c8());
      if ((this.c8() & 4294967295L) > 0L) {
         var1.n5(this.t2());
         var1.n5(3);
         var1.n5(com.aspose.slides.internal.l7h.j5.z1().u3(this.s7()));
      }
   }

   @Override
   public String u3() {
      return this.s7() != null ? this.s7() : this.u9();
   }

   private static int k5(String var0) {
      if (var0 == null) {
         return 0;
      }

      int var1 = 0;

      while (
         var0.length() > (var1 & 65535) * 3 + 3
            && var0.charAt((var1 & 65535) * 3) == '.'
            && var0.charAt((var1 & 65535) * 3 + 1) == '.'
            && (var0.charAt((var1 & 65535) * 3 + 2) == '\\' || var0.charAt((var1 & 65535) * 3 + 2) == '/')
      ) {
         var1++;
      }

      return var1;
   }
}
