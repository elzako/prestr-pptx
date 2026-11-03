package com.aspose.slides.internal.l3;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class u3 extends n5 {
   private e2 l6;
   private final int[] k5 = new int[5021];
   private final int[] u3 = new int[5021];
   private final byte[] a6 = new byte[5021];
   private int u9;
   private int h0;
   private int c8;
   private u9 t2;

   public u3(t4 var1) {
      super(var1);
   }

   public u3(t4 var1, int var2, int var3, int var4, int var5) {
      this(var1);
      if (var2 != 1) {
         this.t2 = new u9(var2, var3, var4, var5);
      } else {
         this.t2 = null;
      }
   }

   @Override
   public void write(byte[] srcBuffer, int srcOffset, int srcCount) {
      if (this.t2 != null) {
         this.l6 = this.t2.n5(new e2(srcBuffer, srcOffset, srcCount));
         this.l6.setPosition(0L);
      } else {
         this.l6 = new e2(srcBuffer, srcOffset, srcCount);
      }

      this.n5();
      this.l6();
      this.u3();
   }

   private void n5() {
      this.u9 = 0;
      this.h0 = 128;
      this.c8 = 9;
   }

   private void l6() {
      for (int var1 = 0; var1 < this.k5.length; var1++) {
         this.k5[var1] = -1;
      }
   }

   private void k5() {
      if (this.h0 != 128) {
         super.n5.writeByte((byte)this.u9);
      }
   }

   private void n5(boolean var1) {
      if (var1) {
         this.u9 = this.u9 | this.h0;
      }

      this.h0 >>= 1;
      if (this.h0 == 0) {
         super.n5.writeByte((byte)this.u9);
         this.u9 = 0;
         this.h0 = 128;
      }
   }

   private void n5(int var1) {
      for (int var2 = 1 << this.c8 - 1; var2 != 0; var2 >>= 1) {
         this.n5((var2 & var1) != 0);
      }
   }

   private void u3() {
      int var1 = 258;
      int var2 = this.l6.readByte();
      if (var2 == -1) {
         var2 = 257;
      }

      this.n5(256);

      int var3;
      while ((var3 = this.l6.readByte()) != -1) {
         int var4 = this.n5(var2, var3);
         if (var1 == 1 << this.c8) {
            if (this.c8 < 12) {
               this.c8++;
            } else {
               var1 = 258;
               this.l6();
               this.n5(256);
               this.c8 = 9;
            }
         }

         if (this.k5[var4] != -1) {
            var2 = this.k5[var4];
         } else {
            this.k5[var4] = var1++;
            this.u3[var4] = var2;
            this.a6[var4] = (byte)var3;
            this.n5(var2);
            var2 = var3;
         }
      }

      this.n5(var2);
      this.n5(257);
      this.k5();
   }

   private int n5(int var1, int var2) {
      int var3 = var2 << this.c8 - 8 ^ var1;
      int var4 = var3 == 0 ? 1 : 5021 - var3;

      while (this.k5[var3] != -1 && (this.u3[var3] != var1 || this.a6[var3] != (byte)var2)) {
         var3 -= var4;
         if (var3 < 0) {
            var3 += 5021;
         }
      }

      return var3;
   }
}
