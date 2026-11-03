package com.aspose.slides.internal.c1;

import com.aspose.slides.internal.z0k.t4;

public class a6 extends n5 {
   private int n5 = 10;
   private int l6 = 1;
   private boolean k5;
   private int u3 = 1;
   private boolean a6;
   private int u9 = 8;
   private boolean h0;
   private boolean c8;
   private boolean t2;

   @Override
   public t4 n5(t4 var1) {
      this.n5();
      return this.n5 == 1 ? new com.aspose.slides.internal.l3.u3(var1) : new com.aspose.slides.internal.l3.u3(var1, this.n5, this.l6, this.u3, this.u9);
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      this.n5();
      var1.k5("/Filter", "/LZWDecode");
      if (this.n5 != 1) {
         var1.n5("/DecodeParms");
         var1.c8();
         var1.n5("/Predictor", this.n5);
         if (this.k5) {
            var1.n5("/Colors", this.l6);
         }

         if (this.a6) {
            var1.n5("/Columns", this.u3);
         }

         if (this.h0) {
            var1.n5("/BitsPerComponent", this.u9);
         }

         var1.t2();
      }
   }

   private void n5() {
      if (this.t2 || this.k5 || this.h0 || this.a6) {
         if (this.c8) {
            if (this.l6 >= 3) {
               this.n5 = 14;
            } else {
               this.n5 = 1;
            }
         } else if (this.l6 >= 3) {
            this.n5 = 15;
         } else {
            this.n5 = 1;
         }
      }
   }

   public final void n5(int var1) {
      if (var1 != 1) {
         this.l6 = var1;
         this.k5 = true;
      }
   }

   public final void l6(int var1) {
      if (var1 != 1) {
         this.u3 = var1;
         this.a6 = true;
      }
   }

   public final void k5(int var1) {
      if (var1 != 8) {
         this.u9 = var1;
         this.h0 = true;
      }
   }

   public final void n5(boolean var1) {
      this.c8 = var1;
      this.t2 = true;
   }
}
