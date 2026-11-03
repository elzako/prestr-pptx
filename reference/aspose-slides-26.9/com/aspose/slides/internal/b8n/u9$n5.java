package com.aspose.slides.internal.b8n;

import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.e1.z1;

class u9$n5 extends y4 {
   private float n5;

   private u9$n5() {
   }

   @Override
   public void n5(w1 var1) {
      this.n5 = var1.k5();
   }

   @Override
   public void n5(z1 var1) {
      if (var1.u3() == null) {
         var1.n5(new com.aspose.slides.internal.o9b.w1(var1.s7().l6(), this.n5 - var1.s7().k5()));
      } else {
         var1.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F), 0);
         var1.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.n5), 1);
      }
   }

   @Override
   public void n5(k7 var1) {
      if (var1.l6().k5() < 0.0F) {
         com.aspose.slides.internal.e1.t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.e1.t2.class);
         if (var2 != null) {
            if (var2.u3() == null) {
               var2.n5(new com.aspose.slides.internal.w0.c8());
            }

            var2.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F));
         }
      }
   }

   @Override
   public void l6(r4 var1) {
      if (var1.u3() == null) {
         var1.n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
      }

      var1.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.n5), 1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      if (var1.u3() != null && var1.t2() == 1 && com.aspose.slides.internal.v6g.k5.l6(var1.n5(0), k7.class)) {
         k7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(0), k7.class);
         var1.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F / var2.l6().l6(), 0.0F, 0.0F, -1.0F / var2.l6().k5(), 0.0F, 1.0F), 0);
         var1.u3().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.n5), 1);
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/b8n/u9$1;)V -> ()V
   u9$n5(com.aspose.slides.internal.b8n.u9$1 recoveredArg0) {
      this();
   }
}
