package com.aspose.slides.internal.e4;

import com.aspose.slides.Collections.Generic.List;

public class n5 extends u3 {
   private final List<Integer> u3 = new List<>();
   private int a6;
   private int u9;

   public n5(com.aspose.slides.internal.m9.h0 var1, int var2, int var3) {
      super(var1, var2, var3, 1);
      this.k5();
   }

   @Override
   protected void k5() {
      if (!this.l6) {
         if (!this.l6) {
            int var1 = 10;
            int var2 = 32;

            while ((var2 & 32) == 32) {
               this.u3.addItem(var1);
               var2 = this.n5.a6(var1);
               var1 += 4;
               if ((var2 & 1) == 1) {
                  var1 += 4;
               } else {
                  var1 += 2;
               }

               if ((var2 & 8) == 8) {
                  var1 += 2;
               } else if ((var2 & 64) == 64) {
                  var1 += 4;
               } else if ((var2 & 128) == 128) {
                  var1 += 8;
               }
            }

            int var3 = var1;
            if ((var2 & 256) == 256) {
               this.u9 = this.n5.a6(var1);
               var1 += 2;
               this.a6 = var1;
               var3 = var1 + this.u9 * 1;
            }

            this.n5(this.l6() - var3);
         }
      }
   }

   public final int l6(int var1) {
      return this.n5.a6(this.u3.get_Item(var1));
   }

   public final int u3() {
      return this.u3.size();
   }

   public final int k5(int var1) {
      return this.n5.a6(2 + this.u3.get_Item(var1));
   }

   public final int u3(int var1) {
      int var2 = 4 + this.u3.get_Item(var1);
      int var3 = this.l6(var1);
      return (var3 & 1) == 1 ? this.n5.a6(var2) : this.n5.u3(var2);
   }

   public final int a6(int var1) {
      int var2 = 4 + this.u3.get_Item(var1);
      int var3 = this.l6(var1);
      return (var3 & 1) == 1 ? this.n5.a6(var2 + 2) : this.n5.u3(var2 + 1);
   }

   public final int u9(int var1) {
      int var2 = this.l6(var1);
      if ((var2 & 8) == 8) {
         return 2;
      } else if ((var2 & 64) == 64) {
         return 4;
      } else {
         return (var2 & 128) == 128 ? 8 : 0;
      }
   }

   public final byte[] h0(int var1) {
      int var2 = this.l6(var1);
      int var3 = this.u3.get_Item(var1) + 4;
      if ((var2 & 1) == 1) {
         var3 += 4;
      } else {
         var3 += 2;
      }

      int var4 = this.u9(var1);
      byte[] var5 = new byte[var4];
      this.n5.n5(var3, var5, 0, var4);
      return var5;
   }

   @Override
   public int a6() {
      return this.u9;
   }

   @Override
   public com.aspose.slides.internal.m9.h0 u9() {
      return (com.aspose.slides.internal.m9.h0)this.n5.k5(this.a6, this.a6());
   }
}
