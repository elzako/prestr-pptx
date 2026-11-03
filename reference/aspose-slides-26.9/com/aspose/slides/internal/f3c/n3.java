package com.aspose.slides.internal.f3c;

import com.aspose.slides.ms.System.d1;

public class n3 {
   private h0 n5;
   private z1[] l6;
   private String k5;
   private int u3;

   public n3(h0 var1) {
      this.n5 = var1;
      this.k5 = d1.n5;
   }

   public h0 n5() {
      return this.n5;
   }

   public z1[] l6() {
      return this.l6;
   }

   public int k5() {
      return this.u3;
   }

   public void n5(int var1) {
      this.u3 = var1;
   }

   private int l6(int var1) {
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 1; var3++ < 32; var4 <<= 1) {
         if ((var1 & var4) == var4) {
            var2++;
         }
      }

      return var2;
   }

   private void n5(z1[] var1, int[] var2, int var3, int var4) {
      if ((var3 & var4) != 0) {
         var1[var2[0]].n5(var4);
         var1[var2[0]].n5(z1.l6(var4));
         var2[0]++;
      }
   }

   public void u3() {
      if (this.u3 == 0) {
         this.l6 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), 0));
      } else {
         int var1 = this.l6(this.u3);
         this.l6 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), var1));
         int var2 = 0;
         int[] var3 = new int[]{0};
         this.n5(this.l6, var3, this.u3, 32);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 1);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 2);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 4);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 8);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 16);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 64);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 128);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 256);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 512);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 1024);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 2048);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 4096);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 8192);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 16384);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 32768);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 65536);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 131072);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 262144);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 524288);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 16777216);
         var2 = var3[0];
         var3[0] = var2;
         this.n5(this.l6, var3, this.u3, 33554432);
         var2 = var3[0];
      }
   }
}
