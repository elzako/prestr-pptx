package com.aspose.slides.internal.g9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.q1;

public class e2 extends n5 {
   private com.aspose.slides.internal.v2.n5 n5;
   private a6 l6;
   private byte[] k5;
   private int u3;
   private float[][] a6;
   private int[][] u9;
   private u3 h0;

   @Override
   public com.aspose.slides.internal.v2.n5 n5() {
      return this.n5;
   }

   public static String l6() {
      return "Indexed";
   }

   public static String u9() {
      return "I";
   }

   @Override
   public u3 k5() {
      if (this.h0 == null) {
         this.h0 = new u3(new float[]{0.0F}, this);
      }

      return this.h0;
   }

   public e2() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.x1);
      this.n5.n5(com.aspose.slides.internal.v2.c8.w3);
      this.n5.n5(com.aspose.slides.internal.v2.h0.n5(255L));
      this.n5.n5(com.aspose.slides.internal.v2.s7.c8());
   }

   public e2(com.aspose.slides.internal.v2.n5 var1, com.aspose.slides.internal.e7.t2 var2) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.g9.a6.n5(this.n5.k5(1), var2);
      this.s7();
      this.n3();
   }

   @Override
   public String u3() {
      return l6();
   }

   @Override
   public int a6() {
      a6 var1 = this.h0();
      return var1.a6();
   }

   public final a6 h0() {
      com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(1);
      return com.aspose.slides.internal.g9.u9.n5(var1);
   }

   private void c8() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(3);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.y4.class)) {
            this.k5 = ((com.aspose.slides.internal.v2.y4)var1).n5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.x8.class)) {
            this.k5 = new com.aspose.slides.internal.e7.s7((com.aspose.slides.internal.v2.x8)var1).n5();
         } else if (var1 == null) {
            this.k5 = new byte[0];
         }
      }
   }

   private void s7() {
      this.c8();
      int var1 = q1.l6(this.x8(), 255);
      int var2 = this.l6.a6();
      if (this.k5.length / var2 < var1 + 1) {
         var1 = this.k5.length / var2 - 1;
      }

      this.u3 = var1;
      this.a6 = new float[var1 + 1][];

      for (int var3 = 0; var3 < this.a6.length; var3++) {
         this.a6[var3] = new float[var2];
      }

      int var6 = 0;
      int var4 = 0;

      while (var6 <= var1) {
         for (int var5 = 0; var5 < var2; var5++) {
            this.a6[var6][var5] = (this.k5[var4] & 0xFF & 0xFF) / 255.0F;
            var4++;
         }

         var6++;
      }
   }

   private int x8() {
      return ((com.aspose.slides.internal.v2.t2)this.n5.l6(2)).k5();
   }

   private void n3() {
      int var1 = this.l6.a6();
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(this.u3 + 1, 1, 198659);
      com.aspose.slides.internal.o9b.c8[] var3 = var2.t2().n5();
      int[] var4 = new int[var1];
      int var5 = 0;

      for (int var6 = this.u3; var5 <= var6; var5++) {
         for (int var7 = 0; var7 < var1; var7++) {
            var4[var7] = com.aspose.slides.internal.v6g.k5.u3(this.a6[var5][var7] * 255.0F, 13);
         }

         com.aspose.slides.internal.o9b.c8 var11 = com.aspose.slides.internal.o9b.c8.w4().o8();
         switch (var1) {
            case 3:
               com.aspose.slides.internal.o9b.c8.n5(var4[0], var4[1], var4[2]).n5(var11);
               break;
            case 4:
               com.aspose.slides.internal.o9b.c8.n5(var4[0], var4[1], var4[2], var4[3]).n5(var11);
         }

         var11.n5(var3[var5]);
      }

      this.u9 = new int[this.u3 + 1][];

      for (int var8 = 0; var8 < this.u9.length; var8++) {
         this.u9[var8] = new int[3];
      }

      var5 = 0;

      for (int var10 = this.u3; var5 <= var10; var5++) {
         com.aspose.slides.internal.o9b.c8 var12 = var3[var5].o8();
         this.u9[var5] = new int[]{var12.x8() & 255, var12.n3() & 255, var12.y4() & 255};
      }
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1) {
      int var2 = var1.e2();
      int var3 = var1.h0();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var2, var3, 139273);

      for (int var5 = 0; var5 < var3; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            com.aspose.slides.internal.o9b.c8 var7 = var4.l6(var6, var5).o8();
            int var8 = q1.l6(var7.x8() & 255, this.u3);
            com.aspose.slides.internal.o9b.c8 var9 = com.aspose.slides.internal.o9b.c8.n5(this.u9[var8][0], this.u9[var8][1], this.u9[var8][2]).o8();
            var4.n5(var6, var5, var9.o8());
         }
      }

      return var4;
   }

   @Override
   public float[] n5(float[] var1) {
      if (var1.length > 1) {
         throw new ArgumentException("Indexed color spaces must have one color value");
      }

      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1[0]), 14);
      var2 = q1.n5(var2, 0);
      var2 = q1.l6(var2, this.u3);
      int[] var3 = this.u9[var2];
      return new float[]{var3[0] / 255.0F, var3[1] / 255.0F, var3[2] / 255.0F};
   }
}
