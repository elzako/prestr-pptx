package com.aspose.slides.internal.s5r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.c4i.e5;
import com.aspose.slides.internal.c4i.s3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class k5 {
   private final com.aspose.slides.internal.a1g.n5 n5;
   private final t4 l6;

   public k5(com.aspose.slides.internal.a1g.n5 var1, t4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final e5[] n5(int var1) {
      if (var1 < 12) {
         return null;
      }

      List var2 = new List();
      int var3 = var1;
      int var4 = 0;
      e5 var5 = null;

      do {
         e5 var6 = new e5(this.n5);
         long var7 = this.l6.getPosition();
         com.aspose.slides.internal.s5r.n5.n5(var6, this.l6);
         n5 var9 = com.aspose.slides.internal.s5r.l6.n5(var6.t9());
         e5[] var10 = new e5[]{var6};
         boolean var11 = var9.n5(var10, this.l6);
         var6 = var10[0];
         if (var11) {
            boolean var12 = false;
            if (var5 instanceof s3 && var6 instanceof s3) {
               s3 var13 = (s3)var5;
               s3 var14 = (s3)var6;
               if (var13.t2() == var14.t2()) {
                  var12 = true;
               }
            }

            if (!var12) {
               this.n5.n5().addItem(var6);
               var2.addItem(var6);
               var5 = var6;
            }
         }

         int var16 = (int)(this.l6.getPosition() - var7);
         int var17 = var6.aq_() - var16;
         if (var17 > 0) {
            this.l6.seek(var17, 1);
            com.aspose.slides.internal.f8y.n5.l6(
               var17 > 4,
               d1.n5(
                  d1.n5(new String[]{j8.n5(this).s7(), " Too much left bytes. LeftBytes = {0}, Emf+ type = {1}, StreamPosition = {2}, RecordIndex = {3}"}),new Object[]{
                  var17,
                  var6.t9(),
                  this.l6.getPosition(),
                  var4
               })
            );
         } else if (var17 < 0) {
            throw new com.aspose.slides.internal.e2o.n5("Readed more bytes than the record size.");
         }

         var4++;
         var3 -= var6.aq_();
      } while (var3 >= 12);

      return (e5[])var2.toArray(new e5[0]);
   }
}
