package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private com.aspose.slides.internal.z5z.n5 n5;
   private com.aspose.slides.internal.z5z.n3 l6;
   private z8 k5;
   private w1 u3;
   private y1 a6;
   private h0 u9;
   private j5 h0;
   private c4 c8;
   private n5 t2;
   private int s7;
   private final IDictionary x8 = com.aspose.slides.internal.z5z.c8.n5();
   private long[] n3;
   private static final String[] y4 = new String[]{"head", "hhea", "maxp", "hmtx", "fpgm", "prep", "cvt ", "loca", "glyf"};
   private static final String[] e2 = new String[]{"OS/2", "name", "cmap", "post"};
   private static final int[] t9 = new int[]{0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

   public final k5 n5(k7 var1, String var2) {
      com.aspose.slides.internal.z0k.t4 var3 = var1.l6();

      try {
         k5 var4 = this.n5(var3, var2);
         var4.n5(var1);
         return var4;
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final k5 n5(com.aspose.slides.internal.z0k.t4 var1, String var2) {
      this.n5 = new com.aspose.slides.internal.z5z.n5(var1);
      this.k5(var2);
      this.l6();
      this.a6();
      this.u9();
      this.k5();
      this.u3();
      this.h0();
      this.c8();
      return this.t2();
   }

   public final m3[] n5(k7 var1) {
      if (!var1.k5()) {
         return new m3[0];
      }

      com.aspose.slides.internal.z0k.t4 var2 = var1.l6();

      try {
         this.n5 = new com.aspose.slides.internal.z5z.n5(var2);
         if (this.s7()) {
            m3[] var11 = this.x8();

            for (m3 var15 : var11) {
               var15.n5(var1);
               var15.n5(true);
            }

            return var11;
         } else {
            if (!this.n5(0)) {
               return null;
            }

            this.a6();
            m3[] var3 = this.u9.n5();

            for (m3 var7 : var3) {
               var7.n5(var1);
               var7.n5(false);
            }

            return var3;
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private int n5() {
      int var1 = this.n5.l6();
      if (var1 != 65536 && var1 != 1330926671) {
         return -1;
      }

      int var2 = this.n5.a6() & 65535;
      this.n5.a6();
      this.n5.a6();
      this.n5.a6();
      return var2;
   }

   private void k5(String var1) {
      if (this.s7()) {
         this.x8();
         long var2 = com.aspose.slides.internal.v6g.k5.u3(this.x8.get_Item(var1), long.class);
         if (!this.n5((int)var2)) {
            throw new InvalidOperationException("The TTC font is invalid.");
         }
      } else if (!this.n5(0)) {
         throw new InvalidOperationException("The file is not recognized as a TTF or TTC font.");
      }
   }

   private boolean n5(int var1) {
      this.n5.n5().setPosition(var1);
      int var2 = this.n5();
      if (var2 <= 0) {
         return false;
      }

      this.l6 = new com.aspose.slides.internal.z5z.n3();

      for (int var3 = 0; var3 < var2; var3++) {
         x8 var4 = new x8(this.n5);
         this.l6.addItem(var4.n5, var4);
      }

      return true;
   }

   private void l6() {
      this.u3("head");
      this.k5 = new z8(this.n5);
   }

   private void k5() {
      this.u3("hhea");
      this.u3 = new w1(this.n5);
   }

   private void u3() {
      this.u3("maxp");
      this.a6 = new y1(this.n5);
   }

   private void a6() {
      this.u3("name");
      int var1 = (int)this.n5.n5().getPosition();
      this.l6(var1);
   }

   private void u9() {
      this.u3("OS/2");
      this.h0 = new j5(this.n5);
   }

   private void h0() {
      if (this.u3 == null) {
         throw new InvalidOperationException("Need to read horizontal header first.");
      }

      if (this.a6 == null) {
         throw new InvalidOperationException("Need to read maximum profile first.");
      }

      this.u3("hmtx");
      this.c8 = new c4(this.n5, this.u3.t4 & 65535, this.a6.l6 & 65535);
   }

   private void c8() {
      this.u3("cmap");
      this.t2 = new n5(this.n5);
   }

   private k5 t2() {
      k5 var1 = new k5();
      var1.k5(this.k5.u9 & 65535);
      var1.y4(this.k5.h0);
      var1.e2(this.k5.c8);
      var1.t9(this.k5.t2);
      var1.z1(this.k5.s7);
      x8 var2 = this.l6("CFF ");
      if (var2 != null) {
         var1.l6(true);
         this.n5.n5().setPosition(var2.k5);
         n3 var3 = new n3(this.n5);
         var1.k5(var3.n5());
      }

      float var13 = 1.8F;
      float var4 = var1.a6() / 1.8F;
      float var5 = var1.a6() * 1.8F;
      int var6 = this.h0.r4 - this.h0.c4;
      int var7 = (this.h0.y1 & 65535) + (this.h0.a0 & 65535);
      boolean var8 = var7 < var5 && var7 > var4;
      var1.n5(this.u9);
      boolean var9 = this.h0.r4 == 0 && this.h0.c4 == 0 || !var8;
      var1.u3(var9 ? this.u3.l6 : this.h0.y1 & 65535);
      var1.a6(var9 ? -this.u3.k5 : this.h0.a0 & 65535);
      var1.u9(!var9 && var1.s7() ? (this.h0.y1 & 65535) + (this.h0.a0 & 65535) : this.u3.l6 - this.u3.k5 + this.u3.u3);
      if (this.h0.c4 <= 0 || !(var6 > var5) && !(var6 < var4) || var8 || var1.c8() != 0 && !(var1.c8() > var5) && !(var1.c8() < var4)) {
         if (this.u3.k5 > 0) {
            var1.u3(this.k5.s7);
            var1.a6(-this.k5.c8);
            var1.u9(var1.u9() + var1.h0());
         }
      } else {
         var1.u3(this.k5.s7);
         var1.a6(-this.k5.c8);
         var1.u9(var1.u9() + var1.h0());
         var1.k5(var1.c8());
      }

      var1.n5((float)(-q1.u3((double)(this.u3.s7), (double)(this.u3.t2)) * 180.0 / Math.PI));
      var1.h0(this.h0.e2);
      var1.n3(this.h0.t9);
      var1.s7(this.h0.h0);
      var1.x8(this.h0.t2);
      var1.c8(this.h0.x8);
      var1.t2(this.h0.y4);
      int var10 = (this.h0.z8 & 65535) == 0 ? this.k5.n5() : this.h0.n5();
      var1.n5(var10);
      var1.l6(var10);
      var1.n5(this.h0.t4);
      var1.n5(this.h0.z1);
      if (com.aspose.slides.internal.z5z.u9.n5(var1.n5(), "Bold", true)) {
         var1.n5(var1.k5() | 1);
      }

      if (com.aspose.slides.internal.z5z.u9.n5(var1.n5(), "Italic", true)) {
         var1.n5(var1.k5() | 2);
      }

      var1.t4(this.h0.p8);
      var1.q0(this.h0.s3);
      var1.n5(this.t2.n5(this.c8));
      var1.n5(this.t2);
      if (var1.u9() + var1.h0() > var1.c8()) {
         var1.u9(var1.u9() + var1.h0());
      }

      byte var11 = 4;
      byte var12 = 8;
      var1.n5((this.h0.a6 & 65535 & 4) != 0 && (this.h0.a6 & 65535 & 8) == 0);
      return var1;
   }

   private void u3(String var1) {
      x8 var2 = this.n5(var1);
      this.n5.n5().setPosition(var2.k5);
   }

   public final x8 n5(String var1) {
      x8 var2 = this.l6(var1);
      if (var2 == null) {
         throw new InvalidOperationException(d1.n5("Cannot find table '{0}' in the font file.", new Object[]{var1}));
      } else {
         return var2;
      }
   }

   public final x8 l6(String var1) {
      return (x8)this.l6.get_Item(var1);
   }

   private boolean s7() {
      this.n5.n5().setPosition(0L);
      String var1 = d1.n5(this.n5.l6(4));
      if (!"ttcf".equals(var1)) {
         return false;
      }

      int var2 = this.n5.l6();
      if (var2 != 65536 && var2 != 131072) {
         return false;
      }

      this.s7 = this.n5.l6();
      this.n3 = new long[this.s7];

      for (int var3 = 0; var3 < this.s7; var3++) {
         this.n3[var3] = this.n5.k5();
      }

      if (131072 == var2) {
         this.n5.k5();
         this.n5.k5();
         this.n5.k5();
      }

      return true;
   }

   public k7[] l6(k7 var1) {
      if (!var1.k5()) {
         return new k7[]{var1};
      }

      com.aspose.slides.internal.z0k.t4 var2 = null;

      try {
         var2 = var1.l6();
         this.n5 = new com.aspose.slides.internal.z5z.n5(var2);
         if (!this.s7()) {
            return new k7[]{var1};
         }

         k7[] var3 = new k7[this.s7];

         for (int var4 = 0; var4 < this.s7; var4++) {
            var2.setPosition(this.n3[var4]);
            com.aspose.slides.internal.z0k.e2 var5 = null;

            try {
               var5 = com.aspose.slides.internal.l6o.l6.n5(var2);
               this.n5(var5, this.n3[var4]);
               var3[var4] = new a0(var5.toArray());
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         }

         return var3;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.e2 var1, long var2) {
      com.aspose.slides.internal.z5z.n5 var4 = new com.aspose.slides.internal.z5z.n5(var1);
      var4.n5().seek(4L, 0);
      int var5 = var4.a6();
      var4.n5().seek(6L, 1);

      for (int var6 = 0; var6 < var5; var6++) {
         var4.n5().seek(8L, 1);
         long var7 = var4.n5().getPosition();
         int var9 = var4.l6();
         var9 -= (int)var2;
         var4.n5().setPosition(var7);
         byte[] var10 = com.aspose.slides.ms.System.x8.l6(var9);
         var1.writeByte(var10[3]);
         var1.writeByte(var10[2]);
         var1.writeByte(var10[1]);
         var1.writeByte(var10[0]);
         var4.n5().seek(4L, 1);
      }
   }

   private m3[] x8() {
      if (this.s7 <= 0) {
         throw new InvalidOperationException("Can't read TTC entry.");
      }

      List var1 = new List();

      for (int var2 = 0; var2 < this.s7; var2++) {
         this.n5.n5().setPosition(this.n3[var2] & 4294967295L);
         int var3 = this.n5();
         if (var3 <= 0) {
            throw new InvalidOperationException("Can't read TTC entry.");
         }

         for (int var4 = 0; var4 < var3; var4++) {
            x8 var5 = new x8(this.n5);
            if ("name".equals(var5.n5)) {
               int var6 = var5.k5;
               this.n5.n5().setPosition(var6);
               this.l6(var6);
               String[] var7 = this.u9.k5(4);

               for (String var11 : var7) {
                  this.x8.set_Item(var11, this.n3[var2]);
               }

               m3[] var12 = this.u9.n5();
               if (null != var12) {
                  var1.addRange(com.aspose.slides.ms.System.u3.n5(var12));
               }
            }
         }
      }

      return (m3[])var1.toArray(new m3[0]);
   }

   private void l6(int var1) {
      int var2 = this.n5.a6();
      if ((var2 & 65535) != 0) {
         throw new InvalidOperationException("Unsupported Name table format.");
      }

      int var3 = this.n5.a6();
      int var4 = this.n5.a6();
      this.u9 = new h0();

      for (int var5 = 0; var5 < (var3 & 65535); var5++) {
         int var6 = this.n5.a6();
         int var7 = this.n5.a6();
         int var8 = this.n5.a6();
         int var9 = this.n5.a6();
         int var10 = this.n5.a6();
         int var11 = this.n5.a6();
         com.aspose.slides.internal.l7h.j5 var12 = null;
         switch (var6) {
            case 0:
               var12 = com.aspose.slides.internal.l7h.j5.t4();
               break;
            case 1:
               if (var7 == 2) {
                  var12 = com.aspose.slides.internal.l7h.j5.k5("big5");
               } else if (var7 == 0 || var7 == 1 || var7 == 3 || var7 == 25) {
                  var12 = com.aspose.slides.internal.l7h.j5.u3(1252);
               }
            case 2:
            default:
               break;
            case 3:
               if (var7 == 4) {
                  var12 = com.aspose.slides.internal.l7h.j5.k5("big5");
               } else if (var7 != 1 && var7 != 10 && var7 != 0) {
                  var12 = com.aspose.slides.internal.l7h.j5.k5("utf-16be");
               } else {
                  var12 = com.aspose.slides.internal.l7h.j5.t4();
               }
         }

         if (var12 != null) {
            int var13 = (int)this.n5.n5().getPosition();
            this.n5.n5().setPosition(var1 + (var4 & 65535) + var11);
            byte[] var14 = this.n5.n5(var10);
            String var21;
            if ("big5".equals(var12.s7())) {
               byte[] var15 = new byte[var14.length];
               int var16 = 0;

               for (byte var20 : var14) {
                  if (var20 != 0) {
                     var15[var16++] = var20;
                  }
               }

               var21 = var12.l6(var15, 0, var16);
            } else {
               var21 = var12.l6(var14);
            }

            if (this.u9.n5(var9, var8) == null) {
               this.u9.n5(var9, var8, var21);
            }

            this.n5.n5().setPosition(var13);
         }
      }
   }
}
