package com.aspose.slides.internal.t3h;

import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.ms.System.y4;

public class l6 extends h2 {
   private final n5 a6;
   private int u9;

   public l6(v3 var1, com.aspose.slides.internal.f2i.n5 var2, int var3, int var4, int var5, int var6, long[][] var7) {
      super(var1);
      this.a6 = new n5(var1, var2, var3, var4, var5, var6, var7);
      this.a6.s3();
   }

   @Override
   public boolean a6() {
      long var1 = 0L;
      Object var3 = null;
      byte[][] var4 = new byte[][]{(byte[])var3};
      long[] var5 = new long[]{0L};
      this.n5(var4, var5);
      var3 = var4[0];
      var1 = var5[0];
      if (var1 <= 0L) {
         this.k5 = 0;
         return false;
      } else {
         this.n5 = (byte[])var3;
         this.k5 = (int)var1;
         this.l6 = 0;
         return true;
      }
   }

   private void n5(byte[][] var1, long[] var2) {
      var1[0] = null;
      var2[0] = 0L;

      do {
         com.aspose.slides.internal.f8y.n5.n5(this.u9 <= 18);
         switch (this.u9) {
            case 0:
               this.h0(var1, var2);
               break;
            case 1:
               this.k5((byte)0, var1, var2);
               break;
            case 2:
               this.k5((byte)1, var1, var2);
               break;
            case 3:
               this.k5((byte)2, var1, var2);
               break;
            case 4:
               this.k5((byte)3, var1, var2);
               break;
            case 5:
               this.l6((byte)0, var1, var2);
               break;
            case 6:
               this.l6((byte)1, var1, var2);
               break;
            case 7:
               this.l6((byte)2, var1, var2);
               break;
            case 8:
               this.l6((byte)3, var1, var2);
               break;
            case 9:
               this.n5((byte)0, var1, var2);
               break;
            case 10:
               this.n5((byte)1, var1, var2);
               break;
            case 11:
               this.n5((byte)2, var1, var2);
               break;
            case 12:
               this.n5((byte)3, var1, var2);
               break;
            case 13:
               this.k5(var1, var2);
               break;
            case 14:
               this.u9(var1, var2);
               break;
            case 15:
               this.c8(var1, var2);
               break;
            case 16:
               if (!this.l6(var1, var2)) {
                  return;
               }
               break;
            case 17:
               this.a6(var1, var2);
               break;
            case 18:
               this.u3(var1, var2);
         }
      } while (var2[0] == 0L);
   }

   private void n5(byte var1, byte[][] var2, long[] var3) {
      var2[0] = null;
      var3[0] = 0L;
      if (this.a6.u9()[var1 & 0xFF] != null) {
         var2[0] = this.a6.u9()[var1 & 0xFF];
         var3[0] = this.a6.u9()[var1 & 0xFF].length & 4294967295L;
      }

      this.u9++;
   }

   private boolean l6(byte[][] var1, long[] var2) {
      var1[0] = null;
      var2[0] = 0L;
      if (this.a6.d2() == 0) {
         if (!this.a6.p8()) {
            return false;
         }

         com.aspose.slides.internal.f8y.n5.n5(this.a6.d2() > 0);
      }

      var2[0] = this.a6.d2();
      if (this.a6.n3() == 0) {
         var1[0] = this.a6.y4();
      } else {
         var1[0] = new byte[(int)var2[0]];
         y4.n5(this.a6.y4(), this.a6.n3(), var1[0], 0, (int)var2[0]);
      }

      this.a6.h0(0);
      if (this.a6.a0() == 0L) {
         switch (this.a6.c4()) {
            case 2:
               if (this.a6.y2() < this.a6.y1()) {
                  this.u9 = 17;
               } else {
                  this.u9 = 18;
               }
               break;
            case 3:
               this.u9 = 18;
         }
      }

      return true;
   }

   private void l6(byte var1, byte[][] var2, long[] var3) {
      var2[0] = null;
      var3[0] = 0L;
      if (this.a6.a6()[var1 & 0xFF] != null) {
         var2[0] = this.a6.a6()[var1 & 0xFF];
         var3[0] = this.a6.a6()[var1 & 0xFF].length & 4294967295L;
      }

      this.u9++;
   }

   private void k5(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(true);
      var1[0] = null;
      var2[0] = 0L;
      if (this.a6.m1() != 0) {
         this.a6.e2()[0] = -1;
         this.a6.e2()[1] = -35;
         this.a6.e2()[2] = 0;
         this.a6.e2()[3] = 4;
         this.a6.e2()[4] = (byte)(this.a6.m1() >> 8);
         this.a6.e2()[5] = (byte)(this.a6.m1() & 0xFF);
         var2[0] = 6L;
         var1[0] = this.a6.e2();
      }

      this.u9++;
   }

   private void u3(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(true);
      this.a6.e2()[0] = -1;
      this.a6.e2()[1] = -39;
      var2[0] = 2L;
      var1[0] = this.a6.e2();
   }

   private void k5(byte var1, byte[][] var2, long[] var3) {
      var2[0] = null;
      var3[0] = 0L;
      if (this.a6.u3()[var1 & 0xFF] != null) {
         var2[0] = this.a6.u3()[var1 & 0xFF];
         var3[0] = this.a6.u3()[var1 & 0xFF].length & 4294967295L;
      }

      this.u9++;
   }

   private void a6(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(true);
      this.a6.e2()[0] = -1;
      this.a6.e2()[1] = (byte)(-48 + (this.a6.z8() & 255));
      this.a6.t2((byte)(this.a6.z8() + 1));
      if ((this.a6.z8() & 255) == 8) {
         this.a6.t2((byte)0);
      }

      var2[0] = 2L;
      var1[0] = this.a6.e2();
      this.u9 = 16;
   }

   private void u9(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(2048 >= 10 + (this.a6.m3() & 255) * 3);
      com.aspose.slides.internal.f8y.n5.n5(255 >= 8 + (this.a6.m3() & 255) * 3);
      this.a6.e2()[0] = -1;
      this.a6.e2()[1] = this.a6.j5();
      this.a6.e2()[2] = 0;
      this.a6.e2()[3] = (byte)(8 + (this.a6.m3() & 255) * 3);
      this.a6.e2()[4] = 8;
      this.a6.e2()[5] = (byte)(this.a6.r4() >> 8);
      this.a6.e2()[6] = (byte)(this.a6.r4() & 0xFF);
      this.a6.e2()[7] = (byte)(this.a6.w1() >> 8);
      this.a6.e2()[8] = (byte)(this.a6.w1() & 0xFF);
      this.a6.e2()[9] = this.a6.m3();

      for (byte var3 = 0; (var3 & 255) < (this.a6.m3() & 255); var3++) {
         this.a6.e2()[10 + (var3 & 255) * 3] = this.a6.h0()[(this.a6.k7() & 255) + (var3 & 255)];
         this.a6.e2()[10 + (var3 & 255) * 3 + 1] = this.a6.c8()[(this.a6.k7() & 255) + (var3 & 255)];
         this.a6.e2()[10 + (var3 & 255) * 3 + 2] = this.a6.t2()[(this.a6.k7() & 255) + (var3 & 255)];
      }

      var2[0] = 10 + (this.a6.m3() & 255) * 3 & 4294967295L;
      var1[0] = this.a6.e2();
      this.u9++;
   }

   private void h0(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(true);
      this.a6.e2()[0] = -1;
      this.a6.e2()[1] = -40;
      var2[0] = 2L;
      var1[0] = this.a6.e2();
      this.u9++;
   }

   private void c8(byte[][] var1, long[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(2048 >= 8 + (this.a6.m3() & 255) * 2);
      com.aspose.slides.internal.f8y.n5.n5(255 >= 6 + (this.a6.m3() & 255) * 2);
      this.a6.e2()[0] = -1;
      this.a6.e2()[1] = -38;
      this.a6.e2()[2] = 0;
      this.a6.e2()[3] = (byte)(6 + (this.a6.m3() & 255) * 2);
      this.a6.e2()[4] = this.a6.m3();

      for (byte var3 = 0; (var3 & 255) < (this.a6.m3() & 255); var3++) {
         this.a6.e2()[5 + (var3 & 255) * 2] = this.a6.s7()[(this.a6.k7() & 255) + (var3 & 255)];
         this.a6.e2()[5 + (var3 & 255) * 2 + 1] = this.a6.x8()[(this.a6.k7() & 255) + (var3 & 255)];
      }

      this.a6.e2()[5 + (this.a6.m3() & 255) * 2] = 0;
      this.a6.e2()[5 + (this.a6.m3() & 255) * 2 + 1] = 63;
      this.a6.e2()[5 + (this.a6.m3() & 255) * 2 + 2] = 0;
      var2[0] = 8 + (this.a6.m3() & 255) * 2 & 4294967295L;
      var1[0] = this.a6.e2();
      this.u9++;
   }
}
