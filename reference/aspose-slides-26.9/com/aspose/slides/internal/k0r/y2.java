package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptUnsupportedFormatException;

public class y2 extends e6r {
   private long n5;
   private String l6 = "";
   private long k5 = 3817979999L;

   public y2() {
      this.w1().n5(4086);
   }

   public static y2 n5(com.aspose.slides.internal.x1.x8 var0) {
      try {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(((com.aspose.slides.internal.x1.u9)var0.n5().u3("Current User")).n5());
         y2 var2 = new y2();
         var2.k5(new com.aspose.slides.internal.z0k.n5(var1));
         var1.close();
         return var2;
      } catch (RuntimeException var3) {
         throw new PptUnsupportedFormatException("Unknown file format.", var3);
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = (int)var1.x8().getPosition();
      var1.c4();
      this.k5 = var1.c4() & 4294967295L;
      this.n5 = var1.c4() & 4294967295L;
      short var3 = var1.k7();
      var1.k7();
      var1.z1();
      var1.z1();
      var1.k7();
      if (var3 > 0) {
         com.aspose.slides.internal.l7h.u6 var4 = new com.aspose.slides.internal.l7h.u6();
         char[] var5 = var4.n5(var1.c8(var3));
         if (var5 != null) {
            this.l6 = com.aspose.slides.ms.System.d1.n5(var5);
         }

         var1.m3();
      } else {
         this.l6 = "Aspose.Slides";
      }

      int var6 = (int)var1.x8().getPosition() - var2;
      if (var6 < this.w1().a6()) {
         var1.c8(this.w1().a6() - var6);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(20L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.n5 & 4294967295L);
      var1.n5((short)this.l6.length());
      var1.n5((short)1012);
      var1.n5((byte)3);
      var1.n5((byte)0);
      var1.n5((short)0);

      for (int var2 = 0; var2 < this.l6.length(); var2++) {
         var1.n5((byte)this.l6.charAt(var2));
      }

      var1.l6(8);
   }

   @Override
   public int n5() {
      return 24 + this.l6.length();
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1 == null ? "" : var1;
   }
}
