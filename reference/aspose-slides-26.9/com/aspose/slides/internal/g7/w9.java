package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class w9 extends z1 {
   private j6 a6;
   private k7 u9;
   private byte[] h0;
   private int c8;
   private List<Byte> t2;
   private byte[] s7 = new byte[2];
   private int x8;

   public w9(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("currentfile eexec\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("currentfile eexec\r\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("currentfile eexec\r")
      };
      super.n5 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("0000000000000000000")};
      this.t2 = new List<>(6);
   }

   public final byte[] n5() {
      return this.h0;
   }

   @Override
   public void k5() {
      this.a6 = new j6(0);
      this.c8 = 0;
      this.u9 = null;
      super.k5();
   }

   @Override
   protected void z_() {
      this.h0 = new byte[this.u9.l6()];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.u9.n5())), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), 0, this.u9.l6());
      this.u9 = null;
      super.z_();
   }

   @Override
   protected void n5(int var1) {
      boolean var2 = false;
      byte var3 = this.u3[var1];
      if (this.u9 == null) {
         if (this.z1().k5()) {
            this.u9 = new k7(this.u3.length - var1 / 2);
         } else {
            this.u9 = new k7(this.u3.length - var1);
         }
      }

      if (this.z1().k5()) {
         byte var4 = 0;
         byte[] var5 = new byte[]{0};
         boolean var6 = n5(this.u3[var1], var5);
         var4 = var5[0];
         if (var6) {
            this.s7[this.x8++] = var4;
            if (this.x8 >= 2) {
               var3 = (byte)(16 * (this.s7[0] & 255) + (this.s7[1] & 255));
               var2 = true;
               this.x8 = 0;
            }
         }
      } else if (this.c8 <= 0) {
         if (this.t2.size() == 0 && (this.u3[var1] & 255) != 128 || this.t2.size() == 1 && (this.u3[var1] & 255) != 2 && (this.u3[var1] & 255) != 1) {
            this.c8 = Integer.MAX_VALUE;
            var2 = true;
         }

         this.t2.addItem(this.u3[var1]);
         if (this.t2.size() == 6) {
            this.c8 = (this.t2.get_Item(5) & 255) << 24;
            this.c8 = this.c8 + ((this.t2.get_Item(4) & 255) << 16);
            this.c8 = this.c8 + ((this.t2.get_Item(3) & 255) << 8);
            this.c8 = this.c8 + (this.t2.get_Item(2) & 255);
            this.t2.clear();
         }
      } else {
         var2 = true;
      }

      if (var2) {
         this.u9.n5(this.a6.n5(var3));
         if (!this.z1().k5()) {
            this.c8--;
         }
      }

      super.n5(var1);
   }

   private static boolean n5(byte var0, byte[] var1) {
      var1[0] = var0;
      if ((var1[0] & 255) >= 48 && (var1[0] & 255) <= 57) {
         var1[0] = (byte)((var1[0] & 255) - 48);
         return true;
      } else if ((var1[0] & 255) >= 65 && (var1[0] & 255) <= 70) {
         var1[0] = (byte)((var1[0] & 255) - 55);
         return true;
      } else if ((var1[0] & 255) >= 97 && (var1[0] & 255) <= 102) {
         var1[0] = (byte)((var1[0] & 255) - 87);
         return true;
      } else {
         return false;
      }
   }
}
