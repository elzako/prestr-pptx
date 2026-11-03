package com.aspose.slides.internal.f1s;

import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.s3;

public class t2 extends com.aspose.slides.internal.e1.y4 {
   private final a0 n5;
   private boolean l6;

   public t2(a0 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(c4 var1) {
      this.l6 = true;
   }

   @Override
   public void l6(c4 var1) {
      if (!this.l6 && var1.n5()) {
         this.n5.k5("h");
      }
   }

   @Override
   public void n5(y2 var1) {
      if (var1.n5().size() > 0) {
         for (int var2 = 0; var2 < var1.n5().size(); var2++) {
            if (this.l6) {
               this.n5(var1.n5().get_Item(0).u3());
               this.l6 = false;
            } else {
               this.l6(var1.n5().get_Item(var2).u3());
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      if (this.l6) {
         this.n5(var1.n5().n5().u3());
         this.l6 = false;
      } else {
         this.l6(var1.n5().n5().u3());
      }

      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 3));
      var1.n5().l6().n5(var2[0]);
      var1.n5().k5().n5(var2[1]);
      var1.n5().u3().n5(var2[2]);
      this.n5(var2);
   }

   private void n5(w1 var1) {
      this.n5.n5(var1.u3());
      this.n5.n5(" m ");
   }

   private void l6(w1 var1) {
      int var2 = 1;
      String var3 = s3.l6(var1.l6() / var2);
      String var4 = s3.l6(var1.k5() / var2);
      this.n5.k5(var3);
      this.n5.k5(var4);
      this.n5.n5("l ");

      while (var2 > 32767.0F) {
         var2 = com.aspose.slides.internal.v6g.k5.u3(var2 / 32767.0F, 13) + 1;
      }

      for (int var5 = 1; var5 < var2; var5++) {
         this.n5.k5(var3);
         this.n5.k5(var4);
         this.n5.n5("l ");
      }
   }

   private void n5(w1[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5.n5(var1[var2].u3());
         if (var2 < var1.length - 1) {
            this.n5.n5(" ");
         }
      }

      this.n5.n5(" c ");
   }
}
